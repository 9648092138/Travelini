package co.travelini.backendservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.VerificationToken;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.VerificationTokenRepo;

@Service
public class VerificationTokenService 
{

	@Autowired
	private VerificationTokenRepo verificationTokenRepo;
	


	
	public VerificationToken saveVerificationToken(VerificationToken verificationToken) 
	{
		System.out.println(verificationToken);		
		return verificationTokenRepo.save(verificationToken);
		
	}

	public VerificationToken getVerficationToken(TraveliniAccount traveliniAccount, String token) throws TraveliniException 
	{

		Optional<VerificationToken> traveliniTokenOpt = verificationTokenRepo.getByAccountIdAndToken(traveliniAccount.getAccountId(), token);

		if (traveliniTokenOpt.isPresent())
			return traveliniTokenOpt.get();
		System.out.println(traveliniTokenOpt);
		throw new TraveliniException(ResponseCode.ERR_TOKEN_NOT_FOUND);
	}

	
	public VerificationToken getVerficationTokenByAccount(TraveliniAccount traveliniAccount) throws TraveliniException {
		
		Optional<VerificationToken> traveliniTokenOpt = verificationTokenRepo.getByAccountId(traveliniAccount.getAccountId());
		
		if (traveliniTokenOpt.isPresent())

			return traveliniTokenOpt.get();



	
		throw new TraveliniException(ResponseCode.ERR_TOKEN_NOT_FOUND);

}

}
