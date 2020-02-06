
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseCoreReq;
import com.travelport.schema.common_v45_0.OverridePCC;


/**
 * <p>Java class for BaseAirExchangeMultiQuoteReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseAirExchangeMultiQuoteReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseCoreReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}TicketNumber" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="ProviderReservationInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}ProviderReservation"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirPricingSolution" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}RepricingModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}OriginalItineraryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}OverridePCC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAirExchangeMultiQuoteReq", propOrder = {
    "ticketNumber",
    "providerReservationInfo",
    "airPricingSolution",
    "repricingModifiers",
    "originalItineraryDetails",
    "overridePCC"
})
@XmlSeeAlso({
    AirExchangeMultiQuoteReq.class
})
public class BaseAirExchangeMultiQuoteReq
    extends BaseCoreReq
{

    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<String> ticketNumber;
    @XmlElement(name = "ProviderReservationInfo")
    protected BaseAirExchangeMultiQuoteReq.ProviderReservationInfo providerReservationInfo;
    @XmlElement(name = "AirPricingSolution")
    protected List<AirPricingSolution> airPricingSolution;
    @XmlElement(name = "RepricingModifiers")
    protected RepricingModifiers repricingModifiers;
    @XmlElement(name = "OriginalItineraryDetails")
    protected OriginalItineraryDetails originalItineraryDetails;
    @XmlElement(name = "OverridePCC", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected OverridePCC overridePCC;

    /**
     * Gets the value of the ticketNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<String>();
        }
        return this.ticketNumber;
    }

    /**
     * Gets the value of the providerReservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseAirExchangeMultiQuoteReq.ProviderReservationInfo }
     *     
     */
    public BaseAirExchangeMultiQuoteReq.ProviderReservationInfo getProviderReservationInfo() {
        return providerReservationInfo;
    }

    /**
     * Sets the value of the providerReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAirExchangeMultiQuoteReq.ProviderReservationInfo }
     *     
     */
    public void setProviderReservationInfo(BaseAirExchangeMultiQuoteReq.ProviderReservationInfo value) {
        this.providerReservationInfo = value;
    }

    /**
     * Gets the value of the airPricingSolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingSolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingSolution }
     * 
     * 
     */
    public List<AirPricingSolution> getAirPricingSolution() {
        if (airPricingSolution == null) {
            airPricingSolution = new ArrayList<AirPricingSolution>();
        }
        return this.airPricingSolution;
    }

    /**
     * Gets the value of the repricingModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link RepricingModifiers }
     *     
     */
    public RepricingModifiers getRepricingModifiers() {
        return repricingModifiers;
    }

    /**
     * Sets the value of the repricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepricingModifiers }
     *     
     */
    public void setRepricingModifiers(RepricingModifiers value) {
        this.repricingModifiers = value;
    }

    /**
     * Gets the value of the originalItineraryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalItineraryDetails }
     *     
     */
    public OriginalItineraryDetails getOriginalItineraryDetails() {
        return originalItineraryDetails;
    }

    /**
     * Sets the value of the originalItineraryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalItineraryDetails }
     *     
     */
    public void setOriginalItineraryDetails(OriginalItineraryDetails value) {
        this.originalItineraryDetails = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}ProviderReservation"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProviderReservationInfo {

        @XmlAttribute(name = "ProviderCode", required = true)
        protected String providerCode;
        @XmlAttribute(name = "ProviderLocatorCode", required = true)
        protected String providerLocatorCode;

        /**
         * Gets the value of the providerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderCode() {
            return providerCode;
        }

        /**
         * Sets the value of the providerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProviderCode(String value) {
            this.providerCode = value;
        }

        /**
         * Gets the value of the providerLocatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderLocatorCode() {
            return providerLocatorCode;
        }

        /**
         * Sets the value of the providerLocatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProviderLocatorCode(String value) {
            this.providerLocatorCode = value;
        }

    }

}
