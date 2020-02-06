
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseSearchRsp;
import com.travelport.schema.common_v45_0.TypeDistance;


/**
 * Availability Search response
 * 
 * <p>Java class for BaseAvailabilitySearchRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseAvailabilitySearchRsp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseSearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FlightDetailsList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirSegmentList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareInfoList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareRemarkList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirItinerarySolution" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}HostTokenList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}APISRequirementsList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DistanceUnits" type="{http://www.travelport.com/schema/common_v45_0}typeDistance" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAvailabilitySearchRsp", propOrder = {
    "flightDetailsList",
    "airSegmentList",
    "fareInfoList",
    "fareRemarkList",
    "airItinerarySolution",
    "hostTokenList",
    "apisRequirementsList"
})
@XmlSeeAlso({
    AvailabilitySearchRsp.class,
    AirSearchRsp.class
})
public class BaseAvailabilitySearchRsp
    extends BaseSearchRsp
{

    @XmlElement(name = "FlightDetailsList")
    protected FlightDetailsList flightDetailsList;
    @XmlElement(name = "AirSegmentList")
    protected AirSegmentList airSegmentList;
    @XmlElement(name = "FareInfoList")
    protected FareInfoList fareInfoList;
    @XmlElement(name = "FareRemarkList")
    protected FareRemarkList fareRemarkList;
    @XmlElement(name = "AirItinerarySolution")
    protected List<AirItinerarySolution> airItinerarySolution;
    @XmlElement(name = "HostTokenList")
    protected HostTokenList hostTokenList;
    @XmlElement(name = "APISRequirementsList")
    protected APISRequirementsList apisRequirementsList;
    @XmlAttribute(name = "DistanceUnits")
    protected TypeDistance distanceUnits;

    /**
     * Gets the value of the flightDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsList }
     *     
     */
    public FlightDetailsList getFlightDetailsList() {
        return flightDetailsList;
    }

    /**
     * Sets the value of the flightDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsList }
     *     
     */
    public void setFlightDetailsList(FlightDetailsList value) {
        this.flightDetailsList = value;
    }

    /**
     * Gets the value of the airSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link AirSegmentList }
     *     
     */
    public AirSegmentList getAirSegmentList() {
        return airSegmentList;
    }

    /**
     * Sets the value of the airSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegmentList }
     *     
     */
    public void setAirSegmentList(AirSegmentList value) {
        this.airSegmentList = value;
    }

    /**
     * Gets the value of the fareInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link FareInfoList }
     *     
     */
    public FareInfoList getFareInfoList() {
        return fareInfoList;
    }

    /**
     * Sets the value of the fareInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInfoList }
     *     
     */
    public void setFareInfoList(FareInfoList value) {
        this.fareInfoList = value;
    }

    /**
     * Gets the value of the fareRemarkList property.
     * 
     * @return
     *     possible object is
     *     {@link FareRemarkList }
     *     
     */
    public FareRemarkList getFareRemarkList() {
        return fareRemarkList;
    }

    /**
     * Sets the value of the fareRemarkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRemarkList }
     *     
     */
    public void setFareRemarkList(FareRemarkList value) {
        this.fareRemarkList = value;
    }

    /**
     * Gets the value of the airItinerarySolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItinerarySolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirItinerarySolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirItinerarySolution }
     * 
     * 
     */
    public List<AirItinerarySolution> getAirItinerarySolution() {
        if (airItinerarySolution == null) {
            airItinerarySolution = new ArrayList<AirItinerarySolution>();
        }
        return this.airItinerarySolution;
    }

    /**
     * Gets the value of the hostTokenList property.
     * 
     * @return
     *     possible object is
     *     {@link HostTokenList }
     *     
     */
    public HostTokenList getHostTokenList() {
        return hostTokenList;
    }

    /**
     * Sets the value of the hostTokenList property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTokenList }
     *     
     */
    public void setHostTokenList(HostTokenList value) {
        this.hostTokenList = value;
    }

    /**
     * Gets the value of the apisRequirementsList property.
     * 
     * @return
     *     possible object is
     *     {@link APISRequirementsList }
     *     
     */
    public APISRequirementsList getAPISRequirementsList() {
        return apisRequirementsList;
    }

    /**
     * Sets the value of the apisRequirementsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRequirementsList }
     *     
     */
    public void setAPISRequirementsList(APISRequirementsList value) {
        this.apisRequirementsList = value;
    }

    /**
     * Gets the value of the distanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDistance }
     *     
     */
    public TypeDistance getDistanceUnits() {
        return distanceUnits;
    }

    /**
     * Sets the value of the distanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDistance }
     *     
     */
    public void setDistanceUnits(TypeDistance value) {
        this.distanceUnits = value;
    }

}
