
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.rail_v45_0.RailFareIDList;
import com.travelport.schema.rail_v45_0.RailFareList;
import com.travelport.schema.rail_v45_0.RailFareNoteList;
import com.travelport.schema.rail_v45_0.RailJourneyList;
import com.travelport.schema.rail_v45_0.RailPricingSolution;
import com.travelport.schema.rail_v45_0.RailSegmentList;


/**
 * Base Response for Air Search
 * 
 * <p>Java class for AirSearchRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSearchRsp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/air_v45_0}BaseAvailabilitySearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareNoteList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ExpertSolutionList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}RouteList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AlternateRouteList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AlternateLocationDistanceList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareInfoMessage" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirPricingSolution" maxOccurs="999" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirPricePointList" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailSegmentList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailJourneyList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailFareNoteList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailFareIDList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailFareList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailPricingSolution" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSearchRsp", propOrder = {
    "fareNoteList",
    "expertSolutionList",
    "routeList",
    "alternateRouteList",
    "alternateLocationDistanceList",
    "fareInfoMessage",
    "airPricingSolution",
    "airPricePointList",
    "railSegmentList",
    "railJourneyList",
    "railFareNoteList",
    "railFareIDList",
    "railFareList",
    "railPricingSolution"
})
@XmlSeeAlso({
    LowFareSearchAsynchRsp.class,
    LowFareSearchRsp.class,
    RetrieveLowFareSearchRsp.class,
    ScheduleSearchRsp.class
})
public class AirSearchRsp
    extends BaseAvailabilitySearchRsp
{

    @XmlElement(name = "FareNoteList")
    protected FareNoteList fareNoteList;
    @XmlElement(name = "ExpertSolutionList")
    protected ExpertSolutionList expertSolutionList;
    @XmlElement(name = "RouteList")
    protected RouteList routeList;
    @XmlElement(name = "AlternateRouteList")
    protected AlternateRouteList alternateRouteList;
    @XmlElement(name = "AlternateLocationDistanceList")
    protected AlternateLocationDistanceList alternateLocationDistanceList;
    @XmlElement(name = "FareInfoMessage")
    protected List<FareInfoMessage> fareInfoMessage;
    @XmlElement(name = "AirPricingSolution")
    protected List<AirPricingSolution> airPricingSolution;
    @XmlElement(name = "AirPricePointList")
    protected AirPricePointList airPricePointList;
    @XmlElement(name = "RailSegmentList", namespace = "http://www.travelport.com/schema/rail_v45_0")
    protected RailSegmentList railSegmentList;
    @XmlElement(name = "RailJourneyList", namespace = "http://www.travelport.com/schema/rail_v45_0")
    protected RailJourneyList railJourneyList;
    @XmlElement(name = "RailFareNoteList", namespace = "http://www.travelport.com/schema/rail_v45_0")
    protected RailFareNoteList railFareNoteList;
    @XmlElement(name = "RailFareIDList", namespace = "http://www.travelport.com/schema/rail_v45_0")
    protected RailFareIDList railFareIDList;
    @XmlElement(name = "RailFareList", namespace = "http://www.travelport.com/schema/rail_v45_0")
    protected RailFareList railFareList;
    @XmlElement(name = "RailPricingSolution", namespace = "http://www.travelport.com/schema/rail_v45_0")
    protected List<RailPricingSolution> railPricingSolution;

    /**
     * Gets the value of the fareNoteList property.
     * 
     * @return
     *     possible object is
     *     {@link FareNoteList }
     *     
     */
    public FareNoteList getFareNoteList() {
        return fareNoteList;
    }

    /**
     * Sets the value of the fareNoteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareNoteList }
     *     
     */
    public void setFareNoteList(FareNoteList value) {
        this.fareNoteList = value;
    }

    /**
     * Gets the value of the expertSolutionList property.
     * 
     * @return
     *     possible object is
     *     {@link ExpertSolutionList }
     *     
     */
    public ExpertSolutionList getExpertSolutionList() {
        return expertSolutionList;
    }

    /**
     * Sets the value of the expertSolutionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpertSolutionList }
     *     
     */
    public void setExpertSolutionList(ExpertSolutionList value) {
        this.expertSolutionList = value;
    }

    /**
     * Gets the value of the routeList property.
     * 
     * @return
     *     possible object is
     *     {@link RouteList }
     *     
     */
    public RouteList getRouteList() {
        return routeList;
    }

    /**
     * Sets the value of the routeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteList }
     *     
     */
    public void setRouteList(RouteList value) {
        this.routeList = value;
    }

    /**
     * Gets the value of the alternateRouteList property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateRouteList }
     *     
     */
    public AlternateRouteList getAlternateRouteList() {
        return alternateRouteList;
    }

    /**
     * Sets the value of the alternateRouteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateRouteList }
     *     
     */
    public void setAlternateRouteList(AlternateRouteList value) {
        this.alternateRouteList = value;
    }

    /**
     * Gets the value of the alternateLocationDistanceList property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateLocationDistanceList }
     *     
     */
    public AlternateLocationDistanceList getAlternateLocationDistanceList() {
        return alternateLocationDistanceList;
    }

    /**
     * Sets the value of the alternateLocationDistanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateLocationDistanceList }
     *     
     */
    public void setAlternateLocationDistanceList(AlternateLocationDistanceList value) {
        this.alternateLocationDistanceList = value;
    }

    /**
     * Gets the value of the fareInfoMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfoMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareInfoMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoMessage }
     * 
     * 
     */
    public List<FareInfoMessage> getFareInfoMessage() {
        if (fareInfoMessage == null) {
            fareInfoMessage = new ArrayList<FareInfoMessage>();
        }
        return this.fareInfoMessage;
    }

    /**
     * Gets the value of the airPricingSolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingSolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingSolution }
     * 
     * 
     */
    public List<AirPricingSolution> getAirPricingSolution() {
        if (airPricingSolution == null) {
            airPricingSolution = new ArrayList<AirPricingSolution>();
        }
        return this.airPricingSolution;
    }

    /**
     * Gets the value of the airPricePointList property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricePointList }
     *     
     */
    public AirPricePointList getAirPricePointList() {
        return airPricePointList;
    }

    /**
     * Sets the value of the airPricePointList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricePointList }
     *     
     */
    public void setAirPricePointList(AirPricePointList value) {
        this.airPricePointList = value;
    }

    /**
     * Gets the value of the railSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link RailSegmentList }
     *     
     */
    public RailSegmentList getRailSegmentList() {
        return railSegmentList;
    }

    /**
     * Sets the value of the railSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSegmentList }
     *     
     */
    public void setRailSegmentList(RailSegmentList value) {
        this.railSegmentList = value;
    }

    /**
     * Gets the value of the railJourneyList property.
     * 
     * @return
     *     possible object is
     *     {@link RailJourneyList }
     *     
     */
    public RailJourneyList getRailJourneyList() {
        return railJourneyList;
    }

    /**
     * Sets the value of the railJourneyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailJourneyList }
     *     
     */
    public void setRailJourneyList(RailJourneyList value) {
        this.railJourneyList = value;
    }

    /**
     * Gets the value of the railFareNoteList property.
     * 
     * @return
     *     possible object is
     *     {@link RailFareNoteList }
     *     
     */
    public RailFareNoteList getRailFareNoteList() {
        return railFareNoteList;
    }

    /**
     * Sets the value of the railFareNoteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareNoteList }
     *     
     */
    public void setRailFareNoteList(RailFareNoteList value) {
        this.railFareNoteList = value;
    }

    /**
     * Gets the value of the railFareIDList property.
     * 
     * @return
     *     possible object is
     *     {@link RailFareIDList }
     *     
     */
    public RailFareIDList getRailFareIDList() {
        return railFareIDList;
    }

    /**
     * Sets the value of the railFareIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareIDList }
     *     
     */
    public void setRailFareIDList(RailFareIDList value) {
        this.railFareIDList = value;
    }

    /**
     * Gets the value of the railFareList property.
     * 
     * @return
     *     possible object is
     *     {@link RailFareList }
     *     
     */
    public RailFareList getRailFareList() {
        return railFareList;
    }

    /**
     * Sets the value of the railFareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareList }
     *     
     */
    public void setRailFareList(RailFareList value) {
        this.railFareList = value;
    }

    /**
     * Gets the value of the railPricingSolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railPricingSolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPricingSolution }
     * 
     * 
     */
    public List<RailPricingSolution> getRailPricingSolution() {
        if (railPricingSolution == null) {
            railPricingSolution = new ArrayList<RailPricingSolution>();
        }
        return this.railPricingSolution;
    }

}
