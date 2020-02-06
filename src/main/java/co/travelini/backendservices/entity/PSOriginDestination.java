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
@Table(name = "partnerservice_to_origin_dest")
public class PSOriginDestination {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "partnerservice_to_origin_dest_id", nullable = false)
	private long partnerserviceToOriginDestId;

	@Column(name = "origin_destination_details_id")
	private Long originDestinationDetailsId;

	@Column(name = "partner_service_request_id")
	private Long psRequestId;

	@OneToOne
	@JoinColumn(name = "origin_destination_details_id", referencedColumnName = "origin_destination_details_id", insertable = false, updatable = false)
	private OriginDestinationDetail originDestinationDetail;

	@OneToOne
	@JoinColumn(name = "partner_service_request_id", referencedColumnName = "partner_service_request_id", insertable = false, updatable = false)
	private PartnerServiceRequest psRequest;

	public PSOriginDestination() {

	}

	public PSOriginDestination(Long originDestinationDetailsId, Long psRequestId) {
		this.originDestinationDetailsId = originDestinationDetailsId;
		this.psRequestId = psRequestId;
	}

	public long getPartnerserviceToOriginDestId() {
		return partnerserviceToOriginDestId;
	}

	public void setPartnerserviceToOriginDestId(long partnerserviceToOriginDestId) {
		this.partnerserviceToOriginDestId = partnerserviceToOriginDestId;
	}

	public Long getOriginDestinationDetailsId() {
		return originDestinationDetailsId;
	}

	public void setOriginDestinationDetailsId(Long originDestinationDetailsId) {
		this.originDestinationDetailsId = originDestinationDetailsId;
	}

	public Long getPsRequestId() {
		return psRequestId;
	}

	public void setPsRequestId(Long psRequestId) {
		this.psRequestId = psRequestId;
	}

	public OriginDestinationDetail getOriginDestinationDetail() {
		return originDestinationDetail;
	}

	public void setOriginDestinationDetail(OriginDestinationDetail originDestinationDetail) {
		this.originDestinationDetail = originDestinationDetail;
	}

	public PartnerServiceRequest getPsRequest() {
		return psRequest;
	}

	public void setPsRequest(PartnerServiceRequest psRequest) {
		this.psRequest = psRequest;
	}
	
	
}