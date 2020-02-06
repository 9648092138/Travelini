package co.travelini.backendservices.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.OriginDestinationDetail;

@Repository
public interface OriginDestinationDetailRepo extends JpaRepository<OriginDestinationDetail, Long> {

	Optional<OriginDestinationDetail> findByOriginDestinationDetailsId(long originDestinationDetailsId);

}
