package co.travelini.backendservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.PSForexAmount;

@Repository
public interface PSForexAmountRepo extends JpaRepository<PSForexAmount, Long> {

}