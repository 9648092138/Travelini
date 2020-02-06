
package com.travelport.schema.hotel_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="Location" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *       &lt;attribute name="LocationType" type="{http://www.travelport.com/schema/hotel_v45_0}typeHotelLocation" default="Airport" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "HotelLocation")
public class HotelLocation {

    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "LocationType")
    protected TypeHotelLocation locationType;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHotelLocation }
     *     
     */
    public TypeHotelLocation getLocationType() {
        if (locationType == null) {
            return TypeHotelLocation.AIRPORT;
        } else {
            return locationType;
        }
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHotelLocation }
     *     
     */
    public void setLocationType(TypeHotelLocation value) {
        this.locationType = value;
    }

}
