
package com.travelport.schema.hotel_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseReq;
import com.travelport.schema.common_v45_0.PermittedProviders;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}PermittedProviders" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelProperty" maxOccurs="20"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SecureLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="SizeCode" type="{http://www.travelport.com/schema/hotel_v45_0}typeRequestedImageSize" default="A" /&gt;
 *       &lt;attribute name="RichMedia" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="Gallery" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedProviders",
    "hotelProperty"
})
@XmlRootElement(name = "HotelMediaLinksReq")
public class HotelMediaLinksReq
    extends BaseReq
{

    @XmlElement(name = "PermittedProviders", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected PermittedProviders permittedProviders;
    @XmlElement(name = "HotelProperty", required = true)
    protected List<HotelProperty> hotelProperty;
    @XmlAttribute(name = "SecureLinks")
    protected Boolean secureLinks;
    @XmlAttribute(name = "SizeCode")
    protected String sizeCode;
    @XmlAttribute(name = "RichMedia")
    protected Boolean richMedia;
    @XmlAttribute(name = "Gallery")
    protected Boolean gallery;

    /**
     * Gets the value of the permittedProviders property.
     * 
     * @return
     *     possible object is
     *     {@link PermittedProviders }
     *     
     */
    public PermittedProviders getPermittedProviders() {
        return permittedProviders;
    }

    /**
     * Sets the value of the permittedProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedProviders }
     *     
     */
    public void setPermittedProviders(PermittedProviders value) {
        this.permittedProviders = value;
    }

    /**
     * Gets the value of the hotelProperty property.
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
     * Gets the value of the secureLinks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSecureLinks() {
        if (secureLinks == null) {
            return true;
        } else {
            return secureLinks;
        }
    }

    /**
     * Sets the value of the secureLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecureLinks(Boolean value) {
        this.secureLinks = value;
    }

    /**
     * Gets the value of the sizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCode() {
        if (sizeCode == null) {
            return "A";
        } else {
            return sizeCode;
        }
    }

    /**
     * Sets the value of the sizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCode(String value) {
        this.sizeCode = value;
    }

    /**
     * Gets the value of the richMedia property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRichMedia() {
        if (richMedia == null) {
            return true;
        } else {
            return richMedia;
        }
    }

    /**
     * Sets the value of the richMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRichMedia(Boolean value) {
        this.richMedia = value;
    }

    /**
     * Gets the value of the gallery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGallery() {
        if (gallery == null) {
            return true;
        } else {
            return gallery;
        }
    }

    /**
     * Sets the value of the gallery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGallery(Boolean value) {
        this.gallery = value;
    }

}
