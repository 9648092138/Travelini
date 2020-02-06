package co.travelini.backendservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.Activity;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;
import co.travelini.backendservices.service.MusementService;

@RestController
public class MusementController 
{
	@Autowired
	private MusementService musementservice;
	
	@GetMapping("/activities")
	public GenericResponse<Activity> getActivity(@RequestParam("interestId") Long interestId, Long limit)
	{
		GenericResponse<Activity> res = new GenericResponse<Activity>(ResponseCode.SUC_GENERIC);
		try
		{
		List<Activity> musementmessage = musementservice.getAllActivities(interestId,100L);
		res.setStatus(TraveliniResponseStatus.SUCCESS);
		res.setMessage("Data Successfully retrieved");
		res.setData(musementmessage);
		res.setCode(100001);
		res.setAppCode("Suc_Generic");
		}
		catch(Exception e)
		{
			res.setStatus(TraveliniResponseStatus.ERROR);
			res.setMessage("Data retrieval failed");
		}
		return res;
	}
	
}