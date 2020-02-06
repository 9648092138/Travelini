package co.travelini.backendservices.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.VerificationToken;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.service.TemplateService;
import co.travelini.backendservices.service.TraveliniAccountService;
import co.travelini.backendservices.service.VerificationTokenService;
import co.travelini.backendservices.util.EncodingUtil;
import co.travelini.backendservices.util.EncryptionUtil;


@RequestMapping("/api")
@RestController
public class EmailVerificationController {

	@Autowired
	private TraveliniAccountService traveliniAccountService;

	@Autowired
	private VerificationTokenService verificationTokenService;
	
	private TemplateEngine templateEngine;
	@Autowired
	 public void MailContentBuilder(TemplateEngine templateEngine)
	    {
	        this.templateEngine = templateEngine;
	    }
	
	@GetMapping("/v1/verify")
	public String verifyEmail(@RequestParam(required = true, name = "a") String accountIdStr,
			@RequestParam(required = true, name = "t") String token) throws TraveliniException 
	{
try
{
		String decryptedAccountId = EncryptionUtil.decryptString(EncodingUtil.decodeBase64(accountIdStr));
		String decyptedToken = EncryptionUtil.decryptString(EncodingUtil.decodeBase64(token));

		final long accountId = Long.parseLong(decryptedAccountId);
		System.out.println(" account id "+accountId);

		Optional<TraveliniAccount> traveliniAccountOpt = traveliniAccountService.retrieveAccountByAccountId(accountId);
    
		if (!traveliniAccountOpt.isPresent())
			
			throw new TraveliniException(ResponseCode.ERR_ACCOUNT_NOT_FOUND);
	
		TraveliniAccount traveliniAccount = traveliniAccountOpt.get();
		
		VerificationToken verificationToken = verificationTokenService.getVerficationToken(traveliniAccount,decyptedToken);
	
		final LocalDateTime now = LocalDateTime.now();

		if (!verificationToken.getIsValid())
			throw new TraveliniException(ResponseCode.ERR_TOKEN_NOT_VALID);
		
			/*
			 * if (now.isAfter(verificationToken.getExpiryDate())) throw new
			 * TraveliniException(ResponseCode.ERR_TOKEN_EXPIRED);
			 */

		verificationToken.setIsValid(false);
		traveliniAccount.setEnabled(true);

		verificationTokenService.saveVerificationToken(verificationToken);
		System.out.println(verificationToken);
		traveliniAccountService.saveTraveliniAccount(traveliniAccount);
		
}
catch(Exception e)
{
	System.out.println(e);
	return "<h2>Token Has Expired</h2>";
}


	//	return new GenericResponse<>(ResponseCode.SUC_EMAIL_VERIFIED);
		

Context context = new Context();
return templateEngine.process("Template", context);

	}

}
