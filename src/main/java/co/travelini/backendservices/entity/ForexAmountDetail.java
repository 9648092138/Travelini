package co.travelini.backendservices.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.travelini.backendservices.dto.request.ForexAmountDetailDTO;
import co.travelini.backendservices.entity.master.SupportedCurrency;


@Entity
@Table(name = "forex_amount_details")
public class ForexAmountDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "forex_amount_details_id", nullable = false)
	private long forexAmountDetailId;

	@Column(name = "currency_id")
	private Long currencyId;

	@Column(name = "amount", length = 16, nullable = false)
	private BigDecimal amount;

	@OneToOne
	@JoinColumn(name = "currency_id", referencedColumnName = "currency_id", nullable = false, insertable = false, updatable = false)
	private SupportedCurrency supportedCurrency;

	public ForexAmountDetail() 
	{
		
	}

	public ForexAmountDetail(ForexAmountDetailDTO forexAmountDetailDTO) {

		if (forexAmountDetailDTO != null)
		{
			this.currencyId = forexAmountDetailDTO.getCurrencyId();
			this.amount = forexAmountDetailDTO.getAmount();
		}
	}

	public long getForexAmountDetailId() {
		return forexAmountDetailId;
	}

	public void setForexAmountDetailId(long forexAmountDetailId) {
		this.forexAmountDetailId = forexAmountDetailId;
	}

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

	public SupportedCurrency getSupportedCurrency() {
		return supportedCurrency;
	}

	public void setSupportedCurrency(SupportedCurrency supportedCurrency) {
		this.supportedCurrency = supportedCurrency;
	}
	
	
}