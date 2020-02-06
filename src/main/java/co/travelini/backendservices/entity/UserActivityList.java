package co.travelini.backendservices.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.transaction.Transactional;

import co.travelini.backendservices.dto.response.CategoryResponse;
import co.travelini.backendservices.dto.response.GroupSize;
import co.travelini.backendservices.dto.response.Language;

@Entity
public class UserActivityList {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	private String operationaldays;
	private String title;
	
	@Lob
	private String description;
	

	@Lob
	private String about;
	private String meetingpoint;
	private String duration;
	private String validity;
	private String coverimgurl;
	private String currency;

	private String servicefee;
	private String retail_price_without_service_fee;
	private int discount;
	private String retail;
	private Double latitude;
	private Double longitude;
	private Long bucketListId;
	
	public UserActivityList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserActivityList(String operationaldays, String title, String description, String about, String meetingpoint,
			String duration, String validity, String coverimgurl,
			String currency, String servicefee, String retail_price_without_service_fee, int discount,
			String retail, Double latitude, Double longitude, Long bucketListId) {
		super();
		this.operationaldays = operationaldays;
		this.title = title;
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
		this.bucketListId = bucketListId;
	}
	public String getOperationaldays() {
		return operationaldays;
	}
	public void setOperationaldays(String operationaldays) {
		this.operationaldays = operationaldays;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Object getServicefee() {
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
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getRetail() {
		return retail;
	}
	public void setRetail(String retail) {
		this.retail = retail;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getBucketListId() {
		return bucketListId;
	}
	public void setBucketListId(Long bucketListId) {
		this.bucketListId = bucketListId;
	}
	
	
}
