package co.travelini.backendservices.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
import co.travelini.backendservices.repo.TraveliniAccountRepo;
import co.travelini.backendservices.service.TraveliniAccountService;
import co.travelini.backendservices.service.TraveliniAccountSettingService;
import co.travelini.backendservices.service.master.CountryService;
import co.travelini.backendservices.service.master.SupportedCurrencyService;

@RequestMapping("/api")
@RestController
public class UpdateTraveliniAccountController {

	@Autowired
	private TraveliniAccountService traveliniAccountService;

	@Autowired
	private TraveliniAccountSettingService traveliniAccountSettingService;

	@Autowired
	private SupportedCurrencyService supportedCurrencyService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private TraveliniAccountRepo repo;
	
	
	@PutMapping("/v1/accounts/{accountId}")
	public GenericResponse<TraveliniAccountDetailsDTO> updateTraveliniAccount(
			@Valid @RequestBody UpdateTraveliniAccountDTO updateTraveliniAccountDTO,
			@PathVariable("accountId") long accountId) throws TraveliniException 
	{

		try {
		Optional<TraveliniAccount> traveliniAccountOpt = traveliniAccountService.retrieveAccountByAccountId(accountId);
		String phNo = updateTraveliniAccountDTO.getPhoneNum();
		String name = updateTraveliniAccountDTO.getNewName();
		String countryName = updateTraveliniAccountDTO.getCountry();
		String currencyName = updateTraveliniAccountDTO.getCurrency();
		String nationality = updateTraveliniAccountDTO.getNationality();
		String address =    updateTraveliniAccountDTO.getAddress();
		if (!traveliniAccountOpt.isPresent())
			throw new TraveliniException(ResponseCode.ERR_ACCOUNT_NOT_FOUND);

		
		TraveliniAccount traveliniAccount = traveliniAccountOpt.get();
		traveliniAccount.setName(name);
		traveliniAccount.setPhoneNum(phNo);
		
		
		System.out.println("Get Travelini Account Setting");
		TraveliniAccountSetting traveliniAccountSetting = traveliniAccountOpt.get().getTraveliniAccountSetting();

		Optional<Long> currencyIdOpt = updateTraveliniAccountDTO.getCurrencyId();
		
//		Optional<String> currency = updateTraveliniAccountDTO.getCountry();
		
		traveliniAccountSetting.setCountry(countryName);
		traveliniAccountSetting.setCurrency(currencyName);
		traveliniAccountSetting.setAddress(address);
		traveliniAccountSetting.setNationality(nationality);
		
		
			
		if (currencyIdOpt.isPresent()) {

			Optional<SupportedCurrency> currencyOpt = supportedCurrencyService.getById(currencyIdOpt.get());

			if (!currencyOpt.isPresent())
				throw new TraveliniException(ResponseCode.ERR_CURRENCY_NOT_FOUND);

			traveliniAccountSetting.setPreferredCurrency(currencyOpt.get());
			
		}
//		if(currency.isPresent())
//		{
//			Optional<SupportedCurrency> currencies = supportedCurrencyService.getCurrencybyId(currency.get());
//		
//			if(!currencies.isPresent())
//			throw new TraveliniException(ResponseCode.ERR_CURRENCY_NOT_FOUND);
//				
//			traveliniAccountSetting.setPreferredCurrency(currencies.get());
//		}
		

		

		Optional<Long> countryIdOpt = updateTraveliniAccountDTO.getResidenceCountryId();

		if (countryIdOpt.isPresent()) {

			Optional<Country> countryOpt = countryService.getById(countryIdOpt.get());

			if (!countryOpt.isPresent())
				throw new TraveliniException(ResponseCode.ERR_COUNTRY_NOT_FOUND);

			traveliniAccountSetting.setResidenceCountry(countryOpt.get());

		}
		
//		Optional<String> country = updateTraveliniAccountDTO.getCountry();
		
//		if(country.isPresent())
//		{
//			Optional<Country> countries = countryService.getByCode(country.get());
//			
//			if(!countries.isPresent())
//				throw new TraveliniException(ResponseCode.ERR_COUNTRY_NOT_FOUND);
//			
//			traveliniAccountSetting.setResidenceCountry(countries.get());
//		}
	
		
		
		if(updateTraveliniAccountDTO.getTravelStyle() != null) {
			System.out.println("Setting Travel Style");
			traveliniAccountSetting.setPreferredTravelStyles(updateTraveliniAccountDTO.getTravelStyle().get());
		}
		if(updateTraveliniAccountDTO.getTravelType() != null) {
			System.out.println("Setting Travel Type");
			traveliniAccountSetting.setPreferredTravelTypes(updateTraveliniAccountDTO.getTravelType().get());
		}
		
		
		traveliniAccountSettingService.saveAccountSettings(traveliniAccountSetting);

		TraveliniAccountDetailsDTO traveliniAccountDetailsDTO = new TraveliniAccountDetailsDTO();

		traveliniAccountDetailsDTO.setAccountId(traveliniAccount.getAccountId());
		traveliniAccountDetailsDTO.setName(traveliniAccount.getName());
		traveliniAccountDetailsDTO.setEmail(traveliniAccount.getEmail());
		traveliniAccountDetailsDTO.setPhoneNum(traveliniAccount.getPhoneNum());
	//	traveliniAccountDetailsDTO.setAddress(traveliniAccount.getA);
		traveliniAccountDetailsDTO.setUpdateFlag(true);
		traveliniAccount.setUpdateFlag(true);
		
		repo.save(traveliniAccount);
		traveliniAccountDetailsDTO.setCountry(traveliniAccountSetting.getCountry());
		traveliniAccountDetailsDTO.setCurrency(traveliniAccountSetting.getCurrency());
		traveliniAccountDetailsDTO.setAddress(traveliniAccountSetting.getAddress());
		traveliniAccountDetailsDTO.setNationality(traveliniAccountSetting.getNationality());

		
		
		
		
		Country residenceCountry = traveliniAccountSetting.getResidenceCountry();
		SupportedCurrency preferredCurrency = traveliniAccountSetting.getPreferredCurrency();
		List<String> travelStyles = traveliniAccountSetting.getPreferredTravelStyles();
		List<String> travelTypes = traveliniAccountSetting.getPreferredTravelTypes();
//		String phoneNum =  traveliniAccountSetting.getPhoneNum();
		
		
		boolean showConversation = (residenceCountry != null || preferredCurrency != null || travelStyles != null
				|| travelTypes != null) ? false : true;

		if (residenceCountry != null)
			traveliniAccountDetailsDTO.setResidenceCountryId(residenceCountry.getId());

		if (preferredCurrency != null)
			traveliniAccountDetailsDTO.setCurrencyId(preferredCurrency.getCurrencyId());

//		if(residenceCountry != null)
//			traveliniAccountDetailsDTO.setCountry(residenceCountry.getName());
		
//		if(preferredCurrency != null)
//			traveliniAccountDetailsDTO.setCurrency(preferredCurrency.getName());
		
		
		
		traveliniAccountDetailsDTO.setTravelStyle(travelStyles);
		traveliniAccountDetailsDTO.setTravelType(travelTypes);

		
		Map<String, Object> configurations = new HashMap<>();

		configurations.put("showConversation", showConversation);

		traveliniAccountDetailsDTO.setConfiguration(configurations);

		return new GenericResponse<TraveliniAccountDetailsDTO>(ResponseCode.SUC_GENERIC,
				Collections.singletonList(traveliniAccountDetailsDTO));
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			return new GenericResponse<TraveliniAccountDetailsDTO>(ResponseCode.ERR_GENERIC,
					null);
		}

	}

}
