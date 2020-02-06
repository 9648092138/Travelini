package co.travelini.backendservices.service;

import co.travelini.backendservices.dto.response.Activity;
import co.travelini.backendservices.dto.response.CategoryResponse;
import co.travelini.backendservices.dto.response.GroupSize;
import co.travelini.backendservices.dto.response.Language;
import co.travelini.backendservices.entity.Category;
import co.travelini.backendservices.repo.CategoryRepo;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MusementService
{

	@Autowired
	private CategoryRepo categoryRepo;
	
	
	
	public List<Activity> getAllActivities(Long interestId, Long limit) 
	{

		List<Category>  categoryList = categoryRepo.findByInterestId(interestId);
		String categoryIn="";
		for (Category cate: categoryList) 
		{
			categoryIn+=categoryIn.equals("")?""+cate.getCode():","+cate.getCode();
		}

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<String>(headers);

		String baseurl = "https://sandbox.musement.com/api/v3/activities";

		if (categoryList != null && categoryList.size()>0) 
		{
			baseurl += "?category_in=" +categoryIn;
		}
		//System.out.print("Base Url ::" + baseurl);

		JsonNode res = restTemplate
				.exchange(baseurl, HttpMethod.GET, entity, JsonNode.class)
				.getBody();

		JsonNode allData = res.get("data");
		//System.out.print(" Data Response :: " + allData);

		List<Activity> musementlist = new ArrayList<>();

		for (JsonNode data : allData) 
		{
			Activity activity = new Activity();

			activity.setTitle(data.get("title") != null ? data.get("title").asText() : "");
			activity.setCountry(data.get("country") !=null ? data.get("country").asText(): "");
			activity.setOperationaldays(data.get("operational_days") != null ? data.get("operational_days").asText() : "");
			
			activity.setDescription(data.get("description") != null ? data.get("description").asText() : "");
			activity.setAbout(data.get("about") != null ? data.get("about").asText() : "");
			activity.setMeetingpoint(data.get("meeting_point") != null ? data.get("meeting_point").asText() : "");
			activity.setDuration_range(data.get("duration_range") != null ? data.get("duration_range").asText() : "");
			activity.setValidity(data.get("validity") != null ? data.get("validity").asText() : "");
			
			activity.setAvailability(data.get("availability") !=null ? data.get("availability").asText() : "");
			
			activity.setDoThisBecause(data.get("doThisBecause") !=null ? data.get("doThisBecause").asText() : "");
			activity.setWhatsExcluded(data.get("whatsExcluded") !=null ? data.get("whatsExcluded").asText() : "");
			activity.setWhatsIncluded(data.get("whatsIncluded") !=null ? data.get("whatsIncluded").asText() : "");
			activity.setWhatToExpect(data.get("whatToExpect") !=null ? data.get("whatToExpect").asText() : "");
			activity.setWhatToRemember(data.get("whatToRemember") !=null ? data.get("whatToRemember").asText() : "");
			activity.setWhen(data.get("when") !=null ? data.get("when").asText() : "");
			activity.setWhere(data.get("where") !=null ? data.get("where").asText() : "");
			activity.setDuration(data.get("where") !=null ? data.get("where").asText() : "");
			activity.setReduced(data.get("where") !=null ? data.get("where").asText() : "");
			
			JsonNode allLanguages = res.get("languages");

			List<Language> languageslist = new ArrayList<>();
			if (allLanguages != null) {
				for (JsonNode languages : allLanguages) {
					Language language = new Language();
					//language.setName(allLanguages.get("name").asText());
					language.setName("English");
					language.setCode(allLanguages.get("code").asText());
					languageslist.add(language);
				}
			}

			activity.setLanguages(languageslist);

			JsonNode allGroups = res.get("groupsize");

			List<GroupSize> grpsize = new ArrayList<>();
			if (allGroups != null) {
				for (JsonNode groups : allGroups) {
					GroupSize groupsize = new GroupSize();
					groupsize.setName(allGroups.get("name").asText());
					groupsize.setCode(allLanguages.asText());
					grpsize.add(groupsize);
				}
			}

			activity.setGroupsize(grpsize);
			String image = data.get("cover_image_url").asText();
			activity.setCoverimgurl(image);
			
			activity.setServicefee(data.get("Servicefee") != null ? data.get("Servicefee").asText() : "");
			
			String currency = data.get("retail_price_without_service_fee").get("currency").asText();
			activity.setCurrency(currency);
			
			String price = data.get("retail_price_without_service_fee").get("value").asText();
			activity.setRetail_price_without_service_fee(price);
			
			System.out.println(price);
			
			//activity.setRetail_price_without_service_fee(data.get("retail_price_without_service_fee.currency").asText());
			activity.setDiscount(data.get("discount").asInt());

			JsonNode allCategories = res.get("categories");
			List<CategoryResponse> categories = new ArrayList<>();
			if (allCategories != null) {
				for (JsonNode categorylist : allCategories) {
					CategoryResponse category = new CategoryResponse();
					category.setCode(allCategories.get("code").asText());
					category.setCover_image_url(allCategories.get("cover_image_url").asText());
					category.setEvent_image_url(allCategories.get("event_image_url").asText());
					category.setId(allCategories.get("id").asText());
					category.setLevel(allCategories.get("level").asText());
					category.setName(allCategories.get("name").asText());
					category.setUrl(allCategories.get("url").asText());
					
					categories.add(category);
				}
			}
			activity.setCategories(categories);

			activity.setRetail(data.get("retail_price").asText());
			if (data.get("latitude") != null)
				activity.setLatitude(data.get("latitude").asDouble());
			if (data.get("longitude") != null)
				activity.setLongitude(data.get("longitude").asDouble());

			musementlist.add(activity);
		}
		return musementlist;
	}

//	public static void main(String args[]) {
//		MusementService service = new MusementService();
//
//		List<Activity> musementlist = service.getAllActivities(1L, 100L);
//		//System.out.print("Musement List ::" + musementlist);
//
//		for (Activity a : musementlist) {
//			System.out.println("Activity ::" + a.toString());
//		}
//	}
}