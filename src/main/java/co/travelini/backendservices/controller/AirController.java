package co.travelini.backendservices.controller;

import co.travelini.backendservices.entity.FlightSearchRequest;
import co.travelini.backendservices.dto.request.AirSearchRequest;
import  co.travelini.backendservices.entity.AirResponse;
import co.travelini.backendservices.service.AirService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The Class AirController.
 */
@RestController
@Api(value = "LowFareSearch Microservice")
public class AirController {

  /** The uapi air service. */
  @Autowired
  private AirService uapiAirService;

  /**
   * Instantiates a new air controller.
   *
   * @param uapiAirService the uapi air service
   */
  @Autowired
  AirController(AirService uapiAirService) {
    this.uapiAirService = uapiAirService;
  }

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirController.class);

  /**
   * Air search.
   *
   * @param request the request
   * @param sccType the scc type
   * @param sccChannelId the scc channel id
   * @param view the view
   * @return the response
   */
  @ApiOperation(value = "Maps the model to a LowFareSearchReq and executes a UAPI request", response = AirResponse.class)
  @RequestMapping(value = "/catalogofferings", method = RequestMethod.POST, produces = "application/json")
  public AirResponse airSearch(@RequestBody FlightSearchRequest request,
      @RequestParam(value = "sccType", required = false) String sccType,
      @RequestParam(value = "sccChannelId", required = false) String sccChannelId,
      @RequestParam(value = "view", required = false) String view) {
	  AirResponse response = uapiAirService.getLowFareSearch(request, sccType, sccChannelId, view);
	  try 
	  {
    LOG.debug("Call UAPIAirService with incoming request");
    LOG.debug("Enter air controller, map to /AirSearch");
    
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
    return response;
  }
  @RequestMapping(value = "/searchFlight", method = RequestMethod.POST, produces = "application/json")
  public AirResponse searchFlight(@RequestBody AirSearchRequest request) {
    AirResponse response = uapiAirService.getFlightSearch(request);
    return response;
  }
  
}