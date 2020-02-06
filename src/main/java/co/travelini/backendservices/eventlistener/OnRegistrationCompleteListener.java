package co.travelini.backendservices.eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.VerificationToken;
import co.travelini.backendservices.event.OnRegistrationCompleteEvent;
import co.travelini.backendservices.service.VerificationCodeEmailerService;
import co.travelini.backendservices.service.VerificationTokenService;
import co.travelini.backendservices.util.RandomStringGenerator;

@Component
public class OnRegistrationCompleteListener implements ApplicationListener<OnRegistrationCompleteEvent> {

	@Autowired
	public VerificationCodeEmailerService verificationCodeEmailerService;

	@Autowired
	public VerificationTokenService verificationTokenService;

	@Override
	public void onApplicationEvent(OnRegistrationCompleteEvent event) {

		TraveliniAccount traveliniAccount = event.getTraveliniAccount();

		VerificationToken verificationToken = this.generateVerificationToken(traveliniAccount);
		verificationToken = verificationTokenService.saveVerificationToken(verificationToken);

		this.sendVerificationEmail(traveliniAccount, verificationToken);
	}

	private VerificationToken generateVerificationToken(TraveliniAccount traveliniAccount) {

		VerificationToken verificationToken = new VerificationToken();

		verificationToken.setAccountId(traveliniAccount.getAccountId());
		verificationToken.setToken(RandomStringGenerator.generateRandomString());

		return verificationToken;
	}

	private void sendVerificationEmail(TraveliniAccount traveliniAccount, VerificationToken verificationToken) {

		String token = verificationToken.getToken();
		verificationCodeEmailerService.sendSimpleMessage(traveliniAccount, token);

	}

}
