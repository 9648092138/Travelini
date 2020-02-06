package co.travelini.backendservices.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.request.BucketRequestDTO;
import co.travelini.backendservices.dto.request.HotelDetailRequest;
import co.travelini.backendservices.dto.request.HotelSearchRequest;
import co.travelini.backendservices.dto.response.HotelDetailResponse;
import co.travelini.backendservices.dto.response.HotelSearchResponse;
import co.travelini.backendservices.service.UAPIHotelService;

@RestController
public class HotelController {

	@Autowired
	UAPIHotelService hotelSerice;
	
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(HotelController.class);

	  @RequestMapping(value = "/SearchHotel", method = RequestMethod.POST, produces = "application/json")
	  public HotelSearchResponse SearchHotel(@RequestBody HotelSearchRequest request) {

	    LOG.debug("Call UAPIHotelService with incoming request");
	    LOG.debug("Enter Hotel controller, map to /HotelSearch");
	    
	    HotelSearchResponse res=new HotelSearchResponse();
		try {
			res = hotelSerice.serachHotel(request);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return res;
	  }
	  
	  @RequestMapping(value = "/hoteldetail", method = RequestMethod.POST, produces = "application/json")
	  public HotelDetailResponse hotelDetail(@RequestBody HotelDetailRequest request) {

	    LOG.debug("Call UAPIHotelService with incoming request");
	    LOG.debug("Enter Hotel controller, map to /HotelSearch");
	    
	    HotelDetailResponse res=new HotelDetailResponse();
		try {
			res = hotelSerice.getHotelDetail(request);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return res;
	  }
	  
	  @RequestMapping(value = "/addhoteltobucket", method = RequestMethod.POST, produces = "application/json")
	  public ResponseEntity<?> bookHotel(@RequestBody BucketRequestDTO request) {

	    LOG.debug("Call add to bucket");
	    LOG.debug("Enter Hotel controller, map to /addhoteltobucket");
	    
	    
	    
	    Map<String,String> res=new HashMap<>();
	    
	   res.put("message", "bucket added successfully");
	    
	    return ResponseEntity.ok(res);
	  }
	  

}
