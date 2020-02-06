package co.travelini.backendservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.dto.request.FavouriteListRequest;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;
import co.travelini.backendservices.entity.FavouriteList;
import co.travelini.backendservices.repo.FavouriteRepo;
import co.travelini.backendservices.repo.TraveliniAccountRepo;

@Service
public class FavouriteService {
	@Autowired
	FavouriteRepo repo;
	
	@Autowired
	TraveliniAccountRepo userRepo;

	public FavouriteList saveFavouriteList(FavouriteListRequest favouritelist) {
		
		boolean UserStatus = false ;
		
		FavouriteList list = new  FavouriteList();
		/*
		 * Validating User Exists or not 
		 */
		
		try {
			UserStatus = userRepo.existsById(favouritelist.getUserId());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		if(UserStatus) {
			
				try {
					list.setBucketImage(favouritelist.getBucketImage());	
					list.setAvailability(favouritelist.getAvailability());
					list.setAddress(favouritelist.getAddress());
					list.setUserId(favouritelist.getUserId());
					list.setBucketTitle(favouritelist.getBucketTitle());
					list.setCountry(favouritelist.getCountry());
					list.setCoverImg(favouritelist.getCoverImg());
					list.setCurrency(favouritelist.getCurrency());
					list.setDescription(favouritelist.getDescription());
					list.setDiscount(favouritelist.getDiscount());
					list.setDoThisBecause(favouritelist.getDoThisBecause());
					list.setDuration(favouritelist.getDuration());
					list.setEndDate(favouritelist.getEndDate());
					list.setGroups(favouritelist.getGroups());
					list.setInterestId(favouritelist.getInterestId());
					list.setInterestTitle(favouritelist.getInterestTitle());
					list.setLanguage(favouritelist.getLanguage());
					list.setLatitude(favouritelist.getLatitude());
					list.setLongitude(favouritelist.getLongitude());
					list.setMeetingPoint(favouritelist.getMeetingPoint());
					list.setOperationalDays(favouritelist.getOperationalDays());
					list.setPrice(favouritelist.getPrice());
					list.setReduced(favouritelist.getReduced());
					list.setRetail(favouritelist.getRetail());
					list.setStartDate(favouritelist.getStartDate());
					list.setTitle(favouritelist.getTitle());
					list.setUserEmail(favouritelist.getUserEmail());
					list.setUserId(favouritelist.getUserId());
					list.setValidity(favouritelist.getValidity());
					list.setWhatsExcluded(favouritelist.getWhatsExcluded());
					list.setWhatsIncluded(favouritelist.getWhatsIncluded());
					list.setWhatToExpect(favouritelist.getWhatToExpect());
					list.setWhatToRemember(favouritelist.getWhatToRemember());
					list.setWhens(favouritelist.getWhens());
					list.setWheres(favouritelist.getWheres());
						repo.save(list);
					//list.setBucketId(list.getId());
						list.setBucketId(list.getId());
						repo.save(list);
						
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			
		}else {
			list = null;
		}
		return list;
	}

	public List<FavouriteList> getAllActivityList() {

		return repo.findAll();
	}

	@Transactional
	public List<FavouriteList> getActivityListByUserId(long userId) {
		List<FavouriteList> list = repo.findByUserId(userId);
		return list;
	}

	@Transactional
	public FavouriteList getActivityById(UUID bucketId) {
		//FavouriteList list = repo.findByUserId(userId);
	return repo.findById(bucketId);
	}

	public String deleteById(long id) throws Exception {
		try {
			repo.deleteById(id);

			return "deletion successful";

		} catch (Exception e) {
			return null;

		}

	}

//	public ArrayList<FavouriteList> getData(Long userId) {
//		// TODO Auto-generated method stub
//		ArrayList<FavouriteList> arraylist = repo.findByuser_id(userId);
//		return arraylist;
//	}

}
