package co.travelini.backendservices.dto.request;

import javax.annotation.Nullable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;




@JsonPropertyOrder({ "domain", "social-user-id", "name", "email" })
	//, "tNc-accepted" })
public class LoginWithSocialDTO {

	@NotBlank
	@JsonProperty("domain")
	private String domain;

	@NotBlank
	@JsonProperty("social-user-id")
	private String socialUserId;

	@NotBlank
	@JsonProperty("name")
	private String name;

	@Nullable
	@Email
	@JsonProperty("email")
	private String email;

	@JsonProperty("tNc-accepted")
	private boolean tncAccepted ;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSocialUserId() {
		return socialUserId;
	}

	public void setSocialUserId(String socialUserId) {
		this.socialUserId = socialUserId;
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

	public boolean isTncAccepted() {
		return tncAccepted;
	}

	public void setTncAccepted(boolean tncAccepted) {
		this.tncAccepted = tncAccepted;
	}
	
	

}
