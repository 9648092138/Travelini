package co.travelini.backendservices.dto.request;

import java.util.ArrayList;

public class CreateItineraryRequest {
	
	private long userId;
	private String itineraryName;
	private String itineraryImage;
	private Integer numberOfAdults;
	private Integer numberOfChilds;
	private Integer numberOfInfants;
	private String startDate;
	private String endDate;
	private String budget;
	private String location;
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private Boolean isBooked;
	private ArrayList<Long> flightId;
	private ArrayList<Long> hotelId;
	private ArrayList<Long> activitiesId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getItineraryName() {
		return itineraryName;
	}

	public void setItineraryName(String itineraryName) {
		this.itineraryName = itineraryName;
	}

	public String getItineraryImage() {
		return itineraryImage;
	}

	public void setItineraryImage(String itineraryImage) {
		this.itineraryImage = itineraryImage;
	}

	public Integer getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(Integer numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public Integer getNumberOfChilds() {
		return numberOfChilds;
	}

	public void setNumberOfChilds(Integer numberOfChilds) {
		this.numberOfChilds = numberOfChilds;
	}

	public Integer getNumberOfInfants() {
		return numberOfInfants;
	}

	public void setNumberOfInfants(Integer numberOfInfants) {
		this.numberOfInfants = numberOfInfants;
	}


	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public Boolean getIsBooked() {
		return isBooked;
	}

	public void setIsBooked(Boolean isBooked) {
		this.isBooked = isBooked;
	}

	public ArrayList<Long> getFlightId() {
		return flightId;
	}

	public void setFlightId(ArrayList<Long> flightId) {
		this.flightId = flightId;
	}

	public ArrayList<Long> getHotelId() {
		return hotelId;
	}

	public void setHotelId(ArrayList<Long> hotelId) {
		this.hotelId = hotelId;
	}

	public ArrayList<Long> getActivitiesId() {
		return activitiesId;
	}

	public void setActivitiesId(ArrayList<Long> activitiesId) {
		this.activitiesId = activitiesId;
	}


}
