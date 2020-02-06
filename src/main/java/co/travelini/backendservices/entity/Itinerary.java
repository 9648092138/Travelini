package co.travelini.backendservices.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "itinerary")
public class Itinerary 
{

	@Id
	@Column(name = "itinerary_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long itineraryId;

	@Column(name = "name", length = 255, nullable = false)
	private String name;

	@Column(name = "price", length = 255, nullable = false)
	private long price;
	
	@Column(name = "is_booked", nullable = false)
	private Boolean isBooked;

	@Column(name = "primary_contact_id")
	private Long primaryContactId;

	@ManyToOne
	@JoinColumn(name = "primary_contact_id", referencedColumnName = "primary_contactid", nullable = false, insertable = false, updatable = false)
	 
	private PrimaryContact primaryContact;

	@Column(name = "account_id")
	private Long accountId;


 

	private Integer adultCount;

	private Integer childCount;
	
	
	private String itineraryImage;

	private Integer numberOfInfants;
	
	
	private String budget;
	
	private String startDate;
	private String endDate;
	private String location;
	
	@ManyToOne
	@JoinColumn(name = "account_id", referencedColumnName = "account_id", nullable = false, insertable = false, updatable = false)
	private TraveliniAccount traveliniAccount;

	@ElementCollection
	private List<OriginDestinationDetail> originDestinationDetail;

	@Override
	public String toString() {
		return "Itinerary [itineraryId=" + itineraryId + ", name=" + name + ", price=" + price + ", isBooked="
				+ isBooked + ", primaryContactId=" + primaryContactId + ", primaryContact=" + primaryContact
				+ ", accountId=" + accountId + ", adultCount=" + adultCount + ", childCount=" + childCount
				+ ", traveliniAccount=" + traveliniAccount + ", originDestinationDetail=" + originDestinationDetail
				+ "]";
	}

	public long getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(long itineraryId) {
		this.itineraryId = itineraryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Boolean getIsBooked() {
		return isBooked;
	}

	public void setIsBooked(Boolean isBooked) {
		this.isBooked = isBooked;
	}

	public Long getPrimaryContactId() {
		return primaryContactId;
	}

	public void setPrimaryContactId(Long primaryContactId) {
		this.primaryContactId = primaryContactId;
	}

	public PrimaryContact getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(PrimaryContact primaryContact) {
		this.primaryContact = primaryContact;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Integer getAdultCount() {
		return adultCount;
	}

	public void setAdultCount(Integer adultCount) {
		this.adultCount = adultCount;
	}

	public Integer getChildCount() {
		return childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	public String getItineraryImage() {
		return itineraryImage;
	}

	public void setItineraryImage(String itineraryImage) {
		this.itineraryImage = itineraryImage;
	}

	public Integer getNumberOfInfants() {
		return numberOfInfants;
	}

	public void setNumberOfInfants(Integer numberOfInfants) {
		this.numberOfInfants = numberOfInfants;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public TraveliniAccount getTraveliniAccount() {
		return traveliniAccount;
	}

	public void setTraveliniAccount(TraveliniAccount traveliniAccount) {
		this.traveliniAccount = traveliniAccount;
	}

	public List<OriginDestinationDetail> getOriginDestinationDetail() {
		return originDestinationDetail;
	}

	public void setOriginDestinationDetail(List<OriginDestinationDetail> originDestinationDetail) {
		this.originDestinationDetail = originDestinationDetail;
	}

	

	
	
	
	
}