
package com.travelport.schema.hotel_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.CorporateDiscountID;
import com.travelport.schema.common_v45_0.MediaItem;
import com.travelport.schema.common_v45_0.TypeResultMessage;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}VendorLocation" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelProperty" maxOccurs="999"/&gt;
 *         &lt;element name="HotelSearchError" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.travelport.com/schema/common_v45_0&gt;typeResultMessage"&gt;
 *                 &lt;attribute name="RateSupplier" type="{http://www.travelport.com/schema/common_v45_0}typeThirdPartySupplier" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CorporateDiscountID" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}RateInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}MediaItem" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}PropertyDescription" minOccurs="0"/&gt;
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
    "vendorLocation",
    "hotelProperty",
    "hotelSearchError",
    "corporateDiscountID",
    "rateInfo",
    "mediaItem",
    "hotelType",
    "propertyDescription"
})
@XmlRootElement(name = "HotelSearchResult")
public class HotelSearchResult {

    @XmlElement(name = "VendorLocation", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<VendorLocation> vendorLocation;
    @XmlElement(name = "HotelProperty", required = true)
    protected List<HotelProperty> hotelProperty;
    @XmlElement(name = "HotelSearchError")
    protected List<HotelSearchResult.HotelSearchError> hotelSearchError;
    @XmlElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<CorporateDiscountID> corporateDiscountID;
    @XmlElement(name = "RateInfo")
    protected List<RateInfo> rateInfo;
    @XmlElement(name = "MediaItem", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected MediaItem mediaItem;
    @XmlElement(name = "HotelType")
    protected HotelType hotelType;
    @XmlElement(name = "PropertyDescription")
    protected PropertyDescription propertyDescription;

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
     * The hotel property. Multiple property can only be supported with TRM and GDS property aggrigation.Gets the value of the hotelProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelProperty }
     * 
     * 
     */
    public List<HotelProperty> getHotelProperty() {
        if (hotelProperty == null) {
            hotelProperty = new ArrayList<HotelProperty>();
        }
        return this.hotelProperty;
    }

    /**
     * Gets the value of the hotelSearchError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelSearchError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelSearchError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchResult.HotelSearchError }
     * 
     * 
     */
    public List<HotelSearchResult.HotelSearchError> getHotelSearchError() {
        if (hotelSearchError == null) {
            hotelSearchError = new ArrayList<HotelSearchResult.HotelSearchError>();
        }
        return this.hotelSearchError;
    }

    /**
     * Gets the value of the corporateDiscountID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateDiscountID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateDiscountID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateDiscountID }
     * 
     * 
     */
    public List<CorporateDiscountID> getCorporateDiscountID() {
        if (corporateDiscountID == null) {
            corporateDiscountID = new ArrayList<CorporateDiscountID>();
        }
        return this.corporateDiscountID;
    }

    /**
     * Gets the value of the rateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateInfo }
     * 
     * 
     */
    public List<RateInfo> getRateInfo() {
        if (rateInfo == null) {
            rateInfo = new ArrayList<RateInfo>();
        }
        return this.rateInfo;
    }

    /**
     * Gets the value of the mediaItem property.
     * 
     * @return
     *     possible object is
     *     {@link MediaItem }
     *     
     */
    public MediaItem getMediaItem() {
        return mediaItem;
    }

    /**
     * Sets the value of the mediaItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaItem }
     *     
     */
    public void setMediaItem(MediaItem value) {
        this.mediaItem = value;
    }

    /**
     * Supported Providers:1P/1J
     * 
     * @return
     *     possible object is
     *     {@link HotelType }
     *     
     */
    public HotelType getHotelType() {
        return hotelType;
    }

    /**
     * Sets the value of the hotelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelType }
     *     
     */
    public void setHotelType(HotelType value) {
        this.hotelType = value;
    }

    /**
     * Hotel Property description. Maximum of 100 words returned. Supported Providers: TRM
     * 
     * @return
     *     possible object is
     *     {@link PropertyDescription }
     *     
     */
    public PropertyDescription getPropertyDescription() {
        return propertyDescription;
    }

    /**
     * Sets the value of the propertyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDescription }
     *     
     */
    public void setPropertyDescription(PropertyDescription value) {
        this.propertyDescription = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.travelport.com/schema/common_v45_0&gt;typeResultMessage"&gt;
     *       &lt;attribute name="RateSupplier" type="{http://www.travelport.com/schema/common_v45_0}typeThirdPartySupplier" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelSearchError
        extends TypeResultMessage
    {

        @XmlAttribute(name = "RateSupplier")
        protected String rateSupplier;

        /**
         * Gets the value of the rateSupplier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateSupplier() {
            return rateSupplier;
        }

        /**
         * Sets the value of the rateSupplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateSupplier(String value) {
            this.rateSupplier = value;
        }

    }

}
