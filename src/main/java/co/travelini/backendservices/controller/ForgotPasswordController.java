package co.travelini.backendservices.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.request.PasswordResetDTO;
import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.service.PasswordResetEmailerService;
import co.travelini.backendservices.service.TraveliniAccountService;
import co.travelini.backendservices.util.EncryptionUtil;
import co.travelini.backendservices.util.RandomNumericString;
import co.travelini.backendservices.util.RandomStringGenerator;

@RequestMapping("/api")
@RestController
public class ForgotPasswordController {

	@Autowired
	public PasswordResetEmailerService passwordResetEmailerService;

	@Autowired
	private TraveliniAccountService traveliniAccountService;

	@PostMapping(path = "/v1/resetpwd")
	@ResponseBody
	public GenericResponse<Void> resetPasswordForEmail(
			@Valid @RequestBody PasswordResetDTO passwordResetRequestDTO) throws TraveliniException {

		String email = passwordResetRequestDTO.getEmail();

		Optional<TraveliniAccount> traveliniAccountOpt = traveliniAccountService.retriveAccountByEmail(email);

		if (!traveliniAccountOpt.isPresent())
			throw new TraveliniException(ResponseCode.ERR_ACCOUNT_NOT_FOUND);

		TraveliniAccount registeredAccount = traveliniAccountOpt.get();

		requestPasswordReset(registeredAccount);

		return new GenericResponse<>(ResponseCode.SUC_PASSWORD_RESET);

	}
	private  BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	
	private void requestPasswordReset(TraveliniAccount traveliniAccount) throws TraveliniException
	{
		
		String rawPassword = RandomNumericString.generateRandomString();
		System.out.println(rawPassword);
//		String encryptedPassword = encryptPassword(rawPassword);
		String encryptedOtp = encryptPassword(rawPassword);
		
		
		traveliniAccount.setOtp(encryptedOtp);
		
		traveliniAccountService.saveTraveliniAccount(traveliniAccount);
		
		sendPasswordResetEmail(rawPassword, traveliniAccount);
	}

	private void sendPasswordResetEmail(String rawPassword, TraveliniAccount traveliniAccount) {
		passwordResetEmailerService.sendSimpleMessage(rawPassword, traveliniAccount);
	}

	private String encryptPassword(String password)
	{
		return EncryptionUtil.encryptPassword(password);
	}



@PostMapping("/ResetPassword")
public @ResponseBody GenericResponse<TraveliniAccount> resetpassword( @RequestParam String email,@RequestParam String userOtp,@RequestParam String password,@RequestParam String confirmPassword)
{
	GenericResponse<TraveliniAccount> res = new GenericResponse<TraveliniAccount>(ResponseCode.SUC_PASSWORD_RESET);
	
	String resetPass = passwordResetEmailerService.resetPassword(email,userOtp,password,confirmPassword);
//	System.out.println(resetPass);
	try
	{
		if(resetPass == "password changing successful")
		{
		res.setStatus(TraveliniResponseStatus.SUCCESS);
		res.setMessage("Password changing successful");
		res.setData(resetPass);
		res.setCode(10001);
		res.setAppCode("Suc_Generic");
		System.out.println("The value of post inside if"+resetPass);
		return res;
		}
		else if(resetPass == "Password does not match")
		{
		
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Password changing failed");
			res.setAppCode("Error_Generic");
			return res;
		}
		else 
		{
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Otp does not exist");
			res.setAppCode("Password changing Unsuccessful");
			return res;
		}
	}
	catch(Exception e)
	{
		res.setStatus(TraveliniResponseStatus.ERROR);
		res.setMessage("password changing failed");
		return res;
	}
	
}
}
