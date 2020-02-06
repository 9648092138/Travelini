package co.travelini.backendservices.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "FavouriteList")
public class FavouriteList {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
	
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator( name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
	
	private UUID bucketId;

	

	public UUID getBucketId() {
		return bucketId;
	}

	public void setBucketId(UUID bucketId) {
		this.bucketId = bucketId;
	}

	private long userId;

	private String operationalDays;

	@Column(length=10485760)
	private String description;

//	@Lob
//	private String about;

	
	@Column(length=10485760)
	private String meetingPoint;
	private String duration;
	private String validity;
	private String coverImg;
	private String currency;
	private String price;
	// private String retailPriceWithoutServiceFee;
	private String discount;
	private String retail;

//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}

	private String latitude;
	private String longitude;

	private String userEmail;
	private String bucketTitle;

	private long interestId;
	private String interestTitle;

	
	@Column(length=10485760)
	private String title;

	private String country;
	private String availability;

	@Column(length=10485760)
	private String doThisBecause;

	@Column(length=10485760)
	private String whatToExpect;

	@Column(length=10485760)
	private String whatsIncluded;

	@Column(length=10485760)
	private String whatsExcluded;

	@Column(length=10485760)
	private String reduced;

	@Column(length=10485760)
	private String wheres;

	@Column(length=10485760)
	private String whatToRemember;

	@Column(length=10485760)
	private String whens;

	private String language;
	private String groups;

	public String getBucketImage() {
		return bucketImage;
	}

	public void setBucketImage(String bucketImage) {
		this.bucketImage = bucketImage;
	}

	@Column(length=10485760)
	private String address;
	private String bucketImage;
	private String startDate;
	private String endDate;

	public String getUserEmail() {
		return userEmail;
	}

	public String getWheres() {
		return wheres;
	}

	public void setWheres(String wheres) {
		this.wheres = wheres;
	}

	public String getWhens() {
		return whens;
	}

	public void setWhens(String whens) {
		this.whens = whens;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getBucketTitle() {
		return bucketTitle;
	}

	public void setBucketTitle(String bucketTitle) {
		this.bucketTitle = bucketTitle;
	}

	public long getInterestId() {
		return interestId;
	}

	public void setInterestId(long interestId) {
		this.interestId = interestId;
	}

	public String getInterestTitle() {
		return interestTitle;
	}

	public void setInterestTitle(String interestTitle) {
		this.interestTitle = interestTitle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getDoThisBecause() {
		return doThisBecause;
	}

	public void setDoThisBecause(String doThisBecause) {
		this.doThisBecause = doThisBecause;
	}

	public String getWhatToExpect() {
		return whatToExpect;
	}

	public void setWhatToExpect(String whatToExpect) {
		this.whatToExpect = whatToExpect;
	}

	public String getWhatsIncluded() {
		return whatsIncluded;
	}

	public void setWhatsIncluded(String whatsIncluded) {
		this.whatsIncluded = whatsIncluded;
	}

	public String getWhatsExcluded() {
		return whatsExcluded;
	}

	public void setWhatsExcluded(String whatsExcluded) {
		this.whatsExcluded = whatsExcluded;
	}

	public String getReduced() {
		return reduced;
	}

	public void setReduced(String reduced) {
		this.reduced = reduced;
	}

	/*
	 * public String getWhere() { return where; }
	 * 
	 * public void setWhere(String where) { this.where = where; }
	 */

	public String getWhatToRemember() {
		return whatToRemember;
	}

	public void setWhatToRemember(String whatToRemember) {
		this.whatToRemember = whatToRemember;
	}

	/*
	 * public String getWhen() { return when; }
	 * 
	 * public void setWhen(String when) { this.when = when; }
	 */

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public FavouriteList() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getOperationalDays() {
		return operationalDays;
	}

	public void setOperationalDays(String operationalDays) {
		this.operationalDays = operationalDays;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMeetingPoint() {
		return meetingPoint;
	}

	public void setMeetingPoint(String meetingPoint) {
		this.meetingPoint = meetingPoint;
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

	public String getCoverImg() {
		return coverImg;
	}

	public void setCoverImg(String coverImgUrl) {
		this.coverImg = coverImgUrl;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String serviceFee) {
		this.price = serviceFee;
	}

//	public String getRetailPriceWithoutServiceFee() {
//		return retailPriceWithoutServiceFee;
//	}
//
//	public void setRetailPriceWithoutServiceFee(String retailPriceWithoutServiceFee) {
//		this.retailPriceWithoutServiceFee = retailPriceWithoutServiceFee;
//	}

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

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public FavouriteList(UUID id, UUID bucketId, long userId, String operationalDays, String description,
			String meetingPoint, String duration, String validity, String coverImg, String currency, String price,
			String discount, String retail, String latitude, String longitude, String userEmail, String bucketTitle,
			long interestId, String interestTitle, String title, String country, String availability,
			String doThisBecause, String whatToExpect, String whatsIncluded, String whatsExcluded, String reduced,
			String wheres, String whatToRemember, String whens, String language, String groups, String address,
			String bucketImage, String startDate, String endDate) {
		super();
		this.id = id;
		this.bucketId = bucketId;
		this.userId = userId;
		this.operationalDays = operationalDays;
		this.description = description;
		this.meetingPoint = meetingPoint;
		this.duration = duration;
		this.validity = validity;
		this.coverImg = coverImg;
		this.currency = currency;
		this.price = price;
		this.discount = discount;
		this.retail = retail;
		this.latitude = latitude;
		this.longitude = longitude;
		this.userEmail = userEmail;
		this.bucketTitle = bucketTitle;
		this.interestId = interestId;
		this.interestTitle = interestTitle;
		this.title = title;
		this.country = country;
		this.availability = availability;
		this.doThisBecause = doThisBecause;
		this.whatToExpect = whatToExpect;
		this.whatsIncluded = whatsIncluded;
		this.whatsExcluded = whatsExcluded;
		this.reduced = reduced;
		this.wheres = wheres;
		this.whatToRemember = whatToRemember;
		this.whens = whens;
		this.language = language;
		this.groups = groups;
		this.address = address;
		this.bucketImage = bucketImage;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	

	

	


}
