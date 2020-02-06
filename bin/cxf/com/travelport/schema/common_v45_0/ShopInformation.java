
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SearchRequest" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *                 &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *                 &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v45_0}typeClassOfService" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FlightsOffered" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *                 &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
 *                 &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TravelOrder" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="Carrier" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
 *                 &lt;attribute name="FlightNumber" type="{http://www.travelport.com/schema/common_v45_0}typeFlightNumber" /&gt;
 *                 &lt;attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v45_0}typeClassOfService" /&gt;
 *                 &lt;attribute name="StopOver" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                 &lt;attribute name="Connection" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CabinShopped" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CabinSelected" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LowestFareOffered" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchRequest",
    "flightsOffered"
})
@XmlRootElement(name = "ShopInformation")
public class ShopInformation {

    @XmlElement(name = "SearchRequest")
    protected List<ShopInformation.SearchRequest> searchRequest;
    @XmlElement(name = "FlightsOffered")
    protected List<ShopInformation.FlightsOffered> flightsOffered;
    @XmlAttribute(name = "CabinShopped")
    protected String cabinShopped;
    @XmlAttribute(name = "CabinSelected")
    protected String cabinSelected;
    @XmlAttribute(name = "LowestFareOffered")
    protected String lowestFareOffered;

    /**
     * Gets the value of the searchRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShopInformation.SearchRequest }
     * 
     * 
     */
    public List<ShopInformation.SearchRequest> getSearchRequest() {
        if (searchRequest == null) {
            searchRequest = new ArrayList<ShopInformation.SearchRequest>();
        }
        return this.searchRequest;
    }

    /**
     * Gets the value of the flightsOffered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightsOffered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightsOffered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShopInformation.FlightsOffered }
     * 
     * 
     */
    public List<ShopInformation.FlightsOffered> getFlightsOffered() {
        if (flightsOffered == null) {
            flightsOffered = new ArrayList<ShopInformation.FlightsOffered>();
        }
        return this.flightsOffered;
    }

    /**
     * Gets the value of the cabinShopped property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinShopped() {
        return cabinShopped;
    }

    /**
     * Sets the value of the cabinShopped property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinShopped(String value) {
        this.cabinShopped = value;
    }

    /**
     * Gets the value of the cabinSelected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinSelected() {
        return cabinSelected;
    }

    /**
     * Sets the value of the cabinSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinSelected(String value) {
        this.cabinSelected = value;
    }

    /**
     * Gets the value of the lowestFareOffered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowestFareOffered() {
        return lowestFareOffered;
    }

    /**
     * Sets the value of the lowestFareOffered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowestFareOffered(String value) {
        this.lowestFareOffered = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
     *       &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
     *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TravelOrder" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="Carrier" type="{http://www.travelport.com/schema/common_v45_0}typeCarrier" /&gt;
     *       &lt;attribute name="FlightNumber" type="{http://www.travelport.com/schema/common_v45_0}typeFlightNumber" /&gt;
     *       &lt;attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v45_0}typeClassOfService" /&gt;
     *       &lt;attribute name="StopOver" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *       &lt;attribute name="Connection" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightsOffered {

        @XmlAttribute(name = "Origin")
        protected String origin;
        @XmlAttribute(name = "Destination")
        protected String destination;
        @XmlAttribute(name = "DepartureTime")
        protected String departureTime;
        @XmlAttribute(name = "TravelOrder")
        protected Integer travelOrder;
        @XmlAttribute(name = "Carrier")
        protected String carrier;
        @XmlAttribute(name = "FlightNumber")
        protected String flightNumber;
        @XmlAttribute(name = "ClassOfService")
        protected String classOfService;
        @XmlAttribute(name = "StopOver")
        protected Boolean stopOver;
        @XmlAttribute(name = "Connection")
        protected Boolean connection;

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestination(String value) {
            this.destination = value;
        }

        /**
         * Gets the value of the departureTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureTime() {
            return departureTime;
        }

        /**
         * Sets the value of the departureTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureTime(String value) {
            this.departureTime = value;
        }

        /**
         * Gets the value of the travelOrder property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTravelOrder() {
            return travelOrder;
        }

        /**
         * Sets the value of the travelOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTravelOrder(Integer value) {
            this.travelOrder = value;
        }

        /**
         * Gets the value of the carrier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarrier() {
            return carrier;
        }

        /**
         * Sets the value of the carrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarrier(String value) {
            this.carrier = value;
        }

        /**
         * Gets the value of the flightNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightNumber() {
            return flightNumber;
        }

        /**
         * Sets the value of the flightNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightNumber(String value) {
            this.flightNumber = value;
        }

        /**
         * Gets the value of the classOfService property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassOfService() {
            return classOfService;
        }

        /**
         * Sets the value of the classOfService property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassOfService(String value) {
            this.classOfService = value;
        }

        /**
         * Gets the value of the stopOver property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isStopOver() {
            if (stopOver == null) {
                return false;
            } else {
                return stopOver;
            }
        }

        /**
         * Sets the value of the stopOver property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStopOver(Boolean value) {
            this.stopOver = value;
        }

        /**
         * Gets the value of the connection property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isConnection() {
            if (connection == null) {
                return false;
            } else {
                return connection;
            }
        }

        /**
         * Sets the value of the connection property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setConnection(Boolean value) {
            this.connection = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
     *       &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v45_0}typeIATACode" /&gt;
     *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v45_0}typeClassOfService" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SearchRequest {

        @XmlAttribute(name = "Origin")
        protected String origin;
        @XmlAttribute(name = "Destination")
        protected String destination;
        @XmlAttribute(name = "DepartureTime")
        protected String departureTime;
        @XmlAttribute(name = "ClassOfService")
        protected String classOfService;

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestination(String value) {
            this.destination = value;
        }

        /**
         * Gets the value of the departureTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureTime() {
            return departureTime;
        }

        /**
         * Sets the value of the departureTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureTime(String value) {
            this.departureTime = value;
        }

        /**
         * Gets the value of the classOfService property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassOfService() {
            return classOfService;
        }

        /**
         * Sets the value of the classOfService property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassOfService(String value) {
            this.classOfService = value;
        }

    }

}
