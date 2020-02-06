
package com.travelport.schema.common_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeSearchLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeSearchLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Airport" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/common_v45_0}City" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CityOrAirport" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/common_v45_0}CoordinateLocation" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/common_v45_0}RailLocation" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "typeSearchLocation", propOrder = {
    "airport",
    "city",
    "cityOrAirport",
    "coordinateLocation",
    "railLocation",
    "distance"
})
public class TypeSearchLocation {

    @XmlElement(name = "Airport")
    protected Airport airport;
    @XmlElement(name = "City")
    protected City city;
    @XmlElement(name = "CityOrAirport")
    protected CityOrAirport cityOrAirport;
    @XmlElement(name = "CoordinateLocation")
    protected CoordinateLocation coordinateLocation;
    @XmlElement(name = "RailLocation")
    protected RailLocation railLocation;
    @XmlElement(name = "Distance")
    protected Distance distance;

    /**
     * Gets the value of the airport property.
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setAirport(Airport value) {
        this.airport = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityOrAirport property.
     * 
     * @return
     *     possible object is
     *     {@link CityOrAirport }
     *     
     */
    public CityOrAirport getCityOrAirport() {
        return cityOrAirport;
    }

    /**
     * Sets the value of the cityOrAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityOrAirport }
     *     
     */
    public void setCityOrAirport(CityOrAirport value) {
        this.cityOrAirport = value;
    }

    /**
     * Gets the value of the coordinateLocation property.
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
     * Gets the value of the railLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RailLocation }
     *     
     */
    public RailLocation getRailLocation() {
        return railLocation;
    }

    /**
     * Sets the value of the railLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailLocation }
     *     
     */
    public void setRailLocation(RailLocation value) {
        this.railLocation = value;
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
