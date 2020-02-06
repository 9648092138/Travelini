
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
import com.travelport.schema.common_v45_0.AccountCode;
import com.travelport.schema.common_v45_0.Commission;
import com.travelport.schema.common_v45_0.Endorsement;
import com.travelport.schema.common_v45_0.TypeElementStatus;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareTicketDesignator" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareSurcharge" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}AccountCode" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ContractCode" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Endorsement" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BaggageAllowance" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareRuleKey" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareRuleFailureInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareRemarkRef" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Brand" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Commission" minOccurs="0"/&gt;
 *         &lt;element name="FareAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangePenalty" type="{http://www.travelport.com/schema/air_v45_0}typeFarePenalty" minOccurs="0"/&gt;
 *         &lt;element name="CancelPenalty" type="{http://www.travelport.com/schema/air_v45_0}typeFarePenalty" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareRulesFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="FareBasis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PassengerTypeCode" use="required" type="{http://www.travelport.com/schema/common_v45_0}typePTC" /&gt;
 *       &lt;attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="EffectiveDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TravelDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="Amount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="PrivateFare" type="{http://www.travelport.com/schema/air_v45_0}typePrivateFare" /&gt;
 *       &lt;attribute name="NegotiatedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TourCode" type="{http://www.travelport.com/schema/air_v45_0}typeTourCode" /&gt;
 *       &lt;attribute name="WaiverCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NotValidBefore" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="NotValidAfter" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v45_0}typePCC" /&gt;
 *       &lt;attribute name="FareFamily" type="{http://www.travelport.com/schema/common_v45_0}typeFareFamily" /&gt;
 *       &lt;attribute name="PromotionalFare" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CarCode" type="{http://www.travelport.com/schema/air_v45_0}typeCarCode" /&gt;
 *       &lt;attribute name="ValueCode" type="{http://www.travelport.com/schema/air_v45_0}typeValueCode" /&gt;
 *       &lt;attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InclusiveTour" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SupplierCode" type="{http://www.travelport.com/schema/common_v45_0}typeSupplierCode" /&gt;
 *       &lt;attribute name="TaxAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareTicketDesignator",
    "fareSurcharge",
    "accountCode",
    "contractCode",
    "endorsement",
    "baggageAllowance",
    "fareRuleKey",
    "fareRuleFailureInfo",
    "fareRemarkRef",
    "brand",
    "commission",
    "fareAttributes",
    "changePenalty",
    "cancelPenalty",
    "fareRulesFilter"
})
@XmlRootElement(name = "FareInfo")
public class FareInfo {

