package co.travelini.backendservices.dto.response;

public class FlightResponseByuserId {
	private long userId;
	private long flightId;
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	private String distance;

	private String carrier;

	private String operatingCarrier;

	private String operatingCarrierName;

	private String userEmail;

	private String time;

	public FlightResponseByuserId() {
		super();
	}
	public FlightResponseByuserId(long userId, String distance, String carrier, String operatingCarrier,
			String operatingCarrierName, String userEmail, String time, String froms, String fto, String flightCode,
			String flightType, String flightName, String departureDate, String departureTerminal, String numberOfAdults,
			String numberOfChilds, String numberOfInfants, String price, String currency) {
		super();
		this.userId = userId;
		this.distance = distance;
		this.carrier = carrier;
		this.operatingCarrier = operatingCarrier;
		this.operatingCarrierName = operatingCarrierName;
		this.userEmail = userEmail;
		this.time = time;
		this.froms = froms;
		this.fto = fto;
		this.flightCode = flightCode;
		this.flightType = flightType;
		this.flightName = flightName;
		this.departureDate = departureDate;
		this.departureTerminal = departureTerminal;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChilds = numberOfChilds;
		this.numberOfInfants = numberOfInfants;
		this.price = price;
		this.currency = currency;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getOperatingCarrier() {
		return operatingCarrier;
	}
	public void setOperatingCarrier(String operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}
	public String getOperatingCarrierName() {
		return operatingCarrierName;
	}
	public void setOperatingCarrierName(String operatingCarrierName) {
		this.operatingCarrierName = operatingCarrierName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFroms() {
		return froms;
	}
	public void setFroms(String froms) {
		this.froms = froms;
	}
	public String getFto() {
		return fto;
	}
	public void setFto(String fto) {
		this.fto = fto;
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
	public String getNumberOfAdults() {
		return numberOfAdults;
	}
	public void setNumberOfAdults(String numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}
	public String getNumberOfChilds() {
		return numberOfChilds;
	}
	public void setNumberOfChilds(String numberOfChilds) {
		this.numberOfChilds = numberOfChilds;
	}
	public String getNumberOfInfants() {
		return numberOfInfants;
	}
	public void setNumberOfInfants(String numberOfInfants) {
		this.numberOfInfants = numberOfInfants;
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
	private String froms;
	private String fto;
	private String flightCode;
	private String flightType;
	private String flightName;
	private String departureDate;
	private String departureTerminal;
	private String numberOfAdults;
	private String numberOfChilds;
	private String numberOfInfants;
	private String price;
	private String currency;

}
