package co.travelini.backendservices.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "CatalogOfferingsRequestAir" })
public class FlightSearchRequest {

  @JsonProperty("CatalogOfferingsRequestAir")
  private CatalogOfferingsRequestAir catalogOfferingsRequestAir;

  /**
   * No args constructor for use in serialization
   * 
   */
  public FlightSearchRequest() 
  {
	  
  }

  /**
   * 
   * @param catalogOfferingsRequestAir
   */
  public FlightSearchRequest(CatalogOfferingsRequestAir catalogOfferingsRequestAir) {
    super();
    this.catalogOfferingsRequestAir = catalogOfferingsRequestAir;
  }

  @JsonProperty("CatalogOfferingsRequestAir")
  public CatalogOfferingsRequestAir getCatalogOfferingsRequestAir() {
    return catalogOfferingsRequestAir;
  }

  @JsonProperty("CatalogOfferingsRequestAir")
  public void setCatalogOfferingsRequestAir(CatalogOfferingsRequestAir catalogOfferingsRequestAir) {
    this.catalogOfferingsRequestAir = catalogOfferingsRequestAir;
  }

}