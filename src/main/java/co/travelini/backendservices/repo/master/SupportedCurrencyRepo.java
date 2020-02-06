package co.travelini.backendservices.repo.master;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.master.Country;
import co.travelini.backendservices.entity.master.SupportedCurrency;

@Repository
public interface SupportedCurrencyRepo extends JpaRepository<SupportedCurrency, Long> {

	Optional<SupportedCurrency> findByCode(String currencyCode);

	
	@Query(value = "SELECT * FROM staging.supported_currencies ORDER BY name;",nativeQuery = true)
	List<SupportedCurrency> findAllByName();
	
	
	

}
