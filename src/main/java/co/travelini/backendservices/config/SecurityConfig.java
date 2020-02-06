package co.travelini.backendservices.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;

import co.travelini.backendservices.security.JwtTokenFilterConfigurer;
import co.travelini.backendservices.security.JwtTokenProvider;
import co.travelini.backendservices.security.TraveliniCustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private TraveliniCustomUserDetailsService traveliniCustomUserDetailsService;

	@Autowired
	private JwtTokenProvider jwtTokenProvider;

	private final String[] NOT_SECURED = { //
			"/api/v1/verify", // 
			"/api/v1/register", //
			"/api/v1/login", //
			"/api/v1/social/login", //
			"/api/v1/resetpwd", //
			"/api/v1/accounts/{accountId}/resendVerification", //
			"/api/v1/currencies", //
			"/api/v1/currencies/{currencyId}", //
			"/api/v1/countries", //
			"/api/v1/countries/{countryId}", //
			"/api/v1/seeds", //
			"/api/v1/seeds/{seedDataCode}", //
			"/api/v1/accounts/{accountId}/itineraries?isBooked=true",
			"/swagger-ui.html",
			"/swagger-resources/**",
			"/v2/api-docs",
	};

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(getDaoAuthenticationProvider());
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers(NOT_SECURED);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().//
				disable();
		http.sessionManagement().//
				sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeRequests()//
				.antMatchers("/**").permitAll()//
				.anyRequest().authenticated();
		http.apply(new JwtTokenFilterConfigurer(jwtTokenProvider));
		http.httpBasic();
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence rawPassword) {
				return BCrypt.hashpw(rawPassword.toString(), BCrypt.gensalt(11));
			}

			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				return BCrypt.checkpw(rawPassword.toString(), encodedPassword);
			}
		};
	}

	@Bean
	public DaoAuthenticationProvider getDaoAuthenticationProvider() {
		final DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();

		daoAuthenticationProvider.setUserDetailsService(traveliniCustomUserDetailsService);
		daoAuthenticationProvider.setPasswordEncoder(getPasswordEncoder());

		return daoAuthenticationProvider;
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	


}
