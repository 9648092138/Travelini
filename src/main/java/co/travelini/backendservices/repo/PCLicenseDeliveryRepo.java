package co.travelini.backendservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.PCLicenseDelivery;

@Repository
public interface PCLicenseDeliveryRepo extends JpaRepository<PCLicenseDelivery, Long> {

}