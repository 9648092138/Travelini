package co.travelini.backendservices.dto.response;


import java.util.ArrayList;
import java.util.List;

import co.travelini.backendservices.entity.FavouriteList;


public class CreateItineraryResponse {

	

	private long userId;
	private long itineraryId;
	private String itineraryName;
	private String itineraryImage;
	private Integer numberOfAdults;
	private Integer numberOfChilds;
	private Integer numberOfInfants;
	private String startDate;
	private String  endDate;
	private String budget;
	private String location;
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private ArrayList<Long> flightdetail;
	private ArrayList<Long> hoteldetail;
	private List<FavouriteList> activitiesdetail;

	
	
	public ArrayList<Long> getFlightdetail() {
		return flightdetail;
	}

	public void setFlightdetail(ArrayList<Long> flightdetail) {
		this.flightdetail = flightdetail;
	}

	public ArrayList<Long> getHoteldetail() {
		return hoteldetail;
	}

	public void setHoteldetail(ArrayList<Long> hoteldetail) {
		this.hoteldetail = hoteldetail;
	}



	
	
	public List<FavouriteList> getActivitiesdetail() {
		return activitiesdetail;
	}

	public void setActivitiesdetail(List<FavouriteList> activitiesdetail) {
		this.activitiesdetail = activitiesdetail;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(long itineraryId) {
		this.itineraryId = itineraryId;
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
	public CreateItineraryResponse(long userId, long itineraryId, String itineraryName, String itineraryImage,
			Integer numberOfAdults, Integer numberOfChilds, Integer numberOfInfants, String startDate, String endDate,
			String budget, ArrayList<Long> flightdetail, ArrayList<Long> hoteldetail,
			List<FavouriteList> activitiesdetail) {
		super();
		this.userId = userId;
		this.itineraryId = itineraryId;
		this.itineraryName = itineraryName;
		this.itineraryImage = itineraryImage;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChilds = numberOfChilds;
		this.numberOfInfants = numberOfInfants;
		this.startDate = startDate;
		this.endDate = endDate;
		this.budget = budget;
		this.flightdetail = flightdetail;
		this.hoteldetail = hoteldetail;
		this.activitiesdetail = activitiesdetail;
	}

	public CreateItineraryResponse() {
		super();
	}
	

	
}
