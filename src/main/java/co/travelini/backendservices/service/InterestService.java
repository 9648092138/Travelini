package co.travelini.backendservices.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import co.travelini.backendservices.dto.response.Activity;
import co.travelini.backendservices.entity.BucketList;
import co.travelini.backendservices.entity.Category;
import co.travelini.backendservices.repo.BucketRepo;
import co.travelini.backendservices.repo.CategoryRepo;
import com.fasterxml.jackson.databind.JsonNode;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.entity.InterestList;
import co.travelini.backendservices.entity.UserActivityList;
import co.travelini.backendservices.repo.InterestRepo;
import co.travelini.backendservices.repo.UserActivityListRepo;

import org.springframework.web.client.RestTemplate;

@Service
public class InterestService 
{

	@Autowired
	private InterestRepo repo;

	@Autowired
	private  CategoryRepo categoryRepo;
	
	@Autowired
	private  UserActivityListRepo activityRepo;
	
	
	
	// ===============op added code=================
	
//	public List<InterestList> createInterestData(List<InterestList> interestlist) {
//        
//		
//		return  repo.saveAll(interestlist);
//	}
//	
	
public List<InterestList> createInterestData(List<InterestList> interestlist) {
	RestTemplate restTemplate = new RestTemplate();

	HttpHeaders headers = new HttpHeaders();

	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

	HttpEntity<String> entity = new HttpEntity<String>(headers);

	JsonNode res = restTemplate
			.exchange("https://sandbox.musement.com/api/v3/categories?limit=100", HttpMethod.GET, entity, JsonNode.class)
			.getBody();
	System.out.println(res.asText());
	List<InterestList> intrest = new ArrayList<>();
	for(JsonNode data : res){
		InterestList c = new InterestList();
	//	data.get("title") != null ? data.get("title").asText() : "";
		//activity.setTitle(data.get("title") != null ? data.get("title").asText() : "");
		c.setInterestId(data.get("id").asLong());
		//c.setInterestId(data.get("").asLong());
		c.setInterestImage(data.get("event_image_url").asText());
	    c.setInterestName(data.get("name").asText());
		intrest.add(c);
	}
	repo.saveAll(interestlist);
	return interestlist;
		
		//return  repo.saveAll(interestlist);
	}
	
	
	
	
	public List<InterestList> getAllListOfInterestList()
	{
	
		return repo.findAll();
	}
	
	

	public InterestList updateInterest(InterestList interestlist) 
	{

		return repo.save(interestlist);
	}

	

	public Optional<InterestList> getTheInterestByid(long id)
	{
	
		return repo.findById(id);
	}
	public List<Category> updateInterestAndCategory(){

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<String>(headers);

		JsonNode res = restTemplate
				.exchange("https://sandbox.musement.com/api/v3/categories?limit=100", HttpMethod.GET, entity, JsonNode.class)
				.getBody();
		System.out.println(res.asText());
		List<Category> category = new ArrayList<>();
		for(JsonNode data : res){
			Category c = new Category();
			c.setCategoryId(data.get("id").asLong());
			c.setCategoryName(data.get("name").asText());
			c.setCode(data.get("code").asText());
			
			//===============op===================//
          // c.setCoverimgurl(data.get("cover_image_url").asText());
		   //	c.setEvent_image_url(data.get("event_image_url").asText());
			//c.(data.get("code").asText());
			category.add(c);
		}
		categoryRepo.saveAll(category);
		return category;
	}

	public List<Category> updateInterestWithCategoryId(long[] categoryId, long interestId){

		System.out.println("categoryId:"+categoryId);
		List<Category> category = new ArrayList<>();
		for(long c : categoryId){
			System.out.println("categoryId:"+c);
			Category cat = categoryRepo.findByCategoryId(c);
			System.out.println(cat.getInterestId());
			System.out.println(interestId);
			cat.setInterestId(interestId);
			category.add(categoryRepo.save(cat));
		}

		//	System.out.println(category.getCategoryName());
//			category.setCategoryId(interestId);
//			categoryRepo.save(category);

		return category;
	}
	
	public UserActivityList addInterestToBucketList(Activity activity, Long bucketId ){
		
		UserActivityList userActivity = new UserActivityList(activity.getOperationaldays(),activity.getTitle(),activity.getDescription(),activity.getAbout(),activity.getMeetingpoint(),
				activity.getDuration_range(),activity.getValidity(),activity.getCoverimgurl(),
				activity.getCurrency(),activity.getServicefee(),activity.getRetail_price_without_service_fee(),activity.getDiscount(),
				activity.getRetail(),activity.getLatitude(),activity.getLongitude(),bucketId);
		
		
		return activityRepo.save(userActivity);
	}
	public List<UserActivityList> getBybucketListId(long bucketListId) 
	{
		
		
		return activityRepo.findByBucketListId(bucketListId);
		 
	}
}
