package co.travelini.backendservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import co.travelini.backendservices.dto.request.CreateItineraryRequest;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.success.ItineraryDetailsDTO;
import co.travelini.backendservices.entity.FavouriteList;
import co.travelini.backendservices.entity.Itinerary;
import co.travelini.backendservices.entity.ItineraryFlights;
import co.travelini.backendservices.entity.OriginDestinationDetail;
import co.travelini.backendservices.entity.PrimaryContact;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.master.Country;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.FlightItinieryRepo;
import co.travelini.backendservices.repo.ItineraryRepo;
import co.travelini.backendservices.repo.OriginDestinationDetailRepo;
import co.travelini.backendservices.repo.PrimaryContactRepo;
import co.travelini.backendservices.repo.TraveliniAccountRepo;
import co.travelini.backendservices.repo.master.CountryRepo;

@Service
public class ItineraryService {

	@Autowired
	private ItineraryRepo itineraryRepo;

	@Autowired
	protected TraveliniAccountRepo traveliniAccountRepo;
	
	@Autowired
	protected PrimaryContactRepo primaryContactRepo;
	
	@Autowired
	protected OriginDestinationDetailRepo originDestinationRepo;
	
	@Autowired
	protected FlightItinieryRepo flightRepo;
	
	
	@Autowired
	protected CountryRepo countryRepo;
	
	@Autowired
	TraveliniAccountRepo userRepo;

//	public Itinerary save(Itinerary itinerary) {
//		
//		
//		PrimaryContact contact = primaryContactRepo.findByPrimaryContactId(itinerary.getPrimaryContactId());
//		itinerary.setPrimaryContact(contact);
//		System.out.println(itinerary.getAccountId());
//		TraveliniAccount travelini = traveliniAccountRepo.findByAccountId(itinerary.getAccountId());
//		
//		itinerary.setTraveliniAccount(travelini);
//		
//		List<OriginDestinationDetail> destinatioDetail = itinerary.getOriginDestinationDetail();
//		List<OriginDestinationDetail> saveDestinatioDetail = new ArrayList<OriginDestinationDetail>();
//		for(OriginDestinationDetail d : destinatioDetail) {
//			Country originCountry = countryRepo.findCountryById(d.getOriginCountryId());
//			d.setOriginCountry(originCountry);
//			Country destinationCountry = countryRepo.findCountryById(d.getDestinationCountryId());
//			d.setDestinationCountry(destinationCountry);
//			originDestinationRepo.save(d);
//			saveDestinatioDetail.add(d);
//		}
//		
//		itinerary.setOriginDestinationDetail(saveDestinatioDetail);
//		return itineraryRepo.save(itinerary);
//	}

	/**
	 * Fetch all itinaries by account id
	 * 
	 * @param accountId
	 * @param isBooked
	 * @return
	 * @throws TraveliniException
	 */
	public List<ItineraryDetailsDTO> getItinerariesByAccountId(long accountId, Boolean isBooked)
			throws TraveliniException 
	{

		List<ItineraryDetailsDTO> itineraryDetailsDTOs = new ArrayList<ItineraryDetailsDTO>();
		List<Itinerary> itineraries = null;

		Optional<TraveliniAccount> traveliniAccountOpt = traveliniAccountRepo.findById(accountId);
		if (!traveliniAccountOpt.isPresent())
			throw new TraveliniException(ResponseCode.ERR_ACCOUNT_NOT_FOUND);

		if (isBooked == null)
			itineraries = itineraryRepo.findAllByAccountId(accountId);
		else
			itineraries = itineraryRepo.findAllByAccountIdAndIsBooked(accountId, isBooked);
		if (!CollectionUtils.isEmpty(itineraries)) {
			itineraryDetailsDTOs = itineraries.stream().map(itinerary -> new ItineraryDetailsDTO(itinerary))
					.collect(Collectors.<ItineraryDetailsDTO>toList());
		}

		return itineraryDetailsDTOs;
	}

//
//	public ItineraryFlights saveFlightsToItenary(ItineraryFlights flights) {
//		Itinerary itineray = itineraryRepo.findItineraryByItineraryId(flights.getIternaryId());
//		if(itineray != null) {
//			flightRepo.save(flights);
//			return flights;
//		}else {
//			return null;
//		}
//		
//	}
	
	public ItineraryFlights saveFlightsToItenary(ItineraryFlights flights) {
		return flightRepo.save(flights);
		
	}
	
	//*************************fligth response by  user id ***************************//
	@Transactional
	public List<ItineraryFlights> getflightByUserId(long userId) {
		//FavouriteList list = repo.findByUserId(userId);
		List<ItineraryFlights> list =flightRepo.findByUserId(userId);
	return list;
	}

	public Itinerary saveItinerary(CreateItineraryRequest itenary) {
		boolean UserStatus = false ;
		// TODO Auto-generated method stub
		Itinerary  list = new Itinerary();
	//	FavouriteList list1 = new FavouriteList();
		try {
			UserStatus = userRepo.existsById(itenary.getUserId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("user exist ");
			e.printStackTrace();
		}
		
		if(UserStatus) {
			list.setAccountId(itenary.getUserId());
			list.setName(itenary.getItineraryName());
			list.setItineraryImage(itenary.getItineraryImage());
			list.setAdultCount(itenary.getNumberOfAdults());
			list.setChildCount(itenary.getNumberOfChilds());
			list.setNumberOfInfants(itenary.getNumberOfInfants());
			list.setStartDate(itenary.getStartDate());
			list.setEndDate(itenary.getEndDate());
			list.setBudget(itenary.getBudget());
			list.setIsBooked(itenary.getIsBooked());
			list.setLocation(itenary.getLocation());
			//list.setFlightId(itenary.getFlightId());
			try {
				list = itineraryRepo.save(list);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("error in save");
				e.printStackTrace();
			}
		}else {
			list=null;
		}
		return list;
	}
	
//	public List<ItineraryFlights> getFightsOfItineray(long userId)
//	{
//		List<ItineraryFlights>  list = flightRepo.findByUserId(userId);
//		 return list;
//	}
	
}