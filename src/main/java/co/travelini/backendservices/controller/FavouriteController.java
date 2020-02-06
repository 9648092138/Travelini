package co.travelini.backendservices.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.request.FavouriteListRequest;
import co.travelini.backendservices.dto.response.FavouriteListresponse;
import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.InterestListResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.ResponsebyuserId;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;
import co.travelini.backendservices.entity.FavouriteList;
import co.travelini.backendservices.repo.TraveliniAccountRepo;
import co.travelini.backendservices.service.FavouriteService;
import co.travelini.backendservices.service.PartnerServiceMailSender;

@RestController
public class FavouriteController {

	@Autowired
	private FavouriteService service;

	@Autowired
	PartnerServiceMailSender  sendactivitydetails;
	

	@Autowired
	TraveliniAccountRepo userRepo;
	
	@PostMapping("/PostActivities")
	public GenericResponse<FavouriteList> createActivity(@RequestBody FavouriteListRequest favouritelist) {

		GenericResponse<FavouriteList> res = new GenericResponse<FavouriteList>(ResponseCode.SUC_GENERIC);
		FavouriteListresponse response = new FavouriteListresponse();
		FavouriteList post = service.saveFavouriteList(favouritelist);
		try {

			//FavouriteList post = service.saveFavouriteList(favouritelist);

			if (post != null) {
				
				response.setUserId(post.getUserId());
				//response.setBucketId(post.getId());
				response.setBucketId(post.getId());
				response.setBucketTitle(post.getBucketTitle());
				response.setBucketImage(post.getBucketImage());
				response.setInterestId(post.getInterestId());
				response.setCoverImage(post.getCoverImg());
				response.setInterestTitle(post.getInterestTitle());
				response.setAvailability(post.getAvailability());
				response.setCountry(post.getCountry());
				response.setCurrency(post.getCurrency());
				response.setDuration(post.getDuration());
				response.setPrice(post.getPrice());
				response.setValidity(post.getValidity());
				response.setTitle(post.getTitle());
				res.setData(response);
			//	boolean useremail=false;
				//useremail = userRepo.existsById(post.getUserId());
				//======= for send email notification===============================//	
			} else {
				System.out.println("The value of post inside else" + post);
				res.setStatus(TraveliniResponseStatus.ERROR);
				res.setMessage("User not found");
				res.setCode(40001);
				res.setAppCode("Suc_Generic");
			}
			
		} catch (Exception e) {
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Data Posting unSuccessful");
			e.printStackTrace();

		}

		try {
			String s = post.getBucketTitle();
			String s1= "Sightseeing";
			String s2 ="Activities";
			System.out.println("enter bucket title is  :"+s);
			if(s.equalsIgnoreCase(s1)|| s.equalsIgnoreCase(s2)) {
				System.out.println("send for ---->"+post.getBucketTitle()+" in current email  "+post.getUserEmail());
				String email = post.getUserEmail();
				sendactivitydetails.sendActivity(email,post);
				
			}else {
				System.out.println("Bucket title is not equal to Sightseeing OR Activities /n  not send any notification to user and admin");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res.setMessage("email not  send Successful");
			e.printStackTrace();
		}
         
		return res;
	}


	@GetMapping("/GetActivities/{bucketId}")
	public GenericResponse<FavouriteList> getActivityById(@PathVariable UUID bucketId) {
		GenericResponse<FavouriteList> res = new GenericResponse<FavouriteList>(ResponseCode.SUC_GENERIC);
		ResponsebyuserId response = new ResponsebyuserId();

		try {
			FavouriteList getbyid = service.getActivityById(bucketId);
			if (getbyid != null) {
				
				response.setUserId(getbyid.getUserId());
				//response.setBucketId(getbyid.getId());
				//response.setB
				response.setBucketId(getbyid.getId());
				response.setBucketTitle(getbyid.getBucketTitle());
				response.setBucketImage(getbyid.getBucketImage());
				response.setInterestId(getbyid.getInterestId());
				response.setCoverImage(getbyid.getCoverImg());
				response.setInterestTitle(getbyid.getInterestTitle());
				response.setAvailability(getbyid.getAvailability());
				response.setCountry(getbyid.getCountry());
				response.setCurrency(getbyid.getCurrency());
				response.setDuration(getbyid.getDuration());
				response.setPrice(getbyid.getPrice());
				response.setValidity(getbyid.getValidity());
				response.setTitle(getbyid.getTitle());
				response.setCountry(getbyid.getCountry());
				response.setDoThisBecause(getbyid.getDoThisBecause());
				response.setWhatToExpect(getbyid.getWhatToExpect());
				response.setWhatsIncluded(getbyid.getWhatsExcluded());
				response.setWhatsExcluded(getbyid.getWhatsExcluded());
				response.setReduced(getbyid.getReduced());
				response.setWhere(getbyid.getWheres());

				response.setWhatToRemember(getbyid.getWhatToRemember());
				response.setWhen(getbyid.getWhens());
				response.setLanguage(getbyid.getLanguage());
				response.setGroups(getbyid.getGroups());
				response.setTitle(getbyid.getTitle());
				response.setAddress(getbyid.getAddress());
				response.setMeetingPoint(getbyid.getMeetingPoint());
				response.setLocation(getbyid.getAddress());
				response.setLatitute(getbyid.getLatitude());
				response.setLongitute(getbyid.getLongitude());

				response.setStartDate(getbyid.getStartDate());
				response.setEndDate(getbyid.getEndDate());
				res.setData(response);
			} else {
				res.setStatus(TraveliniResponseStatus.ERROR);
				res.setMessage("No data found this bucket id");

			}
		} catch (Exception e) {
			System.out.println(e);
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("unable to retrieved by id");
		}
	
		
		return res;
	}

	@GetMapping("/favouriteList/{userId}")
	public GenericResponse<FavouriteList> getActivityByUserId(@PathVariable long userId) {
		List<ResponsebyuserId> res = new ArrayList<>();

		List<FavouriteList> getbyid = service.getActivityListByUserId(userId);
		ResponsebyuserId response;
		for (int i = 0; i < getbyid.size(); i++) {
			response = new ResponsebyuserId();

			response.setUserId(getbyid.get(i).getUserId());
			response.setBucketId(getbyid.get(i).getId());
			response.setBucketTitle(getbyid.get(i).getBucketTitle());
			response.setBucketImage(getbyid.get(i).getBucketImage());
			response.setInterestId(getbyid.get(i).getInterestId());
			response.setCoverImage(getbyid.get(i).getCoverImg());
			response.setInterestTitle(getbyid.get(i).getInterestTitle());
			response.setAvailability(getbyid.get(i).getAvailability());
			response.setCountry(getbyid.get(i).getCountry());
			response.setCurrency(getbyid.get(i).getCurrency());
			response.setDuration(getbyid.get(i).getDuration());
			response.setPrice(getbyid.get(i).getPrice());
			response.setValidity(getbyid.get(i).getValidity());
			response.setTitle(getbyid.get(i).getTitle());
			response.setCountry(getbyid.get(i).getCountry());
			response.setDoThisBecause(getbyid.get(i).getDoThisBecause());
			response.setWhatToExpect(getbyid.get(i).getWhatToExpect());
			response.setWhatsIncluded(getbyid.get(i).getWhatsExcluded());
			response.setWhatsExcluded(getbyid.get(i).getWhatsExcluded());
			response.setReduced(getbyid.get(i).getReduced());
			response.setWhere(getbyid.get(i).getWheres());
			response.setWhatToRemember(getbyid.get(i).getWhatToRemember());
			response.setWhen(getbyid.get(i).getWhens());
			response.setLanguage(getbyid.get(i).getLanguage());
			response.setGroups(getbyid.get(i).getGroups());
			response.setTitle(getbyid.get(i).getTitle());
			response.setAddress(getbyid.get(i).getAddress());
			response.setMeetingPoint(getbyid.get(i).getMeetingPoint());
			response.setLocation(getbyid.get(i).getAddress());
			response.setLatitute(getbyid.get(i).getLatitude());
			response.setLongitute(getbyid.get(i).getLongitude());
            response.setStartDate(getbyid.get(i).getStartDate());
			response.setEndDate(getbyid.get(i).getEndDate());
			response.setIsFavorite("true");
			res.add(response);
		}
		GenericResponse<FavouriteList> resp =  new GenericResponse<FavouriteList>(ResponseCode.SUC_GENERIC);
		resp.setData(res);
		return resp;
	}

	@DeleteMapping("/DeleteActivity/{bucketId}")
	public GenericResponse<FavouriteList> deleteActivity(@PathVariable long bucketId) throws Exception {
		GenericResponse<FavouriteList> res = new GenericResponse<FavouriteList>(ResponseCode.SUC_GENERIC);
		String delete = service.deleteById(bucketId);
		try {
			if (delete == "deletion successful") {
				System.out.println("deleted successfully");

				res.setStatus(TraveliniResponseStatus.SUCCESS);
				res.setMessage("Successfully deleted by  id");
				res.setCode(100001);
				res.setAppCode("Suc_Generic");

			} else {
				res.setStatus(TraveliniResponseStatus.ERROR);
				res.setMessage("no value with this id exist");
				res.setAppCode("Unsuc_Generic");
			}

		} catch (Exception e) {

			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setCode(100001);
			res.setAppCode("Unsuccessful");
			res.setMessage("no value with this id exist");
		}
		return res;

	}
}
