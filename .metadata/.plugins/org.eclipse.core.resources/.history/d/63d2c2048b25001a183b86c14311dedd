
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.AccountCode;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareDisplayRule"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FarePricing" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareRestriction" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareRoutingInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareMileageInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirFareDisplayRuleKey" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BookingCode" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}AccountCode" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AddlBookingCodeInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareRuleFailureInfo" minOccurs="0"/&gt;
 *         &lt;element name="PriceChange" type="{http://www.travelport.com/schema/air_v45_0}PriceChangeType" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Carrier" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
 *       &lt;attribute name="FareBasis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Amount" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="TripType" type="{http://www.travelport.com/schema/air_v45_0}typeFareTripType" /&gt;
 *       &lt;attribute name="FareTypeCode" type="{http://www.travelport.com/schema/air_v45_0}typeFareTypeCode" /&gt;
 *       &lt;attribute name="SpecialFare" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InstantPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EligibilityRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FlightRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="StopoversRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TransfersRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BlackoutsExist" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AccompaniedTravel" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MileOrRouteBasedFare" type="{http://www.travelport.com/schema/air_v45_0}typeMileOrRouteBasedFare" /&gt;
 *       &lt;attribute name="GlobalIndicator" type="{http://www.travelport.com/schema/air_v45_0}typeATPCOGlobalIndicator" /&gt;
 *       &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="FareTicketingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FareTicketingDesignator" type="{http://www.travelport.com/schema/air_v45_0}typeTicketDesignator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareDisplayRule",
    "farePricing",
    "fareRestriction",
    "fareRoutingInformation",
    "fareMileageInformation",
    "airFareDisplayRuleKey",
    "bookingCode",
    "accountCode",
    "addlBookingCodeInformation",
    "fareRuleFailureInfo",
    "priceChange"
})
@XmlRootElement(name = "FareDisplay")
public class FareDisplay {

