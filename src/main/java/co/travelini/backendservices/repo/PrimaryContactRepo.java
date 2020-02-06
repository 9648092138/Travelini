package co.travelini.backendservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import co.travelini.backendservices.entity.PrimaryContact;

@Repository
public interface PrimaryContactRepo extends JpaRepository<PrimaryContact, Long> {

	public PrimaryContact findByPrimaryContactId(long primaryContactId);

	
}