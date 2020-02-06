package co.travelini.backendservices.dto.request;

import java.util.ArrayList;
import java.util.List;

public class HotelSearchRequest {

	private String location;

	private Integer numberofAdult;

	private Integer numberOfRooms;
	
	private Integer numberOfChilds;

	private boolean availableHotelsOnly;

	private String checkInDate;

	private String checkOutDate;

	private List<String> hotelBedding = new ArrayList<>();

	public Integer getNumberOfChilds() {
		return numberOfChilds;
	}

	public void setNumberOfChilds(Integer numberOfChilds) {
		this.numberOfChilds = numberOfChilds;
	}

	public HotelSearchRequest() {
		// TODO Auto-generated constructor stub
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getNumberofAdult() {
		return numberofAdult;
	}

	public void setNumberofAdult(Integer noOfPerson) {
		this.numberofAdult = noOfPerson;
	}

	public Integer getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(Integer noOfRooms) {
		this.numberOfRooms = noOfRooms;
	}

	public boolean isAvailableHotelsOnly() {
		return availableHotelsOnly;
	}

	public void setAvailableHotelsOnly(boolean availableHotelsOnly) {
		this.availableHotelsOnly = availableHotelsOnly;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public List<String> getHotelBedding() {
		return hotelBedding;
	}

	public void setHotelBedding(List<String> hotelBedding) {
		this.hotelBedding = hotelBedding;
	}

}
