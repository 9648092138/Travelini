
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
import com.travelport.schema.common_v45_0.CoordinateLocation;
import com.travelport.schema.common_v45_0.Distance;
import com.travelport.schema.common_v45_0.PhoneNumber;
import com.travelport.schema.common_v45_0.TypeReserveRequirement;


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
 *         &lt;element name="PropertyAddress" type="{http://www.travelport.com/schema/hotel_v45_0}typeUnstructuredAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PhoneNumber" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CoordinateLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Distance" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelRating" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}Amenities" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}MarketingMessage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HotelChain" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeHotelChainCode" /&gt;
 *       &lt;attribute name="HotelCode" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeHotelCode" /&gt;
 *       &lt;attribute name="HotelLocation" type="{http://www.travelport.com/schema/hotel_v45_0}typeHotelLocationCode" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VendorLocationKey" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HotelTransportation" type="{http://www.travelport.com/schema/common_v45_0}typeOTACode" /&gt;
 *       &lt;attribute name="ReserveRequirement" type="{http://www.travelport.com/schema/common_v45_0}typeReserveRequirement" /&gt;
 *       &lt;attribute name="ParticipationLevel" type="{http://www.travelport.com/schema/common_v45_0}StringLength1" /&gt;
 *       &lt;attribute name="Availability" type="{http://www.travelport.com/schema/hotel_v45_0}typeHotelAvailability" /&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="PreferredOption" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MoreRates" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MoreRatesToken"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="30"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NetTransCommissionInd" type="{http://www.travelport.com/schema/hotel_v45_0}typeNetTransCommission" /&gt;
 *       &lt;attribute name="NumOfRatePlans" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "propertyAddress",
    "phoneNumber",
    "coordinateLocation",
    "distance",
    "hotelRating",
    "amenities",
    "marketingMessage"
})
@XmlRootElement(name = "HotelProperty")
public class HotelProperty {

    @XmlElement(name = "PropertyAddress")
    protected TypeUnstructuredAddress propertyAddress;
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<PhoneNumber> phoneNumber;
    @XmlElement(name = "CoordinateLocation", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected CoordinateLocation coordinateLocation;
    @XmlElement(name = "Distance", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected Distance distance;
    @XmlElement(name = "HotelRating")
    protected List<HotelRating> hotelRating;
    @XmlElement(name = "Amenities")
    protected Amenities amenities;
    @XmlElement(name = "MarketingMessage")
    protected MarketingMessage marketingMessage;
    @XmlAttribute(name = "HotelChain", required = true)
    protected String hotelChain;
    @XmlAttribute(name = "HotelCode", required = true)
    protected String hotelCode;
    @XmlAttribute(name = "HotelLocation")
    protected String hotelLocation;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "VendorLocationKey")
    protected String vendorLocationKey;
    @XmlAttribute(name = "HotelTransportation")
    protected BigInteger hotelTransportation;
    @XmlAttribute(name = "ReserveRequirement")
    protected TypeReserveRequirement reserveRequirement;
    @XmlAttribute(name = "ParticipationLevel")
    protected String participationLevel;
    @XmlAttribute(name = "Availability")
    protected TypeHotelAvailability availability;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "PreferredOption")
    protected Boolean preferredOption;
    @XmlAttribute(name = "MoreRates")
    protected Boolean moreRates;
    @XmlAttribute(name = "MoreRatesToken")
    protected String moreRatesToken;
    @XmlAttribute(name = "NetTransCommissionInd")
    protected TypeNetTransCommission netTransCommissionInd;
    @XmlAttribute(name = "NumOfRatePlans")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numOfRatePlans;

    /**
     * Gets the value of the propertyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link TypeUnstructuredAddress }
     *     
     */
    public TypeUnstructuredAddress getPropertyAddress() {
        return propertyAddress;
    }

    /**
     * Sets the value of the propertyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeUnstructuredAddress }
     *     
     */
    public void setPropertyAddress(TypeUnstructuredAddress value) {
        this.propertyAddress = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
     * 
     * 
     */
    public List<PhoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<PhoneNumber>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the coordinateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateLocation }
     *     
     */
    public CoordinateLocation getCoordinateLocation() {
        return coordinateLocation;
    }

    /**
     * Sets the value of the coordinateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateLocation }
     *     
     */
    public void setCoordinateLocation(CoordinateLocation value) {
        this.coordinateLocation = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
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
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link Amenities }
     *     
     */
    public Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amenities }
     *     
     */
    public void setAmenities(Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the marketingMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingMessage }
     *     
     */
    public MarketingMessage getMarketingMessage() {
        return marketingMessage;
    }

    /**
     * Sets the value of the marketingMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingMessage }
     *     
     */
    public void setMarketingMessage(MarketingMessage value) {
        this.marketingMessage = value;
    }

    /**
     * Gets the value of the hotelChain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelChain() {
        return hotelChain;
    }

    /**
     * Sets the value of the hotelChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelChain(String value) {
        this.hotelChain = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the hotelLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelLocation() {
        return hotelLocation;
    }

    /**
     * Sets the value of the hotelLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelLocation(String value) {
        this.hotelLocation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the vendorLocationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorLocationKey() {
        return vendorLocationKey;
    }

    /**
     * Sets the value of the vendorLocationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorLocationKey(String value) {
        this.vendorLocationKey = value;
    }

    /**
     * Gets the value of the hotelTransportation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHotelTransportation() {
        return hotelTransportation;
    }

    /**
     * Sets the value of the hotelTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHotelTransportation(BigInteger value) {
        this.hotelTransportation = value;
    }

    /**
     * Gets the value of the reserveRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link TypeReserveRequirement }
     *     
     */
    public TypeReserveRequirement getReserveRequirement() {
        return reserveRequirement;
    }

    /**
     * Sets the value of the reserveRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReserveRequirement }
     *     
     */
    public void setReserveRequirement(TypeReserveRequirement value) {
        this.reserveRequirement = value;
    }

    /**
     * Gets the value of the participationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipationLevel() {
        return participationLevel;
    }

    /**
     * Sets the value of the participationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipationLevel(String value) {
        this.participationLevel = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHotelAvailability }
     *     
     */
    public TypeHotelAvailability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHotelAvailability }
     *     
     */
    public void setAvailability(TypeHotelAvailability value) {
        this.availability = value;
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
     * Gets the value of the preferredOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredOption() {
        return preferredOption;
    }

    /**
     * Sets the value of the preferredOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredOption(Boolean value) {
        this.preferredOption = value;
    }

    /**
     * Gets the value of the moreRates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreRates() {
        return moreRates;
    }

    /**
     * Sets the value of the moreRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreRates(Boolean value) {
        this.moreRates = value;
    }

    /**
     * Gets the value of the moreRatesToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreRatesToken() {
        return moreRatesToken;
    }

    /**
     * Sets the value of the moreRatesToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreRatesToken(String value) {
        this.moreRatesToken = value;
    }

    /**
     * Gets the value of the netTransCommissionInd property.
     * 
     * @return
     *     possible object is
     *     {@link TypeNetTransCommission }
     *     
     */
    public TypeNetTransCommission getNetTransCommissionInd() {
        return netTransCommissionInd;
    }

    /**
     * Sets the value of the netTransCommissionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNetTransCommission }
     *     
     */
    public void setNetTransCommissionInd(TypeNetTransCommission value) {
        this.netTransCommissionInd = value;
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

}
