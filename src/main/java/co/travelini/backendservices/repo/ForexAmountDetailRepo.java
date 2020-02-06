package co.travelini.backendservices.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.ForexAmountDetail;

@Repository
public interface ForexAmountDetailRepo extends JpaRepository<ForexAmountDetail, Long> {

	Optional<ForexAmountDetail> findByForexAmountDetailId(long forexAmountDetailId);

}
