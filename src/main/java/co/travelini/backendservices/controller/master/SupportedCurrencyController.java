package co.travelini.backendservices.controller.master;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.success.SupportedCurrencyDTO;
import co.travelini.backendservices.entity.master.SupportedCurrency;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.service.master.SupportedCurrencyService;

@RequestMapping("/api")
@RestController
public class SupportedCurrencyController {

	@Autowired
	private SupportedCurrencyService supportedCurrencyService;

	@GetMapping("/v1/currencies")
	public GenericResponse<SupportedCurrencyDTO> getAllSupportedCurrencies() {

		List<SupportedCurrency> supportedCurrencyList = this.supportedCurrencyService.getAll();

		List<SupportedCurrencyDTO> supportedCurrencyDTOList = new ArrayList<>();

		supportedCurrencyList.stream().forEach((v) -> {
			supportedCurrencyDTOList.add(convertToDTO(v));
		});

		return new GenericResponse<SupportedCurrencyDTO>(ResponseCode.SUC_GENERIC, supportedCurrencyDTOList);

	}

	@GetMapping("/v1/currencies/{currencyId}")
	public GenericResponse<SupportedCurrencyDTO> getAllSupportedCurrenciesById(
			@PathVariable("currencyId") long currencyId) throws TraveliniException {

		Optional<SupportedCurrency> supportedCurrencyOpt = this.supportedCurrencyService.getById(currencyId);

		if (supportedCurrencyOpt.isPresent()) {
			SupportedCurrency supportedCurrency = supportedCurrencyOpt.get();
			return new GenericResponse<SupportedCurrencyDTO>(ResponseCode.SUC_GENERIC,
					Collections.singletonList(convertToDTO(supportedCurrency)));
		}

		throw new TraveliniException(ResponseCode.ERR_COUNTRY_NOT_FOUND);

	}

	private SupportedCurrencyDTO convertToDTO(SupportedCurrency supportedCurrency) {
		SupportedCurrencyDTO supportedCurrencyDTO = new SupportedCurrencyDTO();

		supportedCurrencyDTO.setId(supportedCurrency.getCurrencyId());
		supportedCurrencyDTO.setCode(supportedCurrency.getCode());
		supportedCurrencyDTO.setName(supportedCurrency.getName());
		supportedCurrencyDTO.setEnabled(supportedCurrency.isEnabled());

		return supportedCurrencyDTO;
	}
}
