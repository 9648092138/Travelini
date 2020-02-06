package co.travelini.backendservices.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "CatalogOfferingsResponse" })
public class AirResponse {

  @JsonProperty("CatalogOfferingsResponse")
  private CatalogOfferingsResponse catalogOfferingsResponse;

  /**
   * No args constructor for use in serialization
   * 
   */
  public AirResponse() {
  }

  /**
   * 
   * @param catalogOfferingsResponse
   */
  public AirResponse(CatalogOfferingsResponse catalogOfferingsResponse) {
    super();
    this.catalogOfferingsResponse = catalogOfferingsResponse;
  }

  @JsonProperty("CatalogOfferingsResponse")
  public CatalogOfferingsResponse getCatalogOfferingsResponse() {
    return catalogOfferingsResponse;
  }

  @JsonProperty("CatalogOfferingsResponse")
  public void setCatalogOfferingsResponse(CatalogOfferingsResponse catalogOfferingsResponse) {
    this.catalogOfferingsResponse = catalogOfferingsResponse;
  }

}