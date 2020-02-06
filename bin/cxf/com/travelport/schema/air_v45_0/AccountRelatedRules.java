
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BookingRules" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}RoutingRules" minOccurs="0"/&gt;
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
    "bookingRules",
    "routingRules"
})
@XmlRootElement(name = "AccountRelatedRules")
public class AccountRelatedRules {

    @XmlElement(name = "BookingRules")
    protected List<BookingRules> bookingRules;
    @XmlElement(name = "RoutingRules")
    protected RoutingRules routingRules;

    /**
     * Gets the value of the bookingRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRules }
     * 
     * 
     */
    public List<BookingRules> getBookingRules() {
        if (bookingRules == null) {
            bookingRules = new ArrayList<BookingRules>();
        }
        return this.bookingRules;
    }

    /**
     * Gets the value of the routingRules property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingRules }
     *     
     */
    public RoutingRules getRoutingRules() {
        return routingRules;
    }

    /**
     * Sets the value of the routingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingRules }
     *     
     */
    public void setRoutingRules(RoutingRules value) {
        this.routingRules = value;
    }

}
