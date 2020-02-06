package co.travelini.backendservices.service;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.travelport.schema.common_v45_0.BillingPointOfSaleInfo;
import com.travelport.schema.common_v45_0.PermittedProviders;
import com.travelport.schema.common_v45_0.Provider;
import com.travelport.schema.hotel_v45_0.BaseHotelSearchReq;
import com.travelport.schema.hotel_v45_0.BaseHotelSearchRsp;
import com.travelport.schema.hotel_v45_0.HotelChain;
import com.travelport.schema.hotel_v45_0.HotelDetailItem;
import com.travelport.schema.hotel_v45_0.HotelDetailsModifiers;
import com.travelport.schema.hotel_v45_0.HotelDetailsReq;
import com.travelport.schema.hotel_v45_0.HotelDetailsRsp;
import com.travelport.schema.hotel_v45_0.HotelLocation;
import com.travelport.schema.hotel_v45_0.HotelProperty;
import com.travelport.schema.hotel_v45_0.HotelRateDetail;
import com.travelport.schema.hotel_v45_0.HotelRating;
import com.travelport.schema.hotel_v45_0.HotelSearchAvailabilityReq;
import com.travelport.schema.hotel_v45_0.HotelSearchLocation;
import com.travelport.schema.hotel_v45_0.HotelSearchModifiers;
import com.travelport.schema.hotel_v45_0.HotelSearchResult;
import com.travelport.schema.hotel_v45_0.HotelStay;
import com.travelport.schema.hotel_v45_0.TypeHotelRateDescription;
import com.travelport.schema.hotel_v45_0.TypeRateRuleDetail;

import co.travelini.backendservices.connector.HotelDetailConnector;
import co.travelini.backendservices.connector.HotelSearchConnector;
import co.travelini.backendservices.dto.request.Distance;
import co.travelini.backendservices.dto.request.Hotel;
import co.travelini.backendservices.dto.request.HotelDetailRequest;
import co.travelini.backendservices.dto.request.HotelSearchRequest;
import co.travelini.backendservices.dto.response.HotelDetailResponse;
import co.travelini.backendservices.dto.response.HotelSearchResponse;
import co.travelini.backendservices.dto.response.RoomType;

@Service
public class UAPIHotelService {
	
	
	
	/** The branch. */
	@Value("${air.branch}")
	private String branch;
	
	@Autowired
	HotelSearchConnector hotelSearchConnector;
	
	@Autowired
	HotelDetailConnector hotelDetailConnector;
	
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(UAPIHotelService.class);

	public HotelSearchResponse serachHotel(HotelSearchRequest request) throws ParseException, DatatypeConfigurationException {
		
		HotelSearchAvailabilityReq searchReq=mapHotelSearchRequest(request);
		HotelSearchResponse searchResponse=mapHotelSearchResponse(hotelSearchConnector.hotelSearchConnector(searchReq));
		
		
		return searchResponse;
	}
	
	public HotelDetailResponse getHotelDetail(HotelDetailRequest request) throws ParseException, DatatypeConfigurationException {
		
		HotelDetailsReq detailReq=mapHotelDetailRequest(request);
		HotelDetailResponse hotelDetailResponse=mapHotelDetailResponse(hotelDetailConnector.hotelDetailConnector(detailReq));
		
		
		return hotelDetailResponse;
	}
	
