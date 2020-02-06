package co.travelini.backendservices.event;

import org.springframework.context.ApplicationEvent;

import co.travelini.backendservices.entity.TraveliniAccount;

public class OnRegistrationCompleteEvent extends ApplicationEvent {

	/**
	 * Auto Generated Serial Version UID
	 */
	private static final long serialVersionUID = 1603610141450746850L;

	public OnRegistrationCompleteEvent(TraveliniAccount traveliniAccount) {
		super(traveliniAccount);
	}

	public TraveliniAccount getTraveliniAccount() {
		return (TraveliniAccount) source;
	}

}
