package co.travelini.backendservices.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.UserActivityList;

@Repository
public interface UserActivityListRepo extends JpaRepository<UserActivityList, Long>
{

	public List<UserActivityList> findByBucketListId(Long bucketListId);

}
