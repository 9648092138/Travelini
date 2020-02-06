package co.travelini.backendservices.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceDetails extends Price {
  @JsonProperty("PriceBreakdown")
  private List<PriceBreakdown> priceBreakdown = null;

  public PriceDetails() {
  }

  public PriceDetails(String type, String id, String currencyCode, Double base, Double totalTaxes,
      Double totalFees, Double totalPrice, VendorCurrencyTotal vendorCurrencyTotal,
      List<PriceBreakdown> priceBreakdown) {
    super(type, id, currencyCode, base, totalTaxes, totalFees, totalPrice, vendorCurrencyTotal);
    this.priceBreakdown = priceBreakdown;
  }

  @JsonProperty("PriceBreakdown")
  public List<PriceBreakdown> getPriceBreakdown() {
    return priceBreakdown;
  }

  @JsonProperty("PriceBreakdown")
  public void setPriceBreakdown(List<PriceBreakdown> priceBreakdown) {
    this.priceBreakdown = priceBreakdown;
  }
}