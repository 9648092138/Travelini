
package com.travelport.schema.common_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="TicketStatus" default="Both"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Ticketed"/&gt;
 *             &lt;enumeration value="Unticketed"/&gt;
 *             &lt;enumeration value="Both"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ReservationStatus" default="Both"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="OnHold"/&gt;
 *             &lt;enumeration value="SetForTicketing"/&gt;
 *             &lt;enumeration value="Both"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TicketDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SearchTicketing")
public class SearchTicketing {

    @XmlAttribute(name = "TicketStatus")
    protected String ticketStatus;
    @XmlAttribute(name = "ReservationStatus")
    protected String reservationStatus;
    @XmlAttribute(name = "TicketDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ticketDate;

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketStatus() {
        if (ticketStatus == null) {
            return "Both";
        } else {
            return ticketStatus;
        }
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketStatus(String value) {
        this.ticketStatus = value;
    }

    /**
     * Gets the value of the reservationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatus() {
        if (reservationStatus == null) {
            return "Both";
        } else {
            return reservationStatus;
        }
    }

    /**
     * Sets the value of the reservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationStatus(String value) {
        this.reservationStatus = value;
    }

    /**
     * Gets the value of the ticketDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketDate() {
        return ticketDate;
    }

    /**
     * Sets the value of the ticketDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketDate(XMLGregorianCalendar value) {
        this.ticketDate = value;
    }

}
