
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.AgencySellInfo;
import com.travelport.schema.common_v45_0.BaseReq;
import com.travelport.schema.common_v45_0.HostToken;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}AgencySellInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirSegment" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}HostToken" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}SearchTraveler" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}HostReservation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}MerchandisingPricingModifiers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReturnSeatPricing" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReturnBrandingInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agencySellInfo",
    "airSegment",
    "hostToken",
    "searchTraveler",
    "hostReservation",
    "merchandisingPricingModifiers"
})
@XmlRootElement(name = "SeatMapReq")
public class SeatMapReq
    extends BaseReq
{

    @XmlElement(name = "AgencySellInfo", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected AgencySellInfo agencySellInfo;
    @XmlElement(name = "AirSegment")
    protected List<TypeBaseAirSegment> airSegment;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<HostToken> hostToken;
    @XmlElement(name = "SearchTraveler")
    protected List<SearchTraveler> searchTraveler;
    @XmlElement(name = "HostReservation")
    protected HostReservation hostReservation;
    @XmlElement(name = "MerchandisingPricingModifiers")
    protected MerchandisingPricingModifiers merchandisingPricingModifiers;
    @XmlAttribute(name = "ReturnSeatPricing", required = true)
    protected boolean returnSeatPricing;
    @XmlAttribute(name = "ReturnBrandingInfo")
    protected Boolean returnBrandingInfo;

    /**
     * 
     *                                     Provider: ACH-Required if the user requesting the seat map is not the same agent authenticated in the request.
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link AgencySellInfo }
     *     
     */
    public AgencySellInfo getAgencySellInfo() {
        return agencySellInfo;
    }

    /**
     * Sets the value of the agencySellInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencySellInfo }
     *     
     */
    public void setAgencySellInfo(AgencySellInfo value) {
        this.agencySellInfo = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,MCH.Gets the value of the airSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseAirSegment }
     * 
     * 
     */
    public List<TypeBaseAirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<TypeBaseAirSegment>();
        }
        return this.airSegment;
    }

    /**
     * Provider: ACH-Required if the carrier has multiple adapters.Gets the value of the hostToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * 
     * 
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<HostToken>();
        }
        return this.hostToken;
    }

    /**
     * Provider: 1G,1V,ACH,MCH.Gets the value of the searchTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTraveler }
     * 
     * 
     */
    public List<SearchTraveler> getSearchTraveler() {
        if (searchTraveler == null) {
            searchTraveler = new ArrayList<SearchTraveler>();
        }
        return this.searchTraveler;
    }

    /**
     * Provider: ACH,MCH-Required when seat price is requested.
     * 
     * @return
     *     possible object is
     *     {@link HostReservation }
     *     
     */
    public HostReservation getHostReservation() {
        return hostReservation;
    }

    /**
     * Sets the value of the hostReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostReservation }
     *     
     */
    public void setHostReservation(HostReservation value) {
        this.hostReservation = value;
    }

    /**
     * Used to provide additional pricing options. Provider:ACH.
     * 
     * @return
     *     possible object is
     *     {@link MerchandisingPricingModifiers }
     *     
     */
    public MerchandisingPricingModifiers getMerchandisingPricingModifiers() {
        return merchandisingPricingModifiers;
    }

    /**
     * Sets the value of the merchandisingPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandisingPricingModifiers }
     *     
     */
    public void setMerchandisingPricingModifiers(MerchandisingPricingModifiers value) {
        this.merchandisingPricingModifiers = value;
    }

    /**
     * Gets the value of the returnSeatPricing property.
     * 
     */
    public boolean isReturnSeatPricing() {
        return returnSeatPricing;
    }

    /**
     * Sets the value of the returnSeatPricing property.
     * 
     */
    public void setReturnSeatPricing(boolean value) {
        this.returnSeatPricing = value;
    }

    /**
     * Gets the value of the returnBrandingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnBrandingInfo() {
        if (returnBrandingInfo == null) {
            return false;
        } else {
            return returnBrandingInfo;
        }
    }

    /**
     * Sets the value of the returnBrandingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnBrandingInfo(Boolean value) {
        this.returnBrandingInfo = value;
    }

}
