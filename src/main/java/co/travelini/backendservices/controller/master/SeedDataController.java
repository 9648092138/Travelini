package co.travelini.backendservices.controller.master;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.success.TravelStyleDTO;
import co.travelini.backendservices.dto.response.success.TravelTypeDTO;
import co.travelini.backendservices.entity.master.TravelStyle;
import co.travelini.backendservices.entity.master.TravelType;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.service.master.TravelStyleService;
import co.travelini.backendservices.service.master.TravelTypeService;

@RequestMapping("/api")
@RestController
public class SeedDataController {

	@Autowired
	private TravelTypeService travelTypeService;

	@Autowired
	private TravelStyleService travelStyleService;

	@GetMapping("/v1/seeds")
	public GenericResponse<Map<String, List<?>>> getAllSeedData() {

		List<Map<String, List<?>>> seeds = constructSeedData();

		return new GenericResponse<Map<String, List<?>>>(ResponseCode.SUC_GENERIC, seeds);
	}

	@GetMapping("/v1/seeds/{seedDataCode}")
	public GenericResponse<Map<String, List<?>>> getSeedDataBasedOnCode(
			@PathVariable("seedDataCode") String seedDataCode) throws TraveliniException {

		List<Map<String, List<?>>> seeds = new ArrayList<>();

		switch (seedDataCode) {
		case "travelStyles": {
			List<TravelStyle> travelStyleList = this.travelStyleService.getAll();

			List<TravelStyleDTO> travelStyleDTOList = new ArrayList<>();

			travelStyleList.stream().forEach((v) -> {
				travelStyleDTOList.add(convertToDTO(v));
			});
			seeds.add(Collections.singletonMap("travelStyles", travelStyleDTOList));
			break;
		}
		case "travelTypes": {
			List<TravelType> travelTypeList = this.travelTypeService.getAll();

			List<TravelTypeDTO> travelTypeDTOList = new ArrayList<>();

			travelTypeList.stream().forEach((v) -> {
				travelTypeDTOList.add(convertToDTO(v));
			});
			seeds.add(Collections.singletonMap("travelTypes", travelTypeDTOList));
			break;
		}
		default: {
			throw new TraveliniException(ResponseCode.ERR_SEED_DATA_CODE_NOT_FOUND);
		}
		}

		return new GenericResponse<Map<String, List<?>>>(ResponseCode.SUC_GENERIC, seeds);

	}

	private List<Map<String, List<?>>> constructSeedData() {
		List<Map<String, List<?>>> seeds = new ArrayList<>();

		List<TravelStyle> travelStyleList = this.travelStyleService.getAll();

		List<TravelStyleDTO> travelStyleDTOList = new ArrayList<>();

		travelStyleList.stream().forEach((v) -> {
			travelStyleDTOList.add(convertToDTO(v));
		});

		List<TravelType> travelTypeList = this.travelTypeService.getAll();

		List<TravelTypeDTO> travelTypeDTOList = new ArrayList<>();

		travelTypeList.stream().forEach((v) -> {
			travelTypeDTOList.add(convertToDTO(v));
		});

		seeds.add(Collections.singletonMap("travelStyles", travelStyleDTOList));

		seeds.add(Collections.singletonMap("travelTypes", travelTypeDTOList));

		return seeds;
	}

	private TravelStyleDTO convertToDTO(TravelStyle travelStyle) {
		TravelStyleDTO travelStyleDto = new TravelStyleDTO();

		travelStyleDto.setId(travelStyle.getId());
		travelStyleDto.setCode(travelStyle.getCode());
		travelStyleDto.setDisplay(travelStyle.getDisplay());
		travelStyleDto.setEnabled(travelStyle.isEnabled());

		return travelStyleDto;
	}

	private TravelTypeDTO convertToDTO(TravelType travelType) {
		TravelTypeDTO travelTypeDTO = new TravelTypeDTO();

		travelTypeDTO.setId(travelType.getId());
		travelTypeDTO.setCode(travelType.getCode());
		travelTypeDTO.setDisplay(travelType.getDisplay());
		travelTypeDTO.setEnabled(travelType.isEnabled());

		return travelTypeDTO;
	}

}
