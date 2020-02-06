
package com.travelport.schema.hotel_v45_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BookingTravelerRef;


/**
 * Information about guest to book. Supported Providers TRM.
 * 
 * <p>Java class for typeGuestRoomInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeGuestRoomInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}BookingTravelerRef" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element name="Child" maxOccurs="6" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.travelport.com/schema/hotel_v45_0}typeGuestChildInformation"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v45_0}BookingTravelerRef" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeGuestRoomInformation", propOrder = {
    "adults",
    "bookingTravelerRef",
    "child"
})
public class TypeGuestRoomInformation {

    @XmlElement(name = "Adults", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger adults;
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<BookingTravelerRef> bookingTravelerRef;
    @XmlElement(name = "Child")
    protected List<TypeGuestRoomInformation.Child> child;

    /**
     * Gets the value of the adults property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdults() {
        return adults;
    }

    /**
     * Sets the value of the adults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdults(BigInteger value) {
        this.adults = value;
    }

    /**
     * Reference for the Booking Traveler. Used for Hotel Booking only. The value is arbitrary.Gets the value of the bookingTravelerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTravelerRef }
     * 
     * 
     */
    public List<BookingTravelerRef> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<BookingTravelerRef>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Gets the value of the child property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGuestRoomInformation.Child }
     * 
     * 
     */
    public List<TypeGuestRoomInformation.Child> getChild() {
        if (child == null) {
            child = new ArrayList<TypeGuestRoomInformation.Child>();
        }
        return this.child;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.travelport.com/schema/hotel_v45_0}typeGuestChildInformation"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}BookingTravelerRef" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookingTravelerRef"
    })
    public static class Child
        extends TypeGuestChildInformation
    {

        @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v45_0")
        protected BookingTravelerRef bookingTravelerRef;

        /**
         * Reference for the Booking Traveler. Used for Hotel Booking only. The value is arbitrary.
         * 
         * @return
         *     possible object is
         *     {@link BookingTravelerRef }
         *     
         */
        public BookingTravelerRef getBookingTravelerRef() {
            return bookingTravelerRef;
        }

        /**
         * Sets the value of the bookingTravelerRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookingTravelerRef }
         *     
         */
        public void setBookingTravelerRef(BookingTravelerRef value) {
            this.bookingTravelerRef = value;
        }

    }

}
