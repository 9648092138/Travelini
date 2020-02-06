
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v45_0.TypePriceClassOfService;


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
 *         &lt;element name="PrivateFareOptions" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareType" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareTicketDesignator" minOccurs="0"/&gt;
 *         &lt;element name="OverrideCurrency" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.travelport.com/schema/common_v45_0}typeCurrency" /&gt;
 *                 &lt;attribute name="CountryCode" type="{http://www.travelport.com/schema/common_v45_0}typeCountry" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirSegmentPricingModifiers" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="WithholdTaxCode" maxOccurs="4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PriceClassOfService" type="{http://www.travelport.com/schema/common_v45_0}typePriceClassOfService" /&gt;
 *       &lt;attribute name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ReissueLocCityCode" type="{http://www.travelport.com/schema/common_v45_0}typeCity" /&gt;
 *       &lt;attribute name="ReissueLocCountryCode" type="{http://www.travelport.com/schema/common_v45_0}typeCountry" /&gt;
 *       &lt;attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PenaltyAsTaxCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="AirPricingSolutionRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="PenaltyToFare" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PricePTCOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="BrandDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="BrandModifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="JetServiceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="TimeWindow"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="01"/&gt;
 *             &lt;maxInclusive value="12"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="FlightType" default="Direct"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Direct"/&gt;
 *             &lt;enumeration value="NonStop"/&gt;
 *             &lt;enumeration value="SingleConnection"/&gt;
 *             &lt;enumeration value="NoRestrictions"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MultiAirportSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="ConnectionPoint" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "privateFareOptions",
    "fareType",
    "fareTicketDesignator",
    "overrideCurrency",
    "airSegmentPricingModifiers",
    "withholdTaxCode"
})
@XmlRootElement(name = "RepricingModifiers")
public class RepricingModifiers {

