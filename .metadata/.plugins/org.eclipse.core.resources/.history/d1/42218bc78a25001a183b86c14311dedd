
package com.travelport.schema.rail_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseReservation;
import com.travelport.schema.common_v45_0.BookingTravelerRef;
import com.travelport.schema.common_v45_0.Payment;
import com.travelport.schema.common_v45_0.SupplierLocator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseReservation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}BookingTravelerRef" maxOccurs="9"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailJourney" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailPricingInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Payment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailTicketInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailFareNoteList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}SupplierLocator" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BookingStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerRef",
    "railJourney",
    "railPricingInfo",
    "payment",
    "railTicketInfo",
    "railFareNoteList",
    "supplierLocator"
})
@XmlRootElement(name = "RailReservation")
public class RailReservation
    extends BaseReservation
{

    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v45_0", required = true)
    protected List<BookingTravelerRef> bookingTravelerRef;
    @XmlElement(name = "RailJourney", required = true)
    protected List<RailJourney> railJourney;
    @XmlElement(name = "RailPricingInfo")
    protected List<RailPricingInfo> railPricingInfo;
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<Payment> payment;
    @XmlElement(name = "RailTicketInfo")
    protected List<RailTicketInfo> railTicketInfo;
    @XmlElement(name = "RailFareNoteList")
    protected RailFareNoteList railFareNoteList;
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<SupplierLocator> supplierLocator;
    @XmlAttribute(name = "BookingStatus", required = true)
    protected String bookingStatus;

    /**
     * Gets the value of the bookingTravelerRef property.
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
     * Gets the value of the railJourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railJourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailJourney }
     * 
     * 
     */
    public List<RailJourney> getRailJourney() {
        if (railJourney == null) {
            railJourney = new ArrayList<RailJourney>();
        }
        return this.railJourney;
    }

    /**
     * Gets the value of the railPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPricingInfo }
     * 
     * 
     */
    public List<RailPricingInfo> getRailPricingInfo() {
        if (railPricingInfo == null) {
            railPricingInfo = new ArrayList<RailPricingInfo>();
        }
        return this.railPricingInfo;
    }

    /**
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<Payment>();
        }
        return this.payment;
    }

    /**
     * Gets the value of the railTicketInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railTicketInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailTicketInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailTicketInfo }
     * 
     * 
     */
    public List<RailTicketInfo> getRailTicketInfo() {
        if (railTicketInfo == null) {
            railTicketInfo = new ArrayList<RailTicketInfo>();
        }
        return this.railTicketInfo;
    }

    /**
     * List of RailFareNote(s) that is referenced by key in RailFare.
     * 
     * @return
     *     possible object is
     *     {@link RailFareNoteList }
     *     
     */
    public RailFareNoteList getRailFareNoteList() {
        return railFareNoteList;
    }

    /**
     * Sets the value of the railFareNoteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareNoteList }
     *     
     */
    public void setRailFareNoteList(RailFareNoteList value) {
        this.railFareNoteList = value;
    }

    /**
     * Gets the value of the supplierLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierLocator }
     * 
     * 
     */
    public List<SupplierLocator> getSupplierLocator() {
        if (supplierLocator == null) {
            supplierLocator = new ArrayList<SupplierLocator>();
        }
        return this.supplierLocator;
    }

    /**
     * Gets the value of the bookingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * Sets the value of the bookingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingStatus(String value) {
        this.bookingStatus = value;
    }

}
