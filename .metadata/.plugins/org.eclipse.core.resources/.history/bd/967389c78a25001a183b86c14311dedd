
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
 *         &lt;element name="PermittedChains" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelChain" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProhibitedChains" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelChain" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PermittedProviders" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}PermittedAggregators" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}LoyaltyCard" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CorporateDiscountID" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="RateCategory" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" maxOccurs="8" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelRating" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}SearchPriority" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelBedding" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="Amenities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}Amenity" maxOccurs="8" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HotelPaymentType" type="{http://www.travelport.com/schema/hotel_v45_0}typeHotelPaymentType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}NumberOfChildren" minOccurs="0"/&gt;
 *         &lt;element name="HotelTransportation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}BookingGuestInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="NumberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MaxProperties" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="IsRelaxed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PreferredCurrency" type="{http://www.travelport.com/schema/common_v45_0}typeCurrency" /&gt;
 *       &lt;attribute name="AvailableHotelsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaxWait" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="AggregateResults" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReturnPropertyDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="NumOfRatePlans" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="ReturnAmenities" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedChains",
    "prohibitedChains",
    "permittedProviders",
    "permittedAggregators",
    "loyaltyCard",
    "hotelName",
    "corporateDiscountID",
    "rateCategory",
    "hotelRating",
    "searchPriority",
    "hotelBedding",
    "amenities",
    "hotelPaymentType",
    "numberOfChildren",
    "hotelTransportation",
    "bookingGuestInformation"
})
@XmlRootElement(name = "HotelSearchModifiers")
public class HotelSearchModifiers {

    @XmlElement(name = "PermittedChains")
    protected HotelSearchModifiers.PermittedChains permittedChains;
    @XmlElement(name = "ProhibitedChains")
    protected HotelSearchModifiers.ProhibitedChains prohibitedChains;
    @XmlElement(name = "PermittedProviders", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected PermittedProviders permittedProviders;
    @XmlElement(name = "PermittedAggregators")
    protected PermittedAggregators permittedAggregators;
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<CorporateDiscountID> corporateDiscountID;
    @XmlElement(name = "RateCategory")
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> rateCategory;
    @XmlElement(name = "HotelRating")
    protected List<HotelRating> hotelRating;
    @XmlElement(name = "SearchPriority")
    protected SearchPriority searchPriority;
    @XmlElement(name = "HotelBedding")
    protected List<HotelBedding> hotelBedding;
    @XmlElement(name = "Amenities")
    protected HotelSearchModifiers.Amenities amenities;
    @XmlElement(name = "HotelPaymentType")
    @XmlSchemaType(name = "string")
    protected TypeHotelPaymentType hotelPaymentType;
    @XmlElement(name = "NumberOfChildren")
    protected NumberOfChildren numberOfChildren;
    @XmlElement(name = "HotelTransportation")
    protected HotelSearchModifiers.HotelTransportation hotelTransportation;
    @XmlElement(name = "BookingGuestInformation")
    protected BookingGuestInformation bookingGuestInformation;
    @XmlAttribute(name = "NumberOfAdults")
    protected Integer numberOfAdults;
    @XmlAttribute(name = "NumberOfRooms")
    protected Integer numberOfRooms;
    @XmlAttribute(name = "MaxProperties")
    protected Integer maxProperties;
    @XmlAttribute(name = "IsRelaxed")
    protected Boolean isRelaxed;
    @XmlAttribute(name = "PreferredCurrency")
    protected String preferredCurrency;
    @XmlAttribute(name = "AvailableHotelsOnly")
    protected Boolean availableHotelsOnly;
    @XmlAttribute(name = "MaxWait")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxWait;
    @XmlAttribute(name = "AggregateResults")
    protected Boolean aggregateResults;
    @XmlAttribute(name = "ReturnPropertyDescription")
    protected Boolean returnPropertyDescription;
    @XmlAttribute(name = "NumOfRatePlans")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numOfRatePlans;
    @XmlAttribute(name = "ReturnAmenities")
    protected Boolean returnAmenities;

    /**
     * Gets the value of the permittedChains property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchModifiers.PermittedChains }
     *     
     */
    public HotelSearchModifiers.PermittedChains getPermittedChains() {
        return permittedChains;
    }

    /**
     * Sets the value of the permittedChains property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchModifiers.PermittedChains }
     *     
     */
    public void setPermittedChains(HotelSearchModifiers.PermittedChains value) {
        this.permittedChains = value;
    }

    /**
     * Gets the value of the prohibitedChains property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchModifiers.ProhibitedChains }
     *     
     */
    public HotelSearchModifiers.ProhibitedChains getProhibitedChains() {
        return prohibitedChains;
    }

    /**
     * Sets the value of the prohibitedChains property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchModifiers.ProhibitedChains }
     *     
     */
    public void setProhibitedChains(HotelSearchModifiers.ProhibitedChains value) {
        this.prohibitedChains = value;
    }

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
     * Gets the value of the permittedAggregators property.
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
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
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
     * Gets the value of the hotelRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRating }
     * 
     * 
     */
    public List<HotelRating> getHotelRating() {
        if (hotelRating == null) {
            hotelRating = new ArrayList<HotelRating>();
        }
        return this.hotelRating;
    }

