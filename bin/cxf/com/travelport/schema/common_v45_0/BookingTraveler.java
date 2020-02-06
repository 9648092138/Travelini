
package com.travelport.schema.common_v45_0;

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
 *         &lt;group ref="{http://www.travelport.com/schema/common_v45_0}BaseBookingTravelerInfoA"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}SSR" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}NameRemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}AirSeatAssignment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}RailSeatAssignment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.travelport.com/schema/common_v45_0}BaseBookingTravelerInfoB"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrElementKeyResults"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrBookingTravelerGrp"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerName",
    "deliveryInfo",
    "phoneNumber",
    "email",
    "loyaltyCard",
    "discountCard",
    "ssr",
    "nameRemark",
    "airSeatAssignment",
    "railSeatAssignment",
    "emergencyInfo",
    "address",
    "driversLicense",
    "appliedProfile",
    "customizedNameData",
    "travelComplianceData",
    "travelInfo"
})
@XmlRootElement(name = "BookingTraveler")
public class BookingTraveler {

    @XmlElement(name = "BookingTravelerName", required = true)
    protected BookingTravelerName bookingTravelerName;
    @XmlElement(name = "DeliveryInfo")
    protected List<DeliveryInfo> deliveryInfo;
    @XmlElement(name = "PhoneNumber")
    protected List<PhoneNumber> phoneNumber;
    @XmlElement(name = "Email")
    protected List<Email> email;
    @XmlElement(name = "LoyaltyCard")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "DiscountCard")
    protected List<DiscountCard> discountCard;
    @XmlElement(name = "SSR")
    protected List<SSR> ssr;
    @XmlElement(name = "NameRemark")
    protected List<NameRemark> nameRemark;
    @XmlElement(name = "AirSeatAssignment")
    protected List<AirSeatAssignment> airSeatAssignment;
    @XmlElement(name = "RailSeatAssignment")
    protected List<RailSeatAssignment> railSeatAssignment;
    @XmlElement(name = "EmergencyInfo")
    protected String emergencyInfo;
    @XmlElement(name = "Address")
    protected List<TypeStructuredAddress> address;
    @XmlElement(name = "DriversLicense")
    protected List<DriversLicense> driversLicense;
    @XmlElement(name = "AppliedProfile")
    protected List<AppliedProfile> appliedProfile;
    @XmlElement(name = "CustomizedNameData")
    protected List<CustomizedNameData> customizedNameData;
    @XmlElement(name = "TravelComplianceData")
    protected List<TravelComplianceData> travelComplianceData;
    @XmlElement(name = "TravelInfo")
    protected TravelInfo travelInfo;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "TravelerType")
    protected String travelerType;
    @XmlAttribute(name = "Age")
    protected BigInteger age;
    @XmlAttribute(name = "VIP")
    protected Boolean vip;
    @XmlAttribute(name = "DOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "Nationality")
    protected String nationality;

    /**
     * Gets the value of the bookingTravelerName property.
     * 
     * @return
     *     possible object is
     *     {@link BookingTravelerName }
     *     
     */
    public BookingTravelerName getBookingTravelerName() {
        return bookingTravelerName;
    }

    /**
     * Sets the value of the bookingTravelerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingTravelerName }
     *     
     */
    public void setBookingTravelerName(BookingTravelerName value) {
        this.bookingTravelerName = value;
    }

    /**
     * Gets the value of the deliveryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInfo }
     * 
     * 
     */
    public List<DeliveryInfo> getDeliveryInfo() {
        if (deliveryInfo == null) {
            deliveryInfo = new ArrayList<DeliveryInfo>();
        }
        return this.deliveryInfo;
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
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<Email>();
        }
        return this.email;
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
     * Gets the value of the discountCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCard }
     * 
     * 
     */
    public List<DiscountCard> getDiscountCard() {
        if (discountCard == null) {
            discountCard = new ArrayList<DiscountCard>();
        }
        return this.discountCard;
    }

    /**
     * Gets the value of the ssr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSR }
     * 
     * 
     */
    public List<SSR> getSSR() {
        if (ssr == null) {
            ssr = new ArrayList<SSR>();
        }
        return this.ssr;
    }

    /**
     * Gets the value of the nameRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameRemark }
     * 
     * 
     */
    public List<NameRemark> getNameRemark() {
        if (nameRemark == null) {
            nameRemark = new ArrayList<NameRemark>();
        }
        return this.nameRemark;
    }

    /**
     * Gets the value of the airSeatAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSeatAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSeatAssignment }
     * 
     * 
     */
    public List<AirSeatAssignment> getAirSeatAssignment() {
        if (airSeatAssignment == null) {
            airSeatAssignment = new ArrayList<AirSeatAssignment>();
        }
        return this.airSeatAssignment;
    }

    /**
     * Gets the value of the railSeatAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railSeatAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailSeatAssignment }
     * 
     * 
     */
    public List<RailSeatAssignment> getRailSeatAssignment() {
        if (railSeatAssignment == null) {
            railSeatAssignment = new ArrayList<RailSeatAssignment>();
        }
        return this.railSeatAssignment;
    }

    /**
     * Gets the value of the emergencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyInfo() {
        return emergencyInfo;
    }

    /**
     * Sets the value of the emergencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyInfo(String value) {
        this.emergencyInfo = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeStructuredAddress }
     * 
     * 
     */
    public List<TypeStructuredAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<TypeStructuredAddress>();
        }
        return this.address;
    }

    /**
     * Gets the value of the driversLicense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driversLicense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriversLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriversLicense }
     * 
     * 
     */
    public List<DriversLicense> getDriversLicense() {
        if (driversLicense == null) {
            driversLicense = new ArrayList<DriversLicense>();
        }
        return this.driversLicense;
    }

    /**
     * Gets the value of the appliedProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedProfile }
     * 
     * 
     */
    public List<AppliedProfile> getAppliedProfile() {
        if (appliedProfile == null) {
            appliedProfile = new ArrayList<AppliedProfile>();
        }
        return this.appliedProfile;
    }

    /**
     * Gets the value of the customizedNameData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customizedNameData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomizedNameData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomizedNameData }
     * 
     * 
     */
    public List<CustomizedNameData> getCustomizedNameData() {
        if (customizedNameData == null) {
            customizedNameData = new ArrayList<CustomizedNameData>();
        }
        return this.customizedNameData;
    }

    /**
     * Travel Compliance and Preferred Supplier information of the booking traveler specific to a segment. Not applicable to Saved Trip.Gets the value of the travelComplianceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelComplianceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelComplianceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData }
     * 
     * 
     */
    public List<TravelComplianceData> getTravelComplianceData() {
        if (travelComplianceData == null) {
            travelComplianceData = new ArrayList<TravelComplianceData>();
        }
        return this.travelComplianceData;
    }

    /**
     * Gets the value of the travelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelInfo }
     *     
     */
    public TravelInfo getTravelInfo() {
        return travelInfo;
    }

    /**
     * Sets the value of the travelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelInfo }
     *     
     */
    public void setTravelInfo(TravelInfo value) {
        this.travelInfo = value;
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
     * Gets the value of the travelerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerType() {
        return travelerType;
    }

    /**
     * Sets the value of the travelerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerType(String value) {
        this.travelerType = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * Gets the value of the vip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isVIP() {
        if (vip == null) {
            return false;
        } else {
            return vip;
        }
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVIP(Boolean value) {
        this.vip = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

}
