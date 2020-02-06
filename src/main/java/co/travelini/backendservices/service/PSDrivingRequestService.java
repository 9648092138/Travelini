package co.travelini.backendservices.service;

import org.springframework.stereotype.Service;

import co.travelini.backendservices.dto.request.PartnerServiceDTO;
import co.travelini.backendservices.dto.response.success.PrimaryContactDTO;
import co.travelini.backendservices.entity.PCLicenseDelivery;
import co.travelini.backendservices.entity.PartnerServiceRequest;
import co.travelini.backendservices.entity.PrimaryContact;
import co.travelini.backendservices.exception.TraveliniException;

/**
 * 
 * @author Prabhu
 *
 */
@Service("drivingService")
public class PSDrivingRequestService extends AbstractPartnerRequestService {

	/**
	 * 
	 * @param partnerServiceDTO
	 * @throws TraveliniException
	 */
	@Override
	protected void createPartnerServiceRequest(PartnerServiceDTO partnerServiceDTO) throws TraveliniException {
		PrimaryContactDTO primaryContactDTO = partnerServiceDTO.getPrimaryContactDTO();

		// Save primary contact entity
		PrimaryContact primaryContact = createPrimaryContact(primaryContactDTO);

		// Save partner service request entity
try
{
		PartnerServiceRequest partnerServiceRequest = createPartnerRequest(partnerServiceDTO, primaryContact);

		// Save LicenseDelivery Type
		PCLicenseDelivery pCLicenseDelivery = new PCLicenseDelivery();
		pCLicenseDelivery.setPrimaryContactId(primaryContact.getPrimaryContactId());
		pCLicenseDelivery.setDeliveryType(partnerServiceDTO.getLicenseDeliveryType());
		pCLicenseDeliveryRepo.save(pCLicenseDelivery);
}
catch(Exception e)
{
	System.out.println("Exception = "+e);
}
	}
}
