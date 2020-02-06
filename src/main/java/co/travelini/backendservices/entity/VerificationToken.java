package co.travelini.backendservices.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "verification_token")
public class VerificationToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;

//	@OneToOne(targetEntity = TraveliniAccount.class, fetch = FetchType.EAGER, cascade=CascadeType.ALL )
//	@JoinColumn(name = "account_id", nullable = false)
////	@Column(name = "TraveliniAccount traveliniAccount")
//	private TraveliniAccount traveliniAccount;
	
	private long accountId;

	@Column(name = "token", nullable = false)
	private String token;

	
	@Column(name = "expiry", nullable = false)
	private LocalDateTime expiryDate = LocalDateTime.now().plusMinutes(300);
	
	@Column(name = "is_valid", nullable = false)
	private Boolean isValid = true;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	
}
