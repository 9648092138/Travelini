package co.travelini.backendservices.dto.request;

import java.util.ArrayList;
import java.util.List;

public class ActivitiesRequest
{
private String text;
private String text_operator;
private String extend_other_languages;
private String extend_content_fields;
private String fuzziness_level;
private List<String> sort_by = new ArrayList<>();
private List<String> category_in = new ArrayList<>();
private List<String> city_in = new ArrayList<>();
private String coordinates;
private List<String> country_in = new ArrayList<>();
private String default_price_range;
private String distance;
private List<String> feature_in= new ArrayList<>();
private boolean temporary;
private List<String> venue_in =  new ArrayList<>();
private List<String> vertical_in = new ArrayList<>();
private long limit;
private long offset;
private List<String> include_facets = new ArrayList<>();
private List<String> pickup_in =  new ArrayList<>();
private List<String> available_language_in = new ArrayList<>();
private String preffered_seller_code;
private String x_musement_version;
private String accept_language;
private String x_musement_currency;




public ActivitiesRequest(String text, String text_operator, String extend_other_languages, String extend_content_fields,
		String fuzziness_level, List<String> sort_by, List<String> category_in, List<String> city_in,
		String coordinates, List<String> country_in, String default_price_range, String distance,
		List<String> feature_in, boolean temporary, List<String> venue_in, List<String> vertical_in, long limit,
		long offset, List<String> include_facets, List<String> pickup_in, List<String> available_language_in,
		String preffered_seller_code, String x_musement_version, String accept_language, String x_musement_currency) {
	super();
	this.text = text;
	this.text_operator = text_operator;
	this.extend_other_languages = extend_other_languages;
	this.extend_content_fields = extend_content_fields;
	this.fuzziness_level = fuzziness_level;
	this.sort_by = sort_by;
	this.category_in = category_in;
	this.city_in = city_in;
	this.coordinates = coordinates;
	this.country_in = country_in;
	this.default_price_range = default_price_range;
	this.distance = distance;
	this.feature_in = feature_in;
	this.temporary = temporary;
	this.venue_in = venue_in;
	this.vertical_in = vertical_in;
	this.limit = limit;
	this.offset = offset;
	this.include_facets = include_facets;
	this.pickup_in = pickup_in;
	this.available_language_in = available_language_in;
	this.preffered_seller_code = preffered_seller_code;
	this.x_musement_version = x_musement_version;
	this.accept_language = accept_language;
	this.x_musement_currency = x_musement_currency;
}

public ActivitiesRequest()
{
	
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

public String getText_operator() {
	return text_operator;
}

public void setText_operator(String text_operator) {
	this.text_operator = text_operator;
}

public String getExtend_other_languages() {
	return extend_other_languages;
}

public void setExtend_other_languages(String extend_other_languages) {
	this.extend_other_languages = extend_other_languages;
}

public String getExtend_content_fields() {
	return extend_content_fields;
}

public void setExtend_content_fields(String extend_content_fields) {
	this.extend_content_fields = extend_content_fields;
}

public String getFuzziness_level() {
	return fuzziness_level;
}

public void setFuzziness_level(String fuzziness_level) {
	this.fuzziness_level = fuzziness_level;
}

public List<String> getSort_by() {
	return sort_by;
}

public void setSort_by(List<String> sort_by) {
	this.sort_by = sort_by;
}

public List<String> getCategory_in() {
	return category_in;
}

public void setCategory_in(List<String> category_in) {
	this.category_in = category_in;
}

public List<String> getCity_in() {
	return city_in;
}

public void setCity_in(List<String> city_in) {
	this.city_in = city_in;
}

public String getCoordinates() {
	return coordinates;
}

public void setCoordinates(String coordinates) {
	this.coordinates = coordinates;
}

public List<String> getCountry_in() {
	return country_in;
}

public void setCountry_in(List<String> country_in) {
	this.country_in = country_in;
}

public String getDefault_price_range() {
	return default_price_range;
}

public void setDefault_price_range(String default_price_range) {
	this.default_price_range = default_price_range;
}

public String getDistance() {
	return distance;
}

public void setDistance(String distance) {
	this.distance = distance;
}

public List<String> getFeature_in() {
	return feature_in;
}

public void setFeature_in(List<String> feature_in) {
	this.feature_in = feature_in;
}

public boolean isTemporary() {
	return temporary;
}

public void setTemporary(boolean temporary) {
	this.temporary = temporary;
}

public List<String> getVenue_in() {
	return venue_in;
}

public void setVenue_in(List<String> venue_in) {
	this.venue_in = venue_in;
}

public List<String> getVertical_in() {
	return vertical_in;
}

public void setVertical_in(List<String> vertical_in) {
	this.vertical_in = vertical_in;
}

public long getLimit() {
	return limit;
}

public void setLimit(long limit) {
	this.limit = limit;
}

public long getOffset() {
	return offset;
}

public void setOffset(long offset) {
	this.offset = offset;
}

public List<String> getInclude_facets() {
	return include_facets;
}

public void setInclude_facets(List<String> include_facets) {
	this.include_facets = include_facets;
}

public List<String> getPickup_in() {
	return pickup_in;
}

public void setPickup_in(List<String> pickup_in) {
	this.pickup_in = pickup_in;
}

public List<String> getAvailable_language_in() {
	return available_language_in;
}

public void setAvailable_language_in(List<String> available_language_in) {
	this.available_language_in = available_language_in;
}

public String getPreffered_seller_code() {
	return preffered_seller_code;
}

public void setPreffered_seller_code(String preffered_seller_code) {
	this.preffered_seller_code = preffered_seller_code;
}

public String getX_musement_version() {
	return x_musement_version;
}

public void setX_musement_version(String x_musement_version) {
	this.x_musement_version = x_musement_version;
}

public String getAccept_language() {
	return accept_language;
}

public void setAccept_language(String accept_language) {
	this.accept_language = accept_language;
}

public String getX_musement_currency() {
	return x_musement_currency;
}

public void setX_musement_currency(String x_musement_currency) {
	this.x_musement_currency = x_musement_currency;
}

@Override
public String toString() {
	return "ActivitiesRequest [text=" + text + ", text_operator=" + text_operator + ", extend_other_languages="
			+ extend_other_languages + ", extend_content_fields=" + extend_content_fields + ", fuzziness_level="
			+ fuzziness_level + ", sort_by=" + sort_by + ", category_in=" + category_in + ", city_in=" + city_in
			+ ", coordinates=" + coordinates + ", country_in=" + country_in + ", default_price_range="
			+ default_price_range + ", distance=" + distance + ", feature_in=" + feature_in + ", temporary=" + temporary
			+ ", venue_in=" + venue_in + ", vertical_in=" + vertical_in + ", limit=" + limit + ", offset=" + offset
			+ ", include_facets=" + include_facets + ", pickup_in=" + pickup_in + ", available_language_in="
			+ available_language_in + ", preffered_seller_code=" + preffered_seller_code + ", x_musement_version="
			+ x_musement_version + ", accept_language=" + accept_language + ", x_musement_currency="
			+ x_musement_currency + "]";
}




}
