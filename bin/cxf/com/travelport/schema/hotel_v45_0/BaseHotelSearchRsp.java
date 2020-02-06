
package com.travelport.schema.hotel_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseSearchRsp;
import com.travelport.schema.common_v45_0.HostToken;
import com.travelport.schema.common_v45_0.MarketingInformation;


/**
 * 
 *                 Base hotel Search Response
 *             
 * 
 * <p>Java class for BaseHotelSearchRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseHotelSearchRsp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseSearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferencePoint" type="{http://www.travelport.com/schema/hotel_v45_0}typeHotelReferencePoint" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelSearchResult" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}MarketingInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}HostToken" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AddressSearchQuality" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseHotelSearchRsp", propOrder = {
    "referencePoint",
    "hotelSearchResult",
    "marketingInformation",
    "hostToken"
})
@XmlSeeAlso({
    RetrieveHotelSearchAvailabilityRsp.class,
    HotelSearchAvailabilityAsynchRsp.class
})
public class BaseHotelSearchRsp
    extends BaseSearchRsp
{

    @XmlElement(name = "ReferencePoint")
    protected TypeHotelReferencePoint referencePoint;
    @XmlElement(name = "HotelSearchResult")
    protected List<HotelSearchResult> hotelSearchResult;
    @XmlElement(name = "MarketingInformation", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected MarketingInformation marketingInformation;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected HostToken hostToken;
    @XmlAttribute(name = "AddressSearchQuality")
    protected Integer addressSearchQuality;

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
     * Gets the value of the hotelSearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelSearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchResult }
     * 
     * 
     */
    public List<HotelSearchResult> getHotelSearchResult() {
        if (hotelSearchResult == null) {
            hotelSearchResult = new ArrayList<HotelSearchResult>();
        }
        return this.hotelSearchResult;
    }

    /**
     * Gets the value of the marketingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingInformation }
     *     
     */
    public MarketingInformation getMarketingInformation() {
        return marketingInformation;
    }

    /**
     * Sets the value of the marketingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingInformation }
     *     
     */
    public void setMarketingInformation(MarketingInformation value) {
        this.marketingInformation = value;
    }

    /**
     * Gets the value of the hostToken property.
     * 
     * @return
     *     possible object is
     *     {@link HostToken }
     *     
     */
    public HostToken getHostToken() {
        return hostToken;
    }

    /**
     * Sets the value of the hostToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostToken }
     *     
     */
    public void setHostToken(HostToken value) {
        this.hostToken = value;
    }

    /**
     * Gets the value of the addressSearchQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddressSearchQuality() {
        return addressSearchQuality;
    }

    /**
     * Sets the value of the addressSearchQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddressSearchQuality(Integer value) {
        this.addressSearchQuality = value;
    }

}
