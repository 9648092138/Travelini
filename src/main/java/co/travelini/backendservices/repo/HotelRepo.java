package co.travelini.backendservices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.travelini.backendservices.entity.HotelList;

@Repository
public interface HotelRepo extends JpaRepository<HotelList, Long> 
{

	
	List<HotelList> findByBucketListId(long bucketId);
	
	
}
