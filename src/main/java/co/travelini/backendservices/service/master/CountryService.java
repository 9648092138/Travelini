package co.travelini.backendservices.service.master;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.entity.master.Country;

import co.travelini.backendservices.repo.master.CountryRepo;



@Service
public class CountryService {

	@Autowired
	private CountryRepo countryRepo;
	

	


	
	public Optional<Country> getById(Long id) 
	{

		
		
		return countryRepo.findById(id);
	}

	public Optional<Country> getByCode(String countryCode) 
	{
		
		return this.countryRepo.findByCode(countryCode);
	}

	public List<Country> getAll() 
	{
//			System.out.println(countryRepo.findAll());
		return countryRepo.findAllByName();
	}

	public Country addCountry(Country addCountry) {
		// TODO Auto-generated method stub
		return countryRepo.save(addCountry);
	}


	
	

}
