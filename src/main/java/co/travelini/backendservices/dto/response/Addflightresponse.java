package co.travelini.backendservices.dto.response;

public class Addflightresponse {
	private long userId;
	private long flightId;
	private String distance;
	private String time;
	private String from;
	private String to;
	private String flightCode;
	private String flightType;
	private String flightName;
	private String departureDate;
	private String departureTerminal;
	private String price;
	private String currency;

	public Addflightresponse(long userId, long flightId, String distance, String time, String from, String to,
			String flightCode, String flightType, String flightName, String departureDate, String departureTerminal,
			String price, String currency) {
		super();
		this.userId = userId;
		this.flightId = flightId;
		this.distance = distance;
		this.time = time;
		this.from = from;
		this.to = to;
		this.flightCode = flightCode;
		this.flightType = flightType;
		this.flightName = flightName;
		this.departureDate = departureDate;
		this.departureTerminal = departureTerminal;
		this.price = price;
		this.currency = currency;
	}

	public Addflightresponse() {
		super();
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureTerminal() {
		return departureTerminal;
	}

	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
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

}
