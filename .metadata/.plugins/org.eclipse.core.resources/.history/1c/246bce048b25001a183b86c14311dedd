
package com.travelport.schema.hotel_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseReq;


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
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelProperty"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelRateDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelProperty",
    "hotelRateDetail"
})
@XmlRootElement(name = "HotelUpsellDetailsReq")
public class HotelUpsellDetailsReq
    extends BaseReq
{

    @XmlElement(name = "HotelProperty", required = true)
    protected HotelProperty hotelProperty;
    @XmlElement(name = "HotelRateDetail")
    protected HotelRateDetail hotelRateDetail;

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
     * Only returned if number of adults and   checkin/checkout given on request
     * 
     * @return
     *     possible object is
     *     {@link HotelRateDetail }
     *     
     */
    public HotelRateDetail getHotelRateDetail() {
        return hotelRateDetail;
    }

    /**
     * Sets the value of the hotelRateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateDetail }
     *     
     */
    public void setHotelRateDetail(HotelRateDetail value) {
        this.hotelRateDetail = value;
    }

}
