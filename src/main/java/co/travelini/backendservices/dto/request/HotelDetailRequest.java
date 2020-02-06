package co.travelini.backendservices.dto.request;

public class HotelDetailRequest {
	
	private String hotelCode;
	
	private String hotelChain;
	
	private Integer noOfPerson;
	
	private Integer noOfRooms;
	
	private String checkInDate;
	
	private String checkOutDate;
	
	private String rateRuleDetail;
	
	 
	public HotelDetailRequest() 
	{
	
	}


	public HotelDetailRequest(String hotelCode, String hotelChain, Integer noOfPerson, Integer noOfRooms,
			String checkInDate, String checkOutDate, String rateRuleDetail) {
		super();
		this.hotelCode = hotelCode;
		this.hotelChain = hotelChain;
		this.noOfPerson = noOfPerson;
		this.noOfRooms = noOfRooms;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.rateRuleDetail = rateRuleDetail;
	}


	public String getHotelCode() {
		return hotelCode;
	}


	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}


	public String getHotelChain() {
		return hotelChain;
	}


	public void setHotelChain(String hotelChain) {
		this.hotelChain = hotelChain;
	}


	public Integer getNoOfPerson() {
		return noOfPerson;
	}


	public void setNoOfPerson(Integer noOfPerson) {
		this.noOfPerson = noOfPerson;
	}


	public Integer getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}


	public String getCheckInDate() {
		return checkInDate;
	}


	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}


	public String getCheckOutDate() {
		return checkOutDate;
	}


	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}


	public String getRateRuleDetail() {
		return rateRuleDetail;
	}


	public void setRateRuleDetail(String rateRuleDetail) {
		this.rateRuleDetail = rateRuleDetail;
	}


	@Override
	public String toString() {
		return "HotelDetailRequest [hotelCode=" + hotelCode + ", hotelChain=" + hotelChain + ", noOfPerson="
				+ noOfPerson + ", noOfRooms=" + noOfRooms + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", rateRuleDetail=" + rateRuleDetail + "]";
	}
	
	

}
