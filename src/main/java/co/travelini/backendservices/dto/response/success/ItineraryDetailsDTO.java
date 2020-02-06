package co.travelini.backendservices.dto.response.success;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import co.travelini.backendservices.entity.Itinerary;

/**
 * 
 * @author Prabhu
 *
 */

@JsonSerialize
@JsonAutoDetect
@JsonInclude(Include.NON_NULL)
public class ItineraryDetailsDTO {

	private long itineraryId;
    private long userId;
	private String name;
    private String	itineraryImage;
    private String location;
	
	public ItineraryDetailsDTO() {

	}

	public ItineraryDetailsDTO(Itinerary itinerary) {

		if (itinerary != null) {
			this.itineraryId = itinerary.getItineraryId();
			this.name = itinerary.getName();
			this.itineraryImage=itinerary.getItineraryImage();
			this.userId =itinerary.getAccountId();
			this.location =itinerary.getLocation();
		}
	}

	public long getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(long itineraryId) {
		this.itineraryId = itineraryId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItineraryImage() {
		return itineraryImage;
	}

	public void setItineraryImage(String itineraryImage) {
		this.itineraryImage = itineraryImage;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}