
package com.travelport.schema.air_v45_0;

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
import com.travelport.schema.common_v45_0.TypeResultMessage;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FlightInfoDetail" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="FlightInfoErrorMessage" type="{http://www.travelport.com/schema/common_v45_0}typeResultMessage" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CriteriaKey" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="Carrier" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
 *       &lt;attribute name="FlightNumber" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeFlightNumber" /&gt;
 *       &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="DepartureDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v45_0}typeClassOfService" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightInfoDetail",
    "flightInfoErrorMessage"
})
@XmlRootElement(name = "FlightInfo")
public class FlightInfo {

    @XmlElement(name = "FlightInfoDetail")
    protected List<FlightInfoDetail> flightInfoDetail;
    @XmlElement(name = "FlightInfoErrorMessage")
    protected List<TypeResultMessage> flightInfoErrorMessage;
    @XmlAttribute(name = "CriteriaKey", required = true)
    protected String criteriaKey;
    @XmlAttribute(name = "Carrier", required = true)
    protected String carrier;
    @XmlAttribute(name = "FlightNumber", required = true)
    protected String flightNumber;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlAttribute(name = "ClassOfService")
    protected String classOfService;

    /**
     * Gets the value of the flightInfoDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInfoDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInfoDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInfoDetail }
     * 
     * 
     */
    public List<FlightInfoDetail> getFlightInfoDetail() {
        if (flightInfoDetail == null) {
            flightInfoDetail = new ArrayList<FlightInfoDetail>();
        }
        return this.flightInfoDetail;
    }

    /**
     * Gets the value of the flightInfoErrorMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInfoErrorMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInfoErrorMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeResultMessage }
     * 
     * 
     */
    public List<TypeResultMessage> getFlightInfoErrorMessage() {
        if (flightInfoErrorMessage == null) {
            flightInfoErrorMessage = new ArrayList<TypeResultMessage>();
        }
        return this.flightInfoErrorMessage;
    }

    /**
     * Gets the value of the criteriaKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaKey() {
        return criteriaKey;
    }

    /**
     * Sets the value of the criteriaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaKey(String value) {
        this.criteriaKey = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
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
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

}
