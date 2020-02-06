package co.travelini.backendservices.dto.response.success;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import co.travelini.backendservices.entity.PrimaryContact;

/**
 * 
 * @author Prabhu
 *
 */

@JsonSerialize
@JsonAutoDetect
@JsonInclude(Include.NON_NULL)
public class PrimaryContactDTO {

	private Long primaryContactId;

	private String address;

	private String emailId;

	private String name;

	private Long countryId;

	private String phoneNum;
	
    private String amount;
    
	public PrimaryContactDTO() {

	}

	public PrimaryContactDTO(PrimaryContact primaryContact) {
		if (primaryContact != null) {
			this.primaryContactId = primaryContact.getPrimaryContactId();
			this.address = primaryContact.getAddress();
			this.emailId = primaryContact.getEmailId();
			this.name = primaryContact.getName();
			this.phoneNum = primaryContact.getPhoneNum();
			this.countryId = primaryContact.getCountryId();
			this.amount =primaryContact.getAmount();
		}
	}

	public Long getPrimaryContactId() {
		return primaryContactId;
	}

	public void setPrimaryContactId(Long primaryContactId) {
		this.primaryContactId = primaryContactId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}


	
}
