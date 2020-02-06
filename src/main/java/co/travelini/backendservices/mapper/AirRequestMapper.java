package co.travelini.backendservices.mapper;



import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import co.travelini.backendservices.entity.CatalogOfferingsRequestAir;
import co.travelini.backendservices.entity.FlightSearchRequest;
import co.travelini.backendservices.dto.request.AirSearchRequest;
import com.travelport.schema.air_v45_0.AirSearchModifiers.PreferredProviders;
import com.travelport.schema.air_v45_0.LowFareSearchReq;
import com.travelport.schema.air_v45_0.SearchAirLeg;
import com.travelport.schema.common_v45_0.BillingPointOfSaleInfo;
import com.travelport.schema.common_v45_0.CityOrAirport;
import com.travelport.schema.common_v45_0.Provider;
import com.travelport.schema.common_v45_0.SearchPassenger;
import com.travelport.schema.common_v45_0.TypeFlexibleTimeSpec;
import com.travelport.schema.common_v45_0.TypeSearchLocation;

/**
 * The Class RequestMapper.
 */
@Component
@EnableConfigurationProperties
@ConfigurationProperties("air")

public class AirRequestMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirRequestMapper.class);

  /** The branch. */
  @Value("${air.branch}")
  private String branch;

  /** The price mod mapper. */
  @Autowired
  PriceModifiersMapper priceModMapper;

  /** The search mod mapper. */
  @Autowired
  SearchModifiersMapper searchModMapper;

  /** The air leg mapper. */
  @Autowired
  AirLegMapper airLegMapper;

  /** The passenger mapper. */
  @Autowired
  SearchPassengerMapper passengerMapper;

  /**
   * Instantiates a new request mapper.
   */
  public AirRequestMapper() {
  }

  /**
   * Map low fare search req.
   *
   * @param request the request
   * @param sccType the scc type
   * @param sccChannelId the scc channel id
   * @return the low fare search req
   */
  public LowFareSearchReq mapLowFareSearchReq(FlightSearchRequest request, String sccType,
      String sccChannelId) {
    LOG.debug("*Entered AirMapper");
    LowFareSearchReq lfsRequest = new LowFareSearchReq();
    CatalogOfferingsRequestAir catalogofferings = request.getCatalogOfferingsRequestAir();

    lfsRequest.setTargetBranch(branch);
    lfsRequest.setNSCC(sccType);
    lfsRequest.setSolutionResult(false);
    lfsRequest.setBillingPointOfSaleInfo(mapBillingPointOfSale());

    lfsRequest.getSearchAirLeg()
        .addAll(airLegMapper.mapSearchAirLegs(catalogofferings.getSearchCriteriaFlight()));
    lfsRequest.getSearchPassenger()
        .addAll(passengerMapper.mapSearchPassengers(catalogofferings.getPassengerCriteria()));
    lfsRequest.setAirPricingModifiers(priceModMapper.mapAirPricingModifiers(sccChannelId,
        catalogofferings.getPricingModifiersAir()));
    lfsRequest.setAirSearchModifiers(searchModMapper.mapSearchModifiers(
        catalogofferings.getOffersPerPage(), catalogofferings.getSearchModifiersAir()));
    
    
    return lfsRequest;
  }

  /**
   * Map billing point of sale.
   *
   * @return the billing point of sale info
   */
  private BillingPointOfSaleInfo mapBillingPointOfSale() {
    BillingPointOfSaleInfo bpos = new BillingPointOfSaleInfo();

    bpos.setOriginApplication("UAPI");

    return bpos;
  }

  /**
   * Map providers.
   *
   * @param provider the provider
   * @return the preferred providers
   */
  // UAPI allows for referencing preferred cores. Trip Services does not use the cores.
  private PreferredProviders mapProviders(String provider) {
    PreferredProviders providers = new PreferredProviders();
    Provider p = new Provider();

    p.setCode(provider);
    providers.getProvider().add(p);

    return providers;
  }
  
  public LowFareSearchReq mapSearchFlight(AirSearchRequest request) {
	    LOG.debug("*Entered AirMapper");
	    LowFareSearchReq lfsRequest = new LowFareSearchReq();
//	    CatalogOfferingsRequestAir catalogofferings = request.getCatalogOfferingsRequestAir();

	    lfsRequest.setTargetBranch(branch);
	    lfsRequest.setSolutionResult(false);
	    lfsRequest.setBillingPointOfSaleInfo(mapBillingPointOfSale());
	    
	    
	    System.out.println(request.getFrom());
	    List<TypeSearchLocation> searchOrigin = new ArrayList<TypeSearchLocation>();
	    TypeSearchLocation searchO = new TypeSearchLocation();
	    CityOrAirport city = new CityOrAirport();
	    city.setCode(request.getFrom());
	    searchO.setCityOrAirport(city);
	    searchOrigin.add(searchO);
	  
	    List<TypeSearchLocation> searchDestination = new ArrayList<TypeSearchLocation>();
	    TypeSearchLocation searchD = new TypeSearchLocation();
	    city = new CityOrAirport();
	    city.setCode(request.getTo());
	    searchD.setCityOrAirport(city);
	    searchDestination.add(searchD);
	    
	    TypeFlexibleTimeSpec searchDepTime = new TypeFlexibleTimeSpec();
	    searchDepTime.setPreferredTime(request.getDepartureDate());
	    
	    SearchAirLeg searchAirLeg = new SearchAirLeg();
	    
	    searchAirLeg.getSearchOrigin().addAll(searchOrigin);
	    searchAirLeg.getSearchDestination().addAll(searchDestination);
	    searchAirLeg.getSearchDepTime().add(searchDepTime);
//	    searchAirLeg.getSearchArvTime().add(searchDepTime);
	    
	  
	    List<SearchAirLeg> airLeg = new ArrayList<>();
	    airLeg.add(searchAirLeg);
	    
	    
	    lfsRequest.getSearchAirLeg()
	        .addAll(airLeg);
	    List<SearchPassenger> searchPassenger=new ArrayList<SearchPassenger>();
	    if(request.getNumberOfAdults()>0) {
	    	 SearchPassenger serPag=new SearchPassenger();
	    	 serPag.setCode("ADT");
	    	 searchPassenger.add(serPag);
	    }
	    
	  
	   
	  	    if(request.getNumberOfChilds()>0) {
	    	 SearchPassenger serPag=new SearchPassenger();
	    	 serPag.setCode("CHD");
	    	 searchPassenger.add(serPag);
	    }
	   
	  
		   
	  	    if(request.getNumberOfInfants()>0) {
	    	 SearchPassenger serPag=new SearchPassenger();
	    	 serPag.setCode("INF");
	    	 searchPassenger.add(serPag);
	    }
	   
	    lfsRequest.getSearchPassenger().addAll(searchPassenger);

	    
	    
	    return lfsRequest;
	  }
}