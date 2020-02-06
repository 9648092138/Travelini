package co.travelini.backendservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.TraveliniAccountSetting;

@Repository
public interface TraveliniAccountSettingRepo extends JpaRepository<TraveliniAccountSetting, Long> {

}
