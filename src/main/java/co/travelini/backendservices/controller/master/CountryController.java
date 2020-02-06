package co.travelini.backendservices.controller.master;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.success.CountryDTO;
import co.travelini.backendservices.entity.master.Country;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.service.master.CountryService;

@RequestMapping("/api")
@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping("/v1/countries")
	public GenericResponse<CountryDTO> getAllCountries() {

		List<Country> countryList = countryService.getAll();

		List<CountryDTO> countryDTOList = new ArrayList<>();

		countryList.stream().forEach((v) -> {
			countryDTOList.add(convertToDTO(v));
		});

		return new GenericResponse<CountryDTO>(ResponseCode.SUC_GENERIC, countryDTOList);

	}

	@GetMapping("/v1/countries/{countryId}")
	public GenericResponse<CountryDTO> getCountryById(
			@PathVariable("countryId") long countryId) throws TraveliniException {

		Optional<Country> countryOpt = countryService.getById(countryId);

		if (countryOpt.isPresent()) {
			Country country = countryOpt.get();
			return new GenericResponse<CountryDTO>(ResponseCode.SUC_GENERIC,
					Collections.singletonList(convertToDTO(country)));
		}
		
		throw new TraveliniException(ResponseCode.ERR_CURRENCY_NOT_FOUND);

	}

	private CountryDTO convertToDTO(Country country) {
		CountryDTO countryDTO = new CountryDTO();

		countryDTO.setId(country.getId());
		countryDTO.setCode(country.getCode());
		countryDTO.setName(country.getName());
		countryDTO.setIsdCode(country.getIsdCode());
		countryDTO.setDefaultCurrencyId(country.getDefaultCurrencyId());
		countryDTO.setEnabled(country.isEnabled());
		countryDTO.setCurrencyCode(country.getCurrencyCode());
		return countryDTO;
	}
}
