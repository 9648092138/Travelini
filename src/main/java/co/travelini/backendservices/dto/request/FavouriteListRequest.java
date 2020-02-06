package co.travelini.backendservices.dto.request;



public class FavouriteListRequest {

	private long userId;

	private String operationalDays;

	
	private String description;



	
	private String meetingPoint;
	private String duration;
	private String validity;
	private String coverImg;
	private String currency;
	private String price;
	
	private String discount;
	private String retail;

	private String latitude;
	private String longitude;

	private String userEmail;
	private String bucketTitle;

	private long interestId;
	private String interestTitle;

	private String title;
	private String country;
	private String availability;
	private String doThisBecause;
	private String whatToExpect;
	private String whatsIncluded;
	private String whatsExcluded;
	private String reduced;
	private String wheres;
	private String whatToRemember;
	private String whens;
	private String language;
	private String groups;

	public String getBucketImage() {
		return bucketImage;
	}

	public void setBucketImage(String bucketImage) {
		this.bucketImage = bucketImage;
	}

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


}
