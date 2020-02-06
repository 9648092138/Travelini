package co.travelini.backendservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.travelini.backendservices.entity.PSOriginDestination;

/**
 * 
 * @author Prabhu
 *
 */
public interface PSOriginDestinationRepo extends JpaRepository<PSOriginDestination, Long> {

}