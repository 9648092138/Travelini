
package com.travelport.schema.common_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v45_0.AirBaseReq;
import com.travelport.schema.air_v45_0.AirExchangeEligibilityReq;
import com.travelport.schema.air_v45_0.AirExchangeReq;
import com.travelport.schema.air_v45_0.AirExchangeTicketingReq;
import com.travelport.schema.air_v45_0.AirFareDisplayReq;
import com.travelport.schema.air_v45_0.AirFareRulesReq;
import com.travelport.schema.air_v45_0.AirMerchandisingDetailsReq;
import com.travelport.schema.air_v45_0.AirMerchandisingOfferAvailabilityReq;
import com.travelport.schema.air_v45_0.AirPrePayReq;
import com.travelport.schema.air_v45_0.AirRefundQuoteReq;
import com.travelport.schema.air_v45_0.AirRefundReq;
import com.travelport.schema.air_v45_0.AirRetrieveDocumentReq;
import com.travelport.schema.air_v45_0.AirVoidDocumentReq;
import com.travelport.schema.air_v45_0.EMDIssuanceReq;
import com.travelport.schema.air_v45_0.EMDRetrieveReq;
import com.travelport.schema.air_v45_0.FlightDetailsReq;
import com.travelport.schema.air_v45_0.FlightInformationReq;
import com.travelport.schema.air_v45_0.RetrieveLowFareSearchReq;
import com.travelport.schema.air_v45_0.SeatMapReq;


/**
 * <p>Java class for BaseReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseCoreReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}OverridePCC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RetrieveProviderReservationDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReq", propOrder = {
    "overridePCC"
})
@XmlSeeAlso({
    BaseCreateReservationReq.class,
    AirExchangeEligibilityReq.class,
    AirMerchandisingDetailsReq.class,
    EMDIssuanceReq.class,
    EMDRetrieveReq.class,
    AirPrePayReq.class,
    FlightInformationReq.class,
    AirMerchandisingOfferAvailabilityReq.class,
    AirRetrieveDocumentReq.class,
    AirVoidDocumentReq.class,
    RetrieveLowFareSearchReq.class,
    BaseSearchReq.class,
    SeatMapReq.class,
    FlightDetailsReq.class,
    AirFareRulesReq.class,
    AirFareDisplayReq.class,
    AirRefundReq.class,
    AirRefundQuoteReq.class,
    AirExchangeTicketingReq.class,
    AirExchangeReq.class,
    AirBaseReq.class
})
public class BaseReq
    extends BaseCoreReq
{

    @XmlElement(name = "OverridePCC")
    protected OverridePCC overridePCC;
    @XmlAttribute(name = "RetrieveProviderReservationDetails")
    protected Boolean retrieveProviderReservationDetails;

    /**
     * Gets the value of the overridePCC property.
     * 
     * @return
     *     possible object is
     *     {@link OverridePCC }
     *     
     */
    public OverridePCC getOverridePCC() {
        return overridePCC;
    }

    /**
     * Sets the value of the overridePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverridePCC }
     *     
     */
    public void setOverridePCC(OverridePCC value) {
        this.overridePCC = value;
    }

    /**
     * Gets the value of the retrieveProviderReservationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRetrieveProviderReservationDetails() {
        if (retrieveProviderReservationDetails == null) {
            return false;
        } else {
            return retrieveProviderReservationDetails;
        }
    }

    /**
     * Sets the value of the retrieveProviderReservationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveProviderReservationDetails(Boolean value) {
        this.retrieveProviderReservationDetails = value;
    }

}
