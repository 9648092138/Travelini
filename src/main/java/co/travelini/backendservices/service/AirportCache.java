package co.travelini.backendservices.service;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.cache.CacheLoader;

import co.travelini.backendservices.entity.Airport;
import co.travelini.backendservices.util.GauvaCache;

@Service
public class AirportCache {

	@Autowired
	private AirportService airportService;

	private GauvaCache<String, Airport> cache;

	private GauvaCache<String, Airport> getAirportCache() {
		if (cache == null) {
			cache = new GauvaCache<String, Airport>(new CacheLoader<String, Airport>() {

				@Override
				public Airport load(String code) throws Exception {
					return airportService.getAirportByCode(code);
				}
			});
		}
		return cache;
	}

	public Airport get(String key) throws ExecutionException {
		return getAirportCache().get(key);
	}

}
