package co.travelini.backendservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.travelini.backendservices.entity.ActivityBucketList;

public interface ActivityBucketListRepo extends JpaRepository<ActivityBucketList, Long>
{

//	@Query("Select b from ActivityBucketList b where b.bucketId= ?1")
//	List<ActivityBucketList> findByBucketId(long id);
	List<ActivityBucketList> findByBucketId(Long id);

}
