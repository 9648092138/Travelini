package co.travelini.backendservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.entity.Airport;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.AirportRepo;

@Service
public class AirportService {

	@Autowired
	private AirportRepo airportRepo;

	public Airport getAirportByCode(String code) throws TraveliniException {
		Optional<Airport> airport = airportRepo.getByCode(code);

		if (airport.isPresent())
			return airport.get();

		throw new TraveliniException(ResponseCode.ERR_AIRPORT_CODE_NOT_FOUND);
	}

}
