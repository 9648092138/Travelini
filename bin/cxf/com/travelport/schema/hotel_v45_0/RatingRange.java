
package com.travelport.schema.hotel_v45_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Search for a range of rating
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="MinimumRating" type="{http://www.travelport.com/schema/hotel_v45_0}typeSimpleHotelRating" /&gt;
 *       &lt;attribute name="MaximumRating" type="{http://www.travelport.com/schema/hotel_v45_0}typeSimpleHotelRating" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RatingRange")
public class RatingRange {

    @XmlAttribute(name = "MinimumRating")
    protected BigInteger minimumRating;
    @XmlAttribute(name = "MaximumRating")
    protected BigInteger maximumRating;

    /**
     * Gets the value of the minimumRating property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumRating() {
        return minimumRating;
    }

    /**
     * Sets the value of the minimumRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumRating(BigInteger value) {
        this.minimumRating = value;
    }

    /**
     * Gets the value of the maximumRating property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumRating() {
        return maximumRating;
    }

    /**
     * Sets the value of the maximumRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumRating(BigInteger value) {
        this.maximumRating = value;
    }

}
