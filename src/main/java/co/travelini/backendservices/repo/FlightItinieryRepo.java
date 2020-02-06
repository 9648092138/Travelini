package co.travelini.backendservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.travelini.backendservices.entity.FavouriteList;
import co.travelini.backendservices.entity.ItineraryFlights;

public interface FlightItinieryRepo extends JpaRepository<ItineraryFlights, Long> 
{
	//public List<ItineraryFlights> findByIternaryId(long iternaryId);
	List<ItineraryFlights> findByUserId(long userId);
}
