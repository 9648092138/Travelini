package co.travelini.backendservices.repo.master;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.master.TravelStyle;

@Repository
public interface TravelStyleRepo extends JpaRepository<TravelStyle, Long> {

}