    @XmlElement(name = "FareDisplayRule", required = true)
    protected FareDisplayRule fareDisplayRule;
    @XmlElement(name = "FarePricing", required = true)
    protected List<FarePricing> farePricing;
    @XmlElement(name = "FareRestriction")
    protected List<FareRestriction> fareRestriction;
    @XmlElement(name = "FareRoutingInformation")
    protected String fareRoutingInformation;
    @XmlElement(name = "FareMileageInformation")
    protected String fareMileageInformation;
    @XmlElement(name = "AirFareDisplayRuleKey")
    protected AirFareDisplayRuleKey airFareDisplayRuleKey;
    @XmlElement(name = "BookingCode")
    protected List<BookingCode> bookingCode;
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<AccountCode> accountCode;
    @XmlElement(name = "AddlBookingCodeInformation")
    protected AddlBookingCodeInformation addlBookingCodeInformation;
    @XmlElement(name = "FareRuleFailureInfo")
    protected FareRuleFailureInfo fareRuleFailureInfo;
    @XmlElement(name = "PriceChange")
    protected List<PriceChangeType> priceChange;
    @XmlAttribute(name = "Carrier", required = true)
    protected String carrier;
    @XmlAttribute(name = "FareBasis", required = true)
    protected String fareBasis;
    @XmlAttribute(name = "Amount", required = true)
    protected String amount;
    @XmlAttribute(name = "TripType")
    protected TypeFareTripType tripType;
    @XmlAttribute(name = "FareTypeCode")
    protected String fareTypeCode;
    @XmlAttribute(name = "SpecialFare")
    protected Boolean specialFare;
    @XmlAttribute(name = "InstantPurchase")
    protected Boolean instantPurchase;
    @XmlAttribute(name = "EligibilityRestricted")
    protected Boolean eligibilityRestricted;
    @XmlAttribute(name = "FlightRestricted")
    protected Boolean flightRestricted;
    @XmlAttribute(name = "StopoversRestricted")
    protected Boolean stopoversRestricted;
    @XmlAttribute(name = "TransfersRestricted")
    protected Boolean transfersRestricted;
    @XmlAttribute(name = "BlackoutsExist")
    protected Boolean blackoutsExist;
    @XmlAttribute(name = "AccompaniedTravel")
    protected Boolean accompaniedTravel;
    @XmlAttribute(name = "MileOrRouteBasedFare")
    protected TypeMileOrRouteBasedFare mileOrRouteBasedFare;
    @XmlAttribute(name = "GlobalIndicator")
    protected TypeATPCOGlobalIndicator globalIndicator;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "FareTicketingCode")
    protected String fareTicketingCode;
    @XmlAttribute(name = "FareTicketingDesignator")
    protected String fareTicketingDesignator;

    /**
     * Gets the value of the fareDisplayRule property.
     * 
     * @return
     *     possible object is
     *     {@link FareDisplayRule }
     *     
     */
    public FareDisplayRule getFareDisplayRule() {
        return fareDisplayRule;
    }

    /**
     * Sets the value of the fareDisplayRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDisplayRule }
     *     
     */
    public void setFareDisplayRule(FareDisplayRule value) {
        this.fareDisplayRule = value;
    }

    /**
     * Gets the value of the farePricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarePricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePricing }
     * 
     * 
     */
    public List<FarePricing> getFarePricing() {
        if (farePricing == null) {
            farePricing = new ArrayList<FarePricing>();
        }
        return this.farePricing;
    }

    /**
     * Gets the value of the fareRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestriction }
     * 
     * 
     */
    public List<FareRestriction> getFareRestriction() {
        if (fareRestriction == null) {
            fareRestriction = new ArrayList<FareRestriction>();
        }
        return this.fareRestriction;
    }

    /**
     * Gets the value of the fareRoutingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRoutingInformation() {
        return fareRoutingInformation;
    }

    /**
     * Sets the value of the fareRoutingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRoutingInformation(String value) {
        this.fareRoutingInformation = value;
    }

    /**
     * Gets the value of the fareMileageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareMileageInformation() {
        return fareMileageInformation;
    }

    /**
     * Sets the value of the fareMileageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareMileageInformation(String value) {
        this.fareMileageInformation = value;
    }

    /**
     * Gets the value of the airFareDisplayRuleKey property.
     * 
     * @return
     *     possible object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    public AirFareDisplayRuleKey getAirFareDisplayRuleKey() {
        return airFareDisplayRuleKey;
    }

    /**
     * Sets the value of the airFareDisplayRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    public void setAirFareDisplayRuleKey(AirFareDisplayRuleKey value) {
        this.airFareDisplayRuleKey = value;
    }

    /**
     * Gets the value of the bookingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingCode }
     * 
     * 
     */
    public List<BookingCode> getBookingCode() {
        if (bookingCode == null) {
            bookingCode = new ArrayList<BookingCode>();
        }
        return this.bookingCode;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCode }
     * 
     * 
     */
    public List<AccountCode> getAccountCode() {
        if (accountCode == null) {
            accountCode = new ArrayList<AccountCode>();
        }
        return this.accountCode;
    }

    /**
     * Gets the value of the addlBookingCodeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddlBookingCodeInformation }
     *     
     */
    public AddlBookingCodeInformation getAddlBookingCodeInformation() {
        return addlBookingCodeInformation;
    }

    /**
     * Sets the value of the addlBookingCodeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlBookingCodeInformation }
     *     
     */
    public void setAddlBookingCodeInformation(AddlBookingCodeInformation value) {
        this.addlBookingCodeInformation = value;
    }

    /**
     * Returns fare rule failure info for Non
     *                             Valid fares.
     * 
     * @return
     *     possible object is
     *     {@link FareRuleFailureInfo }
     *     
     */
    public FareRuleFailureInfo getFareRuleFailureInfo() {
        return fareRuleFailureInfo;
    }

    /**
     * Sets the value of the fareRuleFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRuleFailureInfo }
     *     
     */
    public void setFareRuleFailureInfo(FareRuleFailureInfo value) {
        this.fareRuleFailureInfo = value;
    }

    /**
     * Gets the value of the priceChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceChangeType }
     * 
     * 
     */
    public List<PriceChangeType> getPriceChange() {
        if (priceChange == null) {
            priceChange = new ArrayList<PriceChangeType>();
        }
        return this.priceChange;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the tripType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareTripType }
     *     
     */
    public TypeFareTripType getTripType() {
        return tripType;
    }

    /**
     * Sets the value of the tripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareTripType }
     *     
     */
    public void setTripType(TypeFareTripType value) {
        this.tripType = value;
    }

    /**
     * Gets the value of the fareTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTypeCode() {
        return fareTypeCode;
    }

    /**
     * Sets the value of the fareTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareTypeCode(String value) {
        this.fareTypeCode = value;
    }

    /**
     * Gets the value of the specialFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialFare() {
        return specialFare;
    }

    /**
     * Sets the value of the specialFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialFare(Boolean value) {
        this.specialFare = value;
    }

    /**
     * Gets the value of the instantPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstantPurchase() {
        return instantPurchase;
    }

    /**
     * Sets the value of the instantPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantPurchase(Boolean value) {
        this.instantPurchase = value;
    }

    /**
     * Gets the value of the eligibilityRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibilityRestricted() {
        return eligibilityRestricted;
    }

    /**
     * Sets the value of the eligibilityRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibilityRestricted(Boolean value) {
        this.eligibilityRestricted = value;
    }

    /**
     * Gets the value of the flightRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlightRestricted() {
        return flightRestricted;
    }

    /**
     * Sets the value of the flightRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlightRestricted(Boolean value) {
        this.flightRestricted = value;
    }

    /**
     * Gets the value of the stopoversRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopoversRestricted() {
        return stopoversRestricted;
    }

    /**
     * Sets the value of the stopoversRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopoversRestricted(Boolean value) {
        this.stopoversRestricted = value;
    }

    /**
     * Gets the value of the transfersRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransfersRestricted() {
        return transfersRestricted;
    }

    /**
     * Sets the value of the transfersRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransfersRestricted(Boolean value) {
        this.transfersRestricted = value;
    }

    /**
     * Gets the value of the blackoutsExist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlackoutsExist() {
        return blackoutsExist;
    }

    /**
     * Sets the value of the blackoutsExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlackoutsExist(Boolean value) {
        this.blackoutsExist = value;
    }

    /**
     * Gets the value of the accompaniedTravel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccompaniedTravel() {
        return accompaniedTravel;
    }

    /**
     * Sets the value of the accompaniedTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccompaniedTravel(Boolean value) {
        this.accompaniedTravel = value;
    }

    /**
     * Gets the value of the mileOrRouteBasedFare property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMileOrRouteBasedFare }
     *     
     */
    public TypeMileOrRouteBasedFare getMileOrRouteBasedFare() {
        return mileOrRouteBasedFare;
    }

    /**
     * Sets the value of the mileOrRouteBasedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMileOrRouteBasedFare }
     *     
     */
    public void setMileOrRouteBasedFare(TypeMileOrRouteBasedFare value) {
        this.mileOrRouteBasedFare = value;
    }

    /**
     * Gets the value of the globalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeATPCOGlobalIndicator }
     *     
     */
    public TypeATPCOGlobalIndicator getGlobalIndicator() {
        return globalIndicator;
    }

    /**
     * Sets the value of the globalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeATPCOGlobalIndicator }
     *     
     */
    public void setGlobalIndicator(TypeATPCOGlobalIndicator value) {
        this.globalIndicator = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the fareTicketingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTicketingCode() {
        return fareTicketingCode;
    }

    /**
     * Sets the value of the fareTicketingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareTicketingCode(String value) {
        this.fareTicketingCode = value;
    }

    /**
     * Gets the value of the fareTicketingDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTicketingDesignator() {
        return fareTicketingDesignator;
    }

    /**
     * Sets the value of the fareTicketingDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareTicketingDesignator(String value) {
        this.fareTicketingDesignator = value;
    }

}
