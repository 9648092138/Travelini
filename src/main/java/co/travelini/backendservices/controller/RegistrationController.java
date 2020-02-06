package co.travelini.backendservices.controller;


import java.sql.Timestamp;
import java.util.Date;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.request.CheckemailexitRequest;
import co.travelini.backendservices.dto.request.EmailexistResponse;
import co.travelini.backendservices.dto.request.FavouriteListRequest;
import co.travelini.backendservices.dto.request.RegisterWithEmailDTO;
import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;
import co.travelini.backendservices.dto.response.success.SuccessRegisterWithEmailDTO;
import co.travelini.backendservices.entity.FavouriteList;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.TraveliniAccountSetting;
import co.travelini.backendservices.event.OnRegistrationCompleteEvent;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.TraveliniAccountRepo;
import co.travelini.backendservices.service.TraveliniAccountService;
import co.travelini.backendservices.service.TraveliniAccountSettingService;

import co.travelini.backendservices.util.EncryptionUtil;

@RequestMapping("/api")
@RestController
public class RegistrationController {



	@Autowired
	private TraveliniAccountService traveliniAccountService;
	
	@Autowired
	TraveliniAccountSettingService traveliniAccountSettingService;
	
	@Autowired
	ApplicationEventPublisher applicationEventPublisher;
	
	@Autowired
	TraveliniAccountRepo userRepo;

	@PostMapping(path = "/v1/register")
	@ResponseBody
	public GenericResponse<SuccessRegisterWithEmailDTO> registerAccountByEmail(
			@Valid @RequestBody RegisterWithEmailDTO registerWithEmailDTO) throws TraveliniException {
		
			try {
					String email = registerWithEmailDTO.getEmail();

						if (checkIfEmailAlreadyRegistered(email)) {
								GenericResponse<SuccessRegisterWithEmailDTO> successDTO = new GenericResponse<>(
										ResponseCode.ERR_EMAIL_ALREADY_REGISTERED);
						return successDTO;
						}
			//throw new TraveliniException(ResponseCode.);

						TraveliniAccount newAccount = createTraveliniAccountFromDTO(registerWithEmailDTO);
		
						String response = traveliniAccountService.registerTraveliniAccount(newAccount);
			/*
			 * System.out.println(response); TraveliniAccountSetting traveliniAccountSetting
			 * = new TraveliniAccountSetting();
			 * 
			 * 
			 * newAccount.setTraveliniAccountSetting(traveliniAccountSetting);
			 * traveliniAccountSetting.setTraveliniAccount(newAccount);
			 * 
			 * TraveliniAccount registeredAccount =
			 * traveliniAccountService.saveTraveliniAccount(newAccount);
			 * 
			 * 
			 * traveliniAccountSettingService.saveAccountSettings(traveliniAccountSetting);
			 */
	
			// Publish event on successful Account Registration.
					//	applicationEventPublisher.publishEvent(new OnRegistrationCompleteEvent(newAccount));
	
						return createSuccessDTO(newAccount);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			
			GenericResponse<SuccessRegisterWithEmailDTO> successDTO = new GenericResponse<>(
					ResponseCode.ERR_GENERIC);
			return successDTO; 
		}

	}

	private boolean checkIfEmailAlreadyRegistered(String email) 
	{

		return traveliniAccountService.retriveAccountByEmail(email).isPresent();
	}

	private TraveliniAccount createTraveliniAccountFromDTO(RegisterWithEmailDTO registerWithEmailDTO) {
		TraveliniAccount newAccount = new TraveliniAccount();

		String encryptedPassword = encryptPassword(registerWithEmailDTO.getPassword());

		newAccount.setEmail(registerWithEmailDTO.getEmail());
		newAccount.setName(registerWithEmailDTO.getName());
		newAccount.setPassword(encryptedPassword);
		newAccount.setEnabled(Boolean.FALSE);
		newAccount.setUpdateFlag(false);
		 Date date= new Date();
				newAccount.setCreationTime(new Timestamp(date.getTime()));
		return newAccount;
	}

	private GenericResponse<SuccessRegisterWithEmailDTO> createSuccessDTO(TraveliniAccount newAccount)
	{
		
		SuccessRegisterWithEmailDTO successRegisterWithEmailDTO = new SuccessRegisterWithEmailDTO();
		newAccount = traveliniAccountService.saveTraveliniAccount(newAccount);
		successRegisterWithEmailDTO.setAccountId(newAccount.getAccountId());
		successRegisterWithEmailDTO.setName(newAccount.getName());
		successRegisterWithEmailDTO.setEmail(newAccount.getEmail());
		successRegisterWithEmailDTO.setEnabled(newAccount.isEnabled());
		successRegisterWithEmailDTO.setVerificationEmailSent(true);
		System.out.println("verification email sent");
		List<SuccessRegisterWithEmailDTO> data = Collections.singletonList(successRegisterWithEmailDTO);
		//System.out.println("Successfully Sending Response");
		GenericResponse<SuccessRegisterWithEmailDTO> successDTO = new GenericResponse<>(
				ResponseCode.SUC_ACCOUNT_SIGN_UP_WITH_EMAIL, data);
		return successDTO;
	}

	private String encryptPassword(String password) {
		return EncryptionUtil.encryptPassword(password);
	}
	
	
	//============================check user exist or not ======================//
	
	@PostMapping(path ="/checkUsersExists")
	public GenericResponse<TraveliniAccount> checkUserExist(@RequestBody CheckemailexitRequest requestemail) {
		GenericResponse<TraveliniAccount> res = new GenericResponse<TraveliniAccount>(ResponseCode.SUC_GENERIC);
		EmailexistResponse response = new EmailexistResponse();
		//boolean emailexist;
		TraveliniAccount emailexist;
		String email=requestemail.getEmail();
		//for optional use in repo
		
		emailexist = userRepo.findByEmail(email);
		if(emailexist != null) {
			//res.setMessage("Email Already Exists");
			response.setMessage("user already exists");
			response.setStatus(true);
			res.setData(response);
		
		}
		else {
			response.setMessage("new User");
			response.setStatus(false);
			res.setData(response);
		}
		return res;
	}
}


