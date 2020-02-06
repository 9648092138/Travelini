package co.travelini.backendservices.entity;
import java.util.List;

public class MusementList 
{
private String operationaldays;
private String title;
private String description;
private String about;
private String meetingpoint;
private String duration;
private String validity;
private List<Languages> languages;
private List<GroupSize> groupsize;
private String coverimgurl;

private Object servicefee;
private Object retail_price_without_service_fee;
private int discount;
private List<Categories> categories;
private Object retail;
private long latitude;
private long longitude;
public String getOperationaldays() 
{
	return operationaldays;
}


public MusementList(String operationaldays, String title, String description, String about, String meetingpoint,
		String duration, String validity, List<Languages> languages, List<GroupSize> groupsize, String coverimgurl,
		Object servicefee, Object retail_price_without_service_fee, int discount, List<Categories> categories,
		Object retail, long latitude, long longitude) {
	super();
	this.operationaldays = operationaldays;
	this.title = title;
	this.description = description;
	this.about = about;
	this.meetingpoint = meetingpoint;
	this.duration = duration;
	this.validity = validity;
	this.languages = languages;
	this.groupsize = groupsize;
	this.coverimgurl = coverimgurl;
	this.servicefee = servicefee;
	this.retail_price_without_service_fee = retail_price_without_service_fee;
	this.discount = discount;
	this.categories = categories;
	this.retail = retail;
	this.latitude = latitude;
	this.longitude = longitude;
}


public MusementList()
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

public List<Languages> getLanguages() {
	return languages;
}

public void setLanguages(List<Languages> languages) {
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

public Object getServicefee() {
	return servicefee;
}

public void setServicefee(Object servicefee) {
	this.servicefee = servicefee;
}

public Object getRetail_price_without_service_fee() {
	return retail_price_without_service_fee;
}

public void setRetail_price_without_service_fee(Object retail_price_without_service_fee) {
	this.retail_price_without_service_fee = retail_price_without_service_fee;
}

public int getDiscount() {
	return discount;
}

public void setDiscount(int discount) {
	this.discount = discount;
}

public List<Categories> getCategories() {
	return categories;
}

public void setCategories(List<Categories> categories) {
	this.categories = categories;
}

public Object getRetail() {
	return retail;
}

public void setRetail(Object retail) {
	this.retail = retail;
}

public long getLatitude() {
	return latitude;
}

public void setLatitude(long latitude) {
	this.latitude = latitude;
}

public long getLongitude() {
	return longitude;
}

public void setLongitude(long longitude) {
	this.longitude = longitude;
}

public void setOperationaldays(String operationaldays) {
	this.operationaldays = operationaldays;
}

@Override
public String toString() {
	return "MusementList [operationaldays=" + operationaldays + ", title=" + title + ", description=" + description
			+ ", about=" + about + ", meetingpoint=" + meetingpoint + ", duration=" + duration + ", validity="
			+ validity + ", languages=" + languages + ", groupsize=" + groupsize + ", coverimgurl=" + coverimgurl
			+ ", servicefee=" + servicefee + ", retail_price_without_service_fee=" + retail_price_without_service_fee
			+ ", discount=" + discount + ", categories=" + categories + ", retail=" + retail + ", latitude=" + latitude
			+ ", longitude=" + longitude + "]";
}


}
