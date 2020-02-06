
package com.travelport.schema.hotel_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseReq;
import com.travelport.schema.common_v45_0.PointOfSale;


/**
 * Base request for all hotel details search request..
 * 
 * <p>Java class for BaseHotelDetailsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseHotelDetailsReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelProperty"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelDetailsModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PointOfSale" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseHotelDetailsReq", propOrder = {
    "hotelProperty",
    "hotelDetailsModifiers",
    "pointOfSale"
})
@XmlSeeAlso({
    HotelDetailsReq.class
})
public class BaseHotelDetailsReq
    extends BaseReq
{

    @XmlElement(name = "HotelProperty", required = true)
    protected HotelProperty hotelProperty;
    @XmlElement(name = "HotelDetailsModifiers")
    protected HotelDetailsModifiers hotelDetailsModifiers;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected PointOfSale pointOfSale;

    /**
     * Gets the value of the hotelProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty }
     *     
     */
    public HotelProperty getHotelProperty() {
        return hotelProperty;
    }

    /**
     * Sets the value of the hotelProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProperty }
     *     
     */
    public void setHotelProperty(HotelProperty value) {
        this.hotelProperty = value;
    }

    /**
     * Gets the value of the hotelDetailsModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDetailsModifiers }
     *     
     */
    public HotelDetailsModifiers getHotelDetailsModifiers() {
        return hotelDetailsModifiers;
    }

    /**
     * Sets the value of the hotelDetailsModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDetailsModifiers }
     *     
     */
    public void setHotelDetailsModifiers(HotelDetailsModifiers value) {
        this.hotelDetailsModifiers = value;
    }

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSale }
     *     
     */
    public PointOfSale getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSale }
     *     
     */
    public void setPointOfSale(PointOfSale value) {
        this.pointOfSale = value;
    }

}
