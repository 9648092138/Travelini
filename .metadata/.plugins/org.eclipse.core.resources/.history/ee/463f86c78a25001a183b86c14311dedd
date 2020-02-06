
package com.travelport.schema.common_v45_0;

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
 *         &lt;element name="EmergencyContact" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PhoneNumber" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                 &lt;attribute name="Relationship" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HomeAirport" type="{http://www.travelport.com/schema/common_v45_0}typeAirport" /&gt;
 *       &lt;attribute name="VisaExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emergencyContact"
})
@XmlRootElement(name = "TravelerInformation")
public class TravelerInformation {

    @XmlElement(name = "EmergencyContact")
    protected TravelerInformation.EmergencyContact emergencyContact;
    @XmlAttribute(name = "HomeAirport")
    protected String homeAirport;
    @XmlAttribute(name = "VisaExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar visaExpirationDate;
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    protected String bookingTravelerRef;

    /**
     * Gets the value of the emergencyContact property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInformation.EmergencyContact }
     *     
     */
    public TravelerInformation.EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Sets the value of the emergencyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInformation.EmergencyContact }
     *     
     */
    public void setEmergencyContact(TravelerInformation.EmergencyContact value) {
        this.emergencyContact = value;
    }

    /**
     * Gets the value of the homeAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAirport() {
        return homeAirport;
    }

    /**
     * Sets the value of the homeAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAirport(String value) {
        this.homeAirport = value;
    }

    /**
     * Gets the value of the visaExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVisaExpirationDate() {
        return visaExpirationDate;
    }

    /**
     * Sets the value of the visaExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVisaExpirationDate(XMLGregorianCalendar value) {
        this.visaExpirationDate = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PhoneNumber" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *       &lt;attribute name="Relationship" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phoneNumber"
    })
    public static class EmergencyContact {

        @XmlElement(name = "PhoneNumber")
        protected PhoneNumber phoneNumber;
        @XmlAttribute(name = "Name")
        @XmlSchemaType(name = "anySimpleType")
        protected String name;
        @XmlAttribute(name = "Relationship")
        @XmlSchemaType(name = "anySimpleType")
        protected String relationship;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneNumber }
         *     
         */
        public PhoneNumber getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneNumber }
         *     
         */
        public void setPhoneNumber(PhoneNumber value) {
            this.phoneNumber = value;
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
         * Gets the value of the relationship property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelationship() {
            return relationship;
        }

        /**
         * Sets the value of the relationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelationship(String value) {
            this.relationship = value;
        }

    }

}
