package co.travelini.backendservices.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.Airport;

@Repository
public interface AirportRepo extends JpaRepository<Airport, String> {
	
	Optional<Airport> getByCode(String code);
}
