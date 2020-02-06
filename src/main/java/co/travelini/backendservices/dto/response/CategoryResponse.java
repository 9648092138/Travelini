package co.travelini.backendservices.dto.response;



public class CategoryResponse
{
private String id;
private String name;
private String level;
private String code;
private String event_image_url;
private String cover_image_url;
private String url;

public CategoryResponse()
{
	
}
public CategoryResponse(String id, String name, String level, String code, String event_image_url, String cover_image_url,
						String url) {
	super();
	this.id = id;
	this.name = name;
	this.level = level;
	this.code = code;
	this.event_image_url = event_image_url;
	this.cover_image_url = cover_image_url;
	this.url = url;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLevel() {
	return level;
}
public void setLevel(String level) {
	this.level = level;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getEvent_image_url() {
	return event_image_url;
}
public void setEvent_image_url(String event_image_url) {
	this.event_image_url = event_image_url;
}
public String getCover_image_url() {
	return cover_image_url;
}
public void setCover_image_url(String cover_image_url) {
	this.cover_image_url = cover_image_url;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) 
{
	this.url = url;
}
@Override
public String toString() 
{
	return "Categories [id=" + id + ", name=" + name + ", level=" + level + ", code=" + code + ", event_image_url="
			+ event_image_url + ", cover_image_url=" + cover_image_url + ", url=" + url + "]";
}

}