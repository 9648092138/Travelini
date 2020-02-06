package co.travelini.backendservices.controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;
import co.travelini.backendservices.entity.ActivityBucketList;
import co.travelini.backendservices.entity.BucketList;
import co.travelini.backendservices.entity.HotelList;
import co.travelini.backendservices.service.BucketService;

@RestController
public class BucketController 
{

	@Autowired
	private BucketService service;
	
	@GetMapping("/bucketlists")
	public GenericResponse<BucketList> getAllTopics()
	{
		
		GenericResponse<BucketList> res =  new GenericResponse<BucketList>(ResponseCode.SUC_GENERIC);
		
		try 
		{
			List<BucketList> bucketlist = service.getAllBucketList();
			res.setStatus(TraveliniResponseStatus.SUCCESS);
			res.setMessage("Data successfully retrieved");
			res.setData(bucketlist);
			res.setCode(1000001);
			res.setAppCode("Suc_Generic");
		}
		catch(Exception e)
		{
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Data retrieval failed");
			
		}
		
		
		return res;
	}
	
	@GetMapping("/bucketlists/{bucketlistsId}")
	public GenericResponse<BucketList> getById(@PathVariable long bucketlistsId)
	{
		GenericResponse<BucketList> res = new GenericResponse<BucketList>(ResponseCode.SUC_GENERIC);
	try
	{	
		Optional<BucketList> getbyid =   service.getBucketListById(bucketlistsId);
		if(getbyid != null) 
		{
			
		res.setStatus(TraveliniResponseStatus.SUCCESS);
		res.setMessage("Successfully retrieved by id");
		res.setData(getbyid);
		res.setCode(100001);
		res.setAppCode("Suc_Generic");
		}
		else 
		{
			System.out.println("This is the inside else bro");
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Successfully retrieved by id");
			
		}
	}
	catch(Exception e)
	{
		System.out.println("This is the exception bro"+e);
		res.setStatus(TraveliniResponseStatus.ERROR);
		res.setMessage("Successfully retrieved by id");
	}
	return res;
	}
	
	
	@PostMapping("/bucketlists")
	public GenericResponse<BucketList> createBucketList(@RequestBody BucketList bucketlist)
	{
		GenericResponse<BucketList> res = new GenericResponse<BucketList>(ResponseCode.SUC_GENERIC);
		
		try
		{
			BucketList post = service.saveBucketList(bucketlist);
			System.out.println(post);
			if(post != null) {
				res.setStatus(TraveliniResponseStatus.SUCCESS);
				res.setMessage("Data Posted Successfully");
				res.setData(post);
				res.setCode(10001);
				res.setAppCode("Suc_Generic");
				System.out.println("The value of post inside if"+post);
				
			}
			else 
			{
				System.out.println("The value of post inside else"+post);
				res.setStatus(TraveliniResponseStatus.ERROR);
				res.setMessage("User not found");
				res.setCode(40001);
				res.setAppCode("Suc_Generic");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Inside exception");
			System.out.println(e);
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Data Posting unSuccessful");
		}
		return res;
	}
	@PutMapping("/bucketlists")
	public GenericResponse<BucketList> updateTopic(@RequestBody BucketList bucket)
	{
		GenericResponse<BucketList> res = new GenericResponse<BucketList>(ResponseCode.SUC_GENERIC);
		
		try
		{
			BucketList update = service.saveBucketList(bucket);
			
				res.setStatus(TraveliniResponseStatus.SUCCESS);
				res.setMessage("Successfully updated");
				res.setData(update);
				res.setCode(100001);
				res.setAppCode("Suc_Generic");
			}
			catch(Exception e)
			{
				res.setStatus(TraveliniResponseStatus.ERROR);
				res.setMessage("Updation Failed");
			}
		return res;
		}
	@DeleteMapping("/delete/{bucket_list_id}")
	public GenericResponse<BucketList> Delete(@PathVariable long bucketlistsId)
	{
		GenericResponse<BucketList> res = new GenericResponse<BucketList>(ResponseCode.SUC_GENERIC);

		try
		{
			BucketList delete = service.deleteBucketList(bucketlistsId);
			res.setStatus(TraveliniResponseStatus.SUCCESS);
			res.setMessage("Successfully Deleted");
			res.setData(delete);
			res.setCode(10001);
			res.setAppCode("Suc_Generic");
			
		}
		catch(Exception e)
		{
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Deletion Unsuccessfull");
		}
		return res;
	}
	
	@PostMapping("/hotelslist")
	public GenericResponse<HotelList> PostHotelslist(@RequestBody HotelList hotel)
	{
		GenericResponse<HotelList> res = new GenericResponse<HotelList>(ResponseCode.SUC_GENERIC);
		try
		{
			
			String post = service.saveToBucketList(hotel);
			if(post == "Hotel added to bucket")
			{
			res.setStatus(TraveliniResponseStatus.SUCCESS);
			res.setMessage("Data Posted Successfully");
			res.setData(post);
			res.setCode(10001);
			res.setAppCode("Suc_Generic");
			}
			else if(post == "Invalid bucket List")
			{
		
				res.setStatus(TraveliniResponseStatus.ERROR);
				res.setMessage("Data Posting unSuccessful");
			
			}
			}
		
		catch(Exception e)
		{
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Data Posting unSuccessful");
		}
		return res;
	}
	
	
	
	@GetMapping("/getHotelList/{bucketId}")
	public GenericResponse<HotelList> getBucketById(@RequestParam("bucketId") long bucketId)
	{
		GenericResponse<HotelList> res = new GenericResponse<HotelList>(ResponseCode.SUC_GENERIC);
	try
	{	
		List<HotelList> getbyid =   service.getListById(bucketId);
		
		res.setStatus(TraveliniResponseStatus.SUCCESS);
		res.setMessage("Successfully retrieved by id");
		res.setData(getbyid);
		res.setCode(100001);
		res.setAppCode("Suc_Generic");
		}
		
	
	catch(Exception e)
	{
		res.setStatus(TraveliniResponseStatus.ERROR);
		res.setMessage("Successfully retrieved by id");
	}
	return res;
	}
	
	@GetMapping("/getBucketByUserId")
	public GenericResponse<HotelList> getBucketByUserId(@RequestParam("id") long id)
	{
		GenericResponse<HotelList> res = new GenericResponse<HotelList>(ResponseCode.SUC_GENERIC);
	try
	{	
		List<BucketList> getbyid =   service.getListByUserId(id);
		
		res.setStatus(TraveliniResponseStatus.SUCCESS);
		res.setMessage("Successfully retrieved by id");
		res.setData(getbyid);
		res.setCode(100001);
		res.setAppCode("Suc_Generic");
		}
		
	
	catch(Exception e)
	{
		res.setStatus(TraveliniResponseStatus.ERROR);
		res.setMessage("Successfully retrieved by id");
	}
	return res;
	}
	
	@PostMapping("/addInterestToBucket")
	public GenericResponse<HotelList> addInterestToBucket(@RequestBody ActivityBucketList activity)
	{
		GenericResponse<HotelList> res = new GenericResponse<HotelList>(ResponseCode.SUC_GENERIC);
	try
	{	
		ActivityBucketList getbyid =   service.addInterestToBucket(activity);
		
		if(getbyid != null) {
			res.setStatus(TraveliniResponseStatus.SUCCESS);
			res.setMessage("Successfully retrieved by id");
			res.setData(getbyid);
			res.setCode(100001);
			res.setAppCode("Suc_Generic");
		}else {
			res.setStatus(TraveliniResponseStatus.SUCCESS);
			res.setMessage("Bucket Id does not exist");
			res.setCode(400001);
			res.setAppCode("Suc_Generic");
		}
		
		}
		
	
	catch(Exception e)
	{
		res.setStatus(TraveliniResponseStatus.ERROR);
		res.setMessage("Successfully retrieved by id");
	}
	return res;
	}
	
	@GetMapping("/getInterestOfBucket")
	public GenericResponse<HotelList> getInterestOfBucket(@RequestParam long id)
	{
		GenericResponse<HotelList> res = new GenericResponse<HotelList>(ResponseCode.SUC_GENERIC);
	try
	{	
		List<ActivityBucketList> getbyid =   service.getInterestOfBucket(id);
		
		if(getbyid.size() > 0) 
		{
			res.setStatus(TraveliniResponseStatus.SUCCESS);
			res.setMessage("Successfully retrieved by id");
			res.setData(getbyid);
			res.setCode(100001);
			res.setAppCode("Suc_Generic");
		}else {
			res.setStatus(TraveliniResponseStatus.SUCCESS);
			res.setMessage("Bucket Id does not exist");
			res.setCode(400001);
			res.setAppCode("Suc_Generic");
		}
		
		}
		
	
	catch(Exception e)
	{
		System.out.println(e);
		res.setStatus(TraveliniResponseStatus.ERROR);
		res.setMessage("Data Retrieval unsuccessful");
	}
	return res;
	}
	
	}
