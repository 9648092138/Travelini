
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseRsp;
import com.travelport.schema.common_v45_0.BookingTraveler;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}TicketNumber" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}BookingTraveler" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="AirReservation" type="{http://www.travelport.com/schema/air_v45_0}typeAirReservationWithFOP" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeFailureInfo" type="{http://www.travelport.com/schema/air_v45_0}typeTicketFailureInfo" maxOccurs="999" minOccurs="0"/&gt;
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
    "ticketNumber",
    "bookingTraveler",
    "airReservation",
    "exchangeFailureInfo"
})
@XmlRootElement(name = "AirExchangeRsp")
public class AirExchangeRsp
    extends BaseRsp
{

    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<String> ticketNumber;
    @XmlElement(name = "BookingTraveler", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<BookingTraveler> bookingTraveler;
    @XmlElement(name = "AirReservation")
    protected TypeAirReservationWithFOP airReservation;
    @XmlElement(name = "ExchangeFailureInfo")
    protected List<TypeTicketFailureInfo> exchangeFailureInfo;

    /**
     * Gets the value of the ticketNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<String>();
        }
        return this.ticketNumber;
    }

    /**
     * Provider: ACH.Gets the value of the bookingTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTraveler }
     * 
     * 
     */
    public List<BookingTraveler> getBookingTraveler() {
        if (bookingTraveler == null) {
            bookingTraveler = new ArrayList<BookingTraveler>();
        }
        return this.bookingTraveler;
    }

    /**
     * Gets the value of the airReservation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAirReservationWithFOP }
     *     
     */
    public TypeAirReservationWithFOP getAirReservation() {
        return airReservation;
    }

    /**
     * Sets the value of the airReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAirReservationWithFOP }
     *     
     */
    public void setAirReservation(TypeAirReservationWithFOP value) {
        this.airReservation = value;
    }

    /**
     * Gets the value of the exchangeFailureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeFailureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeFailureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTicketFailureInfo }
     * 
     * 
     */
    public List<TypeTicketFailureInfo> getExchangeFailureInfo() {
        if (exchangeFailureInfo == null) {
            exchangeFailureInfo = new ArrayList<TypeTicketFailureInfo>();
        }
        return this.exchangeFailureInfo;
    }

}
