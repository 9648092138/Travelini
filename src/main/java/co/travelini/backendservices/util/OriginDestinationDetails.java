package co.travelini.backendservices.util;

/*
 * OriginDestinationDetailsForInsurance
 */
public class OriginDestinationDetails {
	
	String adultCount;
	String childCount;
	String OriginCountry;
	String DestinationCountry;
	String StartDate;
	String EndDate;
	String NumberOfVisas;
		
	
	
	public String getNumberOfVisas() {
		return NumberOfVisas;
	}
	public void setNumberOfVisas(String numberOfVisas) {
		NumberOfVisas = numberOfVisas;
	}
	public String getAdultCount() {
		return adultCount;
	}
	public void setAdultCount(String adultCount) {
		this.adultCount = adultCount;
	}
	public String getChildCount() {
		return childCount;
	}
	public void setChildCount(String childCount) {
		this.childCount = childCount;
	}
	public String getOriginCountry() {
		return OriginCountry;
	}
	public void setOriginCountry(String originCountry) {
		OriginCountry = originCountry;
	}
	public String getDestinationCountry() {
		return DestinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		DestinationCountry = destinationCountry;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	@Override
	public String toString() {
		return "OriginDestinationDetailsForInsurance [adultCount=" + adultCount + ", childCount=" + childCount
				+ ", OriginCountry=" + OriginCountry + ", DestinationCountry=" + DestinationCountry + ", StartDate="
				+ StartDate + ", EndDate=" + EndDate + "]";
	}
	public OriginDestinationDetails() {
		super();
	}

	
}
