
package com.travelport.schema.hotel_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseSearchReq;
import com.travelport.schema.common_v45_0.PointOfSale;


/**
 * 
 *                 Base hotel Search Request
 *             
 * 
 * <p>Java class for BaseHotelSearchReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseHotelSearchReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseSearchReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelSearchLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelSearchModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelStay"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PointOfSale" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PolicyReference" type="{http://www.travelport.com/schema/common_v45_0}typePolicyReference" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseHotelSearchReq", propOrder = {
    "hotelSearchLocation",
    "hotelSearchModifiers",
    "hotelStay",
    "pointOfSale"
})
@XmlSeeAlso({
    HotelSearchAvailabilityReq.class
})
public class BaseHotelSearchReq
    extends BaseSearchReq
{

    @XmlElement(name = "HotelSearchLocation")
    protected HotelSearchLocation hotelSearchLocation;
    @XmlElement(name = "HotelSearchModifiers")
    protected HotelSearchModifiers hotelSearchModifiers;
    @XmlElement(name = "HotelStay", required = true)
    protected HotelStay hotelStay;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected PointOfSale pointOfSale;
    @XmlAttribute(name = "PolicyReference")
    protected String policyReference;

    /**
     * Gets the value of the hotelSearchLocation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchLocation }
     *     
     */
    public HotelSearchLocation getHotelSearchLocation() {
        return hotelSearchLocation;
    }

    /**
     * Sets the value of the hotelSearchLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchLocation }
     *     
     */
    public void setHotelSearchLocation(HotelSearchLocation value) {
        this.hotelSearchLocation = value;
    }

    /**
     * Gets the value of the hotelSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchModifiers }
     *     
     */
    public HotelSearchModifiers getHotelSearchModifiers() {
        return hotelSearchModifiers;
    }

    /**
     * Sets the value of the hotelSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchModifiers }
     *     
     */
    public void setHotelSearchModifiers(HotelSearchModifiers value) {
        this.hotelSearchModifiers = value;
    }

    /**
     * Gets the value of the hotelStay property.
     * 
     * @return
     *     possible object is
     *     {@link HotelStay }
     *     
     */
    public HotelStay getHotelStay() {
        return hotelStay;
    }

    /**
     * Sets the value of the hotelStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelStay }
     *     
     */
    public void setHotelStay(HotelStay value) {
        this.hotelStay = value;
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

    /**
     * Gets the value of the policyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyReference() {
        return policyReference;
    }

    /**
     * Sets the value of the policyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyReference(String value) {
        this.policyReference = value;
    }

}
