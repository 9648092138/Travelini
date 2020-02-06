package co.travelini.backendservices.dto.request;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author Ram
 *
 */

@JsonSerialize
@JsonAutoDetect
@JsonInclude(Include.NON_NULL)
public class ForexAmountDetailDTO {

	
	private Long currencyId;

	private BigDecimal amount;
    
	//private Long amount;
	
	//public ForexAmountDetailDTO()
//	public PrimaryContactDTO(PrimaryContact primaryContact) {
//		if (primaryContact != null) {
//			this.primaryContactId = primaryContact.getPrimaryContactId();
//			this.address = primaryContact.getAddress();
//			this.emailId = primaryContact.getEmailId();
//			this.name = primaryContact.getName();
//			this.phoneNum = primaryContact.getPhoneNum();
//			this.countryId = primaryContact.getCountryId();
//		}
//	}

	public Long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	

	
}