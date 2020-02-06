
package com.travelport.schema.common_v45_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.air_v45_0.PassengerType;
import com.travelport.schema.air_v45_0.SearchTraveler;


/**
 * Passenger type code with optional age information
 * 
 * <p>Java class for typePassengerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typePassengerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}LoyaltyCard" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}DiscountCard" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PersonalGeography" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Code" use="required" type="{http://www.travelport.com/schema/common_v45_0}typePTC" /&gt;
 *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="Gender" type="{http://www.travelport.com/schema/common_v45_0}typeGender" /&gt;
 *       &lt;attribute name="PricePTCOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BookingTravelerRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AccompaniedPassenger" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ResidencyType" type="{http://www.travelport.com/schema/common_v45_0}typeResidency" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typePassengerType", propOrder = {
    "name",
    "loyaltyCard",
    "discountCard",
    "personalGeography"
})
@XmlSeeAlso({
    SearchPassenger.class,
    SearchTraveler.class,
    PassengerType.class
})
public class TypePassengerType {

    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "LoyaltyCard")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "DiscountCard")
    protected List<DiscountCard> discountCard;
    @XmlElement(name = "PersonalGeography")
    protected PersonalGeography personalGeography;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "Age")
    protected BigInteger age;
    @XmlAttribute(name = "DOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "PricePTCOnly")
    protected Boolean pricePTCOnly;
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    @XmlAttribute(name = "AccompaniedPassenger")
    protected Boolean accompaniedPassenger;
    @XmlAttribute(name = "ResidencyType")
    protected TypeResidency residencyType;

    /**
     * Optional passenger Name with associated LoyaltyCard may provide benefit when pricing itineraries using Low Cost Carriers. In general, most carriers do not consider passenger LoyalyCard information when initially pricing itineraries.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
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
     * Passenger personal geography detail to be sent to Host for accessing location specific fares
     * 
     * @return
     *     possible object is
     *     {@link PersonalGeography }
     *     
     */
    public PersonalGeography getPersonalGeography() {
        return personalGeography;
    }

    /**
     * Sets the value of the personalGeography property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalGeography }
     *     
     */
    public void setPersonalGeography(PersonalGeography value) {
        this.personalGeography = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * Gets the value of the pricePTCOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricePTCOnly() {
        return pricePTCOnly;
    }

    /**
     * Sets the value of the pricePTCOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricePTCOnly(Boolean value) {
        this.pricePTCOnly = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * Gets the value of the accompaniedPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAccompaniedPassenger() {
        if (accompaniedPassenger == null) {
            return false;
        } else {
            return accompaniedPassenger;
        }
    }

    /**
     * Sets the value of the accompaniedPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccompaniedPassenger(Boolean value) {
        this.accompaniedPassenger = value;
    }

    /**
     * Gets the value of the residencyType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeResidency }
     *     
     */
    public TypeResidency getResidencyType() {
        return residencyType;
    }

    /**
     * Sets the value of the residencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeResidency }
     *     
     */
    public void setResidencyType(TypeResidency value) {
        this.residencyType = value;
    }

}
