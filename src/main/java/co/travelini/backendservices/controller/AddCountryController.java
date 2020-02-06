package co.travelini.backendservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;

import co.travelini.backendservices.entity.master.Country;
import co.travelini.backendservices.service.master.CountryService;

@RestController
public class AddCountryController 
{
	@Autowired
	private CountryService countryService;
	
	
@PostMapping("/AddCountry")
public GenericResponse<Country> addCountry(@RequestBody Country addCountry)
{
	GenericResponse<Country> res =  new GenericResponse<Country>(ResponseCode.SUC_GENERIC);
Country country = countryService.addCountry(addCountry);
	try
{
		res.setStatus(TraveliniResponseStatus.SUCCESS);
		res.setMessage("Data Posted Successfully");
		res.setData(country);
		res.setCode(10001);
		res.setAppCode("Suc_Generic");
	
}
catch(Exception e)
{
	res.setStatus(TraveliniResponseStatus.ERROR);
	res.setMessage("Data Posting unSuccessful");
}
	return res;
}
}
