package co.travelini.backendservices.dto.response;
import java.util.List;

public class Activity 
{
	private String coverimgurl;
private String title;
private String servicefee;
private String currency;
private String country;
private String retail_price_without_service_fee;
private String duration_range;
private String validity;
private List<Language> languages;
private List<GroupSize> groupsize;
private int discount;
private String meetingpoint;
private Double latitude;
private Double longitude;
private String description;
private String about;

private String operationaldays;
private List<CategoryResponse> categories;
private String retail;

private String availability;
 private String duration;


public Activity(String coverimgurl, String title, String servicefee, String currency, String country,
		String retail_price_without_service_fee, String duration_range, String validity, List<Language> languages,
		List<GroupSize> groupsize, int discount, String meetingpoint, Double latitude, Double longitude,
		String description, String about, String operationaldays, List<CategoryResponse> categories, String retail,
		String availability, String duration, String doThisBecause, String whatToExpect, String whatsIncluded,
		String whatsExcluded, String reduced, String where, String whatToRemember, String when) {
	super();
	this.coverimgurl = coverimgurl;
	this.title = title;
	this.servicefee = servicefee;
	this.currency = currency;
	this.country = country;
	this.retail_price_without_service_fee = retail_price_without_service_fee;
	this.duration_range = duration_range;
	this.validity = validity;
	this.languages = languages;
	this.groupsize = groupsize;
	this.discount = discount;
	this.meetingpoint = meetingpoint;
	this.latitude = latitude;
	this.longitude = longitude;
	this.description = description;
	this.about = about;
	this.operationaldays = operationaldays;
	this.categories = categories;
	this.retail = retail;
	this.availability = availability;
	this.duration = duration;
	this.doThisBecause = doThisBecause;
	this.whatToExpect = whatToExpect;
	this.whatsIncluded = whatsIncluded;
	this.whatsExcluded = whatsExcluded;
	this.reduced = reduced;
	this.where = where;
	this.whatToRemember = whatToRemember;
	this.when = when;
}




private String doThisBecause;
private String whatToExpect;
private String  whatsIncluded;
private String whatsExcluded;
private String reduced;
private String   where;
private String whatToRemember;
private String when;


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




public String getOperationaldays() 
{
	return operationaldays;
}




public String getCurrency() 
{
	return currency;
}

public String getCountry() {
	return country;
}




public void setCountry(String country) {
	this.country = country;
}



public void setCurrency(String currency)
{
	this.currency = currency;
}








public Activity(String operationaldays, String title, String description, String about, String meetingpoint,
		String duration, String validity, List<Language> languages, List<GroupSize> groupsize, String coverimgurl,
		String currency, String servicefee, String retail_price_without_service_fee, int discount,
		List<CategoryResponse> categories, String retail, Double latitude, Double longitude) {
	super();
	this.operationaldays = operationaldays;
	this.title = title;
	this.description = description;
	this.about = about;
	this.meetingpoint = meetingpoint;
	this.duration_range = duration;
	this.validity = validity;
	this.languages = languages;
	this.groupsize = groupsize;
	this.coverimgurl = coverimgurl;
	this.currency = currency;
	this.servicefee = servicefee;
	this.retail_price_without_service_fee = retail_price_without_service_fee;
	this.discount = discount;
	this.categories = categories;
	this.retail = retail;
	this.latitude = latitude;
	this.longitude = longitude;
}




public Activity()
{
	
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




public String getDuration_range() {
	return duration_range;
}




public void setDuration_range(String duration) {
	this.duration_range = duration;
}




public String getValidity() {
	return validity;
}




public void setValidity(String validity) {
	this.validity = validity;
}




public List<Language> getLanguages() {
	return languages;
}




public void setLanguages(List<Language> languages) {
	this.languages = languages;
}




public List<GroupSize> getGroupsize() {
	return groupsize;
}




public void setGroupsize(List<GroupSize> groupsize) {
	this.groupsize = groupsize;
}




public String getCoverimgurl() {
	return coverimgurl;
}




public void setCoverimgurl(String coverimgurl) {
	this.coverimgurl = coverimgurl;
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




public int getDiscount() {
	return discount;
}




public void setDiscount(int discount) {
	this.discount = discount;
}




public List<CategoryResponse> getCategories() {
	return categories;
}




public void setCategories(List<CategoryResponse> categories) {
	this.categories = categories;
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




public void setOperationaldays(String operationaldays) {
	this.operationaldays = operationaldays;
}




@Override
public String toString() {
	return "Activity [operationaldays=" + operationaldays + ", title=" + title + ", description=" + description
			+ ", about=" + about + ", meetingpoint=" + meetingpoint + ", duration=" + duration_range + ", validity="
			+ validity + ", languages=" + languages + ", groupsize=" + groupsize + ", coverimgurl=" + coverimgurl
			+ ", currency=" + currency + ", servicefee=" + servicefee + ", retail_price_without_service_fee="
			+ retail_price_without_service_fee + ", discount=" + discount + ", categories=" + categories + ", retail="
			+ retail + ", latitude=" + latitude + ", longitude=" + longitude + "]";
}




}