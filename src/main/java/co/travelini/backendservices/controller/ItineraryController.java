package co.travelini.backendservices.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.request.CreateItineraryRequest;
import co.travelini.backendservices.dto.request.ItineraryFlightRequests;
import co.travelini.backendservices.dto.response.Addflightresponse;
import co.travelini.backendservices.dto.response.CreateItineraryResponse;
import co.travelini.backendservices.dto.response.FavouriteListresponse;
import co.travelini.backendservices.dto.response.FlightResponseByuserId;
import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.ResponsebyuserId;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;
import co.travelini.backendservices.dto.response.success.ItineraryDetailsDTO;
import co.travelini.backendservices.entity.FavouriteList;
import co.travelini.backendservices.entity.Itinerary;
import co.travelini.backendservices.entity.ItineraryFlights;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.FavouriteRepo;
import co.travelini.backendservices.service.FavouriteService;
import co.travelini.backendservices.service.ItineraryService;
import co.travelini.backendservices.service.PartnerServiceMailSender;

/**
 * This controller will handle all request related to Itinerary
 * 
 * @author Prabhu
 *
 */
@RequestMapping("/api")
@RestController
public class ItineraryController {

	@Autowired
	private ItineraryService itineraryService;

	@Autowired
	PartnerServiceMailSender sendflightDetails;
	
	@Autowired
	FavouriteRepo repo;

	@Autowired
	private FavouriteService service;
	/**
	 * Fetch all itinearies by account id
	 * 
	 * @param accountId
	 * @param isBooked
	 * @return
	 * @throws TraveliniException
	 */
	@GetMapping("/v1/getItineraryByUserId/{accountId}")
	public GenericResponse<List<ItineraryDetailsDTO>> getItinerariesByUserId(
			@PathVariable("accountId") long accountId,
			@RequestParam(name = "isBooked", required = false) Boolean isBooked) throws TraveliniException {

		List<ItineraryDetailsDTO> itineraryDetailsDTOs = itineraryService.getItinerariesByAccountId(accountId,
				isBooked);
		return new GenericResponse<List<ItineraryDetailsDTO>>(ResponseCode.SUC_GENERIC,
				Collections.singletonList(itineraryDetailsDTOs));

	}
	
	
	//====================================================//
	
