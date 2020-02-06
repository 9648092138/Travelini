package co.travelini.backendservices.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.travelini.backendservices.dto.request.OriginDestinationDetailDTO;
import co.travelini.backendservices.dto.request.PartnerServiceDTO;
import co.travelini.backendservices.dto.response.success.PrimaryContactDTO;
import co.travelini.backendservices.entity.Itinerary;
import co.travelini.backendservices.entity.OriginDestinationDetail;
import co.travelini.backendservices.entity.PartnerServiceRequest;
import co.travelini.backendservices.entity.PrimaryContact;
import co.travelini.backendservices.exception.TraveliniException;

/**
 * 
 * @author Prabhu
 *
 */
@Service("visaService")
public class PSVisaRequestService extends AbstractPartnerRequestService {

	/**
	 * Create partner service request for visa
	 * 
	 * @param partnerServiceDTO
	 * @throws TraveliniException
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	protected void createPartnerServiceRequest(PartnerServiceDTO partnerServiceDTO) throws TraveliniException
	{

try
{
	
		PrimaryContactDTO primaryContactDTO = partnerServiceDTO.getPrimaryContactDTO();

		// Save primary contact entity
		PrimaryContact primaryContact = createPrimaryContact(primaryContactDTO);

		// Save partner service request entity
		PartnerServiceRequest partnerServiceRequest = createPartnerRequest(partnerServiceDTO, primaryContact);

		
		
		
		// link itinerary with primary contact
		if (partnerServiceDTO.getItineraryId() != null || partnerServiceDTO.getItineraryId() != 0)
		{
			Itinerary existingItineary = itineraryRepo.findItineraryByItineraryId(partnerServiceDTO.getItineraryId());
			existingItineary.setPrimaryContactId(primaryContact.getPrimaryContactId());
			itineraryRepo.save(existingItineary);
		}

		// Save origin destination entity
		List<OriginDestinationDetailDTO> originDestinationDetailList = partnerServiceDTO
				.getOriginDestinationDetailDTOList();
		List<OriginDestinationDetail> originDestinationDetails = createOriginDestinationDetails(
				partnerServiceDTO.getItineraryId(), originDestinationDetailList);

		// save partnerservice_to_origin_dest entity
		createPSOriginDestinationDetail(originDestinationDetails, partnerServiceRequest);
}
catch(Exception e)
{
	System.out.println("Exception =" + e);
}
}
	
}
