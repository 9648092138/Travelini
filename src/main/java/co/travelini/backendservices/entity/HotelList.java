package co.travelini.backendservices.entity;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "HotelList")
public class HotelList 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	
	@Column(nullable = false)
	private long bucketListId;

	private String providerCode;

	private String hotelChain;

	private String hotelCode;

	private String hotelLocation;

	private String name;

	private String vendorLocationKey;

	private int hotelTransportation;

	private String reserveRequirement;

	private int participationLevel;

	private boolean availability;

	private int rating;

	private int latitude;

	private int longitude;

	private String distance;

	private int minimumAmount;

	private int maxAmount;

	private String vendorCode;

	private String vendorLocationId;

	private String key;

	
	
public HotelList() {
		super();
		// TODO Auto-generated constructor stub
	}





public HotelList(long id, long bucketListId, String providerCode, String hotelChain, String hotelCode,
		String hotelLocation, String name, String vendorLocationKey, int hotelTransportation, String reserveRequirement,
		int participationLevel, boolean availability, int rating, int latitude, int longitude, String distance,
		int minimumAmount, int maxAmount, String vendorCode, String vendorLocationId, String key) {
	super();
	this.id = id;
	this.bucketListId = bucketListId;
	this.providerCode = providerCode;
	this.hotelChain = hotelChain;
	this.hotelCode = hotelCode;
	this.hotelLocation = hotelLocation;
	this.name = name;
	this.vendorLocationKey = vendorLocationKey;
	this.hotelTransportation = hotelTransportation;
	this.reserveRequirement = reserveRequirement;
	this.participationLevel = participationLevel;
	this.availability = availability;
	this.rating = rating;
	this.latitude = latitude;
	this.longitude = longitude;
	this.distance = distance;
	this.minimumAmount = minimumAmount;
	this.maxAmount = maxAmount;
	this.vendorCode = vendorCode;
	this.vendorLocationId = vendorLocationId;
	this.key = key;
}





public long getId() {
	return id;
}





public void setId(long id) {
	this.id = id;
}





public long getBucketListId() {
	return bucketListId;
}





public void setBucketListId(long bucketListId) {
	this.bucketListId = bucketListId;
}





public String getProviderCode() {
	return providerCode;
}





public void setProviderCode(String providerCode) {
	this.providerCode = providerCode;
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





public int getHotelTransportation() {
	return hotelTransportation;
}





public void setHotelTransportation(int hotelTransportation) {
	this.hotelTransportation = hotelTransportation;
}





public String getReserveRequirement() {
	return reserveRequirement;
}





public void setReserveRequirement(String reserveRequirement) {
	this.reserveRequirement = reserveRequirement;
}





public int getParticipationLevel() {
	return participationLevel;
}





public void setParticipationLevel(int participationLevel) {
	this.participationLevel = participationLevel;
}





public boolean isAvailability() {
	return availability;
}





public void setAvailability(boolean availability) {
	this.availability = availability;
}





public int getRating() {
	return rating;
}





public void setRating(int rating) {
	this.rating = rating;
}





public int getLatitude() {
	return latitude;
}





public void setLatitude(int latitude) {
	this.latitude = latitude;
}





public int getLongitude() {
	return longitude;
}





public void setLongitude(int longitude) {
	this.longitude = longitude;
}





public String getDistance() {
	return distance;
}





public void setDistance(String distance) {
	this.distance = distance;
}





public int getMinimumAmount() {
	return minimumAmount;
}





public void setMinimumAmount(int minimumAmount) {
	this.minimumAmount = minimumAmount;
}





public int getMaxAmount() {
	return maxAmount;
}





public void setMaxAmount(int maxAmount) {
	this.maxAmount = maxAmount;
}





public String getVendorCode() {
	return vendorCode;
}





public void setVendorCode(String vendorCode) {
	this.vendorCode = vendorCode;
}





public String getVendorLocationId() {
	return vendorLocationId;
}





public void setVendorLocationId(String vendorLocationId) {
	this.vendorLocationId = vendorLocationId;
}





public String getKey() {
	return key;
}





public void setKey(String key) {
	this.key = key;
}











}
