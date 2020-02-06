package co.travelini.backendservices.dto.response.success;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({ "id", "code", "name", "enabled" })
public class SupportedCurrencyDTO {

	@JsonProperty("id")
	private long id;

	@JsonProperty("code")
	private String code;

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("enabled")
	private boolean enabled;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	

}
