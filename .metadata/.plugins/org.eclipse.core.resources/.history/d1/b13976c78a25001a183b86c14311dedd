
package com.travelport.schema.air_v45_0;

import java.math.BigInteger;
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
import com.travelport.schema.common_v45_0.CabinClass;


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
 *         &lt;element name="TripType" type="{http://www.travelport.com/schema/air_v45_0}typeFareTripType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CabinClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PenaltyFareInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}integer" default="200" /&gt;
 *       &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="TicketingDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="BaseFareOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="UnrestrictedFaresOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="FaresIndicator" type="{http://www.travelport.com/schema/air_v45_0}typeFaresIndicator" /&gt;
 *       &lt;attribute name="CurrencyType" type="{http://www.travelport.com/schema/common_v45_0}typeCurrency" /&gt;
 *       &lt;attribute name="IncludeTaxes" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IncludeEstimatedTaxes" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IncludeSurcharges" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GlobalIndicator" type="{http://www.travelport.com/schema/air_v45_0}typeATPCOGlobalIndicator" /&gt;
 *       &lt;attribute name="ProhibitMinStayFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ProhibitMaxStayFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ProhibitAdvancePurchaseFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ProhibitNonRefundableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ValidatedFaresOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ProhibitTravelRestrictedFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="FiledCurrency" type="{http://www.travelport.com/schema/common_v45_0}typeCurrency" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tripType",
    "cabinClass",
    "penaltyFareInformation"
})
@XmlRootElement(name = "AirFareDisplayModifiers")
public class AirFareDisplayModifiers {

    @XmlElement(name = "TripType")
    @XmlSchemaType(name = "string")
    protected List<TypeFareTripType> tripType;
    @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected CabinClass cabinClass;
    @XmlElement(name = "PenaltyFareInformation")
    protected PenaltyFareInformation penaltyFareInformation;
    @XmlAttribute(name = "MaxResponses")
    protected BigInteger maxResponses;
    @XmlAttribute(name = "DepartureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlAttribute(name = "TicketingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ticketingDate;
    @XmlAttribute(name = "ReturnDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar returnDate;
    @XmlAttribute(name = "BaseFareOnly")
    protected Boolean baseFareOnly;
    @XmlAttribute(name = "UnrestrictedFaresOnly")
    protected Boolean unrestrictedFaresOnly;
    @XmlAttribute(name = "FaresIndicator")
    protected TypeFaresIndicator faresIndicator;
    @XmlAttribute(name = "CurrencyType")
    protected String currencyType;
    @XmlAttribute(name = "IncludeTaxes")
    protected Boolean includeTaxes;
    @XmlAttribute(name = "IncludeEstimatedTaxes")
    protected Boolean includeEstimatedTaxes;
    @XmlAttribute(name = "IncludeSurcharges")
    protected Boolean includeSurcharges;
    @XmlAttribute(name = "GlobalIndicator")
    protected TypeATPCOGlobalIndicator globalIndicator;
    @XmlAttribute(name = "ProhibitMinStayFares")
    protected Boolean prohibitMinStayFares;
    @XmlAttribute(name = "ProhibitMaxStayFares")
    protected Boolean prohibitMaxStayFares;
    @XmlAttribute(name = "ProhibitAdvancePurchaseFares")
    protected Boolean prohibitAdvancePurchaseFares;
    @XmlAttribute(name = "ProhibitNonRefundableFares")
    protected Boolean prohibitNonRefundableFares;
    @XmlAttribute(name = "ValidatedFaresOnly")
    protected Boolean validatedFaresOnly;
    @XmlAttribute(name = "ProhibitTravelRestrictedFares")
    protected Boolean prohibitTravelRestrictedFares;
    @XmlAttribute(name = "FiledCurrency")
    protected String filedCurrency;

    /**
     * Gets the value of the tripType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFareTripType }
     * 
     * 
     */
    public List<TypeFareTripType> getTripType() {
        if (tripType == null) {
            tripType = new ArrayList<TypeFareTripType>();
        }
        return this.tripType;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     */
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

    /**
     * Request Fares with specific Penalty
     *                             Information.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyFareInformation }
     *     
     */
    public PenaltyFareInformation getPenaltyFareInformation() {
        return penaltyFareInformation;
    }

    /**
     * Sets the value of the penaltyFareInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyFareInformation }
     *     
     */
    public void setPenaltyFareInformation(PenaltyFareInformation value) {
        this.penaltyFareInformation = value;
    }

    /**
     * Gets the value of the maxResponses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxResponses() {
        if (maxResponses == null) {
            return new BigInteger("200");
        } else {
            return maxResponses;
        }
    }

    /**
     * Sets the value of the maxResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxResponses(BigInteger value) {
        this.maxResponses = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the ticketingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketingDate() {
        return ticketingDate;
    }

    /**
     * Sets the value of the ticketingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketingDate(XMLGregorianCalendar value) {
        this.ticketingDate = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the baseFareOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBaseFareOnly() {
        if (baseFareOnly == null) {
            return false;
        } else {
            return baseFareOnly;
        }
    }

    /**
     * Sets the value of the baseFareOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaseFareOnly(Boolean value) {
        this.baseFareOnly = value;
    }

    /**
     * Gets the value of the unrestrictedFaresOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnrestrictedFaresOnly() {
        if (unrestrictedFaresOnly == null) {
            return false;
        } else {
            return unrestrictedFaresOnly;
        }
    }

    /**
     * Sets the value of the unrestrictedFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnrestrictedFaresOnly(Boolean value) {
        this.unrestrictedFaresOnly = value;
    }

    /**
     * Gets the value of the faresIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFaresIndicator }
     *     
     */
    public TypeFaresIndicator getFaresIndicator() {
        return faresIndicator;
    }

    /**
     * Sets the value of the faresIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFaresIndicator }
     *     
     */
    public void setFaresIndicator(TypeFaresIndicator value) {
        this.faresIndicator = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the includeTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTaxes() {
        return includeTaxes;
    }

    /**
     * Sets the value of the includeTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTaxes(Boolean value) {
        this.includeTaxes = value;
    }

    /**
     * Gets the value of the includeEstimatedTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeEstimatedTaxes() {
        return includeEstimatedTaxes;
    }

    /**
     * Sets the value of the includeEstimatedTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEstimatedTaxes(Boolean value) {
        this.includeEstimatedTaxes = value;
    }

    /**
     * Gets the value of the includeSurcharges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSurcharges() {
        return includeSurcharges;
    }

    /**
     * Sets the value of the includeSurcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSurcharges(Boolean value) {
        this.includeSurcharges = value;
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
     * Gets the value of the prohibitMinStayFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitMinStayFares() {
        if (prohibitMinStayFares == null) {
            return false;
        } else {
            return prohibitMinStayFares;
        }
    }

    /**
     * Sets the value of the prohibitMinStayFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitMinStayFares(Boolean value) {
        this.prohibitMinStayFares = value;
    }

    /**
     * Gets the value of the prohibitMaxStayFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitMaxStayFares() {
        if (prohibitMaxStayFares == null) {
            return false;
        } else {
            return prohibitMaxStayFares;
        }
    }

    /**
     * Sets the value of the prohibitMaxStayFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitMaxStayFares(Boolean value) {
        this.prohibitMaxStayFares = value;
    }

    /**
     * Gets the value of the prohibitAdvancePurchaseFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitAdvancePurchaseFares() {
        if (prohibitAdvancePurchaseFares == null) {
            return false;
        } else {
            return prohibitAdvancePurchaseFares;
        }
    }

    /**
     * Sets the value of the prohibitAdvancePurchaseFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitAdvancePurchaseFares(Boolean value) {
        this.prohibitAdvancePurchaseFares = value;
    }

    /**
     * Gets the value of the prohibitNonRefundableFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitNonRefundableFares() {
        if (prohibitNonRefundableFares == null) {
            return false;
        } else {
            return prohibitNonRefundableFares;
        }
    }

    /**
     * Sets the value of the prohibitNonRefundableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitNonRefundableFares(Boolean value) {
        this.prohibitNonRefundableFares = value;
    }

    /**
     * Gets the value of the validatedFaresOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidatedFaresOnly() {
        return validatedFaresOnly;
    }

    /**
     * Sets the value of the validatedFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidatedFaresOnly(Boolean value) {
        this.validatedFaresOnly = value;
    }

    /**
     * Gets the value of the prohibitTravelRestrictedFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitTravelRestrictedFares() {
        if (prohibitTravelRestrictedFares == null) {
            return true;
        } else {
            return prohibitTravelRestrictedFares;
        }
    }

    /**
     * Sets the value of the prohibitTravelRestrictedFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitTravelRestrictedFares(Boolean value) {
        this.prohibitTravelRestrictedFares = value;
    }

    /**
     * Gets the value of the filedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledCurrency() {
        return filedCurrency;
    }

    /**
     * Sets the value of the filedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledCurrency(String value) {
        this.filedCurrency = value;
    }

}
