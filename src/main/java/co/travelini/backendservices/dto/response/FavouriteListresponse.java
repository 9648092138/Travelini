package co.travelini.backendservices.dto.response;

import java.util.UUID;

public class FavouriteListresponse {
	private long userId;
	// private long bucketId;
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

	public FavouriteListresponse() {
		super();
	}

	public UUID getBucketId() {
		return bucketId;
	}

	public void setBucketId(UUID bucketId) {
		this.bucketId = bucketId;
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

	public FavouriteListresponse(long userId, UUID bucketId, String bucketTitle, String bucketImage, long interestId,
			String interestTitle, String coverImage, String title, String country, String availability, String duration,
			String validity, String price, String currency) {
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
	}

}
