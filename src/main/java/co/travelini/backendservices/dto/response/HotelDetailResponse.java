package co.travelini.backendservices.dto.response;

import java.util.List;

import com.travelport.schema.common_v45_0.PhoneNumber;

import co.travelini.backendservices.dto.request.Distance;

public class HotelDetailResponse {
	
	/**
	 * hotel info
	 */
	private String hotelChain;
	private String hotelCode;
	private String hotelLocation; 
	private String name; 
	private String participationLevel;
	private List<String> addresses;
	private List<PhoneNumber> phoneNumber;
	private Distance distance;
	private List<String> marketingMessage;
	
	/**
	 * check in and checkout time
	 */
	private String checkInTime;
	private String checkOutTime;
	
	private List<RoomType> roomTypes; 
	
	private boolean sourceLink;
	
	
	

	public HotelDetailResponse() {
		// TODO Auto-generated constructor stub
	}




	public String getHotelChain() {
		return hotelChain;
	}




	public void setHotelChain(String hotelChain) {
		this.hotelChain = hotelChain;
	}




	public String getHotelCode() {
		return hotelCode;
	}




	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}




	public String getHotelLocation() {
		return hotelLocation;
	}




	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getParticipationLevel() {
		return participationLevel;
	}




	public void setParticipationLevel(String participationLevel) {
		this.participationLevel = participationLevel;
	}




	public List<String> getAddresses() {
		return addresses;
	}




	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	




	public List<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public Distance getDistance() {
		return distance;
	}




	public void setDistance(Distance distance) {
		this.distance = distance;
	}




	public List<String> getMarketingMessage() {
		return marketingMessage;
	}




	public void setMarketingMessage(List<String> marketingMessage) {
		this.marketingMessage = marketingMessage;
	}




	public String getCheckInTime() {
		return checkInTime;
	}




	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}




	public String getCheckOutTime() {
		return checkOutTime;
	}




	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}




	public List<RoomType> getRoomTypes() {
		return roomTypes;
	}




	public void setRoomTypes(List<RoomType> roomTypes) {
		this.roomTypes = roomTypes;
	}




	public boolean isSourceLink() {
		return sourceLink;
	}




	public void setSourceLink(boolean sourceLink) {
		this.sourceLink = sourceLink;
	}
	
	

}
