package co.travelini.backendservices.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.LinkedSocialAccount;

@Repository
public interface LinkedSocialAccountRepo extends JpaRepository<LinkedSocialAccount, String> {

	Optional<LinkedSocialAccount> getLinkedAccountBySocialUserId(String socialUserId);

}
