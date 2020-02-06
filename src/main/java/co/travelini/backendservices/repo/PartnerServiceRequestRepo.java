package co.travelini.backendservices.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.PartnerServiceRequest;

@Repository
public interface PartnerServiceRequestRepo extends JpaRepository<PartnerServiceRequest, Long> {

	Optional<PartnerServiceRequest> findByPartnerServiceRequestId(long partnerServiceRequestId);
	
	//@Query("select * from  partner_service_request WHERE  transcode = ?1")
	 //@Async
	  //  @Query("SELECT t.transcode  FROM PartnerServiceRequest t where t.transcode  = :transcode ") 
	@Query(
	        value = "SELECT * FROM partner_service_request t where t.transCode = :transCode", 
	        nativeQuery=true
	    )
	Optional<PartnerServiceRequest> getbytCode(@Param("transCode") String transCode);

	

}
