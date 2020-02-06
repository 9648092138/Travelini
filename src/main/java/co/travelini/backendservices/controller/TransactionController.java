package co.travelini.backendservices.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.ResponsebyuserId;
import co.travelini.backendservices.dto.response.TransactionaldetailResponse;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;
import co.travelini.backendservices.entity.FavouriteList;
import co.travelini.backendservices.entity.PartnerServiceRequest;
import co.travelini.backendservices.entity.PrimaryContact;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.service.TransactionService;

@RequestMapping("/api")
@RestController
public class TransactionController {
	@Autowired
	private TransactionService transactionservice;
	
	

	@GetMapping("/v1/{transcode}")
	public GenericResponse<PrimaryContact> transactiondetail(@PathVariable("transcode") String transcode)
			throws TraveliniException {
		GenericResponse<PrimaryContact> res = new GenericResponse<PrimaryContact>(ResponseCode.SUC_GENERIC);
		

		TransactionaldetailResponse response = new TransactionaldetailResponse();
		Optional<PartnerServiceRequest> code = transactionservice.findbytcode(transcode);
		if (!code.isPresent()) {
			System.out.println("TRANSACTION CODE NOT PRESENT");
		}
		else {
			PartnerServiceRequest pservice = code.get();
			long primary_contactid = pservice.getPrimaryContactId();
			try {
			PrimaryContact  resp = transactionservice.findbyprimaricontectid(primary_contactid);
	         System.out.println("contect id "+primary_contactid);	
	         System.out.println("Type "+pservice.getType());
	         System.out.println(""+pservice.getPrimaryContact());
				if(resp != null) {
				
					response.setName(resp.getName());
					response.setAmount(resp.getAmount());
					response.setAddress(resp.getAddress());
					response.setEmail(resp.getEmailId());
					response.setPhone(resp.getPhoneNum());
					response.setType(pservice.getType());
					res.setData(response);
					return res;
				}
				else {
					res.setStatus(TraveliniResponseStatus.ERROR);
					res.setMessage("No data found ");

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
			
	
		res.setStatus(TraveliniResponseStatus.ERROR);
		res.setMessage("No data found ");

		return res;

	}
}
