package co.travelini.backendservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.travelini.backendservices.entity.ActivityBucketList;
import co.travelini.backendservices.entity.BucketList;
import co.travelini.backendservices.entity.HotelList;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.repo.ActivityBucketListRepo;
import co.travelini.backendservices.repo.BucketRepo;
import co.travelini.backendservices.repo.HotelRepo;
import co.travelini.backendservices.repo.TraveliniAccountRepo;

@Service
public class BucketService 
{

	@Autowired
	BucketRepo bucketrepo;
	
	@Autowired
	HotelRepo hotelrepo;
	
	@Autowired
	TraveliniAccountRepo accountrepo;
	
	@Autowired
	ActivityBucketListRepo activityRepo;
	

	
	public List<BucketList> getAllBucketList() 
	{
		return bucketrepo.findAll();
		
	}

	public Optional<BucketList> getBucketListById(long bucket_list_id) 
	{
		Optional<BucketList> id =  bucketrepo.findById(bucket_list_id);
		return id;
	}

	public BucketList saveBucketList(BucketList bucketlist) 
	{
			return 	bucketrepo.save(bucketlist);
	
	}


	public BucketList deleteBucketList(long bucketlistsId) 
	{
		
		bucketrepo.deleteById(bucketlistsId);
		return null;
	}

	public String saveToBucketList(HotelList hotel) 
	{			
				
		Optional<BucketList> id =  bucketrepo.findById(hotel.getBucketListId());
			System.out.println(id);
			if(!id.equals(null))
			{
				System.out.println("Saving");
				 hotelrepo.save(hotel);
				 return "Hotel added to bucket";
			}
			else
			{
				System.out.println("Invalid");
				return "Invalid bucket List";  
				
			}
			}

	public List<HotelList> getListById(long bucketId) 
	{
	
		List<HotelList> list =   hotelrepo.findByBucketListId(bucketId);
		return list;
		
	
	}
	
	public List<BucketList> getListByUserId(long userId) 
	{
	
		//List<HotelList> list =   hotelrepo.findByBucketListId(bucketId);
		List<BucketList> list = bucketrepo.findBucketByUserId(userId);
		return list;
		
	}
	
	public ActivityBucketList addInterestToBucket(ActivityBucketList activity) 
	{
		Optional<BucketList> id =  bucketrepo.findById(activity.getBucketId());
		
		if(!id.equals(null))
		{
			System.out.println("Saving");
			return activityRepo.save(activity);
			 
		}
		else
		{
			System.out.println("Invalid");
			return null;  
			
		}
		
	}
	
	@Transactional 
	public List<ActivityBucketList> getInterestOfBucket(long id) 
	{
		System.out.println(id);
		List<ActivityBucketList> list = activityRepo.findByBucketId(id);
		System.out.println(list);
		return list;
		
	}

}