	@PostMapping("/v1/createItinerary")
	public GenericResponse<Itinerary> createItinerary(@RequestBody CreateItineraryRequest itenary)
			throws TraveliniException {
		GenericResponse<Itinerary> res = new GenericResponse<Itinerary>(ResponseCode.SUC_GENERIC);
		// ======for activity list========================//
		List<FavouriteList> activityList = new ArrayList<>();
		
		List<ResponsebyuserId> resp = new ArrayList<>();
		
		// for activity response=====================//
		FavouriteListresponse activityres = new FavouriteListresponse();
		CreateItineraryResponse response = new CreateItineraryResponse();
		Itinerary itinerarypost = itineraryService.saveItinerary(itenary);
		
				
		FavouriteList activity = null;
		for(int i=0;i<itenary.getActivitiesId().size();i++) {
			activity = new FavouriteList();
			activity = repo.findByActivityId(itenary.getActivitiesId().get(i));
			//activityres.setBucketId(activity.getId());
			activityList.add(activity);
			
		}
		
		try {
			if(itinerarypost != null) {
				
				response.setUserId(itinerarypost.getAccountId());
				response.setItineraryId(itinerarypost.getItineraryId());
				System.out.println(" "+itinerarypost.getItineraryId());
				response.setItineraryName(itinerarypost.getName());
				response.setItineraryImage(itinerarypost.getItineraryImage());
				response.setNumberOfAdults(itinerarypost.getAdultCount());
				response.setNumberOfChilds(itinerarypost.getChildCount());
				response.setNumberOfInfants(itinerarypost.getNumberOfInfants());
				response.setStartDate(itinerarypost.getStartDate());
				response.setEndDate(itinerarypost.getEndDate());
				response.setBudget(itinerarypost.getBudget());
				response.setLocation(itinerarypost.getLocation());
				response.setActivitiesdetail(activityList);
				res.setData(response);
				
			}else {
				System.out.println("The value of post inside else" +itinerarypost);
				res.setStatus(TraveliniResponseStatus.ERROR);
				res.setMessage("User not found");
				res.setCode(40001);
				res.setAppCode("Suc_Generic");	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Data Posting unSuccessful");
			e.printStackTrace();
		}

		return res;
	}
	

	///==========================================================//
	@PostMapping("/v1/addFlight")
	public GenericResponse<ItineraryFlights> addFlight(@RequestBody ItineraryFlights flights) throws TraveliniException
	{
		GenericResponse<ItineraryFlights> res = new GenericResponse<ItineraryFlights>(ResponseCode.SUC_GENERIC);
		Addflightresponse response = new Addflightresponse();
		//return new GenericResponse<ItineraryFlights>(ResponseCode.SUC_GENERIC, Collections.singletonList(itineraryService.saveFlightsToItenary(flights)));
		
		try {
			ItineraryFlights resflight = itineraryService.saveFlightsToItenary(flights);
			//FavouriteList post = service.saveFavouriteList(favouritelist);

			if (resflight != null) {

				response.setUserId(resflight.getUserId());
				response.setFlightId(resflight.getId());
				response .setDistance(resflight.getDistance());
				response.setTime(resflight.getTime());
				response.setFrom(resflight.getFroms());
				response.setTo(resflight.getFto());
				response.setFlightCode(resflight.getFlightCode());
				response.setFlightType(resflight.getFlightType());
				response.setFlightName(resflight.getFlightName());
				response.setDepartureDate(resflight.getDepartureDate());
				response.setDepartureTerminal(resflight.getDepartureTerminal());
				response.setTime(resflight.getTime());
				response.setCurrency(resflight.getCurrency());
				response.setPrice(resflight.getPrice());

			} else {
				System.out.println("The value of post inside else" + resflight);
				res.setStatus(TraveliniResponseStatus.ERROR);
				res.setMessage("User not found");
				res.setCode(40001);
				res.setAppCode("Suc_Generic");
			}

		} catch (Exception e) {
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Data Posting unSuccessful");

		}
		sendflightDetails.sendflightdetails(flights);
		res.setData(response);
		System.out.println("Response "+response);
		return res;
	
	
	}
	
	@GetMapping("/v1/getFlightsById/{userId}")
	public GenericResponse<ItineraryFlights> getFlightsById(@PathVariable long userId) throws TraveliniException
	{
		GenericResponse<ItineraryFlights> resp = new GenericResponse<ItineraryFlights>(ResponseCode.SUC_GENERIC);
		
		List<FlightResponseByuserId > res = new ArrayList<>();
		FlightResponseByuserId response;
		
			List<ItineraryFlights> getbyid = itineraryService.getflightByUserId(userId);
			for(int i=0;i<getbyid.size();i++) {
                response = new FlightResponseByuserId();
				response.setUserId(getbyid.get(i).getUserId());
				response.setDistance(getbyid.get(i).getDistance());
				response.setFlightId(getbyid.get(i).getId());
				response.setTime(getbyid.get(i).getTime());
				response.setFroms(getbyid.get(i).getFroms());
				response.setFto(getbyid.get(i).getFto());
				response.setFlightCode(getbyid.get(i).getFlightCode());
				response.setFlightType(getbyid.get(i).getFlightType());
				response.setFlightName(getbyid.get(i).getFlightName());
				response.setDepartureDate(getbyid.get(i).getDepartureDate());
				response.setDepartureTerminal(getbyid.get(i).getDepartureTerminal());
				response.setPrice(getbyid.get(i).getPrice());
				response.setCurrency(getbyid.get(i).getCurrency());
				response.setCarrier(getbyid.get(i).getCarrier());
				response.setOperatingCarrier(getbyid.get(i).getOperatingCarrier());
				response.setDepartureTerminal(getbyid.get(i).getDepartureTerminal());
				response.setNumberOfAdults(getbyid.get(i).getNumberOfAdults());
				response.setNumberOfChilds(getbyid.get(i).getNumberOfChilds());
				response.setNumberOfInfants(getbyid.get(i).getNumberOfInfants());
				response.setUserEmail(getbyid.get(i).getUserEmail());
				response.setOperatingCarrierName(getbyid.get(i).getOperatingCarrierName());
			    res.add(response);
			}
			
		 resp.setData(res);
		return resp;

		//return new GenericResponse<List<ItineraryFlights>>(ResponseCode.SUC_GENERIC, Collections.singletonList(itineraryService.getFightsOfItineray(id)));
		
	}
}