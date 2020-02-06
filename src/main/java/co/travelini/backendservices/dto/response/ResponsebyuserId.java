package co.travelini.backendservices.dto.response;

import java.util.UUID;

public class ResponsebyuserId {
	private long userId;
	//private long bucketId;
	private UUID bucketId;
	private String bucketTitle;
	private String bucketImage;
	private long interestId;
	private String interestTitle;
	private String coverImage;
	private String title;
	private String country;
	private String availability;
	private String duration;
	private String validity;
	private String price;
	private String currency;
	private String doThisBecause;
	private String whatToExpect;
	private String whatsIncluded;
	private String whatsExcluded;
	private String reduced;
	private String where;
	private String whatToRemember;
	private String when;
	private String language;
	private String groups;
	private String address;
	private String meetingPoint;
	private String location;
	private String latitute;
	private String longitute;
	private String startDate;
	private String endDate;
    private String isFavorite;

	public String getIsFavorite() {
		return isFavorite;
	}

	public void setIsFavorite(String isFavorite) {
		this.isFavorite = isFavorite;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	

	public String getBucketTitle() {
		return bucketTitle;
	}

	public void setBucketTitle(String bucketTitle) {
		this.bucketTitle = bucketTitle;
	}

	public String getBucketImage() {
		return bucketImage;
	}

	public void setBucketImage(String bucketImage) {
		this.bucketImage = bucketImage;
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

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public String getWhatToRemember() {
		return whatToRemember;
	}

	public void setWhatToRemember(String whatToRemember) {
		this.whatToRemember = whatToRemember;
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}

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

	public String getMeetingPoint() {
		return meetingPoint;
	}

	public void setMeetingPoint(String meetingPoint) {
		this.meetingPoint = meetingPoint;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLatitute() {
		return latitute;
	}

	public void setLatitute(String latitute) {
		this.latitute = latitute;
	}

	public String getLongitute() {
		return longitute;
	}

	public void setLongitute(String longitute) {
		this.longitute = longitute;
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

	public ResponsebyuserId() {
		super();
	}

	public UUID getBucketId() {
		return bucketId;
	}

	public void setBucketId(UUID bucketId) {
		this.bucketId = bucketId;
	}

	public ResponsebyuserId(long userId, UUID bucketId, String bucketTitle, String bucketImage, long interestId,
			String interestTitle, String coverImage, String title, String country, String availability, String duration,
			String validity, String price, String currency, String doThisBecause, String whatToExpect,
			String whatsIncluded, String whatsExcluded, String reduced, String where, String whatToRemember,
			String when, String language, String groups, String address, String meetingPoint, String location,
			String latitute, String longitute, String startDate, String endDate, String isFavorite) {
		super();
		this.userId = userId;
		this.bucketId = bucketId;
		this.bucketTitle = bucketTitle;
		this.bucketImage = bucketImage;
		this.interestId = interestId;
		this.interestTitle = interestTitle;
		this.coverImage = coverImage;
		this.title = title;
		this.country = country;
		this.availability = availability;
		this.duration = duration;
		this.validity = validity;
		this.price = price;
		this.currency = currency;
		this.doThisBecause = doThisBecause;
		this.whatToExpect = whatToExpect;
		this.whatsIncluded = whatsIncluded;
		this.whatsExcluded = whatsExcluded;
		this.reduced = reduced;
		this.where = where;
		this.whatToRemember = whatToRemember;
		this.when = when;
		this.language = language;
		this.groups = groups;
		this.address = address;
		this.meetingPoint = meetingPoint;
		this.location = location;
		this.latitute = latitute;
		this.longitute = longitute;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isFavorite = isFavorite;
	}

	
	
}
