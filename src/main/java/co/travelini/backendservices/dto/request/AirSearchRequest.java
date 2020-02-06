package co.travelini.backendservices.dto.request;

import java.util.ArrayList;
import java.util.List;

public class AirSearchRequest {

	
	private String from;
	
	private String to;
	
	
	
	private String flightType;
	
	private int numberOfAdults;
	
	private int numberOfChilds;
	
	private int numberOfInfants; 
	
	private String departureDate;
	
	
	
	public AirSearchRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


		public AirSearchRequest(String from, String to, String preferredTime, String flightType, int numberOfAdults,
			int numberOfChilds, int numberOfInfants, String departureDate, String arrivalTime) {
		super();
		this.from = from;
		this.to = to;
		
		this.flightType = flightType;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChilds = numberOfChilds;
		this.numberOfInfants = numberOfInfants;
		this.departureDate = departureDate;
		
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





public String getFlightType() {
		return flightType;
	}



public void setFlightType(String flightType) {
		this.flightType = flightType;
	}


public int getNumberOfAdults() {
		return numberOfAdults;
	}

public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}


public int getNumberOfChilds() {
		return numberOfChilds;
	}


public void setNumberOfChilds(int numberOfChilds) {
		this.numberOfChilds = numberOfChilds;
	}



public String getDepartureDate() {
	return departureDate;
}



public void setDepartureDate(String departureDate) {
	this.departureDate = departureDate;
}








public int getNumberOfInfants() {
	return numberOfInfants;
}


public void setNumberOfInfants(int numberOfInfants) {
	this.numberOfInfants = numberOfInfants;
}


@Override
public String toString() {
	return "AirSearchRequest [from=" + from + ", to=" + to + ", preferredTime=" +  ", flightType="
			+ flightType + ", numberOfAdults=" + numberOfAdults + ", numberOfChilds=" + numberOfChilds
			+ ", numberOfInfants=" + numberOfInfants + ", departureDate=" + departureDate + ", arrivalTime="
			 + "]";
}
















	




	
}