    @XmlElement(name = "FareTicketDesignator")
    protected List<FareTicketDesignator> fareTicketDesignator;
    @XmlElement(name = "FareSurcharge")
    protected List<FareSurcharge> fareSurcharge;
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<AccountCode> accountCode;
    @XmlElement(name = "ContractCode")
    protected List<ContractCode> contractCode;
    @XmlElement(name = "Endorsement", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<Endorsement> endorsement;
    @XmlElement(name = "BaggageAllowance")
    protected BaggageAllowance baggageAllowance;
    @XmlElement(name = "FareRuleKey")
    protected FareRuleKey fareRuleKey;
    @XmlElement(name = "FareRuleFailureInfo")
    protected FareRuleFailureInfo fareRuleFailureInfo;
    @XmlElement(name = "FareRemarkRef")
    protected List<FareRemarkRef> fareRemarkRef;
    @XmlElement(name = "Brand")
    protected Brand brand;
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected Commission commission;
    @XmlElement(name = "FareAttributes")
    protected String fareAttributes;
    @XmlElement(name = "ChangePenalty")
    protected TypeFarePenalty changePenalty;
    @XmlElement(name = "CancelPenalty")
    protected TypeFarePenalty cancelPenalty;
    @XmlElement(name = "FareRulesFilter")
    protected FareRulesFilter fareRulesFilter;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "FareBasis", required = true)
    protected String fareBasis;
    @XmlAttribute(name = "PassengerTypeCode", required = true)
    protected String passengerTypeCode;
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    @XmlAttribute(name = "EffectiveDate", required = true)
    protected String effectiveDate;
    @XmlAttribute(name = "TravelDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDate;
    @XmlAttribute(name = "DepartureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlAttribute(name = "Amount")
    protected String amount;
    @XmlAttribute(name = "PrivateFare")
    protected TypePrivateFare privateFare;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    @XmlAttribute(name = "WaiverCode")
    protected String waiverCode;
    @XmlAttribute(name = "NotValidBefore")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidBefore;
    @XmlAttribute(name = "NotValidAfter")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidAfter;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "FareFamily")
    protected String fareFamily;
    @XmlAttribute(name = "PromotionalFare")
    protected Boolean promotionalFare;
    @XmlAttribute(name = "CarCode")
    protected String carCode;
    @XmlAttribute(name = "ValueCode")
    protected String valueCode;
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;
    @XmlAttribute(name = "InclusiveTour")
    protected Boolean inclusiveTour;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "TaxAmount")
    protected String taxAmount;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Gets the value of the fareTicketDesignator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareTicketDesignator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareTicketDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareTicketDesignator }
     * 
     * 
     */
    public List<FareTicketDesignator> getFareTicketDesignator() {
        if (fareTicketDesignator == null) {
            fareTicketDesignator = new ArrayList<FareTicketDesignator>();
        }
        return this.fareTicketDesignator;
    }

    /**
     * Gets the value of the fareSurcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareSurcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSurcharge }
     * 
     * 
     */
    public List<FareSurcharge> getFareSurcharge() {
        if (fareSurcharge == null) {
            fareSurcharge = new ArrayList<FareSurcharge>();
        }
        return this.fareSurcharge;
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
     * Gets the value of the contractCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractCode }
     * 
     * 
     */
    public List<ContractCode> getContractCode() {
        if (contractCode == null) {
            contractCode = new ArrayList<ContractCode>();
        }
        return this.contractCode;
    }

    /**
     * Gets the value of the endorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Endorsement }
     * 
     * 
     */
    public List<Endorsement> getEndorsement() {
        if (endorsement == null) {
            endorsement = new ArrayList<Endorsement>();
        }
        return this.endorsement;
    }

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowance }
     *     
     */
    public BaggageAllowance getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowance }
     *     
     */
    public void setBaggageAllowance(BaggageAllowance value) {
        this.baggageAllowance = value;
    }

    /**
     * Gets the value of the fareRuleKey property.
     * 
     * @return
     *     possible object is
     *     {@link FareRuleKey }
     *     
     */
    public FareRuleKey getFareRuleKey() {
        return fareRuleKey;
    }

    /**
     * Sets the value of the fareRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRuleKey }
     *     
     */
    public void setFareRuleKey(FareRuleKey value) {
        this.fareRuleKey = value;
    }

    /**
     * Gets the value of the fareRuleFailureInfo property.
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
     * Gets the value of the fareRemarkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRemarkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRemarkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRemarkRef }
     * 
     * 
     */
    public List<FareRemarkRef> getFareRemarkRef() {
        if (fareRemarkRef == null) {
            fareRemarkRef = new ArrayList<FareRemarkRef>();
        }
        return this.fareRemarkRef;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link Brand }
     *     
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Brand }
     *     
     */
    public void setBrand(Brand value) {
        this.brand = value;
    }

    /**
     * Specifies the Commission for Agency for a particular Fare component. Apllicable Providers are 1G and 1V.
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     */
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the fareAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareAttributes() {
        return fareAttributes;
    }

    /**
     * Sets the value of the fareAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareAttributes(String value) {
        this.fareAttributes = value;
    }

    /**
     * Gets the value of the changePenalty property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFarePenalty }
     *     
     */
    public TypeFarePenalty getChangePenalty() {
        return changePenalty;
    }

    /**
     * Sets the value of the changePenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFarePenalty }
     *     
     */
    public void setChangePenalty(TypeFarePenalty value) {
        this.changePenalty = value;
    }

    /**
     * Gets the value of the cancelPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFarePenalty }
     *     
     */
    public TypeFarePenalty getCancelPenalty() {
        return cancelPenalty;
    }

    /**
     * Sets the value of the cancelPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFarePenalty }
     *     
     */
    public void setCancelPenalty(TypeFarePenalty value) {
        this.cancelPenalty = value;
    }

    /**
     * Gets the value of the fareRulesFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesFilter }
     *     
     */
    public FareRulesFilter getFareRulesFilter() {
        return fareRulesFilter;
    }

    /**
     * Sets the value of the fareRulesFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesFilter }
     *     
     */
    public void setFareRulesFilter(FareRulesFilter value) {
        this.fareRulesFilter = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the travelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDate(XMLGregorianCalendar value) {
        this.travelDate = value;
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
     * Gets the value of the privateFare property.
     * 
     * @return
     *     possible object is
     *     {@link TypePrivateFare }
     *     
     */
    public TypePrivateFare getPrivateFare() {
        return privateFare;
    }

    /**
     * Sets the value of the privateFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePrivateFare }
     *     
     */
    public void setPrivateFare(TypePrivateFare value) {
        this.privateFare = value;
    }

    /**
     * Gets the value of the negotiatedFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiatedFare() {
        return negotiatedFare;
    }

    /**
     * Sets the value of the negotiatedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the waiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverCode(String value) {
        this.waiverCode = value;
    }

    /**
     * Gets the value of the notValidBefore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotValidBefore(XMLGregorianCalendar value) {
        this.notValidBefore = value;
    }

    /**
     * Gets the value of the notValidAfter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotValidAfter(XMLGregorianCalendar value) {
        this.notValidAfter = value;
    }

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the fareFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareFamily() {
        return fareFamily;
    }

    /**
     * Sets the value of the fareFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareFamily(String value) {
        this.fareFamily = value;
    }

    /**
     * Gets the value of the promotionalFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotionalFare() {
        return promotionalFare;
    }

    /**
     * Sets the value of the promotionalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotionalFare(Boolean value) {
        this.promotionalFare = value;
    }

    /**
     * Gets the value of the carCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarCode() {
        return carCode;
    }

    /**
     * Sets the value of the carCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarCode(String value) {
        this.carCode = value;
    }

    /**
     * Gets the value of the valueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueCode() {
        return valueCode;
    }

    /**
     * Sets the value of the valueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueCode(String value) {
        this.valueCode = value;
    }

    /**
     * Gets the value of the bulkTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkTicket() {
        return bulkTicket;
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
     * Gets the value of the inclusiveTour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveTour() {
        return inclusiveTour;
    }

    /**
     * Sets the value of the inclusiveTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusiveTour(Boolean value) {
        this.inclusiveTour = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

}
