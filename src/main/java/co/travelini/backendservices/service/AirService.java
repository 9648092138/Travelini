package co.travelini.backendservices.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.connector.AirSearchConnector;
import co.travelini.backendservices.dto.request.AirSearchRequest;
import co.travelini.backendservices.entity.FlightSearchRequest;
import  co.travelini.backendservices.entity.AirResponse;
import co.travelini.backendservices.mapper.AirRequestMapper;
import co.travelini.backendservices.mapper.ResponseMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.travelport.schema.air_v45_0.LowFareSearchReq;
import com.travelport.schema.air_v45_0.LowFareSearchRsp;

/**
 * The Class UAPIAirService.
 */
@Service
public class AirService 
{

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirService.class);
  
  /** The air mapper. */
  @Autowired
  private AirRequestMapper airMapper;
  
  /** The air search connector. */
  @Autowired
  private AirSearchConnector airSearchConnector;
  
  /** The response mapper. */
  @Autowired
  private ResponseMapper responseMapper;

  /**
   * Gets the low fare search.
   *
   * @param request the request
   * @param sccType the scc type
   * @param sccChannelID the scc channel ID
   * @param view the view
   * @return the low fare search
   */
  public AirResponse getLowFareSearch(FlightSearchRequest request, String sccType, String sccChannelID,
      String view) {
    LOG.debug("Send model to mapper to get LowFareSearchReq");
    LowFareSearchReq lfsRequest = airMapper.mapLowFareSearchReq(request, sccType, sccChannelID);
    LOG.debug("****Setup service");
    LOG.debug("****Getting Service");
    LowFareSearchRsp lfsResponse = airSearchConnector.airSearchConnector(lfsRequest);
    LOG.debug("****Mapping Response");
    AirResponse solutions = responseMapper.mapLowFareSearchRes(lfsResponse, view);
    LOG.debug("*******Request Completed");
    return solutions;
  }
  
  public AirResponse getFlightSearch(AirSearchRequest request) {
	    LOG.debug("Send model to mapper to get LowFareSearchReq");
	    LowFareSearchReq lfsRequest = airMapper.mapSearchFlight(request);
	    LOG.debug("****Setup service");
	    LOG.debug("****Getting Service");
	    LowFareSearchRsp lfsResponse = airSearchConnector.airSearchConnector(lfsRequest);
	    LOG.debug("****Mapping Response");
	    ObjectMapper mapper=new ObjectMapper();
	    try {
			System.out.println(mapper.writeValueAsString(lfsResponse));
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    AirResponse solutions = responseMapper.mapLowFareSearchRes(lfsResponse, null);
	    LOG.debug("*******Request Completed");
	    return solutions;
	  }
}