    /**
     * Gets the value of the searchPriority property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPriority }
     *     
     */
    public SearchPriority getSearchPriority() {
        return searchPriority;
    }

    /**
     * Sets the value of the searchPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPriority }
     *     
     */
    public void setSearchPriority(SearchPriority value) {
        this.searchPriority = value;
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
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchModifiers.Amenities }
     *     
     */
    public HotelSearchModifiers.Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchModifiers.Amenities }
     *     
     */
    public void setAmenities(HotelSearchModifiers.Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the hotelPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHotelPaymentType }
     *     
     */
    public TypeHotelPaymentType getHotelPaymentType() {
        return hotelPaymentType;
    }

    /**
     * Sets the value of the hotelPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHotelPaymentType }
     *     
     */
    public void setHotelPaymentType(TypeHotelPaymentType value) {
        this.hotelPaymentType = value;
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
     * Gets the value of the hotelTransportation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchModifiers.HotelTransportation }
     *     
     */
    public HotelSearchModifiers.HotelTransportation getHotelTransportation() {
        return hotelTransportation;
    }

    /**
     * Sets the value of the hotelTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchModifiers.HotelTransportation }
     *     
     */
    public void setHotelTransportation(HotelSearchModifiers.HotelTransportation value) {
        this.hotelTransportation = value;
    }

    /**
     * Gets the value of the bookingGuestInformation property.
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
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRooms() {
        return numberOfRooms;
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
     * Gets the value of the maxProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxProperties() {
        return maxProperties;
    }

    /**
     * Sets the value of the maxProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxProperties(Integer value) {
        this.maxProperties = value;
    }

    /**
     * Gets the value of the isRelaxed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRelaxed() {
        return isRelaxed;
    }

    /**
     * Sets the value of the isRelaxed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRelaxed(Boolean value) {
        this.isRelaxed = value;
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
     * Gets the value of the availableHotelsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableHotelsOnly() {
        return availableHotelsOnly;
    }

    /**
     * Sets the value of the availableHotelsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableHotelsOnly(Boolean value) {
        this.availableHotelsOnly = value;
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

    /**
     * Gets the value of the aggregateResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAggregateResults() {
        if (aggregateResults == null) {
            return false;
        } else {
            return aggregateResults;
        }
    }

    /**
     * Sets the value of the aggregateResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAggregateResults(Boolean value) {
        this.aggregateResults = value;
    }

    /**
     * Gets the value of the returnPropertyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnPropertyDescription() {
        if (returnPropertyDescription == null) {
            return false;
        } else {
            return returnPropertyDescription;
        }
    }

    /**
     * Sets the value of the returnPropertyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnPropertyDescription(Boolean value) {
        this.returnPropertyDescription = value;
    }

    /**
     * Gets the value of the numOfRatePlans property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfRatePlans() {
        return numOfRatePlans;
    }

    /**
     * Sets the value of the numOfRatePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfRatePlans(BigInteger value) {
        this.numOfRatePlans = value;
    }

    /**
     * Gets the value of the returnAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnAmenities() {
        if (returnAmenities == null) {
            return false;
        } else {
            return returnAmenities;
        }
    }

    /**
     * Sets the value of the returnAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnAmenities(Boolean value) {
        this.returnAmenities = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}Amenity" maxOccurs="8" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amenity"
    })
    public static class Amenities {

        @XmlElement(name = "Amenity")
        protected List<Amenity> amenity;

        /**
         * Gets the value of the amenity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amenity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmenity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Amenity }
         * 
         * 
         */
        public List<Amenity> getAmenity() {
            if (amenity == null) {
                amenity = new ArrayList<Amenity>();
            }
            return this.amenity;
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
     *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelTransportation {

        @XmlAttribute(name = "Type", required = true)
        protected BigInteger type;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setType(BigInteger value) {
            this.type = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelChain" maxOccurs="999"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hotelChain"
    })
    public static class PermittedChains {

        @XmlElement(name = "HotelChain", required = true)
        protected List<HotelChain> hotelChain;

        /**
         * Gets the value of the hotelChain property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelChain property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelChain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelChain }
         * 
         * 
         */
        public List<HotelChain> getHotelChain() {
            if (hotelChain == null) {
                hotelChain = new ArrayList<HotelChain>();
            }
            return this.hotelChain;
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
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelChain" maxOccurs="999"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hotelChain"
    })
    public static class ProhibitedChains {

        @XmlElement(name = "HotelChain", required = true)
        protected List<HotelChain> hotelChain;

        /**
         * Gets the value of the hotelChain property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelChain property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelChain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelChain }
         * 
         * 
         */
        public List<HotelChain> getHotelChain() {
            if (hotelChain == null) {
                hotelChain = new ArrayList<HotelChain>();
            }
            return this.hotelChain;
        }

    }

}
