package co.travelini.backendservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "partner_service_request")
public class PartnerServiceRequest 
{

	@Id
	@Column(name = "partner_service_request_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long partnerServiceRequestId;

	@Column(name = "type", length = 255, nullable = false)
	private String type;
	
	@Column(name = "transcode")
	private String transCode;

	@Column(name = "primary_contact_id")
	private Long primaryContactId;

	@OneToOne
	@JoinColumn(name = "primary_contact_id", referencedColumnName = "primary_contactid", insertable = false, updatable = false)
	private PrimaryContact primaryContact;

	public long getPartnerServiceRequestId() {
		return partnerServiceRequestId;
	}

	public void setPartnerServiceRequestId(long partnerServiceRequestId) {
		this.partnerServiceRequestId = partnerServiceRequestId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public Long getPrimaryContactId() {
		return primaryContactId;
	}

	public void setPrimaryContactId(Long primaryContactId) {
		this.primaryContactId = primaryContactId;
	}

	public PrimaryContact getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(PrimaryContact primaryContact) {
		this.primaryContact = primaryContact;
	}

	
}