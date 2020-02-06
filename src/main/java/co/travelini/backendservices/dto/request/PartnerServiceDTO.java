package co.travelini.backendservices.dto.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import co.travelini.backendservices.dto.response.success.PrimaryContactDTO;
import co.travelini.backendservices.entity.ServiceTransactionList;
import co.travelini.backendservices.util.PartnerServiceRequestType;

/**
 * 
 * @author Prabhu
 *
 */

@JsonPropertyOrder({ "itineraryId","accId", "name", "primaryCountactId", "accountId", "originDestinationDetails","transCode","TransactionDetails" })
public class PartnerServiceDTO {

	@JsonProperty("itineraryId")
	private Long itineraryId;
	
	@JsonProperty("accId")
	private String accId;
	
	@JsonProperty("type")
	private PartnerServiceRequestType type;
	
	@JsonProperty("transCode")
	private String transCode;
	
	


	@JsonProperty("originDestinationDetails")
	private List<OriginDestinationDetailDTO> originDestinationDetailDTOList;

	@JsonProperty("primaryContact")
	private PrimaryContactDTO primaryContactDTO;
	
	@JsonProperty("licenseDeliveryType")
	private String licenseDeliveryType;
	
    @JsonProperty("forexDetails")
	private List<ForexAmountDetailDTO> forexAmountsDTOList;

	//@JsonProperty("forexDetails")
	//private ForexAmountDetail forexAmountsDTOList;
	
	//@JsonProperty("forexDetails")
	//private ForexAmountDetailDTO forexAmountsDTOList;

	@JsonProperty("TransactionDetails")
	private List<ServiceTransactionList> serviceTransactionList;

	public Long getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(Long itineraryId) {
		this.itineraryId = itineraryId;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public PartnerServiceRequestType getType() {
		return type;
	}

	public void setType(PartnerServiceRequestType type) {
		this.type = type;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public List<OriginDestinationDetailDTO> getOriginDestinationDetailDTOList() {
		return originDestinationDetailDTOList;
	}

	public void setOriginDestinationDetailDTOList(List<OriginDestinationDetailDTO> originDestinationDetailDTOList) {
		this.originDestinationDetailDTOList = originDestinationDetailDTOList;
	}

	public PrimaryContactDTO getPrimaryContactDTO() {
		return primaryContactDTO;
	}

	public void setPrimaryContactDTO(PrimaryContactDTO primaryContactDTO) {
		this.primaryContactDTO = primaryContactDTO;
	}

	public String getLicenseDeliveryType() {
		return licenseDeliveryType;
	}

	public void setLicenseDeliveryType(String licenseDeliveryType) {
		this.licenseDeliveryType = licenseDeliveryType;
	}

	public List<ForexAmountDetailDTO> getForexAmountsDTOList() {
		return forexAmountsDTOList;
	}

	public void setForexAmountsDTOList(List<ForexAmountDetailDTO> forexAmountsDTOList) {
		this.forexAmountsDTOList = forexAmountsDTOList;
	}

	public List<ServiceTransactionList> getServiceTransactionList() {
		return serviceTransactionList;
	}

	public void setServiceTransactionList(List<ServiceTransactionList> serviceTransactionList) {
		this.serviceTransactionList = serviceTransactionList;
	}

	
	
}