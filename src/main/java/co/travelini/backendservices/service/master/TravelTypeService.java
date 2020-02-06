package co.travelini.backendservices.service.master;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.entity.master.TravelType;
import co.travelini.backendservices.repo.master.TravelTypeRepo;

@Service
public class TravelTypeService {

	@Autowired
	private TravelTypeRepo travelTypeRepo;

	public Optional<TravelType> getById(Long id) {
		return travelTypeRepo.findById(id);
	}

	public List<TravelType> getAll() {
		return travelTypeRepo.findAll();
	}

}
