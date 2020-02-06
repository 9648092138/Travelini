package co.travelini.backendservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.entity.PrimaryContact;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.PrimaryContactRepo;

@Service
public class PrimaryContactService {

	@Autowired
	private PrimaryContactRepo primaryContactRepo;

	public PrimaryContact save(PrimaryContact primaryContact) {
		return primaryContactRepo.save(primaryContact);
	}

	public Optional<PrimaryContact> findById(long id) throws TraveliniException {
		return primaryContactRepo.findById(id);
	}

}
