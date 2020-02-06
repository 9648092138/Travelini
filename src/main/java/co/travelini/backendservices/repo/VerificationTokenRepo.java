package co.travelini.backendservices.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.VerificationToken;

public interface VerificationTokenRepo extends JpaRepository<VerificationToken, Long>
{

	Optional<VerificationToken> getByAccountIdAndToken(long accountId, String token);

	Optional<VerificationToken> getByAccountId(long accountId);

}
