package co.travelini.backendservices.dto.request;

import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateTraveliniAccountDTO {

	@JsonProperty("currencyId")
	private Optional<Long> currencyId;

	@JsonProperty("residenceCountryId")
	private Optional<Long> residenceCountryId;

	@JsonProperty("travelStyle")
	private Optional<List<String>> travelStyle;

	@JsonProperty("travelType")
	private Optional<List<String>> travelType;
	
	@JsonProperty("phoneNum")
	private String PhoneNum;

	@JsonProperty("Country")
	private String country;
	
	@JsonProperty("Currency")
	private String currency;
	
	@JsonProperty("Name")
	private String newName;
	
	@JsonProperty("Nationality")
	private String nationality;
	
	@JsonProperty("Address")
	private String address;

	public Optional<Long> getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Optional<Long> currencyId) {
		this.currencyId = currencyId;
	}

	public Optional<Long> getResidenceCountryId() {
		return residenceCountryId;
	}

	public void setResidenceCountryId(Optional<Long> residenceCountryId) {
		this.residenceCountryId = residenceCountryId;
	}

	public Optional<List<String>> getTravelStyle() {
		return travelStyle;
	}

	public void setTravelStyle(Optional<List<String>> travelStyle) {
		this.travelStyle = travelStyle;
	}

	public Optional<List<String>> getTravelType() {
		return travelType;
	}

	public void setTravelType(Optional<List<String>> travelType) {
		this.travelType = travelType;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
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
