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
@Table(name = "ps_to_forex_amount")
public class PSForexAmount
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ps_to_forexamount_id", nullable = false)
	private long psForexAmountId;

	@Column(name = "forex_amount_details_id")
	private Long forexAmountDetailsId;

	@Column(name = "ps_request_id")
	private Long psRequestId;

	@OneToOne
	@JoinColumn(name = "forex_amount_details_id", referencedColumnName = "forex_amount_details_id", insertable = false, updatable = false)
	private ForexAmountDetail forexAmount;

	@OneToOne
	@JoinColumn(name = "ps_request_id", referencedColumnName = "partner_service_request_id", insertable = false, updatable = false)
	private PartnerServiceRequest psRequest;

	public PSForexAmount() {

	}

	public PSForexAmount(Long forexAmountDetailsId, Long psRequestId) 
	{
		this.forexAmountDetailsId = forexAmountDetailsId;
		this.psRequestId = psRequestId;
	}
}