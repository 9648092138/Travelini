package co.travelini.backendservices.mapper;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.travelini.backendservices.entity.CatalogOfferingsResponse;
import co.travelini.backendservices.entity.AirResponse;
import com.travelport.schema.air_v45_0.LowFareSearchRsp;

/**
 * The Class ResponseMapper.
 */
@Component
public class ResponseMapper
{

  /** The ref list mapper. */
  @Autowired
  ReferenceListMapper refListMapper;

  /** The catalog offerings mapper. */
  @Autowired
  CatalogOfferingsMapper catalogOfferingsMapper;

  /** The result mapper. */
  @Autowired
  ResultMapper resultMapper;

  /**
   * Map low fare search res.
   *
   * @param lfsResponse the lfs response
   * @param view the view
   * @return the response
   */
  public AirResponse mapLowFareSearchRes(LowFareSearchRsp lfsResponse, String view) {
    AirResponse response = new AirResponse();
    CatalogOfferingsResponse catalogOfferingsResponse = new CatalogOfferingsResponse();

    catalogOfferingsResponse
        .setCatalogOfferings(catalogOfferingsMapper.mapCatalogOfferings(lfsResponse, view));
    catalogOfferingsResponse.setTransactionId(lfsResponse.getTransactionId());
    catalogOfferingsResponse.setTraceId(lfsResponse.getTraceId());
    catalogOfferingsResponse.setResult(resultMapper.mapResult(lfsResponse.getResponseMessage()));
    catalogOfferingsResponse.setReferenceList(
        refListMapper.mapReferenceList(lfsResponse.getAirSegmentList().getAirSegment()));
    response.setCatalogOfferingsResponse(catalogOfferingsResponse);

    return response;
  }

}