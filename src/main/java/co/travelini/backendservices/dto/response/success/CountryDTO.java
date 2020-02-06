package co.travelini.backendservices.dto.response.success;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "code", "name", "isdCode", "defaultCurrencyId", "enabled","currencyCode" })
public class CountryDTO {

	@JsonProperty("id")
	private long id;

	@JsonProperty("code")
	private String code;

	@JsonProperty("name")
	private String name;

	@JsonProperty("isdCode")
	private short isdCode;

	@JsonProperty("defaultCurrencyId")
	private long defaultCurrencyId;

	@JsonProperty("enabled")
	private boolean enabled;
	
	@JsonProperty("currencyCode")
	 private String currencyCode;

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

	public short getIsdCode() {
		return isdCode;
	}

	public void setIsdCode(short isdCode) {
		this.isdCode = isdCode;
	}

	public long getDefaultCurrencyId() {
		return defaultCurrencyId;
	}

	public void setDefaultCurrencyId(long defaultCurrencyId) {
		this.defaultCurrencyId = defaultCurrencyId;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	
}
