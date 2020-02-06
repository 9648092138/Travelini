package co.travelini.backendservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.entity.TraveliniAccountSetting;
import co.travelini.backendservices.repo.TraveliniAccountSettingRepo;

@Service
public class TraveliniAccountSettingService {

	@Autowired
	private TraveliniAccountSettingRepo traveliniAccountSettingRepo;

	public TraveliniAccountSetting saveAccountSettings(TraveliniAccountSetting theTraveliniAccountSetting) 
	{
		try
		{
		return traveliniAccountSettingRepo.save(theTraveliniAccountSetting);
		}
			catch(Exception e)
			{
				System.out.println(e);
				return traveliniAccountSettingRepo.save(theTraveliniAccountSetting);
			}
			
		
		}
}

