
package com.travelport.schema.hotel_v45_0;

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
import com.travelport.schema.common_v45_0.CorporateDiscountID;
import com.travelport.schema.common_v45_0.TypePolicyCodesList;
import com.travelport.schema.common_v45_0.TypeTrinary;


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
 *         &lt;element name="PolicyCodesList" type="{http://www.travelport.com/schema/common_v45_0}typePolicyCodesList" minOccurs="0"/&gt;
 *         &lt;element name="RoomRateDescription" type="{http://www.travelport.com/schema/hotel_v45_0}typeHotelRateDescription" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelRateByDate" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CorporateDiscountID" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}AcceptedPayment" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}Commission" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}RateMatchIndicator" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}TaxDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}CancelInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}GuaranteeInfo" minOccurs="0"/&gt;
 *         &lt;element name="SupplementalRateInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomCapacity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="99" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="IsPackage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExtraCharges" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ExtraAdultAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *                 &lt;attribute name="ExtraChildAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *                 &lt;attribute name="CribAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *                 &lt;attribute name="AdultRollawayCharge" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *                 &lt;attribute name="ChildRollawayCharge" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Inclusions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BedTypes" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
 *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MealPlans" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MealPlan" maxOccurs="99" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Breakfast" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
 *                           &lt;attribute name="Lunch" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
 *                           &lt;attribute name="Dinner" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}RoomView" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="SmokingRoomIndicator" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/hotel_v45_0}attrHotelRate"/&gt;
 *       &lt;attribute name="RatePlanType" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeRatePlanType" /&gt;
 *       &lt;attribute name="ApproximateBase" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateTax" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateTotal" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateSurcharge" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="RateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ApproximateRateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateCategory" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="RateSupplier" type="{http://www.travelport.com/schema/common_v45_0}typeThirdPartySupplier" /&gt;
 *       &lt;attribute name="BookableQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="RateOfferId" type="{http://www.travelport.com/schema/hotel_v45_0}typeRateOfferId" /&gt;
 *       &lt;attribute name="InPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateChangeIndicator" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
 *       &lt;attribute name="ExtraFeesIncluded" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyCodesList",
    "roomRateDescription",
    "hotelRateByDate",
    "corporateDiscountID",
    "acceptedPayment",
    "commission",
    "rateMatchIndicator",
    "taxDetails",
    "cancelInfo",
    "guaranteeInfo",
    "supplementalRateInfo",
    "roomCapacity",
    "extraCharges",
    "inclusions"
})
@XmlRootElement(name = "HotelRateDetail")
public class HotelRateDetail {

