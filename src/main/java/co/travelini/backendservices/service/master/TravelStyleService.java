package co.travelini.backendservices.service.master;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.entity.master.TravelStyle;
import co.travelini.backendservices.repo.master.TravelStyleRepo;

@Service
public class TravelStyleService {

	@Autowired
	private TravelStyleRepo travelStyleRepo;

	public Optional<TravelStyle> getById(Long id) {
		return travelStyleRepo.findById(id);
	}

	public List<TravelStyle> getAll() {
		return travelStyleRepo.findAll();
	}

}
