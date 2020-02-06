package co.travelini.backendservices.dto.request;

import java.math.BigInteger;

public class Hotel {
	
	/**
	 * vendor location info
	 */
	private String providerCode;
	private String VendorCode;
	private String VendorLocationID;
	private String Key;		
	private String hotelChain;
	private String hotelCode;
	private String hotelLocation; 
	private String name; 
	private String vendorLocationKey;
	private BigInteger hotelTransportation;
	private String reserveRequirement;
	private String participationLevel; 
	private String availability;
	private Double rating;
	
	
	/**
	 * address info
	 */
	private String address;
	private double latitude;
	private double longitude;
	private Distance distance;
	
	/**
	 * price info
	 */
	private String minimumAmount;
	private String maximunAmount;
	
   

	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	


	



	public String getProviderCode() {
		return providerCode;
	}








	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}








	public String getVendorCode() {
		return VendorCode;
	}




	public void setVendorCode(String vendorCode) {
		VendorCode = vendorCode;
	}




	public String getVendorLocationID() {
		return VendorLocationID;
	}




	public void setVendorLocationID(String vendorLocationID) {
		VendorLocationID = vendorLocationID;
	}




	public String getKey() {
		return Key;
	}




	public void setKey(String key) {
		Key = key;
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



	public String getVendorLocationKey() {
		return vendorLocationKey;
	}



	public void setVendorLocationKey(String vendorLocationKey) {
		this.vendorLocationKey = vendorLocationKey;
	}



	public BigInteger getHotelTransportation() {
		return hotelTransportation;
	}



	public void setHotelTransportation(BigInteger hotelTransportation) {
		this.hotelTransportation = hotelTransportation;
	}



	public String getReserveRequirement() {
		return reserveRequirement;
	}



	public void setReserveRequirement(String reserveRequirement) {
		this.reserveRequirement = reserveRequirement;
	}



	public String getParticipationLevel() {
		return participationLevel;
	}



	public void setParticipationLevel(String participationLevel) {
		this.participationLevel = participationLevel;
	}



	public String getAvailability() {
		return availability;
	}



	public void setAvailability(String availability) {
		this.availability = availability;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	



	public double getLatitude() {
		return latitude;
	}








	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}








	public double getLongitude() {
		return longitude;
	}








	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public String getMinimumAmount() {
		return minimumAmount;
	}



	public void setMinimumAmount(String minimumAmount) {
		this.minimumAmount = minimumAmount;
	}



	public String getMaximunAmount() {
		return maximunAmount;
	}



	public void setMaximunAmount(String maximunAmount) {
		this.maximunAmount = maximunAmount;
	}




	public Distance getDistance() {
		return distance;
	}




	public void setDistance(Distance distance) {
		this.distance = distance;
	}




	public Double getRating() {
		return rating;
	}




	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	
	

}
