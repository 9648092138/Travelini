package co.travelini.backendservices.security;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.exception.TraveliniException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component
public class JwtTokenProvider {

	private String secretKey = SecurityConstants.SECURITY_TOKEN;

	@Autowired
	private TraveliniCustomUserDetailsService traveliniUserSecurityService;

	@PostConstruct
	protected void init() {
		secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
	}

	public String createToken(String username, List<Role> roles) {
		Claims claims = Jwts.claims().setSubject(username);
		claims.put("auth", Collections.singletonList(new SimpleGrantedAuthority("USER")));

		LocalDateTime nowLocalDateTime = LocalDateTime.now();
		LocalDateTime expiryLocalDateTime = LocalDateTime.now().plusDays(10);

		Date now = Date.from(nowLocalDateTime.atZone(ZoneId.systemDefault()).toInstant());
		Date expiry = Date.from(expiryLocalDateTime.atZone(ZoneId.systemDefault()).toInstant());

		return Jwts.builder()//
				.setClaims(claims)//
				.setIssuedAt(now)//
				.setExpiration(expiry)//
				.signWith(SignatureAlgorithm.HS256, secretKey)//
				.compact();

	}

	public Authentication getAuthentication(String token) throws TraveliniException {
		UserDetails userDetails = traveliniUserSecurityService.loadUserByUsername(getUsername(token));
		return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
	}

	public String getUsername(String token) {
		return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
	}

	public String resolveToken(HttpServletRequest req) {
		String bearerToken = req.getHeader("Authorization");
		if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
			return bearerToken.substring(7, bearerToken.length());
		}
		return null;
	}

	public boolean validateToken(String token) throws TraveliniException {
		try {
			Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
			return true;
		} catch (UnsupportedJwtException | MalformedJwtException | SignatureException | IllegalArgumentException ex) {
			throw new TraveliniException(ResponseCode.ERR_TOKEN_NOT_VALID);
		} catch (ExpiredJwtException ex) {
			throw new TraveliniException(ResponseCode.ERR_TOKEN_EXPIRED);
		}
	}

}
