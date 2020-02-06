
package com.travelport.schema.air_v45_0;

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
import com.travelport.schema.common_v45_0.TypeElementStatus;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}TicketDesignator" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="OperatingCarrier" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
 *       &lt;attribute name="OperatingFlightNumber" type="{http://www.travelport.com/schema/common_v45_0}typeFlightNumber" /&gt;
 *       &lt;attribute name="MarketingCarrier" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
 *       &lt;attribute name="MarketingFlightNumber" type="{http://www.travelport.com/schema/common_v45_0}typeFlightNumber" /&gt;
 *       &lt;attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StopoverCode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BookingClass" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="FareBasis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NotValidBefore" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="NotValidAfter" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="Status" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SegmentGroup" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MarriageGroup" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketDesignator"
})
@XmlRootElement(name = "Coupon")
public class Coupon {

    @XmlElement(name = "TicketDesignator")
    protected List<TicketDesignator> ticketDesignator;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "CouponNumber")
    protected BigInteger couponNumber;
    @XmlAttribute(name = "OperatingCarrier")
    protected String operatingCarrier;
    @XmlAttribute(name = "OperatingFlightNumber")
    protected String operatingFlightNumber;
    @XmlAttribute(name = "MarketingCarrier")
    protected String marketingCarrier;
    @XmlAttribute(name = "MarketingFlightNumber")
    protected String marketingFlightNumber;
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    @XmlAttribute(name = "DepartureTime")
    protected String departureTime;
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;
    @XmlAttribute(name = "StopoverCode", required = true)
    protected boolean stopoverCode;
    @XmlAttribute(name = "BookingClass", required = true)
    protected String bookingClass;
    @XmlAttribute(name = "FareBasis", required = true)
    protected String fareBasis;
    @XmlAttribute(name = "NotValidBefore")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidBefore;
    @XmlAttribute(name = "NotValidAfter")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidAfter;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "SegmentGroup")
    protected BigInteger segmentGroup;
    @XmlAttribute(name = "MarriageGroup")
    protected BigInteger marriageGroup;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Gets the value of the ticketDesignator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDesignator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDesignator }
     * 
     * 
     */
    public List<TicketDesignator> getTicketDesignator() {
        if (ticketDesignator == null) {
            ticketDesignator = new ArrayList<TicketDesignator>();
        }
        return this.ticketDesignator;
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
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCouponNumber(BigInteger value) {
        this.couponNumber = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrier(String value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the operatingFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingFlightNumber() {
        return operatingFlightNumber;
    }

    /**
     * Sets the value of the operatingFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingFlightNumber(String value) {
        this.operatingFlightNumber = value;
    }

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCarrier(String value) {
        this.marketingCarrier = value;
    }

    /**
     * Gets the value of the marketingFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingFlightNumber() {
        return marketingFlightNumber;
    }

    /**
     * Sets the value of the marketingFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingFlightNumber(String value) {
        this.marketingFlightNumber = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the stopoverCode property.
     * 
     */
    public boolean isStopoverCode() {
        return stopoverCode;
    }

    /**
     * Sets the value of the stopoverCode property.
     * 
     */
    public void setStopoverCode(boolean value) {
        this.stopoverCode = value;
    }

    /**
     * Gets the value of the bookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingClass(String value) {
        this.bookingClass = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the notValidBefore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotValidBefore(XMLGregorianCalendar value) {
        this.notValidBefore = value;
    }

    /**
     * Gets the value of the notValidAfter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotValidAfter(XMLGregorianCalendar value) {
        this.notValidAfter = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the segmentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSegmentGroup() {
        return segmentGroup;
    }

    /**
     * Sets the value of the segmentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSegmentGroup(BigInteger value) {
        this.segmentGroup = value;
    }

    /**
     * Gets the value of the marriageGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarriageGroup() {
        return marriageGroup;
    }

    /**
     * Sets the value of the marriageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarriageGroup(BigInteger value) {
        this.marriageGroup = value;
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

}
