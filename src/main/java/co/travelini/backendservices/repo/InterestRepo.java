package co.travelini.backendservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.InterestList;

@Repository
public interface InterestRepo extends JpaRepository<InterestList,Long>
{
}
