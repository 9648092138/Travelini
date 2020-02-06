package co.travelini.backendservices.controller;

import co.travelini.backendservices.dto.response.Activity;
import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.InterestListResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;
import co.travelini.backendservices.entity.BucketList;
import co.travelini.backendservices.entity.Category;
import co.travelini.backendservices.entity.FavouriteList;
import co.travelini.backendservices.entity.InterestList;
import co.travelini.backendservices.entity.UserActivityList;
import co.travelini.backendservices.service.InterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@RestController
public class InterestController {
    @Autowired
    private InterestService service;

    @PostMapping("/interest")
    public GenericResponse createInterestData(@RequestBody List<InterestList> interestlist) {
        GenericResponse<InterestList> res = new GenericResponse<>(ResponseCode.SUC_GENERIC);
        try {
            List<InterestList> interest = service.createInterestData(interestlist);

            res.setStatus(TraveliniResponseStatus.SUCCESS);
            res.setMessage("Interest created successfully");
            res.setData(interest);
            res.setCode(100001);
            res.setAppCode("Suc_Generic");
        } catch (Exception e) {
            res.setStatus(TraveliniResponseStatus.ERROR);
            res.setMessage("Data Posting failed");
            res.setCode(2000004);
            res.setAppCode("Error creatng interest");
            res.setData(" ");
        }
        return res;

    }

    @GetMapping("/interest")
    public  GenericResponse<InterestList> getInterest() {
    	List<InterestListResponse>  res = new ArrayList<>();
    	
    	List<InterestList> getInterestList = service.getAllListOfInterestList();
    	
    	InterestListResponse response ;
    	for(int i=0;i<getInterestList.size();i++) {
    		response = new InterestListResponse();
    		response.setInterestId(getInterestList.get(i).getId());
    		response.setInterestImage(getInterestList.get(i).getInterestImage());
    		response.setInterestTitle(getInterestList.get(i).getInterestName());
    		res.add(response);
    	}
        GenericResponse<InterestList> resp = new GenericResponse<>(ResponseCode.SUC_GENERIC);
//        try {
//            List<InterestList> getInterestList = service.getAllListOfInterestList();
//            res.setStatus(TraveliniResponseStatus.SUCCESS);
//            res.setMessage("Interest List get successful");
//            res.setData(getInterestList);
//            res.setCode(100001);
//            res.setAppCode("Suc_Generic");
//        } catch (Exception e) {
//            res.setMessage("Getting interest List failed");
//            res.setStatus(TraveliniResponseStatus.ERROR);
//            res.setCode(200004);
//            res.setAppCode("Error fetching interest list");
//            res.setData(" ");
//        }
        resp.setData(res);
      return resp;
    }

    @GetMapping("/interest/{id}")
    public GenericResponse<InterestList> getTheInterestById(@RequestParam int id) {
        GenericResponse<InterestList> res = new GenericResponse<>(ResponseCode.SUC_GENERIC);
        try {
            Optional<InterestList> getInterestListbyId = service.getTheInterestByid(id);
            res.setStatus(TraveliniResponseStatus.SUCCESS);
            res.setMessage("Interest get by id successful");
            res.setData(getInterestListbyId);
            res.setCode(100001);
            res.setAppCode("Suc_Generic");
        } catch (Exception e) {
            res.setMessage(" Getting interest by id failed");
            res.setStatus(TraveliniResponseStatus.ERROR);
            res.setAppCode("Error fetching interest by id");
            res.setCode(200004);
            res.setData(" ");
        }
        return res;
    }

