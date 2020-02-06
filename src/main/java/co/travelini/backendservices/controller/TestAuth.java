package co.travelini.backendservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;

@RestController
@RequestMapping("/api/v1/testauth")
public class TestAuth {

	@GetMapping
	public GenericResponse<Void> testService() {
		return new GenericResponse<>(ResponseCode.SUC_GENERIC);
	}

}
