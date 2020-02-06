package co.travelini.backendservices.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import co.travelini.backendservices.entity.master.Country;
import co.travelini.backendservices.entity.master.SupportedCurrency;


@Entity
@Table(name = "travelini_account_setting")
public class TraveliniAccountSetting {

	@Id
	@Column(name = "travelini_account_setting_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long travelini_account_setting_id;

	@JsonIgnore
	@OneToOne(targetEntity = TraveliniAccount.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id")
	private TraveliniAccount traveliniAccount;

	@OneToOne(targetEntity = SupportedCurrency.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "preferred_currency_id")
	private SupportedCurrency preferredCurrency;

	@OneToOne(targetEntity = Country.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "residence_country_id")
	private Country residenceCountry;

	@ElementCollection
	private List<String> preferredTravelStyles;

	@ElementCollection
	private List<String> preferredTravelTypes;

	@Column(name = "country" , nullable = true)
	private String country;
	
	@Column(name ="Nationality")
	private String nationality;
	
	@Column(name ="Address")
	private String address;
	
	@Column(name = "currency" , nullable = true)
	private String currency;
	
	@Column(name = "ImageLocation" , nullable = true)
	private String imageLocation;

	public long getTravelini_account_setting_id() {
		return travelini_account_setting_id;
	}

	public void setTravelini_account_setting_id(long travelini_account_setting_id) {
		this.travelini_account_setting_id = travelini_account_setting_id;
	}

	public TraveliniAccount getTraveliniAccount() {
		return traveliniAccount;
	}

	public void setTraveliniAccount(TraveliniAccount traveliniAccount) {
		this.traveliniAccount = traveliniAccount;
	}

	public SupportedCurrency getPreferredCurrency() {
		return preferredCurrency;
	}

	public void setPreferredCurrency(SupportedCurrency preferredCurrency) {
		this.preferredCurrency = preferredCurrency;
	}

	public Country getResidenceCountry() {
		return residenceCountry;
	}

	public void setResidenceCountry(Country residenceCountry) {
		this.residenceCountry = residenceCountry;
	}

	public List<String> getPreferredTravelStyles() {
		return preferredTravelStyles;
	}

	public void setPreferredTravelStyles(List<String> preferredTravelStyles) {
		this.preferredTravelStyles = preferredTravelStyles;
	}

	public List<String> getPreferredTravelTypes() {
		return preferredTravelTypes;
	}

	public void setPreferredTravelTypes(List<String> preferredTravelTypes) {
		this.preferredTravelTypes = preferredTravelTypes;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	
}
