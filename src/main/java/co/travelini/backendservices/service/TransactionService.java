package co.travelini.backendservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.entity.PartnerServiceRequest;
import co.travelini.backendservices.entity.PrimaryContact;
import co.travelini.backendservices.repo.PartnerServiceRequestRepo;
import co.travelini.backendservices.repo.PrimaryContactRepo;

@Service
public class TransactionService {
    @Autowired
	private PartnerServiceRequestRepo partenerRepo;
  
    @Autowired
   private  PrimaryContactRepo contectrepo;
   
	public Optional<PartnerServiceRequest> findbytcode(String transcode) {
		// TODO Auto-generated method stub
		System.out.println("transaction code --> "+transcode);
		return this.partenerRepo.getbytCode(transcode);
	}

	public PrimaryContact findbyprimaricontectid(long primary_contactid) {
		// TODO Auto-generated method stub
		return this.contectrepo.findByPrimaryContactId(primary_contactid);
		//return this.contectrepo.findById(primary_contactid);
	}

}
