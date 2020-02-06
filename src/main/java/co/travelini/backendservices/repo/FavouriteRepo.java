package co.travelini.backendservices.repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.travelini.backendservices.entity.FavouriteList;

public interface FavouriteRepo extends JpaRepository<FavouriteList, Long> {

	List<FavouriteList> findByUserId(long userId);

	FavouriteList findById(UUID bucketId);

	@Query(value = "Select id from favourite_list order by id desc limit 1 ", nativeQuery = true)
	long findLastId();

	@Query(value = "Select f from FavouriteList f where id = :activityId")
	public FavouriteList findByActivityId(@Param("activityId") Long activityId);

}
