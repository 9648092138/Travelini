
package com.travelport.schema.hotel_v45_0;

import java.math.BigInteger;
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
 *       &lt;choice&gt;
 *         &lt;element name="Rating" type="{http://www.travelport.com/schema/hotel_v45_0}typeSimpleHotelRating" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}RatingRange"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="RatingProvider" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rating",
    "ratingRange"
})
@XmlRootElement(name = "HotelRating")
public class HotelRating {

    @XmlElement(name = "Rating")
    protected List<BigInteger> rating;
    @XmlElement(name = "RatingRange")
    protected RatingRange ratingRange;
    @XmlAttribute(name = "RatingProvider", required = true)
    protected String ratingProvider;

    /**
     * Gets the value of the rating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getRating() {
        if (rating == null) {
            rating = new ArrayList<BigInteger>();
        }
        return this.rating;
    }

    /**
     * Search for a range of ratings
     * 
     * @return
     *     possible object is
     *     {@link RatingRange }
     *     
     */
    public RatingRange getRatingRange() {
        return ratingRange;
    }

    /**
     * Sets the value of the ratingRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingRange }
     *     
     */
    public void setRatingRange(RatingRange value) {
        this.ratingRange = value;
    }

    /**
     * Gets the value of the ratingProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingProvider() {
        return ratingProvider;
    }

    /**
     * Sets the value of the ratingProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingProvider(String value) {
        this.ratingProvider = value;
    }

}
