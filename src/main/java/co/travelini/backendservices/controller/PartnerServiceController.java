package co.travelini.backendservices.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.request.PartnerServiceDTO;
import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.TraveliniAccountRepo;
import co.travelini.backendservices.service.PartnerRequestService;
import co.travelini.backendservices.service.PartnerServiceMailSender;
import co.travelini.backendservices.util.RandomNumericString;
import co.travelini.backendservices.util.TransactionNumberGenerator;

/**
 * This controller will handle all request related to partner service request
 * 
 * @author Prabhu
 *
 */
@RequestMapping("/api")
@RestController
public class PartnerServiceController {

	@Autowired
	private PartnerRequestService psRequestService;

	@Autowired
	protected TraveliniAccountRepo traveliniAccountRepo;
	
	@Autowired
	PartnerServiceMailSender sendTransactionDetails;
	
	/**
	 * Create the partner service request for insurance/visa/forex/driving
	 * license
	 * 
	 * @param accountId
	 * @param partnerServiceDTO
	 * @return
	 * @throws TraveliniException
	 */
	@PostMapping(path = "/v1/accounts/{accountId}/partnerservices")
	@ResponseBody
	public GenericResponse<PartnerServiceDTO> createPartnerServiceRequest(@PathVariable("accountId") long accountId,
			@Valid @RequestBody PartnerServiceDTO partnerServiceDTO) throws TraveliniException {
		
		
		 psRequestService.createPartnerServiceRequest(accountId, partnerServiceDTO);
		 
		 
		GenericResponse<PartnerServiceDTO> res =  new GenericResponse<PartnerServiceDTO>(ResponseCode.SUC_GENERIC);
		
		
		String Transactionid  = psRequestService.getTransactionId(accountId,partnerServiceDTO);	
		try
		{
			sendTransactionDetails.sendUserTransaction(accountId, partnerServiceDTO,Transactionid);
		     res.setStatus(TraveliniResponseStatus.SUCCESS);
			res.setMessage("Generic Success");
			res.setData(Transactionid);
			res.setCode(1000001);
			res.setAppCode("Suc_Generic");
		}
			catch(Exception e)
			{
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Data retrieval failed");
			}
		
		return  res;
	}
	
}