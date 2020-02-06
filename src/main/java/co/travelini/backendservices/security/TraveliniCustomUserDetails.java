package co.travelini.backendservices.security;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import co.travelini.backendservices.entity.TraveliniAccount;


//@Data
public class TraveliniCustomUserDetails implements UserDetails {

	/**
	 * Auto Generated Serial Version UID
	 */
	private static final long serialVersionUID = -6922271975515067452L;

	private String username;

	private String password;

	private boolean enabled;

	private Collection<String> roles;

	public TraveliniCustomUserDetails(TraveliniAccount traveliniAccount) {

		this.username = traveliniAccount.getEmail();
		this.password = traveliniAccount.getPassword();
		this.enabled = traveliniAccount.isEnabled();

		// TODO : This needs to change once Roles are added.
		this.roles = Collections.singletonList("USER");
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		List<SimpleGrantedAuthority> grantedAuthorityList = this.roles//
				.stream()//
				.map(p -> new SimpleGrantedAuthority(p))//
				.collect(Collectors.toList());

		return grantedAuthorityList;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

}
