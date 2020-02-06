package co.travelini.backendservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import co.travelini.backendservices.dto.request.ForexAmountDetailDTO;
import co.travelini.backendservices.dto.request.OriginDestinationDetailDTO;
import co.travelini.backendservices.dto.request.PartnerServiceDTO;
import co.travelini.backendservices.dto.response.success.PrimaryContactDTO;
import co.travelini.backendservices.entity.ForexAmountDetail;
import co.travelini.backendservices.entity.Itinerary;
import co.travelini.backendservices.entity.OriginDestinationDetail;
import co.travelini.backendservices.entity.PSForexAmount;
import co.travelini.backendservices.entity.PSOriginDestination;
import co.travelini.backendservices.entity.PartnerServiceRequest;
import co.travelini.backendservices.entity.PrimaryContact;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.ForexAmountDetailRepo;
import co.travelini.backendservices.repo.ItineraryRepo;
import co.travelini.backendservices.repo.OriginDestinationDetailRepo;
import co.travelini.backendservices.repo.PSForexAmountRepo;
import co.travelini.backendservices.repo.PCLicenseDeliveryRepo;
import co.travelini.backendservices.repo.PSOriginDestinationRepo;
import co.travelini.backendservices.repo.PartnerServiceRequestRepo;
import co.travelini.backendservices.repo.PrimaryContactRepo;
import co.travelini.backendservices.repo.master.CountryRepo;

/**
 * 
 * @author Prabhu
 *
 */
public abstract class AbstractPartnerRequestService {

	@Autowired
	protected PrimaryContactRepo primaryContactRepo;

	@Autowired
	protected CountryRepo countryRepo;

	@Autowired
	protected OriginDestinationDetailRepo partnerServiceDestinationRepo;

	@Autowired
	protected ItineraryRepo itineraryRepo;
	
	@Autowired
	protected PCLicenseDeliveryRepo pCLicenseDeliveryRepo;

	@Autowired
	protected PartnerServiceRequestRepo partnerServiceRequestRepo;

	@Autowired
	protected PSOriginDestinationRepo psOriginDestinationRepo;
	
	@Autowired
	protected PSForexAmountRepo psForexAmountRepo;
	
	@Autowired
	protected ForexAmountDetailRepo forexAmountDetailRepo;

	/**
	 * 
	 * @param partnerServiceDTO
	 * @throws TraveliniException
	 */
	protected abstract void createPartnerServiceRequest(PartnerServiceDTO partnerServiceDTO) throws TraveliniException;

	/**
	 * Save primary contact entity
	 * 
	 * @param primaryContactDTO
	 * @return
	 */
	protected PrimaryContact createPrimaryContact(PrimaryContactDTO primaryContactDTO) {

		PrimaryContact primaryContact = new PrimaryContact(primaryContactDTO);
		primaryContactRepo.save(primaryContact);
		return primaryContact;
	}

	/**
	 * Save partner service request entity
	 * 
	 * @param partnerServiceDTO
	 * @param primaryContactData
	 * @return
	 */
	protected PartnerServiceRequest createPartnerRequest(PartnerServiceDTO partnerServiceDTO,PrimaryContact primaryContactData) {

		PartnerServiceRequest partnerServiceRequest = new PartnerServiceRequest();
		partnerServiceRequest.setType(partnerServiceDTO.getType().name());
		partnerServiceRequest.setPrimaryContactId(primaryContactData.getPrimaryContactId());
		partnerServiceRequest.setTransCode(partnerServiceDTO.getTransCode());
		return partnerServiceRequestRepo.save(partnerServiceRequest);
	}

	/**
	 * Save origin destination entity
	 * 
	 * @param originDestinationDetailDTOs
	 * @return
	 */
	protected List<OriginDestinationDetail> createOriginDestinationDetails(Long itineraryId,List<OriginDestinationDetailDTO> originDestinationDetailDTOs) {

		List<OriginDestinationDetail> originDestinationDetails = new ArrayList<OriginDestinationDetail>();
		if (!CollectionUtils.isEmpty(originDestinationDetailDTOs)) {
			originDestinationDetails = originDestinationDetailDTOs.stream().map(originDestinationDTO -> {
				OriginDestinationDetail originDestinationDetail = new OriginDestinationDetail(originDestinationDTO);
				if (itineraryId != 0 && itineraryId != null) {
					Itinerary itinerary = itineraryRepo.findItineraryByItineraryId(itineraryId);
					originDestinationDetail.setItinerary(itinerary);
					partnerServiceDestinationRepo.save(originDestinationDetail);
				}
				return originDestinationDetail;
			}).collect(Collectors.<OriginDestinationDetail>toList());

			originDestinationDetails = partnerServiceDestinationRepo.saveAll(originDestinationDetails);
		}
		return originDestinationDetails;
	}

	/**
	 * save partnerservice_to_origin_dest entity
	 * 
	 * @param originDestinationDetails
	 * @param partnerServiceRequest
	 */
	protected void createPSOriginDestinationDetail(List<OriginDestinationDetail> originDestinationDetails,
			PartnerServiceRequest partnerServiceRequest) {

		List<PSOriginDestination> psOriginDestinations = new ArrayList<PSOriginDestination>();
		if (!CollectionUtils.isEmpty(originDestinationDetails)) {
			psOriginDestinations = originDestinationDetails.stream()
					.map(originDestinationDetail -> new PSOriginDestination(
							originDestinationDetail.getOriginDestinationDetailsId(),
							partnerServiceRequest.getPartnerServiceRequestId()))
					.collect(Collectors.<PSOriginDestination>toList());
			psOriginDestinationRepo.saveAll(psOriginDestinations);
		}
	}
	
	
	protected List<ForexAmountDetail> createForexAmountDetails(Long itineraryId,
			List<ForexAmountDetailDTO> forexAmountDetailDTOs) {
		
		List<ForexAmountDetail> forexAmountDetails = new ArrayList<ForexAmountDetail>();
		if (!CollectionUtils.isEmpty(forexAmountDetailDTOs)) {
		
			forexAmountDetails = forexAmountDetailDTOs.stream().map(forexAmountDetailDTO -> {
				ForexAmountDetail forexAmountDetail = new ForexAmountDetail(forexAmountDetailDTO);
				 
				return forexAmountDetail;
			}).collect(Collectors.<ForexAmountDetail>toList());

			forexAmountDetails = forexAmountDetailRepo.saveAll(forexAmountDetails);
		}
		return forexAmountDetails;
	}
	
	
	protected void createPSForexAmountDetail(List<ForexAmountDetail> forexAmountDetails,PartnerServiceRequest partnerServiceRequest) {
		
		List<PSForexAmount> psForexAmounts = new ArrayList<PSForexAmount>();
		try
		{
		if (!CollectionUtils.isEmpty(forexAmountDetails)) 
		{
			psForexAmounts = forexAmountDetails.stream()
					.map(forexAmountDetail -> new PSForexAmount(
							forexAmountDetail.getForexAmountDetailId(),
							partnerServiceRequest.getPartnerServiceRequestId()))
					.collect(Collectors.<PSForexAmount>toList());
			psForexAmountRepo.saveAll(psForexAmounts);
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


	
}