    @XmlElement(name = "PrivateFareOptions")
    protected String privateFareOptions;
    @XmlElement(name = "FareType")
    protected List<FareType> fareType;
    @XmlElement(name = "FareTicketDesignator")
    protected FareTicketDesignator fareTicketDesignator;
    @XmlElement(name = "OverrideCurrency")
    protected RepricingModifiers.OverrideCurrency overrideCurrency;
    @XmlElement(name = "AirSegmentPricingModifiers")
    protected List<AirSegmentPricingModifiers> airSegmentPricingModifiers;
    @XmlElement(name = "WithholdTaxCode")
    protected List<String> withholdTaxCode;
    @XmlAttribute(name = "PriceClassOfService")
    protected TypePriceClassOfService priceClassOfService;
    @XmlAttribute(name = "CreateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "ReissueLocCityCode")
    protected String reissueLocCityCode;
    @XmlAttribute(name = "ReissueLocCountryCode")
    protected String reissueLocCountryCode;
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;
    @XmlAttribute(name = "AccountCode")
    protected String accountCode;
    @XmlAttribute(name = "PenaltyAsTaxCode")
    protected String penaltyAsTaxCode;
    @XmlAttribute(name = "AirPricingSolutionRef")
    protected String airPricingSolutionRef;
    @XmlAttribute(name = "PenaltyToFare")
    protected Boolean penaltyToFare;
    @XmlAttribute(name = "PricePTCOnly")
    protected Boolean pricePTCOnly;
    @XmlAttribute(name = "BrandDetails")
    protected Boolean brandDetails;
    @XmlAttribute(name = "BrandModifier")
    protected String brandModifier;
    @XmlAttribute(name = "JetServiceOnly")
    protected Boolean jetServiceOnly;
    @XmlAttribute(name = "TimeWindow")
    protected Integer timeWindow;
    @XmlAttribute(name = "FlightType")
    protected String flightType;
    @XmlAttribute(name = "MultiAirportSearch")
    protected Boolean multiAirportSearch;
    @XmlAttribute(name = "ConnectionPoint")
    protected String connectionPoint;

    /**
     * Gets the value of the privateFareOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateFareOptions() {
        return privateFareOptions;
    }

    /**
     * Sets the value of the privateFareOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateFareOptions(String value) {
        this.privateFareOptions = value;
    }

    /**
     * Gets the value of the fareType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareType }
     * 
     * 
     */
    public List<FareType> getFareType() {
        if (fareType == null) {
            fareType = new ArrayList<FareType>();
        }
        return this.fareType;
    }

    /**
     * Gets the value of the fareTicketDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link FareTicketDesignator }
     *     
     */
    public FareTicketDesignator getFareTicketDesignator() {
        return fareTicketDesignator;
    }

    /**
     * Sets the value of the fareTicketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTicketDesignator }
     *     
     */
    public void setFareTicketDesignator(FareTicketDesignator value) {
        this.fareTicketDesignator = value;
    }

    /**
     * Gets the value of the overrideCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link RepricingModifiers.OverrideCurrency }
     *     
     */
    public RepricingModifiers.OverrideCurrency getOverrideCurrency() {
        return overrideCurrency;
    }

    /**
     * Sets the value of the overrideCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepricingModifiers.OverrideCurrency }
     *     
     */
    public void setOverrideCurrency(RepricingModifiers.OverrideCurrency value) {
        this.overrideCurrency = value;
    }

    /**
     * Gets the value of the airSegmentPricingModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentPricingModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegmentPricingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentPricingModifiers }
     * 
     * 
     */
    public List<AirSegmentPricingModifiers> getAirSegmentPricingModifiers() {
        if (airSegmentPricingModifiers == null) {
            airSegmentPricingModifiers = new ArrayList<AirSegmentPricingModifiers>();
        }
        return this.airSegmentPricingModifiers;
    }

    /**
     * Gets the value of the withholdTaxCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdTaxCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithholdTaxCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWithholdTaxCode() {
        if (withholdTaxCode == null) {
            withholdTaxCode = new ArrayList<String>();
        }
        return this.withholdTaxCode;
    }

    /**
     * Gets the value of the priceClassOfService property.
     * 
     * @return
     *     possible object is
     *     {@link TypePriceClassOfService }
     *     
     */
    public TypePriceClassOfService getPriceClassOfService() {
        return priceClassOfService;
    }

    /**
     * Sets the value of the priceClassOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePriceClassOfService }
     *     
     */
    public void setPriceClassOfService(TypePriceClassOfService value) {
        this.priceClassOfService = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the reissueLocCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReissueLocCityCode() {
        return reissueLocCityCode;
    }

    /**
     * Sets the value of the reissueLocCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReissueLocCityCode(String value) {
        this.reissueLocCityCode = value;
    }

    /**
     * Gets the value of the reissueLocCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReissueLocCountryCode() {
        return reissueLocCountryCode;
    }

    /**
     * Sets the value of the reissueLocCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReissueLocCountryCode(String value) {
        this.reissueLocCountryCode = value;
    }

    /**
     * Gets the value of the bulkTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBulkTicket() {
        if (bulkTicket == null) {
            return false;
        } else {
            return bulkTicket;
        }
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkTicket(Boolean value) {
        this.bulkTicket = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the penaltyAsTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyAsTaxCode() {
        return penaltyAsTaxCode;
    }

    /**
     * Sets the value of the penaltyAsTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyAsTaxCode(String value) {
        this.penaltyAsTaxCode = value;
    }

    /**
     * Gets the value of the airPricingSolutionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirPricingSolutionRef() {
        return airPricingSolutionRef;
    }

    /**
     * Sets the value of the airPricingSolutionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirPricingSolutionRef(String value) {
        this.airPricingSolutionRef = value;
    }

    /**
     * Gets the value of the penaltyToFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPenaltyToFare() {
        return penaltyToFare;
    }

    /**
     * Sets the value of the penaltyToFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPenaltyToFare(Boolean value) {
        this.penaltyToFare = value;
    }

    /**
     * Gets the value of the pricePTCOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPricePTCOnly() {
        if (pricePTCOnly == null) {
            return false;
        } else {
            return pricePTCOnly;
        }
    }

    /**
     * Sets the value of the pricePTCOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricePTCOnly(Boolean value) {
        this.pricePTCOnly = value;
    }

    /**
     * Gets the value of the brandDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBrandDetails() {
        if (brandDetails == null) {
            return false;
        } else {
            return brandDetails;
        }
    }

    /**
     * Sets the value of the brandDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrandDetails(Boolean value) {
        this.brandDetails = value;
    }

    /**
     * Gets the value of the brandModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandModifier() {
        return brandModifier;
    }

    /**
     * Sets the value of the brandModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandModifier(String value) {
        this.brandModifier = value;
    }

    /**
     * Gets the value of the jetServiceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isJetServiceOnly() {
        if (jetServiceOnly == null) {
            return false;
        } else {
            return jetServiceOnly;
        }
    }

    /**
     * Sets the value of the jetServiceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJetServiceOnly(Boolean value) {
        this.jetServiceOnly = value;
    }

    /**
     * Gets the value of the timeWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeWindow() {
        return timeWindow;
    }

    /**
     * Sets the value of the timeWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeWindow(Integer value) {
        this.timeWindow = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        if (flightType == null) {
            return "Direct";
        } else {
            return flightType;
        }
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the multiAirportSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultiAirportSearch() {
        if (multiAirportSearch == null) {
            return true;
        } else {
            return multiAirportSearch;
        }
    }

    /**
     * Sets the value of the multiAirportSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiAirportSearch(Boolean value) {
        this.multiAirportSearch = value;
    }

    /**
     * Gets the value of the connectionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionPoint() {
        return connectionPoint;
    }

    /**
     * Sets the value of the connectionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionPoint(String value) {
        this.connectionPoint = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://www.travelport.com/schema/common_v45_0}typeCurrency" /&gt;
     *       &lt;attribute name="CountryCode" type="{http://www.travelport.com/schema/common_v45_0}typeCountry" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OverrideCurrency {

        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

    }

}
