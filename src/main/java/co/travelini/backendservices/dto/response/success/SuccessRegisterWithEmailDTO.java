package co.travelini.backendservices.dto.response.success;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "account-id", "name", "email", "enabled", "verification-email-sent" })
public class SuccessRegisterWithEmailDTO {

	@JsonProperty("account-id")
	private Long accountId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("email")
	private String email;

	@JsonProperty("enabled")
	private Boolean enabled;

	@JsonProperty("verification-email-sent")
	private Boolean verificationEmailSent;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getVerificationEmailSent() {
		return verificationEmailSent;
	}

	public void setVerificationEmailSent(Boolean verificationEmailSent) {
		this.verificationEmailSent = verificationEmailSent;
	}
	
	

}
