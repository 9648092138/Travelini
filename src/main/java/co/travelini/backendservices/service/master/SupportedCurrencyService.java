package co.travelini.backendservices.service.master;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.entity.master.SupportedCurrency;
import co.travelini.backendservices.repo.master.SupportedCurrencyRepo;

@Service
public class SupportedCurrencyService {

	@Autowired
	private SupportedCurrencyRepo supportedCurrencyRepo;

	public Optional<SupportedCurrency> getById(Long id) {
		return supportedCurrencyRepo.findById(id);
	}

	public Optional<SupportedCurrency> getByCode(String currencyCode) {
		return this.supportedCurrencyRepo.findByCode(currencyCode);
	}

	public List<SupportedCurrency> getAll() {
		return supportedCurrencyRepo.findAllByName();
	}

	public SupportedCurrency addCurrency(SupportedCurrency supportedcurr) {
		
		return supportedCurrencyRepo.save(supportedcurr);
	}


	public Optional<SupportedCurrency> getCurrencybyId(String country) {
		
		return supportedCurrencyRepo.findByCode(country);
	}

	
}
