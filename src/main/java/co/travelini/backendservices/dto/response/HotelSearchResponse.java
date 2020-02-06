package co.travelini.backendservices.dto.response;

import java.util.ArrayList;
import java.util.List;

import co.travelini.backendservices.dto.request.Hotel;

public class HotelSearchResponse {
	
	private String referencePoint;
	
	private List<Hotel> hotels=new ArrayList<>();

	public HotelSearchResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getReferencePoint() {
		return referencePoint;
	}

	public void setReferencePoint(String referencePoint) {
		this.referencePoint = referencePoint;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	
	

}
