package co.travelini.backendservices.security;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.exception.TraveliniException;

public class JwtTokenFilter extends GenericFilterBean {

	private JwtTokenProvider jwtTokenProvider;

	public JwtTokenFilter(JwtTokenProvider jwtTokenProvider) {
		this.jwtTokenProvider = jwtTokenProvider;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		String token = jwtTokenProvider.resolveToken(httpServletRequest);

		try {
			if (token != null && jwtTokenProvider.validateToken(token)) {
				Authentication auth = jwtTokenProvider.getAuthentication(token);
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
		} catch (TraveliniException ex) {

			GenericResponse<Void> errorResponse = new GenericResponse<>(ex.getErrorCode());

			String json = new ObjectMapper().writeValueAsString(errorResponse);

			httpServletResponse.sendError(HttpStatus.UNAUTHORIZED.value());

			PrintWriter writer = httpServletResponse.getWriter();

			writer.write(json);
			writer.flush();
			writer.close();

			return;
		}

		chain.doFilter(request, response);
	}

}
