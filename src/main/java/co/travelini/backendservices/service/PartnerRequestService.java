package co.travelini.backendservices.service;

import java.util.Optional;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.dto.request.PartnerServiceDTO;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.entity.ServiceTransactionList;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.PartnerServiceRequestRepo;
import co.travelini.backendservices.repo.TransactionReceiptRepo;
import co.travelini.backendservices.repo.TraveliniAccountRepo;
import co.travelini.backendservices.util.PartnerServiceRequestType;
import co.travelini.backendservices.util.TransactionNumberGenerator;

/**
 * 
 * @author Prabhu
 *
 */
@Service
public class PartnerRequestService {

	@Autowired
	protected TraveliniAccountRepo traveliniAccountRepo;

	@Autowired
	private BeanFactory beanFactory;
	
	@Autowired
	private TransactionReceiptRepo transrepo;

	
	/**
	 * Create the partner service request for insurance/visa/forex/driving
	 * license
	 * 
	 * @param accountId
	 * @param partnerServiceDTO
	 * @throws TraveliniException
	 */
	public void createPartnerServiceRequest(long accountId, PartnerServiceDTO partnerServiceDTO)
			throws TraveliniException {

		AbstractPartnerRequestService prService = null;
		Optional<TraveliniAccount> traveliniAccountOpt = traveliniAccountRepo.findById(accountId);
		
		if (!traveliniAccountOpt.isPresent())
			throw new TraveliniException(ResponseCode.ERR_ACCOUNT_NOT_FOUND);

		switch (partnerServiceDTO.getType()) {
		case INSURANCE:
			prService = (AbstractPartnerRequestService) beanFactory.getBean("insuranceService");
			break;
		case VISA:
			prService = (AbstractPartnerRequestService) beanFactory.getBean("visaService");
			break;
		case FOREX:
			prService = (AbstractPartnerRequestService) beanFactory.getBean("forexService");
			break;
		case DRIVING:

			prService = (AbstractPartnerRequestService) beanFactory.getBean("drivingService");
			break;

		default:
			throw new TraveliniException(ResponseCode.ERR_INVALID_PARTNER_TYPE);
			
		}
		
	
		prService.createPartnerServiceRequest(partnerServiceDTO);
		
		if (!traveliniAccountOpt.isPresent())
			
		throw new TraveliniException(ResponseCode.ERR_ACCOUNT_NOT_FOUND);
	

		
	}


	public String getTransactionId(long accountId,PartnerServiceDTO partnerServiceDTO) 
	{
		
		
		
		ServiceTransactionList list = new ServiceTransactionList();
		
		String rawPassword = TransactionNumberGenerator.generateRandomString();
		

		
		
		 long transaction = transrepo.count();  
		
		 long newNum = transaction + 10000;
		 
		 String completeTransactionReceipt  = rawPassword + newNum; 
		 String completeTransactionreceipt = completeTransactionReceipt.toUpperCase();
		 
		list.setTransactionNumber(completeTransactionreceipt);
		list.setAccountId(partnerServiceDTO.getAccId());

      PartnerServiceRequestType enumTypes = 		partnerServiceDTO.getType();

		PartnerServiceRequestType yolo = null  ; 
		
		if(partnerServiceDTO.getType() == enumTypes.DRIVING)
		{
			list.setType("DRIVING");
			//transrepo.save(list);
		}
		else if(partnerServiceDTO.getType() == enumTypes.FOREX)
		{
			list.setType("FOREX");
			//transrepo.save(list);
		}
		else if(partnerServiceDTO.getType() == enumTypes.INSURANCE)
		{
			list.setType("INSURANCE");
			//transrepo.save(list);
		}
		else if(partnerServiceDTO.getType() == enumTypes.VISA)
		{
			list.setType("VISA");
			//transrepo.save(list);
		}
	
		list.setTansactionId(partnerServiceDTO.getTransCode());

		System.out.print(partnerServiceDTO.getType());
		transrepo.save(list);
		
		return completeTransactionreceipt;
	}
}