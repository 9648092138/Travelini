
package com.travelport.schema.hotel_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.CoordinateLocation;
import com.travelport.schema.common_v45_0.Distance;
import com.travelport.schema.common_v45_0.TypeStructuredAddress;
import com.travelport.schema.common_v45_0.VendorLocation;


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
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}ProviderLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}VendorLocation" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="HotelAddress" type="{http://www.travelport.com/schema/common_v45_0}typeStructuredAddress" minOccurs="0"/&gt;
 *         &lt;element name="ReferencePoint" type="{http://www.travelport.com/schema/hotel_v45_0}typeHotelReferencePoint" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CoordinateLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Distance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelLocation",
    "providerLocation",
    "vendorLocation",
    "hotelAddress",
    "referencePoint",
    "coordinateLocation",
    "distance"
})
@XmlRootElement(name = "HotelSearchLocation")
public class HotelSearchLocation {

    @XmlElement(name = "HotelLocation")
    protected HotelLocation hotelLocation;
    @XmlElement(name = "ProviderLocation")
    protected ProviderLocation providerLocation;
    @XmlElement(name = "VendorLocation", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<VendorLocation> vendorLocation;
    @XmlElement(name = "HotelAddress")
    protected TypeStructuredAddress hotelAddress;
    @XmlElement(name = "ReferencePoint")
    protected TypeHotelReferencePoint referencePoint;
    @XmlElement(name = "CoordinateLocation", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected CoordinateLocation coordinateLocation;
    @XmlElement(name = "Distance", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected Distance distance;

    /**
     * Date and Location information for the Hotel.
     * 
     * @return
     *     possible object is
     *     {@link HotelLocation }
     *     
     */
    public HotelLocation getHotelLocation() {
        return hotelLocation;
    }

    /**
     * Sets the value of the hotelLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelLocation }
     *     
     */
    public void setHotelLocation(HotelLocation value) {
        this.hotelLocation = value;
    }

    /**
     * Provider specific Hotel location.  Applicable for TRM only.
     * 
     * @return
     *     possible object is
     *     {@link ProviderLocation }
     *     
     */
    public ProviderLocation getProviderLocation() {
        return providerLocation;
    }

    /**
     * Sets the value of the providerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderLocation }
     *     
     */
    public void setProviderLocation(ProviderLocation value) {
        this.providerLocation = value;
    }

    /**
     * Gets the value of the vendorLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorLocation }
     * 
     * 
     */
    public List<VendorLocation> getVendorLocation() {
        if (vendorLocation == null) {
            vendorLocation = new ArrayList<VendorLocation>();
        }
        return this.vendorLocation;
    }

    /**
     * Gets the value of the hotelAddress property.
     * 
     * @return
     *     possible object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public TypeStructuredAddress getHotelAddress() {
        return hotelAddress;
    }

    /**
     * Sets the value of the hotelAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public void setHotelAddress(TypeStructuredAddress value) {
        this.hotelAddress = value;
    }

    /**
     * Gets the value of the referencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHotelReferencePoint }
     *     
     */
    public TypeHotelReferencePoint getReferencePoint() {
        return referencePoint;
    }

    /**
     * Sets the value of the referencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHotelReferencePoint }
     *     
     */
    public void setReferencePoint(TypeHotelReferencePoint value) {
        this.referencePoint = value;
    }

    /**
     * Search using latitude and longitude.  Applicable for 1G, 1V only. Not applicable for HotelSuperShopper
     * 
     * @return
     *     possible object is
     *     {@link CoordinateLocation }
     *     
     */
    public CoordinateLocation getCoordinateLocation() {
        return coordinateLocation;
    }

    /**
     * Sets the value of the coordinateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateLocation }
     *     
     */
    public void setCoordinateLocation(CoordinateLocation value) {
        this.coordinateLocation = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

}
