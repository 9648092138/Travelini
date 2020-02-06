package co.travelini.backendservices.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import co.travelini.backendservices.dto.validation.ValidPassword;


@JsonPropertyOrder({ "name", "email", "password" })
public class RegisterWithEmailDTO {

	@NotBlank(message = "Name cannot be blank.")
	@JsonProperty("name")
	private String name;

	@NotBlank(message = "Email cannot be blank.")
	@Email(message = "Invalid Email Format.")
	@JsonProperty("email")
	private String email;

	@NotBlank(message = "Password cannot be blank")
	@Size(min = 8, max = 15)
	@ValidPassword
	@JsonProperty("password")
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	


}
