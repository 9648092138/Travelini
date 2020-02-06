package co.travelini.backendservices.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.request.UpdateTraveliniAccountDTO;
import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.success.TraveliniAccountDetailsDTO;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.TraveliniAccountSetting;
import co.travelini.backendservices.entity.master.Country;
import co.travelini.backendservices.entity.master.SupportedCurrency;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.service.TraveliniAccountService;

@RequestMapping("/api")
@RestController
public class AccountDetailsController
{

	@Autowired
	private TraveliniAccountService traveliniAccountService;

	@GetMapping("/v1/accounts/{accountId}")
	public GenericResponse<TraveliniAccountDetailsDTO> getAccountDetailsByAccountId(
			@PathVariable("accountId") long accountId) throws TraveliniException {

try
{
		Optional<TraveliniAccount> traveliniAccountOpt = traveliniAccountService.retrieveAccountByAccountId(accountId);


//		UpdateTraveliniAccountDTO traveliniAccDto = new UpdateTraveliniAccountDTO();
		if (!traveliniAccountOpt.isPresent())
			throw new TraveliniException(ResponseCode.ERR_ACCOUNT_NOT_FOUND);

		
		
		TraveliniAccount traveliniAccount = traveliniAccountOpt.get();
				
		TraveliniAccountSetting traveliniAccountSetting = traveliniAccount.getTraveliniAccountSetting();
		
		TraveliniAccountDetailsDTO traveliniAccountDetailsDTO = new TraveliniAccountDetailsDTO();
		
		
		traveliniAccountDetailsDTO.setAccountId(traveliniAccount.getAccountId());
		traveliniAccountDetailsDTO.setName(traveliniAccount.getName());
		traveliniAccountDetailsDTO.setEmail(traveliniAccount.getEmail());
		traveliniAccountDetailsDTO.setPhoneNum(traveliniAccount.getPhoneNum());
		traveliniAccountDetailsDTO.setImageLocation(traveliniAccount.getImageLocation());
		traveliniAccountDetailsDTO.setUpdateFlag(traveliniAccount.isUpdateFlag());
		traveliniAccountDetailsDTO.setResidenceCountryId(traveliniAccountSetting.getResidenceCountry().getId());
		traveliniAccountDetailsDTO.setCurrencyId(traveliniAccountSetting.getPreferredCurrency().getCurrencyId());
		traveliniAccountDetailsDTO.setCountry(traveliniAccountSetting.getCountry());
		traveliniAccountDetailsDTO.setCurrency(traveliniAccountSetting.getCurrency());
		//op
		//traveliniAccountDetailsDTO.setNationality(traveliniAccountSetting.);
		
		traveliniAccountDetailsDTO.setAddress(traveliniAccountSetting.getAddress());
		traveliniAccountDetailsDTO.setNationality(traveliniAccountSetting.getNationality());
		
	
		Country residenceCountry = traveliniAccountSetting.getResidenceCountry();
		SupportedCurrency preferredCurrency = traveliniAccountSetting.getPreferredCurrency();
		List<String> travelStyles = traveliniAccountSetting.getPreferredTravelStyles();
		List<String> travelTypes = traveliniAccountSetting.getPreferredTravelTypes();

		boolean showConversation = residenceCountry == null && preferredCurrency == null && isNullOrBlank(travelStyles)
				&& isNullOrBlank(travelTypes);

		if (residenceCountry != null)
			traveliniAccountDetailsDTO.setResidenceCountryId(residenceCountry.getId());

		if (preferredCurrency != null)
			traveliniAccountDetailsDTO.setCurrencyId(preferredCurrency.getCurrencyId());

		traveliniAccountDetailsDTO.setTravelStyle(travelStyles);
		
		traveliniAccountDetailsDTO.setTravelType(travelTypes);

		Map<String, Object> configurations = new HashMap<>();

		configurations.put("showConversation", showConversation);

		traveliniAccountDetailsDTO.setConfiguration(configurations);

		return new GenericResponse<TraveliniAccountDetailsDTO>(ResponseCode.SUC_GENERIC,
				Collections.singletonList(traveliniAccountDetailsDTO));
}
catch(Exception e)
{
	System.out.println("Exception = "+e);
	return null;
}
	}

	private boolean isNullOrBlank(List<String> testList)
	{
		if (testList == null || testList.isEmpty())
			return true;
		return false;
	}
}
