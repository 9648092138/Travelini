
package com.travelport.schema.air_v45_0;

import java.math.BigDecimal;
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
import com.travelport.schema.common_v45_0.TypeFormOfRefund;
import com.travelport.schema.common_v45_0.TypeItineraryCode;
import com.travelport.schema.common_v45_0.TypePricingType;


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
 *         &lt;element name="AdvisoryMessage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="WaiverText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LowFarePricing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="LowFareFound" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="PenaltyApplies" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="DiscountApplies" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ItineraryType" type="{http://www.travelport.com/schema/common_v45_0}typeItineraryCode" /&gt;
 *       &lt;attribute name="ValidatingVendorCode" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
 *       &lt;attribute name="ForTicketingOnDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="LastDateToTicket" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="FormOfRefund" type="{http://www.travelport.com/schema/common_v45_0}typeFormOfRefund" /&gt;
 *       &lt;attribute name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BankersSellingRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="PricingType" type="{http://www.travelport.com/schema/common_v45_0}typePricingType" /&gt;
 *       &lt;attribute name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="RateOfExchange" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="OriginalTicketCurrency" type="{http://www.travelport.com/schema/common_v45_0}typeCurrency" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "advisoryMessage",
    "endorsementText",
    "waiverText"
})
@XmlRootElement(name = "PricingDetails")
public class PricingDetails {

    @XmlElement(name = "AdvisoryMessage")
    protected List<String> advisoryMessage;
    @XmlElement(name = "EndorsementText")
    protected List<String> endorsementText;
    @XmlElement(name = "WaiverText")
    protected String waiverText;
    @XmlAttribute(name = "LowFarePricing")
    protected Boolean lowFarePricing;
    @XmlAttribute(name = "LowFareFound")
    protected Boolean lowFareFound;
    @XmlAttribute(name = "PenaltyApplies")
    protected Boolean penaltyApplies;
    @XmlAttribute(name = "DiscountApplies")
    protected Boolean discountApplies;
    @XmlAttribute(name = "ItineraryType")
    protected TypeItineraryCode itineraryType;
    @XmlAttribute(name = "ValidatingVendorCode")
    protected String validatingVendorCode;
    @XmlAttribute(name = "ForTicketingOnDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar forTicketingOnDate;
    @XmlAttribute(name = "LastDateToTicket")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateToTicket;
    @XmlAttribute(name = "FormOfRefund")
    protected TypeFormOfRefund formOfRefund;
    @XmlAttribute(name = "AccountCode")
    protected String accountCode;
    @XmlAttribute(name = "BankersSellingRate")
    protected BigDecimal bankersSellingRate;
    @XmlAttribute(name = "PricingType")
    protected TypePricingType pricingType;
    @XmlAttribute(name = "ConversionRate")
    protected BigDecimal conversionRate;
    @XmlAttribute(name = "RateOfExchange")
    protected BigDecimal rateOfExchange;
    @XmlAttribute(name = "OriginalTicketCurrency")
    protected String originalTicketCurrency;

    /**
     * Gets the value of the advisoryMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advisoryMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvisoryMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdvisoryMessage() {
        if (advisoryMessage == null) {
            advisoryMessage = new ArrayList<String>();
        }
        return this.advisoryMessage;
    }

    /**
     * Gets the value of the endorsementText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEndorsementText() {
        if (endorsementText == null) {
            endorsementText = new ArrayList<String>();
        }
        return this.endorsementText;
    }

    /**
     * Gets the value of the waiverText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverText() {
        return waiverText;
    }

    /**
     * Sets the value of the waiverText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverText(String value) {
        this.waiverText = value;
    }

    /**
     * Gets the value of the lowFarePricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLowFarePricing() {
        if (lowFarePricing == null) {
            return false;
        } else {
            return lowFarePricing;
        }
    }

    /**
     * Sets the value of the lowFarePricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowFarePricing(Boolean value) {
        this.lowFarePricing = value;
    }

    /**
     * Gets the value of the lowFareFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLowFareFound() {
        if (lowFareFound == null) {
            return false;
        } else {
            return lowFareFound;
        }
    }

    /**
     * Sets the value of the lowFareFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowFareFound(Boolean value) {
        this.lowFareFound = value;
    }

    /**
     * Gets the value of the penaltyApplies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPenaltyApplies() {
        if (penaltyApplies == null) {
            return false;
        } else {
            return penaltyApplies;
        }
    }

    /**
     * Sets the value of the penaltyApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPenaltyApplies(Boolean value) {
        this.penaltyApplies = value;
    }

    /**
     * Gets the value of the discountApplies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDiscountApplies() {
        if (discountApplies == null) {
            return false;
        } else {
            return discountApplies;
        }
    }

    /**
     * Sets the value of the discountApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountApplies(Boolean value) {
        this.discountApplies = value;
    }

    /**
     * Gets the value of the itineraryType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeItineraryCode }
     *     
     */
    public TypeItineraryCode getItineraryType() {
        return itineraryType;
    }

    /**
     * Sets the value of the itineraryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeItineraryCode }
     *     
     */
    public void setItineraryType(TypeItineraryCode value) {
        this.itineraryType = value;
    }

    /**
     * Gets the value of the validatingVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingVendorCode() {
        return validatingVendorCode;
    }

    /**
     * Sets the value of the validatingVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingVendorCode(String value) {
        this.validatingVendorCode = value;
    }

    /**
     * Gets the value of the forTicketingOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForTicketingOnDate() {
        return forTicketingOnDate;
    }

    /**
     * Sets the value of the forTicketingOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForTicketingOnDate(XMLGregorianCalendar value) {
        this.forTicketingOnDate = value;
    }

    /**
     * Gets the value of the lastDateToTicket property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDateToTicket() {
        return lastDateToTicket;
    }

    /**
     * Sets the value of the lastDateToTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDateToTicket(XMLGregorianCalendar value) {
        this.lastDateToTicket = value;
    }

    /**
     * Gets the value of the formOfRefund property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFormOfRefund }
     *     
     */
    public TypeFormOfRefund getFormOfRefund() {
        return formOfRefund;
    }

    /**
     * Sets the value of the formOfRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFormOfRefund }
     *     
     */
    public void setFormOfRefund(TypeFormOfRefund value) {
        this.formOfRefund = value;
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
     * Gets the value of the bankersSellingRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBankersSellingRate() {
        return bankersSellingRate;
    }

    /**
     * Sets the value of the bankersSellingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBankersSellingRate(BigDecimal value) {
        this.bankersSellingRate = value;
    }

    /**
     * Gets the value of the pricingType property.
     * 
     * @return
     *     possible object is
     *     {@link TypePricingType }
     *     
     */
    public TypePricingType getPricingType() {
        return pricingType;
    }

    /**
     * Sets the value of the pricingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePricingType }
     *     
     */
    public void setPricingType(TypePricingType value) {
        this.pricingType = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the rateOfExchange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateOfExchange() {
        return rateOfExchange;
    }

    /**
     * Sets the value of the rateOfExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateOfExchange(BigDecimal value) {
        this.rateOfExchange = value;
    }

    /**
     * Gets the value of the originalTicketCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTicketCurrency() {
        return originalTicketCurrency;
    }

    /**
     * Sets the value of the originalTicketCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTicketCurrency(String value) {
        this.originalTicketCurrency = value;
    }

}
