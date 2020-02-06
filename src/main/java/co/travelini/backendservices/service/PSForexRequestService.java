package co.travelini.backendservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.travelini.backendservices.dto.request.ForexAmountDetailDTO;
import co.travelini.backendservices.dto.request.PartnerServiceDTO;
import co.travelini.backendservices.dto.response.success.PrimaryContactDTO;
import co.travelini.backendservices.entity.ForexAmountDetail;
import co.travelini.backendservices.entity.PartnerServiceRequest;
import co.travelini.backendservices.entity.PrimaryContact;
import co.travelini.backendservices.exception.TraveliniException;

/**
 * 
 * @author Prabhu
 *
 */
@Service("forexService")
public class PSForexRequestService extends AbstractPartnerRequestService 
{

	/**
	 * 
	 * @param partnerServiceDTO
	 * @throws TraveliniException
	 */
	@Override
	protected void createPartnerServiceRequest(PartnerServiceDTO partnerServiceDTO) throws TraveliniException 
	{
		PrimaryContactDTO primaryContactDTO = partnerServiceDTO.getPrimaryContactDTO();

		// Save primary contact entity
		PrimaryContact primaryContact = createPrimaryContact(primaryContactDTO);

	try
	{
		// Save partner service request entity
		PartnerServiceRequest partnerServiceRequest = createPartnerRequest(partnerServiceDTO, primaryContact);

		// Skipped Itinerary Part

		// Save Forex Amount entity
		List<ForexAmountDetailDTO> forexAmountDetailList = partnerServiceDTO.getForexAmountsDTOList();
		List<ForexAmountDetail> forexAmountDetails = createForexAmountDetails(partnerServiceDTO.getItineraryId(),
				forexAmountDetailList);

		// save partnerservice_to_origin_dest entity
		createPSForexAmountDetail(forexAmountDetails, partnerServiceRequest);
	}
	catch(Exception e)
	{
		System.out.println("Exception = "+e);
	}
	}
}