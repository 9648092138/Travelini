package co.travelini.backendservices.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;




@JsonPropertyOrder({ "email", "password" })
public class LoginWithEmailDTO {

	@NotBlank(message = "Email cannot be blank.")
	@Email(message = "Invalid Email Format.")
	@JsonProperty("email")
	private String email;

	@NotBlank(message = "Password cannot be blank")
	@JsonProperty("password")
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
