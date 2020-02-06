package co.travelini.backendservices.repo.master;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.master.TravelType;

@Repository
public interface TravelTypeRepo extends JpaRepository<TravelType, Long> {

}
