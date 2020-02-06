
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
import com.travelport.schema.common_v45_0.LoyaltyCard;
import com.travelport.schema.common_v45_0.PermittedProviders;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PermittedProviders" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}LoyaltyCard" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CorporateDiscountID" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelStay"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}NumberOfChildren" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelBedding" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="RateCategory" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" maxOccurs="8" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}PermittedAggregators" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}BookingGuestInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="RateRuleDetail" type="{http://www.travelport.com/schema/hotel_v45_0}typeRateRuleDetail" default="None" /&gt;
 *       &lt;attribute name="NumberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int" default="1" /&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="PreferredCurrency" type="{http://www.travelport.com/schema/common_v45_0}typeCurrency" /&gt;
 *       &lt;attribute name="TotalOccupants" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ProcessAllNegoRatesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="MaxWait" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedProviders",
    "loyaltyCard",
    "corporateDiscountID",
    "hotelStay",
    "numberOfChildren",
    "hotelBedding",
    "rateCategory",
    "permittedAggregators",
    "bookingGuestInformation"
})
@XmlRootElement(name = "HotelDetailsModifiers")
public class HotelDetailsModifiers {

    @XmlElement(name = "PermittedProviders", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected PermittedProviders permittedProviders;
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<CorporateDiscountID> corporateDiscountID;
    @XmlElement(name = "HotelStay", required = true)
    protected HotelStay hotelStay;
    @XmlElement(name = "NumberOfChildren")
    protected NumberOfChildren numberOfChildren;
    @XmlElement(name = "HotelBedding")
    protected List<HotelBedding> hotelBedding;
    @XmlElement(name = "RateCategory")
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> rateCategory;
    @XmlElement(name = "PermittedAggregators")
    protected PermittedAggregators permittedAggregators;
    @XmlElement(name = "BookingGuestInformation")
    protected BookingGuestInformation bookingGuestInformation;
    @XmlAttribute(name = "NumberOfAdults")
    protected Integer numberOfAdults;
    @XmlAttribute(name = "RateRuleDetail")
    protected TypeRateRuleDetail rateRuleDetail;
    @XmlAttribute(name = "NumberOfRooms")
    protected Integer numberOfRooms;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "PreferredCurrency")
    protected String preferredCurrency;
    @XmlAttribute(name = "TotalOccupants")
    protected Integer totalOccupants;
    @XmlAttribute(name = "ProcessAllNegoRatesInd")
    protected Boolean processAllNegoRatesInd;
    @XmlAttribute(name = "MaxWait")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxWait;

    /**
     * Gets the value of the permittedProviders property.
     * 
     * @return
     *     possible object is
     *     {@link PermittedProviders }
     *     
     */
    public PermittedProviders getPermittedProviders() {
        return permittedProviders;
    }

    /**
     * Sets the value of the permittedProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedProviders }
     *     
     */
    public void setPermittedProviders(PermittedProviders value) {
        this.permittedProviders = value;
    }

    /**
     * Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

    /**
     * Search with corporate discount IDs or negotiated rate codes. 1G/1V allows a max of 4.  1P/1J allows a max of 1 corporate discount ID and up to 30 negotiated rate codes.  Support for this function is hotel supplier dependent.Gets the value of the corporateDiscountID property.
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
     * Gets the value of the hotelStay property.
     * 
     * @return
     *     possible object is
     *     {@link HotelStay }
     *     
     */
    public HotelStay getHotelStay() {
        return hotelStay;
    }

    /**
     * Sets the value of the hotelStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelStay }
     *     
     */
    public void setHotelStay(HotelStay value) {
        this.hotelStay = value;
    }

    /**
     * Gets the value of the numberOfChildren property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfChildren }
     *     
     */
    public NumberOfChildren getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * Sets the value of the numberOfChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfChildren }
     *     
     */
    public void setNumberOfChildren(NumberOfChildren value) {
        this.numberOfChildren = value;
    }

    /**
     * Gets the value of the hotelBedding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelBedding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelBedding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelBedding }
     * 
     * 
     */
    public List<HotelBedding> getHotelBedding() {
        if (hotelBedding == null) {
            hotelBedding = new ArrayList<HotelBedding>();
        }
        return this.hotelBedding;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getRateCategory() {
        if (rateCategory == null) {
            rateCategory = new ArrayList<BigInteger>();
        }
        return this.rateCategory;
    }

    /**
     * TRM Only
     * 
     * @return
     *     possible object is
     *     {@link PermittedAggregators }
     *     
     */
    public PermittedAggregators getPermittedAggregators() {
        return permittedAggregators;
    }

    /**
     * Sets the value of the permittedAggregators property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedAggregators }
     *     
     */
    public void setPermittedAggregators(PermittedAggregators value) {
        this.permittedAggregators = value;
    }

    /**
     * Information about requested rooms and allocation of guests per room. Provider: TRM.
     * 
     * @return
     *     possible object is
     *     {@link BookingGuestInformation }
     *     
     */
    public BookingGuestInformation getBookingGuestInformation() {
        return bookingGuestInformation;
    }

    /**
     * Sets the value of the bookingGuestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingGuestInformation }
     *     
     */
    public void setBookingGuestInformation(BookingGuestInformation value) {
        this.bookingGuestInformation = value;
    }

    /**
     * Gets the value of the numberOfAdults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * Sets the value of the numberOfAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAdults(Integer value) {
        this.numberOfAdults = value;
    }

    /**
     * Gets the value of the rateRuleDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateRuleDetail }
     *     
     */
    public TypeRateRuleDetail getRateRuleDetail() {
        if (rateRuleDetail == null) {
            return TypeRateRuleDetail.NONE;
        } else {
            return rateRuleDetail;
        }
    }

    /**
     * Sets the value of the rateRuleDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateRuleDetail }
     *     
     */
    public void setRateRuleDetail(TypeRateRuleDetail value) {
        this.rateRuleDetail = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumberOfRooms() {
        if (numberOfRooms == null) {
            return  1;
        } else {
            return numberOfRooms;
        }
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRooms(Integer value) {
        this.numberOfRooms = value;
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
     * Gets the value of the preferredCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCurrency() {
        return preferredCurrency;
    }

    /**
     * Sets the value of the preferredCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCurrency(String value) {
        this.preferredCurrency = value;
    }

    /**
     * Gets the value of the totalOccupants property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalOccupants() {
        return totalOccupants;
    }

    /**
     * Sets the value of the totalOccupants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalOccupants(Integer value) {
        this.totalOccupants = value;
    }

    /**
     * Gets the value of the processAllNegoRatesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProcessAllNegoRatesInd() {
        if (processAllNegoRatesInd == null) {
            return false;
        } else {
            return processAllNegoRatesInd;
        }
    }

    /**
     * Sets the value of the processAllNegoRatesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessAllNegoRatesInd(Boolean value) {
        this.processAllNegoRatesInd = value;
    }

    /**
     * Gets the value of the maxWait property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxWait() {
        return maxWait;
    }

    /**
     * Sets the value of the maxWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxWait(BigInteger value) {
        this.maxWait = value;
    }

}
