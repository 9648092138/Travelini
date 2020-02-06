package co.travelini.backendservices.controller;

import java.util.Collections;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.request.LoginWithSocialDTO;
import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.success.TokenResponseDTO;
import co.travelini.backendservices.entity.LinkedSocialAccount;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.TraveliniAccountSetting;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.security.JwtTokenProvider;
import co.travelini.backendservices.security.SecurityConstants;
import co.travelini.backendservices.service.LinkedSocialAccountService;
import co.travelini.backendservices.service.TraveliniAccountService;
import co.travelini.backendservices.service.TraveliniAccountSettingService;

@RestController
@RequestMapping("/api")
public class LoginWithSocialController {

	@Autowired
	private TraveliniAccountService traveliniAccountService;

	@Autowired
	private TraveliniAccountSettingService traveliniAccountSettingService;

	@Autowired
	private LinkedSocialAccountService linkedSocialAccountService;

	@Autowired
	private JwtTokenProvider jwtTokenProvider;

	@PostMapping("/v1/social/login")
	public GenericResponse<TokenResponseDTO> login(@Valid @RequestBody LoginWithSocialDTO loginWithSocialDTO)
			throws TraveliniException {

	boolean tncAccepted = loginWithSocialDTO.isTncAccepted();
		
		String name = loginWithSocialDTO.getName();
		String email = loginWithSocialDTO.getEmail();
		String socialUserId = loginWithSocialDTO.getSocialUserId();
		String domain = loginWithSocialDTO.getDomain();
		
		TraveliniAccount traveliniAccount = null;
		LinkedSocialAccount linkedSocialAccount = null;

		Optional<TraveliniAccount> traveliniAccountOpt = traveliniAccountService.retriveAccountByEmail(email);
		Optional<LinkedSocialAccount> linkedSocialAccountOpt = linkedSocialAccountService
				.retrieveLinkedSocialAccount(socialUserId);

		if (tncAccepted == false) {

			if (linkedSocialAccountOpt.isPresent()) {

				linkedSocialAccount = linkedSocialAccountOpt.get();
				traveliniAccount = linkedSocialAccount.getTraveliniAccount();

			} else if (!linkedSocialAccountOpt.isPresent() && traveliniAccountOpt.isPresent()) {

				traveliniAccount = traveliniAccountOpt.get();

				LinkedSocialAccount newLinkedSocialAccount = new LinkedSocialAccount();

				newLinkedSocialAccount.setSocialUserId(socialUserId);
				newLinkedSocialAccount.setDomain(domain);
				
				
				newLinkedSocialAccount.setTraveliniAccount(traveliniAccount);

				linkedSocialAccount = linkedSocialAccountService.save(newLinkedSocialAccount);
			} else {
				throw new TraveliniException(ResponseCode.ERR_ACCOUNT_NOT_FOUND);
			}

		} else {

			if (traveliniAccountOpt.isPresent() == false) {

				TraveliniAccount toRegisterAccount = new TraveliniAccount();

				TraveliniAccountSetting traveliniAccountSetting = new TraveliniAccountSetting();

				toRegisterAccount.setName(name);
				toRegisterAccount.setEmail(email);
				toRegisterAccount.setEnabled(true);
				toRegisterAccount.setUpdateFlag(false);
//				toRegisterAccount.setUpdateFlag(true);
				toRegisterAccount.setTraveliniAccountSetting(traveliniAccountSetting);

				traveliniAccountSettingService.saveAccountSettings(traveliniAccountSetting);

				traveliniAccount = traveliniAccountService.saveTraveliniAccount(toRegisterAccount);

			} else
				traveliniAccount = traveliniAccountOpt.get();

			LinkedSocialAccount newLinkedSocialAccount = new LinkedSocialAccount();

			newLinkedSocialAccount.setSocialUserId(socialUserId);
			newLinkedSocialAccount.setDomain(domain);
			newLinkedSocialAccount.setTraveliniAccount(traveliniAccount);

			linkedSocialAccount = linkedSocialAccountService.save(newLinkedSocialAccount);

		}

		// FIXME : When Roles are introduced, incorporate roles here.
		String token = jwtTokenProvider.createToken(email, null);

		TokenResponseDTO tokenResponseDTO = new TokenResponseDTO();

		tokenResponseDTO.setTokenType(SecurityConstants.BEARER);
		tokenResponseDTO.setToken(token);
		tokenResponseDTO.setAccountId(traveliniAccount.getAccountId());
		tokenResponseDTO.setName(traveliniAccount.getName());
		tokenResponseDTO.setUpdateFlag(traveliniAccount.isUpdateFlag());

		return new GenericResponse<>(ResponseCode.SUC_LOGGED_IN, Collections.singletonList(tokenResponseDTO));
	}
}