	public HotelDetailResponse bookHotel(HotelDetailRequest request) throws ParseException, DatatypeConfigurationException {
		
		HotelDetailsReq detailReq=mapHotelDetailRequest(request);
		HotelDetailResponse hotelDetailResponse=mapHotelDetailResponse(hotelDetailConnector.hotelDetailConnector(detailReq));
		
		
		return hotelDetailResponse;
	}
	
	
	
	
	public HotelSearchAvailabilityReq mapHotelSearchRequest(HotelSearchRequest request) throws ParseException, DatatypeConfigurationException {
		
		HotelSearchAvailabilityReq searchReq=new HotelSearchAvailabilityReq();

		// billing point info
		BillingPointOfSaleInfo billInfo=new BillingPointOfSaleInfo();
		billInfo.setOriginApplication("uAPI");
		searchReq.setBillingPointOfSaleInfo(billInfo);
		
//		set hotel search location
		HotelSearchLocation searchLocation=new HotelSearchLocation();
		HotelLocation hotelLocation=new HotelLocation();
		hotelLocation.setLocation(request.getLocation());
		searchLocation.setHotelLocation(hotelLocation);
		
		searchReq.setHotelSearchLocation(searchLocation);
		
		searchReq.setAuthorizedBy("Travelport");
		searchReq.setTargetBranch(branch);
		searchReq.setTraceId("9f65dcec-2914-4fd4-ad36-bd5070955559");
		
//		set modifiers
		HotelSearchModifiers hotelModifire=new HotelSearchModifiers();
		hotelModifire.setNumberOfAdults(request.getNumberofAdult());
		hotelModifire.setNumberOfRooms(request.getNumberOfRooms());
		PermittedProviders pmProd=new PermittedProviders();
		Provider provider=new Provider();
		provider.setCode("1G");
		pmProd.setProvider(provider);
		hotelModifire.setPermittedProviders(pmProd);
		searchReq.setHotelSearchModifiers(hotelModifire);
		
//		set checkin and checkout
		HotelStay hotelStay=new HotelStay();
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date cindate = format.parse(request.getCheckInDate());
		Date coutdate = format.parse(request.getCheckOutDate());

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(cindate);
		GregorianCalendar cal1 = new GregorianCalendar();
		cal1.setTime(coutdate);

		XMLGregorianCalendar xmlGregCal =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		XMLGregorianCalendar xmlGregCal1 =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal1);

		
		hotelStay.setCheckinDate(xmlGregCal);
		hotelStay.setCheckoutDate(xmlGregCal1);
		searchReq.setHotelStay(hotelStay);
		
		
		
		
		return searchReq;
	}
	
	public HotelSearchResponse mapHotelSearchResponse(BaseHotelSearchRsp searchResponse) throws ParseException, DatatypeConfigurationException {
	
		HotelSearchResponse hotelResp=new HotelSearchResponse();
		hotelResp.setReferencePoint(searchResponse.getReferencePoint().getValue());
		
		List<Hotel> hotels=new ArrayList<>();
		
		for(HotelSearchResult hotel :searchResponse.getHotelSearchResult()) {
			
			Hotel obj=new Hotel();
			
//			vendor location info
			if(hotel.getVendorLocation().size()>0) {
				obj.setProviderCode(hotel.getVendorLocation().get(0).getProviderCode());
				obj.setVendorCode(hotel.getVendorLocation().get(0).getVendorCode());
				obj.setVendorLocationID(hotel.getVendorLocation().get(0).getVendorLocationID());
				obj.setKey(hotel.getVendorLocation().get(0).getKey());
				obj.setVendorLocationKey(hotel.getVendorLocation().get(0).getKey());
			}
			
//			hotel property
			if(hotel.getHotelProperty().size()>0) {
				obj.setHotelChain(hotel.getHotelProperty().get(0).getHotelChain());
				obj.setHotelCode(hotel.getHotelProperty().get(0).getHotelCode());
				obj.setHotelLocation(hotel.getHotelProperty().get(0).getHotelLocation());
				obj.setName(hotel.getHotelProperty().get(0).getName());
				obj.setHotelTransportation(hotel.getHotelProperty().get(0).getHotelTransportation());
				obj.setReserveRequirement(hotel.getHotelProperty().get(0).getReserveRequirement().value());
				obj.setParticipationLevel(hotel.getHotelProperty().get(0).getParticipationLevel());
				if(hotel.getHotelProperty().get(0).getAvailability()!=null) {
					obj.setAvailability(hotel.getHotelProperty().get(0).getAvailability().value());
				}
//				hotelRating
				Long totalRating=0L;
				Integer totalProvider=0;
				for(HotelRating rating:hotel.getHotelProperty().get(0).getHotelRating()) {
					List<BigInteger> rate=rating.getRating();
					for(BigInteger r: rate) {
						totalRating+=r.longValue();
						totalProvider++;
					}
				}
				
				obj.setRating(0.0);
				if(totalProvider>0) {
					obj.setRating((double)totalRating/totalProvider);
				}
				
				/**
				 * address info
				 */
				obj.setAddress(hotel.getHotelProperty().get(0).getHotelLocation());
				if(hotel.getHotelProperty().get(0).getCoordinateLocation()!=null) {
					obj.setLatitude(hotel.getHotelProperty().get(0).getCoordinateLocation().getLatitude());
					obj.setLongitude(hotel.getHotelProperty().get(0).getCoordinateLocation().getLongitude());
				}

				Distance distance=new Distance();
				if(hotel.getHotelProperty().get(0).getDistance()!=null) {
					distance.setDirection(hotel.getHotelProperty().get(0).getDistance().getDirection());
					distance.setUnits(hotel.getHotelProperty().get(0).getDistance().getUnits());
					distance.setValue(hotel.getHotelProperty().get(0).getDistance().getValue());
				}
				obj.setDistance(distance);
			}
			

			
			/**
			 * price info
			 */
			if(hotel.getRateInfo().size()>0) {
				obj.setMinimumAmount(hotel.getRateInfo().get(0).getMinimumAmount());
				obj.setMaximunAmount(hotel.getRateInfo().get(0).getMaximumAmount());
			}
			
			hotels.add(obj);
			
		}
		
		hotelResp.setHotels(hotels);
		
		return hotelResp;
	}
	
	
	/**
	 * Hotel Detail Request Mapper
	 * @param request
	 * @return
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	public HotelDetailsReq mapHotelDetailRequest(HotelDetailRequest request) throws ParseException, DatatypeConfigurationException {
		
		HotelDetailsReq detailReq= new HotelDetailsReq();
		
//		basic infodetailReq
		detailReq.setAuthorizedBy("Travelport");
		detailReq.setTargetBranch(branch);
		detailReq.setTraceId("9f65dcec-2914-4fd4-ad36-bd5070955559");
		
		// billing point info
		BillingPointOfSaleInfo billInfo=new BillingPointOfSaleInfo();
		billInfo.setOriginApplication("uAPI");
		detailReq.setBillingPointOfSaleInfo(billInfo);
		
		HotelProperty hotelProperty=new HotelProperty();
		hotelProperty.setHotelChain(request.getHotelChain());
		hotelProperty.setHotelCode(request.getHotelCode());
		
		detailReq.setHotelProperty(hotelProperty);
		
//		set modifiers
		HotelDetailsModifiers hotelModifire=new HotelDetailsModifiers();
		hotelModifire.setNumberOfAdults(request.getNoOfPerson());
		hotelModifire.setNumberOfRooms(request.getNoOfRooms());
		PermittedProviders pmProd=new PermittedProviders();
		Provider provider=new Provider();
		provider.setCode("1G");
		pmProd.setProvider(provider);
		hotelModifire.setPermittedProviders(pmProd);
		hotelModifire.setRateRuleDetail(TypeRateRuleDetail.fromValue(request.getRateRuleDetail()));
		
//		set checkin and checkout
		HotelStay hotelStay=new HotelStay();
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date cindate = format.parse(request.getCheckInDate());
		Date coutdate = format.parse(request.getCheckOutDate());

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(cindate);
		GregorianCalendar cal1 = new GregorianCalendar();
		cal1.setTime(coutdate);

		XMLGregorianCalendar xmlGregCal =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		XMLGregorianCalendar xmlGregCal1 =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal1);

		
		hotelStay.setCheckinDate(xmlGregCal);
		hotelStay.setCheckoutDate(xmlGregCal1);	
		
		hotelModifire.setHotelStay(hotelStay);
		detailReq.setHotelDetailsModifiers(hotelModifire);			
		
		return detailReq;
	}
	
	/**
	 * Hotel Detail Response Mapper
	 * @param detailResponse
	 * @return
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	public HotelSearchResponse mapHotelDetailResponse(BaseHotelSearchRsp searchResponse) throws ParseException, DatatypeConfigurationException {
		
		HotelSearchResponse hotelResp=new HotelSearchResponse();
		hotelResp.setReferencePoint(searchResponse.getReferencePoint().getValue());
		
		List<Hotel> hotels=new ArrayList<>();
		
		for(HotelSearchResult hotel :searchResponse.getHotelSearchResult()) {
			
			Hotel obj=new Hotel();
			
//			vendor location info
			if(hotel.getVendorLocation().size()>0) {
				obj.setProviderCode(hotel.getVendorLocation().get(0).getProviderCode());
				obj.setVendorCode(hotel.getVendorLocation().get(0).getVendorCode());
				obj.setVendorLocationID(hotel.getVendorLocation().get(0).getVendorLocationID());
				obj.setKey(hotel.getVendorLocation().get(0).getKey());
				obj.setVendorLocationKey(hotel.getVendorLocation().get(0).getKey());
			}
			
//			hotel property
			if(hotel.getHotelProperty().size()>0) {
				obj.setHotelChain(hotel.getHotelProperty().get(0).getHotelChain());
				obj.setHotelCode(hotel.getHotelProperty().get(0).getHotelCode());
				obj.setHotelLocation(hotel.getHotelProperty().get(0).getHotelLocation());
				obj.setName(hotel.getHotelProperty().get(0).getName());
				obj.setHotelTransportation(hotel.getHotelProperty().get(0).getHotelTransportation());
				obj.setReserveRequirement(hotel.getHotelProperty().get(0).getReserveRequirement().value());
				obj.setParticipationLevel(hotel.getHotelProperty().get(0).getParticipationLevel());
				if(hotel.getHotelProperty().get(0).getAvailability()!=null) {
					obj.setAvailability(hotel.getHotelProperty().get(0).getAvailability().value());
				}
//				hotelRating
				Long totalRating=0L;
				Integer totalProvider=0;
				for(HotelRating rating:hotel.getHotelProperty().get(0).getHotelRating()) {
					List<BigInteger> rate=rating.getRating();
					for(BigInteger r: rate) {
						totalRating+=r.longValue();
						totalProvider++;
					}
				}
				
				obj.setRating(0.0);
				if(totalProvider>0) {
					obj.setRating((double)totalRating/totalProvider);
				}
				
				/**
				 * address info
				 */
				obj.setAddress(hotel.getHotelProperty().get(0).getHotelLocation());
				if(hotel.getHotelProperty().get(0).getCoordinateLocation()!=null) {
					obj.setLatitude(hotel.getHotelProperty().get(0).getCoordinateLocation().getLatitude());
					obj.setLongitude(hotel.getHotelProperty().get(0).getCoordinateLocation().getLongitude());
				}

				Distance distance=new Distance();
				if(hotel.getHotelProperty().get(0).getDistance()!=null) {
					distance.setDirection(hotel.getHotelProperty().get(0).getDistance().getDirection());
					distance.setUnits(hotel.getHotelProperty().get(0).getDistance().getUnits());
					distance.setValue(hotel.getHotelProperty().get(0).getDistance().getValue());
				}
				obj.setDistance(distance);
			}
			

			
			/**
			 * price info
			 */
			if(hotel.getRateInfo().size()>0) {
				obj.setMinimumAmount(hotel.getRateInfo().get(0).getMinimumAmount());
				obj.setMaximunAmount(hotel.getRateInfo().get(0).getMaximumAmount());
			}
			
			hotels.add(obj);
			
		}
		
		hotelResp.setHotels(hotels);
		
		return hotelResp;
	}

	/**
	 * 
	 * @param hotelDetail
	 * @return
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	public HotelDetailResponse mapHotelDetailResponse(HotelDetailsRsp hotelDetail) throws ParseException, DatatypeConfigurationException {
		
		HotelDetailResponse hr=new HotelDetailResponse();
		
		/*
		 * hotel property
		 */
		hr.setHotelChain(hotelDetail.getRequestedHotelDetails().getHotelProperty().getHotelChain());
		hr.setHotelCode(hotelDetail.getRequestedHotelDetails().getHotelProperty().getHotelCode());
		hr.setHotelLocation(hotelDetail.getRequestedHotelDetails().getHotelProperty().getHotelLocation());
		hr.setName(hotelDetail.getRequestedHotelDetails().getHotelProperty().getName());
		
		hr.setAddresses(hotelDetail.getRequestedHotelDetails().getHotelProperty().getPropertyAddress().getAddress());
		hr.setPhoneNumber(hotelDetail.getRequestedHotelDetails().getHotelProperty().getPhoneNumber());
		
		
		Distance d=new Distance();
		d.setDirection(hotelDetail.getRequestedHotelDetails().getHotelProperty().getDistance().getDirection());
		d.setUnits(hotelDetail.getRequestedHotelDetails().getHotelProperty().getDistance().getUnits());
		d.setValue(hotelDetail.getRequestedHotelDetails().getHotelProperty().getDistance().getValue());;
		hr.setDistance(d);
		
		hr.setMarketingMessage(hotelDetail.getRequestedHotelDetails().getHotelProperty().getMarketingMessage().getText());
		
		/*
		 * hotel Detail item
		 *
		 */
		if(hotelDetail.getRequestedHotelDetails().getHotelDetailItem()!=null && hotelDetail.getRequestedHotelDetails().getHotelDetailItem().size()>0) {
			for(HotelDetailItem hi:hotelDetail.getRequestedHotelDetails().getHotelDetailItem()) {
				if(hi.getName().equalsIgnoreCase("CheckInTime")){
					hr.setCheckInTime(hi.getText().get(0));
				}
				else if(hi.getName().equalsIgnoreCase("CheckOutTime")) {
					hr.setCheckOutTime(hi.getText().get(0));
				}
			}
		}
		
		/*
		 * hotel rate detail
		 */
		List<RoomType> rTypes=new ArrayList<>();
		
		for(HotelRateDetail rdt:hotelDetail.getRequestedHotelDetails().getHotelRateDetail()) {
			RoomType rt=new RoomType();
			rt.setRatePlantype(rdt.getRatePlanType());
			rt.setBaseRate(rdt.getBase());
			rt.setTotalRate(rdt.getTotal());
			rt.setRateCategory(rdt.getRateCategory());
			rt.setRateChangeIndicator(rdt.getRateChangeIndicator().value());
			rt.setExtraFeesIncluded(rdt.getExtraFeesIncluded().value().equals("true")?true:false);
			
			for(TypeHotelRateDescription tyDesc: rdt.getRoomRateDescription()) {
				
				if(tyDesc.getName().equalsIgnoreCase("Room")) {
					rt.setRoomDiscription(tyDesc.getText());
				}
				else if(tyDesc.getName().equalsIgnoreCase("Rate")) {
					rt.setRoomDiscription(tyDesc.getText());
				}
			}
			
			rt.setEffectiveBaseRate(rdt.getHotelRateByDate().get(0).getBase());
			rt.setCommissionIndicator(rdt.getCommission().getIndicator());
			rt.setCommissionPercent(rdt.getCommission().getPercent());
			rt.setRoomCapicity(rdt.getRateMatchIndicator());
			if(rdt.getCancelInfo()!=null) {
				
				rt.setCancelDeadline(rdt.getCancelInfo().getCancelDeadline()==null?null:rdt.getCancelInfo().getCancelDeadline().toString());
				rt.setNonRefundableStay(rdt.getCancelInfo().getNonRefundableStayIndicator());
			}
			rt.setGuaranteeType(rdt.getGuaranteeInfo().getGuaranteeType());
			
			rt.setSmokingRoomIndicator(rdt.getInclusions().getSmokingRoomIndicator());
			rt.setBedTypesCode(rdt.getInclusions().getBedTypes().iterator().next().getCode());
			rt.setMealPlan(rdt.getInclusions().getMealPlans());
			
			rTypes.add(rt);
			
		}
		
		hr.setRoomTypes(rTypes);
		
		return hr;
		
	}
		

}
