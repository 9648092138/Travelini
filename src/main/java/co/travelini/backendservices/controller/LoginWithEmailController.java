package co.travelini.backendservices.controller;

import java.util.Collections;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.request.LoginWithEmailDTO;
import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.success.TokenResponseDTO;

import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.TraveliniAccountRepo;
import co.travelini.backendservices.security.JwtTokenProvider;
import co.travelini.backendservices.security.SecurityConstants;
import co.travelini.backendservices.service.TraveliniAccountService;

@RequestMapping("/api")
@RestController
public class LoginWithEmailController {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private JwtTokenProvider jwtTokenProvider;

	@Autowired
	private TraveliniAccountService traveliniAccountService;
	
	@Autowired
	private TraveliniAccountRepo repo;

	@PostMapping("/v1/login")
	public GenericResponse<TokenResponseDTO> login(@Valid @RequestBody LoginWithEmailDTO loginWithEmailDTO)
			throws TraveliniException 
	{
		 GenericResponse<TokenResponseDTO> res = new GenericResponse<>(ResponseCode.ERR_ACCOUNT_NOT_ENABLED);
		String email = loginWithEmailDTO.getEmail();
		String password = loginWithEmailDTO.getPassword();
		
		Optional<TraveliniAccount> traveliniAccountOpt = traveliniAccountService.retriveAccountByEmail(email);

		if (!traveliniAccountOpt.isPresent())
			throw new TraveliniException(ResponseCode.ERR_ACCOUNT_NOT_FOUND);

		TraveliniAccount traveliniAccount = traveliniAccountOpt.get();

		if (!traveliniAccount.isEnabled())
		{
			res.setStatus(res.getStatus());
			res.setAppCode("ERR_ACCOUNT_NOT_ENABLED");
			res.setCode(2000006);
			res.setMessage("Account not enabled");
			res.setData(traveliniAccount.getAccountId());
			return res;

		}
		if (!passwordEncoder.matches(password, traveliniAccount.getPassword()))

			
			throw new TraveliniException(ResponseCode.ERR_INVALID_PASSWORD);

		System.out.println(passwordEncoder.matches(password, traveliniAccount.getPassword()));
		// FIXME : When Roles are introduced, incorporate roles here.
		String token = jwtTokenProvider.createToken(email, null);
		System.out.println("inside token"+token);
		
	
		TokenResponseDTO tokenResponseDTO = new TokenResponseDTO();
	
		
		
		TraveliniAccount Names = repo.getNameByAccountId(traveliniAccount.getAccountId());
		
		tokenResponseDTO.setName(Names.getName());
		System.out.print(	"names = "+Names.getName());
		
		
		tokenResponseDTO.setTokenType(SecurityConstants.BEARER);
		
		tokenResponseDTO.setToken(token);
		
		tokenResponseDTO.setAccountId(traveliniAccount.getAccountId());

		tokenResponseDTO.setUpdateFlag(traveliniAccount.isUpdateFlag());
		return new GenericResponse<>(ResponseCode.SUC_LOGGED_IN, Collections.singletonList(tokenResponseDTO));

	}

}
