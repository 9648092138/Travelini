package co.travelini.backendservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class ActivityBucketList {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long bucketId;
	
	private String operationaldays;
	
	@Lob
	private String description;
	
	@Lob
	private String about;
	
	@Lob
	private String meetingpoint;
	private String duration;
	private String validity;
	private String coverimgurl;
	private String currency;
	private String servicefee;
	private String retail_price_without_service_fee;
	private String discount;
	private String retail;
	private String latitude;
	private String longitude;
	public ActivityBucketList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ActivityBucketList(long id, long bucketId, String operationaldays, String description, String about,
			String meetingpoint, String duration, String validity, String coverimgurl, String currency,
			String servicefee, String retail_price_without_service_fee, String discount, String retail, String latitude,
			String longitude) {
		super();
		this.id = id;
		this.bucketId = bucketId;
		this.operationaldays = operationaldays;
		this.description = description;
		this.about = about;
		this.meetingpoint = meetingpoint;
		this.duration = duration;
		this.validity = validity;
		this.coverimgurl = coverimgurl;
		this.currency = currency;
		this.servicefee = servicefee;
		this.retail_price_without_service_fee = retail_price_without_service_fee;
		this.discount = discount;
		this.retail = retail;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getBucketId() {
		return bucketId;
	}
	public void setBucketId(long bucketId) {
		this.bucketId = bucketId;
	}
	public String getOperationaldays() {
		return operationaldays;
	}
	public void setOperationaldays(String operationaldays) {
		this.operationaldays = operationaldays;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getMeetingpoint() {
		return meetingpoint;
	}
	public void setMeetingpoint(String meetingpoint) {
		this.meetingpoint = meetingpoint;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getCoverimgurl() {
		return coverimgurl;
	}
	public void setCoverimgurl(String coverimgurl) {
		this.coverimgurl = coverimgurl;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getServicefee() {
		return servicefee;
	}
	public void setServicefee(String servicefee) {
		this.servicefee = servicefee;
	}
	public String getRetail_price_without_service_fee() {
		return retail_price_without_service_fee;
	}
	public void setRetail_price_without_service_fee(String retail_price_without_service_fee) {
		this.retail_price_without_service_fee = retail_price_without_service_fee;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getRetail() {
		return retail;
	}
	public void setRetail(String retail) {
		this.retail = retail;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "ActivityBucketList [id=" + id + ", bucketId=" + bucketId + ", operationaldays=" + operationaldays
				+ ", description=" + description + ", about=" + about + ", meetingpoint=" + meetingpoint + ", duration="
				+ duration + ", validity=" + validity + ", coverimgurl=" + coverimgurl + ", currency=" + currency
				+ ", servicefee=" + servicefee + ", retail_price_without_service_fee="
				+ retail_price_without_service_fee + ", discount=" + discount + ", retail=" + retail + ", latitude="
				+ latitude + ", longitude=" + longitude + "]";
	}
	
	
}
