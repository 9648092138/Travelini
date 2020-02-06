package co.travelini.backendservices.repo.master;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.master.Country;

/**
 * 
 * @author Prabhu
 *
 */
@Repository
public interface CountryRepo extends JpaRepository<Country, Long> {

	Optional<Country> findByCode(String countryCode);

	Country findCountryById(Long countryId);

	@Query(value = "SELECT * FROM staging.Country ORDER BY name",nativeQuery = true)
	List<Country> findAllByName();
}
