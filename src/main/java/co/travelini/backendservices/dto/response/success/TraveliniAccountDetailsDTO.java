package co.travelini.backendservices.dto.response.success;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({ "accountId", "name", "email", "phNo", "currencyId", "residenceCountryId","country" , "currency", "travelStyle",
		"travelType", "configs" })
public class TraveliniAccountDetailsDTO {

	@JsonProperty("accountId")
	private long accountId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("email")
	private String email;

	@JsonProperty("phNo")
	private String phoneNum;

	private String currency;
	
	private String country;
	
	private String imageLocation;
	
	private boolean updateFlag;
	
	@JsonProperty("currencyId")
	private long currencyId;

	@JsonProperty("residenceCountryId")
	private long residenceCountryId;

	@JsonProperty("travelStyle")
	private List<String> travelStyle;

	@JsonProperty("travelType")
	private List<String> travelType;

	@JsonProperty("configs")
	private Map<String, Object> configuration;

	@JsonProperty("Nationality")
	private String nationality;

	@JsonProperty("Address")
	private String address;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
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

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public boolean isUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(boolean updateFlag) {
		this.updateFlag = updateFlag;
	}

	public long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(long currencyId) {
		this.currencyId = currencyId;
	}

	public long getResidenceCountryId() {
		return residenceCountryId;
	}

	public void setResidenceCountryId(long residenceCountryId) {
		this.residenceCountryId = residenceCountryId;
	}

	public List<String> getTravelStyle() {
		return travelStyle;
	}

	public void setTravelStyle(List<String> travelStyle) {
		this.travelStyle = travelStyle;
	}

	public List<String> getTravelType() {
		return travelType;
	}

	public void setTravelType(List<String> travelType) {
		this.travelType = travelType;
	}

	public Map<String, Object> getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Map<String, Object> configuration) {
		this.configuration = configuration;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
