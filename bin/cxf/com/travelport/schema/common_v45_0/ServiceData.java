
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}SeatAttributes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CabinClass" minOccurs="0"/&gt;
 *         &lt;element name="SSRRef" type="{http://www.travelport.com/schema/common_v45_0}typeKeyBasedReference" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Data" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="StopOver" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="TravelerType" type="{http://www.travelport.com/schema/common_v45_0}typePTC" /&gt;
 *       &lt;attribute name="EMDSummaryRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="EMDCouponRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seatAttributes",
    "cabinClass",
    "ssrRef"
})
@XmlRootElement(name = "ServiceData")
public class ServiceData {

    @XmlElement(name = "SeatAttributes")
    protected SeatAttributes seatAttributes;
    @XmlElement(name = "CabinClass")
    protected CabinClass cabinClass;
    @XmlElement(name = "SSRRef")
    protected List<TypeKeyBasedReference> ssrRef;
    @XmlAttribute(name = "Data")
    protected String data;
    @XmlAttribute(name = "AirSegmentRef")
    protected String airSegmentRef;
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    @XmlAttribute(name = "StopOver")
    protected Boolean stopOver;
    @XmlAttribute(name = "TravelerType")
    protected String travelerType;
    @XmlAttribute(name = "EMDSummaryRef")
    protected String emdSummaryRef;
    @XmlAttribute(name = "EMDCouponRef")
    protected String emdCouponRef;

    /**
     * Gets the value of the seatAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAttributes }
     *     
     */
    public SeatAttributes getSeatAttributes() {
        return seatAttributes;
    }

    /**
     * Sets the value of the seatAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAttributes }
     *     
     */
    public void setSeatAttributes(SeatAttributes value) {
        this.seatAttributes = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     */
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the ssrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKeyBasedReference }
     * 
     * 
     */
    public List<TypeKeyBasedReference> getSSRRef() {
        if (ssrRef == null) {
            ssrRef = new ArrayList<TypeKeyBasedReference>();
        }
        return this.ssrRef;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the airSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirSegmentRef() {
        return airSegmentRef;
    }

    /**
     * Sets the value of the airSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirSegmentRef(String value) {
        this.airSegmentRef = value;
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
     * Gets the value of the stopOver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStopOver() {
        if (stopOver == null) {
            return false;
        } else {
            return stopOver;
        }
    }

    /**
     * Sets the value of the stopOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopOver(Boolean value) {
        this.stopOver = value;
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
     * Gets the value of the emdSummaryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDSummaryRef() {
        return emdSummaryRef;
    }

    /**
     * Sets the value of the emdSummaryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDSummaryRef(String value) {
        this.emdSummaryRef = value;
    }

    /**
     * Gets the value of the emdCouponRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDCouponRef() {
        return emdCouponRef;
    }

    /**
     * Sets the value of the emdCouponRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDCouponRef(String value) {
        this.emdCouponRef = value;
    }

}
