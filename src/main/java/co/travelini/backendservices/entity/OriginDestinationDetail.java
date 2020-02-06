package co.travelini.backendservices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import co.travelini.backendservices.dto.request.OriginDestinationDetailDTO;
import co.travelini.backendservices.entity.master.Country;

/**
 * 
 * @author Prabhu
 *
 */

@Entity
@Table(name = "origin_destination_details")
public class OriginDestinationDetail {

	@Id
	@Column(name = "origin_destination_details_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long originDestinationDetailsId;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "adult_count")
	private Integer adultCount;

	@Column(name = "child_count")
	private Integer childCount;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "itinerary_id")
	private Itinerary itinerary;

	@Column(name = "origin_country_id")
	private Long originCountryId;

	@Column(name = "destination_country_id")
	private Long destinationCountryId;

	@Column(name = "visa_count")
	private Integer visaCount;

	@OneToOne
	@JoinColumn(name = "origin_country_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
	private Country originCountry;

	@OneToOne
	@JoinColumn(name = "destination_country_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
	private Country destinationCountry;
	
	
	
	public OriginDestinationDetail() {
	}

	public OriginDestinationDetail(OriginDestinationDetailDTO originDestinationDetailDTO) 
	{

		if (originDestinationDetailDTO != null) {
			this.startDate = originDestinationDetailDTO.getStartDate();
			this.endDate = originDestinationDetailDTO.getEndDate();
			this.adultCount = originDestinationDetailDTO.getAdultCount();
			this.childCount = originDestinationDetailDTO.getChildCount();
			this.originCountryId = originDestinationDetailDTO.getOriginCountryId();
			this.destinationCountryId = originDestinationDetailDTO.getDestinationCountryId();
			this.visaCount = originDestinationDetailDTO.getVisaCount();
		}
	}

	public long getOriginDestinationDetailsId() {
		return originDestinationDetailsId;
	}

	public void setOriginDestinationDetailsId(long originDestinationDetailsId) {
		this.originDestinationDetailsId = originDestinationDetailsId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getAdultCount() {
		return adultCount;
	}

	public void setAdultCount(Integer adultCount) {
		this.adultCount = adultCount;
	}

	public Integer getChildCount() {
		return childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	public Itinerary getItinerary() {
		return itinerary;
	}

	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}

	public Long getOriginCountryId() {
		return originCountryId;
	}

	public void setOriginCountryId(Long originCountryId) {
		this.originCountryId = originCountryId;
	}

	public Long getDestinationCountryId() {
		return destinationCountryId;
	}

	public void setDestinationCountryId(Long destinationCountryId) {
		this.destinationCountryId = destinationCountryId;
	}

	public Integer getVisaCount() {
		return visaCount;
	}

	public void setVisaCount(Integer visaCount) {
		this.visaCount = visaCount;
	}

	public Country getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(Country originCountry) {
		this.originCountry = originCountry;
	}

	public Country getDestinationCountry() {
		return destinationCountry;
	}

	public void setDestinationCountry(Country destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	
}