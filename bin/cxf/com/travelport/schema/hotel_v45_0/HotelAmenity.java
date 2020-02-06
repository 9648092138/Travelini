
package com.travelport.schema.hotel_v45_0;

import java.math.BigInteger;
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
 *       &lt;attribute name="Level" use="required" type="{http://www.travelport.com/schema/hotel_v45_0}typeAmenityLevel" /&gt;
 *       &lt;attribute name="AmenityCode" use="required" type="{http://www.travelport.com/schema/hotel_v45_0}typeAmenityCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "HotelAmenity")
public class HotelAmenity {

    @XmlAttribute(name = "Level", required = true)
    protected TypeAmenityLevel level;
    @XmlAttribute(name = "AmenityCode", required = true)
    protected BigInteger amenityCode;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAmenityLevel }
     *     
     */
    public TypeAmenityLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAmenityLevel }
     *     
     */
    public void setLevel(TypeAmenityLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the amenityCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmenityCode() {
        return amenityCode;
    }

    /**
     * Sets the value of the amenityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmenityCode(BigInteger value) {
        this.amenityCode = value;
    }

}
