package co.travelini.backendservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.Itinerary;

@Repository
public interface ItineraryRepo extends JpaRepository<Itinerary, Long> {

	Itinerary findItineraryByItineraryId(Long itineraryId);

	List<Itinerary> findAllByAccountIdAndIsBooked(Long accountId, Boolean isBooked);

	List<Itinerary> findAllByAccountId(Long accountId);

}