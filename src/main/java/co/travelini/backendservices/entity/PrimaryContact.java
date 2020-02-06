package co.travelini.backendservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.travelini.backendservices.dto.response.success.PrimaryContactDTO;
import co.travelini.backendservices.entity.master.Country;


@Entity
@Table(name = "primary_contact")
public class PrimaryContact {

	@Id
	@Column(name = "primary_contactid", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long primaryContactId;

	@Column(name = "name", length = 255, nullable = false)
	private String name;

	@Column(name = "email_id", unique = false, length = 255, nullable = false)
	private String emailId;

	@Column(name = "phone_num", length = 32)
	private String phoneNum;

	@Column(name = "address", length = 255, nullable = false)
	private String address;
	
	@Column(name = "amount", length = 255, nullable = false)
	private String amount;


	@Column(name = "nationality_country_id")
	private Long countryId;

	@ManyToOne
	@JoinColumn(name = "nationality_country_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
	private Country country;

	public PrimaryContact() {

	}

	public PrimaryContact(PrimaryContactDTO primaryContactDTO) {

		if (primaryContactDTO != null) {
			this.name = primaryContactDTO.getName();
			this.emailId = primaryContactDTO.getEmailId();
			this.phoneNum = primaryContactDTO.getPhoneNum();
			this.address = primaryContactDTO.getAddress();
			this.countryId = primaryContactDTO.getCountryId();
			this.amount = primaryContactDTO.getAmount();
		}
	}

	public long getPrimaryContactId() {
		return primaryContactId;
	}

	public void setPrimaryContactId(long primaryContactId) {
		this.primaryContactId = primaryContactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}


}