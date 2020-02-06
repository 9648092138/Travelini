package co.travelini.backendservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.BucketList;
import co.travelini.backendservices.entity.HotelList;

@Repository
public interface BucketRepo extends JpaRepository<BucketList,Long> 
{
	
	@Query ("select b from BucketList b  where b.traveliniAccount.accountId = ?1")
	List<BucketList> findBucketByUserId(long id);
}