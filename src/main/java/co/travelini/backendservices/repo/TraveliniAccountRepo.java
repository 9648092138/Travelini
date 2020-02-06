package co.travelini.backendservices.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.dto.request.CheckemailexitRequest;
import co.travelini.backendservices.entity.TraveliniAccount;

@Repository
public interface TraveliniAccountRepo extends JpaRepository<TraveliniAccount, Long> {

	Optional<TraveliniAccount> getTraveliniAccountByEmail(String email);

	public TraveliniAccount findByAccountId(long accountId);

	TraveliniAccount getByEmailAndOtp(String email, String inputOtp);

	//@Query(value ="SELECT COUNT(u.id) FROM TraveliniAccount u WHERE u.email=:email")
	//TraveliniAccount findByEmail(@Param("email")String email);

	//Optional<TraveliniAccount> findByEmail(String email);
	
	TraveliniAccount findByEmail(String email);
	
	TraveliniAccount getNameByAccountId(long accountId);

	TraveliniAccount getOneByAccountId(long id);

	Optional<TraveliniAccount> getByAccountId(long accountId);
	//TraveliniAccount getByAccountId(long accountId);

	//boolean findByEmail(String email);

	
}
