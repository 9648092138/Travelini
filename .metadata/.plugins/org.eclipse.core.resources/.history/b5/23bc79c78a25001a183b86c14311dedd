
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
import com.travelport.schema.common_v45_0.FormOfPayment;
import com.travelport.schema.common_v45_0.HostToken;


/**
 * <p>Java class for BaseAirExchangeQuoteReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseAirExchangeQuoteReq"&gt;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirExchangeModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}HostToken" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}OptionalServices" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}FormOfPayment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}RepricingModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}OriginalItineraryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PCC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FareRuleType" type="{http://www.travelport.com/schema/air_v45_0}typeFareRuleType" default="none" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAirExchangeQuoteReq", propOrder = {
    "ticketNumber",
    "providerReservationInfo",
    "airPricingSolution",
    "airExchangeModifiers",
    "hostToken",
    "optionalServices",
    "formOfPayment",
    "repricingModifiers",
    "originalItineraryDetails",
    "pcc"
})
@XmlSeeAlso({
    AirExchangeQuoteReq.class
})
public class BaseAirExchangeQuoteReq
    extends BaseCoreReq
{

    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<String> ticketNumber;
    @XmlElement(name = "ProviderReservationInfo")
    protected BaseAirExchangeQuoteReq.ProviderReservationInfo providerReservationInfo;
    @XmlElement(name = "AirPricingSolution")
    protected List<AirPricingSolution> airPricingSolution;
    @XmlElement(name = "AirExchangeModifiers")
    protected AirExchangeModifiers airExchangeModifiers;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<HostToken> hostToken;
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<FormOfPayment> formOfPayment;
    @XmlElement(name = "RepricingModifiers")
    protected RepricingModifiers repricingModifiers;
    @XmlElement(name = "OriginalItineraryDetails")
    protected OriginalItineraryDetails originalItineraryDetails;
    @XmlElement(name = "PCC")
    protected PCC pcc;
    @XmlAttribute(name = "FareRuleType")
    protected TypeFareRuleType fareRuleType;

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
     *     {@link BaseAirExchangeQuoteReq.ProviderReservationInfo }
     *     
     */
    public BaseAirExchangeQuoteReq.ProviderReservationInfo getProviderReservationInfo() {
        return providerReservationInfo;
    }

    /**
     * Sets the value of the providerReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAirExchangeQuoteReq.ProviderReservationInfo }
     *     
     */
    public void setProviderReservationInfo(BaseAirExchangeQuoteReq.ProviderReservationInfo value) {
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
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeModifiers }
     *     
     */
    public AirExchangeModifiers getAirExchangeModifiers() {
        return airExchangeModifiers;
    }

    /**
     * Sets the value of the airExchangeModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeModifiers }
     *     
     */
    public void setAirExchangeModifiers(AirExchangeModifiers value) {
        this.airExchangeModifiers = value;
    }

    /**
     * Provider: ACH.Gets the value of the hostToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * 
     * 
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<HostToken>();
        }
        return this.hostToken;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     */
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * Provider: ACH-This would allow a user to see the fees if they are changing from one Form Of Payment to other .Gets the value of the formOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * 
     * 
     */
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<FormOfPayment>();
        }
        return this.formOfPayment;
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
     * Gets the value of the pcc property.
     * 
     * @return
     *     possible object is
     *     {@link PCC }
     *     
     */
    public PCC getPCC() {
        return pcc;
    }

    /**
     * Sets the value of the pcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCC }
     *     
     */
    public void setPCC(PCC value) {
        this.pcc = value;
    }

    /**
     * Gets the value of the fareRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareRuleType }
     *     
     */
    public TypeFareRuleType getFareRuleType() {
        if (fareRuleType == null) {
            return TypeFareRuleType.NONE;
        } else {
            return fareRuleType;
        }
    }

    /**
     * Sets the value of the fareRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareRuleType }
     *     
     */
    public void setFareRuleType(TypeFareRuleType value) {
        this.fareRuleType = value;
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
