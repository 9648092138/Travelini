package co.travelini.backendservices.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.service.TraveliniAccountService;

@Service
public class TraveliniCustomUserDetailsService implements UserDetailsService {

	@Autowired
	private TraveliniAccountService traveliniAccountService;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Optional<TraveliniAccount> traveliniAccountOpt = traveliniAccountService.retriveAccountByEmail(email);

		if (traveliniAccountOpt.isPresent())
			return new TraveliniCustomUserDetails(traveliniAccountOpt.get());

		throw new UsernameNotFoundException("Email not registered");
	}

}
