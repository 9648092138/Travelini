package co.travelini.backendservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.dto.request.CheckemailexitRequest;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.TraveliniAccountSetting;
import co.travelini.backendservices.entity.VerificationToken;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.TraveliniAccountRepo;
import co.travelini.backendservices.repo.TraveliniAccountSettingRepo;
import co.travelini.backendservices.util.RandomStringGenerator;

@Service
public class TraveliniAccountService {

	@Autowired
	private TraveliniAccountRepo traveliniAccountRepo;

	@Autowired
	private TraveliniAccountSettingRepo traveliniAccountSettingRepo;

	@Autowired
	private VerificationCodeEmailerService mailSender;

	@Autowired
	private VerificationTokenService tokenservice;

	public Optional<TraveliniAccount> retriveAccountByEmail(String email) {

		return this.traveliniAccountRepo.getTraveliniAccountByEmail(email);
	}

	public Optional<TraveliniAccount> retrieveAccountByAccountId(long accountId) throws TraveliniException {

		System.out.println(accountId);

		return this.traveliniAccountRepo.getByAccountId(accountId);
	

	}

	public TraveliniAccount saveTraveliniAccount(TraveliniAccount toRegisterAccount) {

		try {
			TraveliniAccountSetting settings = new TraveliniAccountSetting();

			// traveliniAccountSettingRepo.save(settings);

			// toRegisterAccount.setTraveliniAccountSetting(settings);

			traveliniAccountRepo.save(toRegisterAccount);

			// settings.setTraveliniAccount(toRegisterAccount);
			// traveliniAccountSettingRepo.save(settings);

			return toRegisterAccount;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	public String registerTraveliniAccount(TraveliniAccount toRegisterAccount) {

		try {
			System.out.println("regetrition for send token");
			TraveliniAccountSetting settings = new TraveliniAccountSetting();
//			settings.setTraveliniAccount(toRegisterAccount);
			traveliniAccountSettingRepo.save(settings);

			// Saving travelini account
			toRegisterAccount.setTraveliniAccountSetting(settings);
			traveliniAccountRepo.save(toRegisterAccount);

			// updating Account with new account settings
			settings.setTraveliniAccount(toRegisterAccount);
			traveliniAccountSettingRepo.save(settings);

			// Token creation process started
			String token = RandomStringGenerator.generateRandomString();
			System.out.println(token);

			VerificationToken verificationtoken = new VerificationToken();
			verificationtoken.setToken(token);
			

//			System.out.println(toRegisterAccount);
			verificationtoken.setAccountId(toRegisterAccount.getAccountId());
			tokenservice.saveVerificationToken(verificationtoken);
			mailSender.sendSimpleMessage(toRegisterAccount, token);
              System.out.println("token send");
			return "Successfull";
		} catch (Exception e) {
			System.out.println(e);
			return e.toString();
		}

	}

	

//	public boolean getemailexist(CheckemailexitRequest email) {
//		// TODO Auto-generated method stub
//		boolean emailexist = false ;
//		TraveliniAccount account = new TraveliniAccount();
//		// String  user ="exist";
//		try {
//			emailexist = traveliniAccountRepo.Emailexist(email.getEmail());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(emailexist) {
//			
//		}
//		else {
//			
//		}
//		return emailexist  ;
//		
//		
//	}
//
	public String findbyemail(String email)throws Exception {
		// TODO Auto-generated method stub
		try {
			traveliniAccountRepo.findByEmail(email);
			return "exists";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

//	public boolean findbyemail(String email)throws Exception {
//		// TODO Auto-generated method stub
//		try {
//			traveliniAccountRepo.findByEmail(email);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//		}
//		return true;
//		
//	}
}
