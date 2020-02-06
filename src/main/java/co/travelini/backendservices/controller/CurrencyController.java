package co.travelini.backendservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.TraveliniResponseStatus;

import co.travelini.backendservices.entity.master.SupportedCurrency;
import co.travelini.backendservices.service.master.SupportedCurrencyService;




@RestController
public class CurrencyController 
{

	
@Autowired
private SupportedCurrencyService service;

@PostMapping("/addCurrency")
public GenericResponse<SupportedCurrency> addCurrency(@RequestBody SupportedCurrency supportedcurr)
{
	GenericResponse<SupportedCurrency> res =  new GenericResponse<SupportedCurrency>(ResponseCode.SUC_GENERIC);
	
	try
	{
		SupportedCurrency addCurrency = service.addCurrency(supportedcurr);

		res.setStatus(TraveliniResponseStatus.SUCCESS);
		res.setMessage("Data Posted Successfully");
		res.setData(addCurrency);
		res.setCode(10001);
		res.setAppCode("Suc_Generic");
		
	}
	catch(Exception e)
	{

		res.setStatus(TraveliniResponseStatus.ERROR);
		res.setMessage("Adding currency unSuccessful");
	}
	return res;
	
}
}
