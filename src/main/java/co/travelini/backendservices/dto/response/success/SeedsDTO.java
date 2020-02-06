package co.travelini.backendservices.dto.response.success;

import java.util.Map;


public class SeedsDTO {
	
	Map<String, Object[]> seedData;

	public Map<String, Object[]> getSeedData() {
		return seedData;
	}

	public void setSeedData(Map<String, Object[]> seedData) {
		this.seedData = seedData;
	}

	
}
