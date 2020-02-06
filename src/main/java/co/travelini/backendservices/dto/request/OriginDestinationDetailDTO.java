package co.travelini.backendservices.dto.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;



/**
 * 
 * @author Prabhu
 *
 */

@JsonSerialize
@JsonAutoDetect
@JsonInclude(Include.NON_NULL)
public class OriginDestinationDetailDTO {

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date startDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date endDate;

	private Integer adultCount;

	private Integer childCount;

	private Integer itineraryId;

	private Long countryId;

	private Long originCountryId;

	private Long destinationCountryId;

	private Integer visaCount;

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

	public Integer getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(Integer itineraryId) {
		this.itineraryId = itineraryId;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
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


	
}