    @PutMapping("/interest/{id}")
    public GenericResponse<InterestList> updateInterest(@RequestBody InterestList interestlist) {
        GenericResponse<InterestList> res = new GenericResponse<>(ResponseCode.SUC_GENERIC);

        try {
            InterestList updateinterest = service.updateInterest(interestlist);
            res.setStatus(TraveliniResponseStatus.SUCCESS);
            res.setMessage("Interest update successffully");
            res.setData(updateinterest);
            res.setCode(10001);
            res.setAppCode("Suc_Generic");

        } catch (Exception e) {
            res.setMessage("updating interest by id failed");
            res.setStatus(TraveliniResponseStatus.ERROR);
            res.setCode(2000004);
            res.setAppCode("Error fetching failed");
            res.setData(" ");
        }
        return res;
    }

    @GetMapping("/addCategory")
    public GenericResponse<InterestList> addCategory() {
        GenericResponse<InterestList> res = new GenericResponse<>(ResponseCode.SUC_GENERIC);
        try{
            List<Category> category = service.updateInterestAndCategory();
            res.setStatus(TraveliniResponseStatus.SUCCESS);
            res.setMessage("CategoryResponse List");
            res.setData(category);
            res.setCode(10001);
            res.setAppCode("Suc_Generic");
        }catch (Exception ex){
            System.out.println(ex);
            res.setMessage("updating interest by id failed");
            res.setStatus(TraveliniResponseStatus.ERROR);
            res.setCode(2000004);
            res.setAppCode("Error fetching failed");
            res.setData(" ");
        }
        return res;
    }
    @GetMapping("/addCategoryToInterest")
    public GenericResponse<InterestList> updateInterestWithCategory(@RequestParam long[] categorId, @RequestParam long interestId) {
        GenericResponse<InterestList> res = new GenericResponse<>(ResponseCode.SUC_GENERIC);
        try{
            System.out.println("CategoryResponse:"+categorId);
            List<Category> list = service.updateInterestWithCategoryId(categorId,interestId);
            res.setStatus(TraveliniResponseStatus.SUCCESS);
            res.setMessage("Interest List Updated");
            res.setData(list);
            res.setCode(10001);
            res.setAppCode("Suc_Generic");
        }catch (Exception ex){
            ex.printStackTrace();
            res.setMessage("updating interest by id failed");
            res.setStatus(TraveliniResponseStatus.ERROR);
            res.setCode(2000004);
            res.setAppCode("Error fetching failed");
            res.setData(" ");
        }
        return res;
    }

    @PostMapping("/addInterestToBucketList")
    public GenericResponse<?> addInterestInBucketList(@RequestBody Activity activity, @RequestParam long bucketId ){
    	GenericResponse<BucketList> res = new GenericResponse<>(ResponseCode.SUC_GENERIC);
        try{
            UserActivityList list = service.addInterestToBucketList(activity,bucketId);
            res.setStatus(TraveliniResponseStatus.SUCCESS);
            res.setMessage("Interest List Updated");
            res.setData(list);
            res.setCode(10001);
            res.setAppCode("Suc_Generic");
        }catch (Exception ex){
            ex.printStackTrace();
            res.setMessage("updating interest by id failed");
            res.setStatus(TraveliniResponseStatus.ERROR);
            res.setCode(2000004);
            res.setAppCode("Error fetching failed");
            res.setData(" ");
        }
        return res;
    }
    
    @Transactional
    @GetMapping("getBucketListById/{bucketListId}")
    public GenericResponse<UserActivityList> getBybucketListId(@RequestParam long bucketListId)
    {
    	GenericResponse<UserActivityList> res =  new GenericResponse<UserActivityList>(ResponseCode.SUC_GENERIC);
    	
    	try
    	{
    	List<UserActivityList> interestList = service.getBybucketListId(bucketListId);
    	
    	  res.setStatus(TraveliniResponseStatus.SUCCESS);
          res.setMessage("List retrieval by id successful");
          res.setData(interestList);								
          res.setCode(10001);
          res.setAppCode("Suc_Generic");
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    		   res.setMessage("retrieving interest by id failed");
               res.setStatus(TraveliniResponseStatus.ERROR);
               res.setCode(2000004);
               res.setAppCode("Error fetching failed");
               res.setData(" ");
    	}
    	return res;
    }
}
