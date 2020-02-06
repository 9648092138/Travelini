
package com.travelport.schema.air_v45_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Option" maxOccurs="999"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LegRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "option"
})
@XmlRootElement(name = "FlightOption")
public class FlightOption {

    @XmlElement(name = "Option", required = true)
    protected List<Option> option;
    @XmlAttribute(name = "LegRef")
    protected String legRef;
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;

    /**
     * List of BookingInfo available for the search air leg.Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Option }
     * 
     * 
     */
    public List<Option> getOption() {
        if (option == null) {
            option = new ArrayList<Option>();
        }
        return this.option;
    }

    /**
     * Gets the value of the legRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegRef() {
        return legRef;
    }

    /**
     * Sets the value of the legRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegRef(String value) {
        this.legRef = value;
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

}