    @XmlElement(name = "PolicyCodesList")
    protected TypePolicyCodesList policyCodesList;
    @XmlElement(name = "RoomRateDescription")
    protected List<TypeHotelRateDescription> roomRateDescription;
    @XmlElement(name = "HotelRateByDate")
    protected List<HotelRateByDate> hotelRateByDate;
    @XmlElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<CorporateDiscountID> corporateDiscountID;
    @XmlElement(name = "AcceptedPayment")
    protected List<AcceptedPayment> acceptedPayment;
    @XmlElement(name = "Commission")
    protected Commission commission;
    @XmlElement(name = "RateMatchIndicator")
    protected List<RateMatchIndicator> rateMatchIndicator;
    @XmlElement(name = "TaxDetails")
    protected TaxDetails taxDetails;
    @XmlElement(name = "CancelInfo")
    protected CancelInfo cancelInfo;
    @XmlElement(name = "GuaranteeInfo")
    protected GuaranteeInfo guaranteeInfo;
    @XmlElement(name = "SupplementalRateInfo")
    protected String supplementalRateInfo;
    @XmlElement(name = "RoomCapacity")
    protected HotelRateDetail.RoomCapacity roomCapacity;
    @XmlElement(name = "ExtraCharges")
    protected HotelRateDetail.ExtraCharges extraCharges;
    @XmlElement(name = "Inclusions")
    protected HotelRateDetail.Inclusions inclusions;
    @XmlAttribute(name = "RatePlanType", required = true)
    protected String ratePlanType;
    @XmlAttribute(name = "ApproximateBase")
    protected String approximateBase;
    @XmlAttribute(name = "ApproximateTax")
    protected String approximateTax;
    @XmlAttribute(name = "ApproximateTotal")
    protected String approximateTotal;
    @XmlAttribute(name = "ApproximateSurcharge")
    protected String approximateSurcharge;
    @XmlAttribute(name = "RateGuaranteed")
    protected Boolean rateGuaranteed;
    @XmlAttribute(name = "ApproximateRateGuaranteed")
    protected Boolean approximateRateGuaranteed;
    @XmlAttribute(name = "RateCategory")
    protected BigInteger rateCategory;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "RateSupplier")
    protected String rateSupplier;
    @XmlAttribute(name = "BookableQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bookableQuantity;
    @XmlAttribute(name = "RateOfferId")
    protected String rateOfferId;
    @XmlAttribute(name = "InPolicy")
    protected Boolean inPolicy;
    @XmlAttribute(name = "RateChangeIndicator")
    protected TypeTrinary rateChangeIndicator;
    @XmlAttribute(name = "ExtraFeesIncluded")
    protected TypeTrinary extraFeesIncluded;
    @XmlAttribute(name = "Base")
    protected String base;
    @XmlAttribute(name = "Tax")
    protected String tax;
    @XmlAttribute(name = "Total")
    protected String total;
    @XmlAttribute(name = "Surcharge")
    protected String surcharge;

    /**
     * Gets the value of the policyCodesList property.
     * 
     * @return
     *     possible object is
     *     {@link TypePolicyCodesList }
     *     
     */
    public TypePolicyCodesList getPolicyCodesList() {
        return policyCodesList;
    }

    /**
     * Sets the value of the policyCodesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePolicyCodesList }
     *     
     */
    public void setPolicyCodesList(TypePolicyCodesList value) {
        this.policyCodesList = value;
    }

    /**
     * Gets the value of the roomRateDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomRateDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomRateDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeHotelRateDescription }
     * 
     * 
     */
    public List<TypeHotelRateDescription> getRoomRateDescription() {
        if (roomRateDescription == null) {
            roomRateDescription = new ArrayList<TypeHotelRateDescription>();
        }
        return this.roomRateDescription;
    }

    /**
     * Gets the value of the hotelRateByDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRateByDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRateByDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRateByDate }
     * 
     * 
     */
    public List<HotelRateByDate> getHotelRateByDate() {
        if (hotelRateByDate == null) {
            hotelRateByDate = new ArrayList<HotelRateByDate>();
        }
        return this.hotelRateByDate;
    }

    /**
     * Corporate Discount IDs and Negotiate rate codes associated with this rate Gets the value of the corporateDiscountID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateDiscountID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateDiscountID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateDiscountID }
     * 
     * 
     */
    public List<CorporateDiscountID> getCorporateDiscountID() {
        if (corporateDiscountID == null) {
            corporateDiscountID = new ArrayList<CorporateDiscountID>();
        }
        return this.corporateDiscountID;
    }

    /**
     * Form of payment accepted by the hotel supplier (chain or property). For credit cards, the two-character code for the credit card type is used. Gets the value of the acceptedPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptedPayment }
     * 
     * 
     */
    public List<AcceptedPayment> getAcceptedPayment() {
        if (acceptedPayment == null) {
            acceptedPayment = new ArrayList<AcceptedPayment>();
        }
        return this.acceptedPayment;
    }

    /**
     * Commission associated with the Rate Plan, as a percentage or flat amount.
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
     * Returns "Match" Indicators for certain request parameters for Hotel Rate returned in response.Gets the value of the rateMatchIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateMatchIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateMatchIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateMatchIndicator }
     * 
     * 
     */
    public List<RateMatchIndicator> getRateMatchIndicator() {
        if (rateMatchIndicator == null) {
            rateMatchIndicator = new ArrayList<RateMatchIndicator>();
        }
        return this.rateMatchIndicator;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetails }
     *     
     */
    public TaxDetails getTaxDetails() {
        return taxDetails;
    }

    /**
     * Sets the value of the taxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetails }
     *     
     */
    public void setTaxDetails(TaxDetails value) {
        this.taxDetails = value;
    }

    /**
     * Gets the value of the cancelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CancelInfo }
     *     
     */
    public CancelInfo getCancelInfo() {
        return cancelInfo;
    }

    /**
     * Sets the value of the cancelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelInfo }
     *     
     */
    public void setCancelInfo(CancelInfo value) {
        this.cancelInfo = value;
    }

    /**
     * Guarantee, deposit, and prepayment information
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeInfo }
     *     
     */
    public GuaranteeInfo getGuaranteeInfo() {
        return guaranteeInfo;
    }

    /**
     * Sets the value of the guaranteeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeInfo }
     *     
     */
    public void setGuaranteeInfo(GuaranteeInfo value) {
        this.guaranteeInfo = value;
    }

    /**
     * Gets the value of the supplementalRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementalRateInfo() {
        return supplementalRateInfo;
    }

    /**
     * Sets the value of the supplementalRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementalRateInfo(String value) {
        this.supplementalRateInfo = value;
    }

    /**
     * Gets the value of the roomCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateDetail.RoomCapacity }
     *     
     */
    public HotelRateDetail.RoomCapacity getRoomCapacity() {
        return roomCapacity;
    }

    /**
     * Sets the value of the roomCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateDetail.RoomCapacity }
     *     
     */
    public void setRoomCapacity(HotelRateDetail.RoomCapacity value) {
        this.roomCapacity = value;
    }

    /**
     * Gets the value of the extraCharges property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateDetail.ExtraCharges }
     *     
     */
    public HotelRateDetail.ExtraCharges getExtraCharges() {
        return extraCharges;
    }

    /**
     * Sets the value of the extraCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateDetail.ExtraCharges }
     *     
     */
    public void setExtraCharges(HotelRateDetail.ExtraCharges value) {
        this.extraCharges = value;
    }

    /**
     * Gets the value of the inclusions property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateDetail.Inclusions }
     *     
     */
    public HotelRateDetail.Inclusions getInclusions() {
        return inclusions;
    }

    /**
     * Sets the value of the inclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateDetail.Inclusions }
     *     
     */
    public void setInclusions(HotelRateDetail.Inclusions value) {
        this.inclusions = value;
    }

    /**
     * Gets the value of the ratePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * Sets the value of the ratePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * Gets the value of the approximateBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateBase() {
        return approximateBase;
    }

    /**
     * Sets the value of the approximateBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateBase(String value) {
        this.approximateBase = value;
    }

    /**
     * Gets the value of the approximateTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTax() {
        return approximateTax;
    }

    /**
     * Sets the value of the approximateTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTax(String value) {
        this.approximateTax = value;
    }

    /**
     * Gets the value of the approximateTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotal() {
        return approximateTotal;
    }

    /**
     * Sets the value of the approximateTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTotal(String value) {
        this.approximateTotal = value;
    }

    /**
     * Gets the value of the approximateSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateSurcharge() {
        return approximateSurcharge;
    }

    /**
     * Sets the value of the approximateSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateSurcharge(String value) {
        this.approximateSurcharge = value;
    }

    /**
     * Gets the value of the rateGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateGuaranteed() {
        return rateGuaranteed;
    }

    /**
     * Sets the value of the rateGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateGuaranteed(Boolean value) {
        this.rateGuaranteed = value;
    }

    /**
     * Gets the value of the approximateRateGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateRateGuaranteed() {
        return approximateRateGuaranteed;
    }

    /**
     * Sets the value of the approximateRateGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateRateGuaranteed(Boolean value) {
        this.approximateRateGuaranteed = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRateCategory(BigInteger value) {
        this.rateCategory = value;
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
     * Gets the value of the rateSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSupplier() {
        return rateSupplier;
    }

    /**
     * Sets the value of the rateSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSupplier(String value) {
        this.rateSupplier = value;
    }

    /**
     * Gets the value of the bookableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookableQuantity() {
        return bookableQuantity;
    }

    /**
     * Sets the value of the bookableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookableQuantity(BigInteger value) {
        this.bookableQuantity = value;
    }

    /**
     * Gets the value of the rateOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateOfferId() {
        return rateOfferId;
    }

    /**
     * Sets the value of the rateOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateOfferId(String value) {
        this.rateOfferId = value;
    }

    /**
     * Gets the value of the inPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPolicy() {
        return inPolicy;
    }

    /**
     * Sets the value of the inPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPolicy(Boolean value) {
        this.inPolicy = value;
    }

    /**
     * Gets the value of the rateChangeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    public TypeTrinary getRateChangeIndicator() {
        return rateChangeIndicator;
    }

    /**
     * Sets the value of the rateChangeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    public void setRateChangeIndicator(TypeTrinary value) {
        this.rateChangeIndicator = value;
    }

    /**
     * Gets the value of the extraFeesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    public TypeTrinary getExtraFeesIncluded() {
        return extraFeesIncluded;
    }

    /**
     * Sets the value of the extraFeesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    public void setExtraFeesIncluded(TypeTrinary value) {
        this.extraFeesIncluded = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax(String value) {
        this.tax = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurcharge(String value) {
        this.surcharge = value;
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
     *       &lt;attribute name="ExtraAdultAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *       &lt;attribute name="ExtraChildAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *       &lt;attribute name="CribAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *       &lt;attribute name="AdultRollawayCharge" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *       &lt;attribute name="ChildRollawayCharge" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExtraCharges {

        @XmlAttribute(name = "ExtraAdultAmount")
        protected String extraAdultAmount;
        @XmlAttribute(name = "ExtraChildAmount")
        protected String extraChildAmount;
        @XmlAttribute(name = "CribAmount")
        protected String cribAmount;
        @XmlAttribute(name = "AdultRollawayCharge")
        protected String adultRollawayCharge;
        @XmlAttribute(name = "ChildRollawayCharge")
        protected String childRollawayCharge;

        /**
         * Gets the value of the extraAdultAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtraAdultAmount() {
            return extraAdultAmount;
        }

        /**
         * Sets the value of the extraAdultAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtraAdultAmount(String value) {
            this.extraAdultAmount = value;
        }

        /**
         * Gets the value of the extraChildAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtraChildAmount() {
            return extraChildAmount;
        }

        /**
         * Sets the value of the extraChildAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtraChildAmount(String value) {
            this.extraChildAmount = value;
        }

        /**
         * Gets the value of the cribAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCribAmount() {
            return cribAmount;
        }

        /**
         * Sets the value of the cribAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCribAmount(String value) {
            this.cribAmount = value;
        }

        /**
         * Gets the value of the adultRollawayCharge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdultRollawayCharge() {
            return adultRollawayCharge;
        }

        /**
         * Sets the value of the adultRollawayCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdultRollawayCharge(String value) {
            this.adultRollawayCharge = value;
        }

        /**
         * Gets the value of the childRollawayCharge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChildRollawayCharge() {
            return childRollawayCharge;
        }

        /**
         * Sets the value of the childRollawayCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChildRollawayCharge(String value) {
            this.childRollawayCharge = value;
        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="BedTypes" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
     *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MealPlans" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MealPlan" maxOccurs="99" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Breakfast" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
     *                 &lt;attribute name="Lunch" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
     *                 &lt;attribute name="Dinner" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}RoomView" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="SmokingRoomIndicator" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bedTypes",
        "mealPlans",
        "roomView"
    })
    public static class Inclusions {

        @XmlElement(name = "BedTypes")
        protected List<HotelRateDetail.Inclusions.BedTypes> bedTypes;
        @XmlElement(name = "MealPlans")
        protected HotelRateDetail.Inclusions.MealPlans mealPlans;
        @XmlElement(name = "RoomView")
        protected RoomView roomView;
        @XmlAttribute(name = "SmokingRoomIndicator")
        protected TypeTrinary smokingRoomIndicator;

        /**
         * Gets the value of the bedTypes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bedTypes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBedTypes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRateDetail.Inclusions.BedTypes }
         * 
         * 
         */
        public List<HotelRateDetail.Inclusions.BedTypes> getBedTypes() {
            if (bedTypes == null) {
                bedTypes = new ArrayList<HotelRateDetail.Inclusions.BedTypes>();
            }
            return this.bedTypes;
        }

        /**
         * Gets the value of the mealPlans property.
         * 
         * @return
         *     possible object is
         *     {@link HotelRateDetail.Inclusions.MealPlans }
         *     
         */
        public HotelRateDetail.Inclusions.MealPlans getMealPlans() {
            return mealPlans;
        }

        /**
         * Sets the value of the mealPlans property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRateDetail.Inclusions.MealPlans }
         *     
         */
        public void setMealPlans(HotelRateDetail.Inclusions.MealPlans value) {
            this.mealPlans = value;
        }

        /**
         * The view from the hotel room. 
         * 
         * @return
         *     possible object is
         *     {@link RoomView }
         *     
         */
        public RoomView getRoomView() {
            return roomView;
        }

        /**
         * Sets the value of the roomView property.
         * 
         * @param value
         *     allowed object is
         *     {@link RoomView }
         *     
         */
        public void setRoomView(RoomView value) {
            this.roomView = value;
        }

        /**
         * Gets the value of the smokingRoomIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link TypeTrinary }
         *     
         */
        public TypeTrinary getSmokingRoomIndicator() {
            return smokingRoomIndicator;
        }

        /**
         * Sets the value of the smokingRoomIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeTrinary }
         *     
         */
        public void setSmokingRoomIndicator(TypeTrinary value) {
            this.smokingRoomIndicator = value;
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
         *       &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BedTypes {

            @XmlAttribute(name = "Code")
            protected BigInteger code;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCode(BigInteger value) {
                this.code = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

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
         *       &lt;sequence&gt;
         *         &lt;element name="MealPlan" maxOccurs="99" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Breakfast" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
         *       &lt;attribute name="Lunch" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
         *       &lt;attribute name="Dinner" type="{http://www.travelport.com/schema/common_v45_0}typeTrinary" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mealPlan"
        })
        public static class MealPlans {

            @XmlElement(name = "MealPlan")
            protected List<HotelRateDetail.Inclusions.MealPlans.MealPlan> mealPlan;
            @XmlAttribute(name = "Breakfast")
            protected TypeTrinary breakfast;
            @XmlAttribute(name = "Lunch")
            protected TypeTrinary lunch;
            @XmlAttribute(name = "Dinner")
            protected TypeTrinary dinner;

            /**
             * Gets the value of the mealPlan property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mealPlan property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMealPlan().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HotelRateDetail.Inclusions.MealPlans.MealPlan }
             * 
             * 
             */
            public List<HotelRateDetail.Inclusions.MealPlans.MealPlan> getMealPlan() {
                if (mealPlan == null) {
                    mealPlan = new ArrayList<HotelRateDetail.Inclusions.MealPlans.MealPlan>();
                }
                return this.mealPlan;
            }

            /**
             * Gets the value of the breakfast property.
             * 
             * @return
             *     possible object is
             *     {@link TypeTrinary }
             *     
             */
            public TypeTrinary getBreakfast() {
                return breakfast;
            }

            /**
             * Sets the value of the breakfast property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeTrinary }
             *     
             */
            public void setBreakfast(TypeTrinary value) {
                this.breakfast = value;
            }

            /**
             * Gets the value of the lunch property.
             * 
             * @return
             *     possible object is
             *     {@link TypeTrinary }
             *     
             */
            public TypeTrinary getLunch() {
                return lunch;
            }

            /**
             * Sets the value of the lunch property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeTrinary }
             *     
             */
            public void setLunch(TypeTrinary value) {
                this.lunch = value;
            }

            /**
             * Gets the value of the dinner property.
             * 
             * @return
             *     possible object is
             *     {@link TypeTrinary }
             *     
             */
            public TypeTrinary getDinner() {
                return dinner;
            }

            /**
             * Sets the value of the dinner property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeTrinary }
             *     
             */
            public void setDinner(TypeTrinary value) {
                this.dinner = value;
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
             *       &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MealPlan {

                @XmlAttribute(name = "Code")
                protected BigInteger code;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCode(BigInteger value) {
                    this.code = value;
                }

            }

        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="99" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="IsPackage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "capacity"
    })
    public static class RoomCapacity {

        @XmlElement(name = "Capacity")
        @XmlSchemaType(name = "positiveInteger")
        protected List<BigInteger> capacity;
        @XmlAttribute(name = "IsPackage")
        protected Boolean isPackage;

        /**
         * Gets the value of the capacity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the capacity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCapacity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getCapacity() {
            if (capacity == null) {
                capacity = new ArrayList<BigInteger>();
            }
            return this.capacity;
        }

        /**
         * Gets the value of the isPackage property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsPackage() {
            return isPackage;
        }

        /**
         * Sets the value of the isPackage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsPackage(Boolean value) {
            this.isPackage = value;
        }

    }

}
