
package com.travelport.schema.hotel_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.MediaItem;
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
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelProperty"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}MediaItem" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="MediaResultMessage" type="{http://www.travelport.com/schema/common_v45_0}typeResultMessage" maxOccurs="999" minOccurs="0"/&gt;
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
    "hotelProperty",
    "mediaItem",
    "mediaResultMessage"
})
@XmlRootElement(name = "HotelPropertyWithMediaItems")
public class HotelPropertyWithMediaItems {

    @XmlElement(name = "HotelProperty", required = true)
    protected HotelProperty hotelProperty;
    @XmlElement(name = "MediaItem", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<MediaItem> mediaItem;
    @XmlElement(name = "MediaResultMessage")
    protected List<TypeResultMessage> mediaResultMessage;

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
     * Photos and other media urls for the item referenced above.Gets the value of the mediaItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaItem }
     * 
     * 
     */
    public List<MediaItem> getMediaItem() {
        if (mediaItem == null) {
            mediaItem = new ArrayList<MediaItem>();
        }
        return this.mediaItem;
    }

    /**
     * Gets the value of the mediaResultMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaResultMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaResultMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeResultMessage }
     * 
     * 
     */
    public List<TypeResultMessage> getMediaResultMessage() {
        if (mediaResultMessage == null) {
            mediaResultMessage = new ArrayList<TypeResultMessage>();
        }
        return this.mediaResultMessage;
    }

}
