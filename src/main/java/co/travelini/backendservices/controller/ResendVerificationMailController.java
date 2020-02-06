package co.travelini.backendservices.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.VerificationToken;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.service.TraveliniAccountService;
import co.travelini.backendservices.service.VerificationCodeEmailerService;
import co.travelini.backendservices.service.VerificationTokenService;
import co.travelini.backendservices.util.RandomStringGenerator;

@RequestMapping("/api")
@RestController
public class ResendVerificationMailController {

	@Autowired
	private TraveliniAccountService traveliniAccountService;

	@Autowired
	private VerificationTokenService verificationTokenService;

	@Autowired
	public VerificationCodeEmailerService verificationCodeEmailerService;

	
	@GetMapping("/v1/accounts/{accountId}/resendVerification")
	public GenericResponse<Void> resendVerification(@PathVariable("accountId") String accountIdStr)
			throws TraveliniException {

		final long accountId = Long.parseLong(accountIdStr);

		Optional<TraveliniAccount> traveliniAccountOpt = traveliniAccountService.retrieveAccountByAccountId(accountId);

		if (!traveliniAccountOpt.isPresent())
			throw new TraveliniException(ResponseCode.ERR_ACCOUNT_NOT_FOUND);
       //  System.out.println("it present");
		TraveliniAccount traveliniAccount = traveliniAccountOpt.get();
		
		// System.out.println("it present"+traveliniAccountOpt.get());
		VerificationToken verificationToken = verificationTokenService.getVerficationTokenByAccount(traveliniAccount);
		String newToken = RandomStringGenerator.generateRandomString();
		
		verificationToken.setToken(newToken);
		verificationToken.setIsValid(true);
		
		verificationTokenService.saveVerificationToken(verificationToken);

		this.sendVerificationEmail(traveliniAccount, newToken);
		return new GenericResponse<>(ResponseCode.SUC_RESEND_VERIFICATION_EMAIL);
	}
		

//catch(Exception e)
//{
//	System.out.println(e);
//}



	private void sendVerificationEmail(TraveliniAccount traveliniAccount, String token) {
		verificationCodeEmailerService.sendSimpleMessage(traveliniAccount, token);
	}

	}
	

