package co.travelini.backendservices.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "linked_accounts")
public class LinkedSocialAccount {

	@Id
	@Column(name = "social_user_id", nullable = false)
	private String socialUserId;

	@ManyToOne(targetEntity = TraveliniAccount.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id", nullable = false)
	private TraveliniAccount traveliniAccount;

	@Column(name = "domain", nullable = false)
	private String domain;

	public String getSocialUserId() {
		return socialUserId;
	}

	public void setSocialUserId(String socialUserId) {
		this.socialUserId = socialUserId;
	}

	public TraveliniAccount getTraveliniAccount() {
		return traveliniAccount;
	}

	public void setTraveliniAccount(TraveliniAccount traveliniAccount) {
		this.traveliniAccount = traveliniAccount;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	

}
