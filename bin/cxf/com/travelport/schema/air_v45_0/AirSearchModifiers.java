
package com.travelport.schema.air_v45_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.Carrier;
import com.travelport.schema.common_v45_0.Provider;
import com.travelport.schema.common_v45_0.TypeDistance;


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
 *         &lt;element name="DisfavoredProviders" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Provider" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PreferredProviders" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Provider" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DisfavoredCarriers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Carrier" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PermittedCarriers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ProhibitedCarriers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PreferredCarriers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PermittedCabins" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PreferredCabins" minOccurs="0"/&gt;
 *         &lt;element name="PreferredAlliances" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Alliance" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DisfavoredAlliances" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Alliance" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PermittedBookingCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BookingCode" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PreferredBookingCodes" minOccurs="0"/&gt;
 *         &lt;element name="ProhibitedBookingCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BookingCode" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FlightType" minOccurs="0"/&gt;
 *         &lt;element name="MaxLayoverDuration" type="{http://www.travelport.com/schema/air_v45_0}MaxLayoverDurationType" minOccurs="0"/&gt;
 *         &lt;element name="NativeSearchModifier" type="{http://www.travelport.com/schema/air_v45_0}typeNativeSearchModifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DistanceType" type="{http://www.travelport.com/schema/common_v45_0}typeDistance" default="MI" /&gt;
 *       &lt;attribute name="IncludeFlightDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="AllowChangeOfAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="ProhibitOvernightLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="MaxSolutions" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MaxConnectionTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="SearchWeekends" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IncludeExtraSolutions" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ProhibitMultiAirportConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PreferNonStop" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="OrderBy"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="JourneyTime"/&gt;
 *             &lt;enumeration value="DepartureTime"/&gt;
 *             &lt;enumeration value="ArrivalTime"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ExcludeOpenJawAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ExcludeGroundTransportation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="MaxJourneyTime" type="{http://www.travelport.com/schema/air_v45_0}typeMaxJourneyTime" /&gt;
 *       &lt;attribute name="JetServiceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "disfavoredProviders",
    "preferredProviders",
    "disfavoredCarriers",
    "permittedCarriers",
    "prohibitedCarriers",
    "preferredCarriers",
    "permittedCabins",
    "preferredCabins",
    "preferredAlliances",
    "disfavoredAlliances",
    "permittedBookingCodes",
    "preferredBookingCodes",
    "prohibitedBookingCodes",
    "flightType",
    "maxLayoverDuration",
    "nativeSearchModifier"
})
@XmlRootElement(name = "AirSearchModifiers")
public class AirSearchModifiers {

    @XmlElement(name = "DisfavoredProviders")
    protected AirSearchModifiers.DisfavoredProviders disfavoredProviders;
    @XmlElement(name = "PreferredProviders")
    protected AirSearchModifiers.PreferredProviders preferredProviders;
    @XmlElement(name = "DisfavoredCarriers")
    protected AirSearchModifiers.DisfavoredCarriers disfavoredCarriers;
    @XmlElement(name = "PermittedCarriers")
    protected PermittedCarriers permittedCarriers;
    @XmlElement(name = "ProhibitedCarriers")
    protected ProhibitedCarriers prohibitedCarriers;
    @XmlElement(name = "PreferredCarriers")
    protected PreferredCarriers preferredCarriers;
    @XmlElement(name = "PermittedCabins")
    protected PermittedCabins permittedCabins;
    @XmlElement(name = "PreferredCabins")
    protected PreferredCabins preferredCabins;
    @XmlElement(name = "PreferredAlliances")
    protected AirSearchModifiers.PreferredAlliances preferredAlliances;
    @XmlElement(name = "DisfavoredAlliances")
    protected AirSearchModifiers.DisfavoredAlliances disfavoredAlliances;
    @XmlElement(name = "PermittedBookingCodes")
    protected AirSearchModifiers.PermittedBookingCodes permittedBookingCodes;
    @XmlElement(name = "PreferredBookingCodes")
    protected PreferredBookingCodes preferredBookingCodes;
    @XmlElement(name = "ProhibitedBookingCodes")
    protected AirSearchModifiers.ProhibitedBookingCodes prohibitedBookingCodes;
    @XmlElement(name = "FlightType")
    protected FlightType flightType;
    @XmlElement(name = "MaxLayoverDuration")
    protected MaxLayoverDurationType maxLayoverDuration;
    @XmlElement(name = "NativeSearchModifier")
    protected TypeNativeSearchModifier nativeSearchModifier;
    @XmlAttribute(name = "DistanceType")
    protected TypeDistance distanceType;
    @XmlAttribute(name = "IncludeFlightDetails")
    protected Boolean includeFlightDetails;
    @XmlAttribute(name = "AllowChangeOfAirport")
    protected Boolean allowChangeOfAirport;
    @XmlAttribute(name = "ProhibitOvernightLayovers")
    protected Boolean prohibitOvernightLayovers;
    @XmlAttribute(name = "MaxSolutions")
    protected BigInteger maxSolutions;
    @XmlAttribute(name = "MaxConnectionTime")
    protected BigInteger maxConnectionTime;
    @XmlAttribute(name = "SearchWeekends")
    protected Boolean searchWeekends;
    @XmlAttribute(name = "IncludeExtraSolutions")
    protected Boolean includeExtraSolutions;
    @XmlAttribute(name = "ProhibitMultiAirportConnection")
    protected Boolean prohibitMultiAirportConnection;
    @XmlAttribute(name = "PreferNonStop")
    protected Boolean preferNonStop;
    @XmlAttribute(name = "OrderBy")
    protected String orderBy;
    @XmlAttribute(name = "ExcludeOpenJawAirport")
    protected Boolean excludeOpenJawAirport;
    @XmlAttribute(name = "ExcludeGroundTransportation")
    protected Boolean excludeGroundTransportation;
    @XmlAttribute(name = "MaxJourneyTime")
    protected Integer maxJourneyTime;
    @XmlAttribute(name = "JetServiceOnly")
    protected Boolean jetServiceOnly;

    /**
     * Gets the value of the disfavoredProviders property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.DisfavoredProviders }
     *     
     */
    public AirSearchModifiers.DisfavoredProviders getDisfavoredProviders() {
        return disfavoredProviders;
    }

    /**
     * Sets the value of the disfavoredProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.DisfavoredProviders }
     *     
     */
    public void setDisfavoredProviders(AirSearchModifiers.DisfavoredProviders value) {
        this.disfavoredProviders = value;
    }

    /**
     * Gets the value of the preferredProviders property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PreferredProviders }
     *     
     */
    public AirSearchModifiers.PreferredProviders getPreferredProviders() {
        return preferredProviders;
    }

    /**
     * Sets the value of the preferredProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PreferredProviders }
     *     
     */
    public void setPreferredProviders(AirSearchModifiers.PreferredProviders value) {
        this.preferredProviders = value;
    }

    /**
     * Gets the value of the disfavoredCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.DisfavoredCarriers }
     *     
     */
    public AirSearchModifiers.DisfavoredCarriers getDisfavoredCarriers() {
        return disfavoredCarriers;
    }

    /**
     * Sets the value of the disfavoredCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.DisfavoredCarriers }
     *     
     */
    public void setDisfavoredCarriers(AirSearchModifiers.DisfavoredCarriers value) {
        this.disfavoredCarriers = value;
    }

    /**
     * Gets the value of the permittedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link PermittedCarriers }
     *     
     */
    public PermittedCarriers getPermittedCarriers() {
        return permittedCarriers;
    }

    /**
     * Sets the value of the permittedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedCarriers }
     *     
     */
    public void setPermittedCarriers(PermittedCarriers value) {
        this.permittedCarriers = value;
    }

    /**
     * Gets the value of the prohibitedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link ProhibitedCarriers }
     *     
     */
    public ProhibitedCarriers getProhibitedCarriers() {
        return prohibitedCarriers;
    }

    /**
     * Sets the value of the prohibitedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProhibitedCarriers }
     *     
     */
    public void setProhibitedCarriers(ProhibitedCarriers value) {
        this.prohibitedCarriers = value;
    }

    /**
     * Gets the value of the preferredCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredCarriers }
     *     
     */
    public PreferredCarriers getPreferredCarriers() {
        return preferredCarriers;
    }

    /**
     * Sets the value of the preferredCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredCarriers }
     *     
     */
    public void setPreferredCarriers(PreferredCarriers value) {
        this.preferredCarriers = value;
    }

    /**
     * Gets the value of the permittedCabins property.
     * 
     * @return
     *     possible object is
     *     {@link PermittedCabins }
     *     
     */
    public PermittedCabins getPermittedCabins() {
        return permittedCabins;
    }

    /**
     * Sets the value of the permittedCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedCabins }
     *     
     */
    public void setPermittedCabins(PermittedCabins value) {
        this.permittedCabins = value;
    }

    /**
     * Gets the value of the preferredCabins property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredCabins }
     *     
     */
    public PreferredCabins getPreferredCabins() {
        return preferredCabins;
    }

    /**
     * Sets the value of the preferredCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredCabins }
     *     
     */
    public void setPreferredCabins(PreferredCabins value) {
        this.preferredCabins = value;
    }

    /**
     * Gets the value of the preferredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PreferredAlliances }
     *     
     */
    public AirSearchModifiers.PreferredAlliances getPreferredAlliances() {
        return preferredAlliances;
    }

    /**
     * Sets the value of the preferredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PreferredAlliances }
     *     
     */
    public void setPreferredAlliances(AirSearchModifiers.PreferredAlliances value) {
        this.preferredAlliances = value;
    }

    /**
     * Gets the value of the disfavoredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.DisfavoredAlliances }
     *     
     */
    public AirSearchModifiers.DisfavoredAlliances getDisfavoredAlliances() {
        return disfavoredAlliances;
    }

    /**
     * Sets the value of the disfavoredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.DisfavoredAlliances }
     *     
     */
    public void setDisfavoredAlliances(AirSearchModifiers.DisfavoredAlliances value) {
        this.disfavoredAlliances = value;
    }

    /**
     * Gets the value of the permittedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PermittedBookingCodes }
     *     
     */
    public AirSearchModifiers.PermittedBookingCodes getPermittedBookingCodes() {
        return permittedBookingCodes;
    }

    /**
     * Sets the value of the permittedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PermittedBookingCodes }
     *     
     */
    public void setPermittedBookingCodes(AirSearchModifiers.PermittedBookingCodes value) {
        this.permittedBookingCodes = value;
    }

    /**
     * Gets the value of the preferredBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredBookingCodes }
     *     
     */
    public PreferredBookingCodes getPreferredBookingCodes() {
        return preferredBookingCodes;
    }

    /**
     * Sets the value of the preferredBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredBookingCodes }
     *     
     */
    public void setPreferredBookingCodes(PreferredBookingCodes value) {
        this.preferredBookingCodes = value;
    }

    /**
     * Gets the value of the prohibitedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.ProhibitedBookingCodes }
     *     
     */
    public AirSearchModifiers.ProhibitedBookingCodes getProhibitedBookingCodes() {
        return prohibitedBookingCodes;
    }

    /**
     * Sets the value of the prohibitedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.ProhibitedBookingCodes }
     *     
     */
    public void setProhibitedBookingCodes(AirSearchModifiers.ProhibitedBookingCodes value) {
        this.prohibitedBookingCodes = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link FlightType }
     *     
     */
    public FlightType getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightType }
     *     
     */
    public void setFlightType(FlightType value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the maxLayoverDuration property.
     * 
     * @return
     *     possible object is
     *     {@link MaxLayoverDurationType }
     *     
     */
    public MaxLayoverDurationType getMaxLayoverDuration() {
        return maxLayoverDuration;
    }

    /**
     * Sets the value of the maxLayoverDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxLayoverDurationType }
     *     
     */
    public void setMaxLayoverDuration(MaxLayoverDurationType value) {
        this.maxLayoverDuration = value;
    }

    /**
     * Gets the value of the nativeSearchModifier property.
     * 
     * @return
     *     possible object is
     *     {@link TypeNativeSearchModifier }
     *     
     */
    public TypeNativeSearchModifier getNativeSearchModifier() {
        return nativeSearchModifier;
    }

    /**
     * Sets the value of the nativeSearchModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNativeSearchModifier }
     *     
     */
    public void setNativeSearchModifier(TypeNativeSearchModifier value) {
        this.nativeSearchModifier = value;
    }

    /**
     * Gets the value of the distanceType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDistance }
     *     
     */
    public TypeDistance getDistanceType() {
        if (distanceType == null) {
            return TypeDistance.MI;
        } else {
            return distanceType;
        }
    }

    /**
     * Sets the value of the distanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDistance }
     *     
     */
    public void setDistanceType(TypeDistance value) {
        this.distanceType = value;
    }

    /**
     * Gets the value of the includeFlightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeFlightDetails() {
        if (includeFlightDetails == null) {
            return true;
        } else {
            return includeFlightDetails;
        }
    }

    /**
     * Sets the value of the includeFlightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFlightDetails(Boolean value) {
        this.includeFlightDetails = value;
    }

    /**
     * Gets the value of the allowChangeOfAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowChangeOfAirport() {
        if (allowChangeOfAirport == null) {
            return true;
        } else {
            return allowChangeOfAirport;
        }
    }

    /**
     * Sets the value of the allowChangeOfAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowChangeOfAirport(Boolean value) {
        this.allowChangeOfAirport = value;
    }

    /**
     * Gets the value of the prohibitOvernightLayovers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitOvernightLayovers() {
        if (prohibitOvernightLayovers == null) {
            return false;
        } else {
            return prohibitOvernightLayovers;
        }
    }

    /**
     * Sets the value of the prohibitOvernightLayovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitOvernightLayovers(Boolean value) {
        this.prohibitOvernightLayovers = value;
    }

    /**
     * Gets the value of the maxSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSolutions() {
        return maxSolutions;
    }

    /**
     * Sets the value of the maxSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSolutions(BigInteger value) {
        this.maxSolutions = value;
    }

    /**
     * Gets the value of the maxConnectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxConnectionTime() {
        return maxConnectionTime;
    }

    /**
     * Sets the value of the maxConnectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxConnectionTime(BigInteger value) {
        this.maxConnectionTime = value;
    }

    /**
     * Gets the value of the searchWeekends property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchWeekends() {
        return searchWeekends;
    }

    /**
     * Sets the value of the searchWeekends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchWeekends(Boolean value) {
        this.searchWeekends = value;
    }

    /**
     * Gets the value of the includeExtraSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeExtraSolutions() {
        return includeExtraSolutions;
    }

    /**
     * Sets the value of the includeExtraSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeExtraSolutions(Boolean value) {
        this.includeExtraSolutions = value;
    }

    /**
     * Gets the value of the prohibitMultiAirportConnection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProhibitMultiAirportConnection() {
        return prohibitMultiAirportConnection;
    }

    /**
     * Sets the value of the prohibitMultiAirportConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitMultiAirportConnection(Boolean value) {
        this.prohibitMultiAirportConnection = value;
    }

    /**
     * Gets the value of the preferNonStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferNonStop() {
        if (preferNonStop == null) {
            return false;
        } else {
            return preferNonStop;
        }
    }

    /**
     * Sets the value of the preferNonStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferNonStop(Boolean value) {
        this.preferNonStop = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the excludeOpenJawAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeOpenJawAirport() {
        if (excludeOpenJawAirport == null) {
            return false;
        } else {
            return excludeOpenJawAirport;
        }
    }

    /**
     * Sets the value of the excludeOpenJawAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeOpenJawAirport(Boolean value) {
        this.excludeOpenJawAirport = value;
    }

    /**
     * Gets the value of the excludeGroundTransportation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeGroundTransportation() {
        if (excludeGroundTransportation == null) {
            return false;
        } else {
            return excludeGroundTransportation;
        }
    }

    /**
     * Sets the value of the excludeGroundTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeGroundTransportation(Boolean value) {
        this.excludeGroundTransportation = value;
    }

    /**
     * Gets the value of the maxJourneyTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxJourneyTime() {
        return maxJourneyTime;
    }

    /**
     * Sets the value of the maxJourneyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxJourneyTime(Integer value) {
        this.maxJourneyTime = value;
    }

    /**
     * Gets the value of the jetServiceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJetServiceOnly() {
        return jetServiceOnly;
    }

    /**
     * Sets the value of the jetServiceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJetServiceOnly(Boolean value) {
        this.jetServiceOnly = value;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Alliance" maxOccurs="999"/&gt;
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
        "alliance"
    })
    public static class DisfavoredAlliances {

        @XmlElement(name = "Alliance", required = true)
        protected List<Alliance> alliance;

        /**
         * Gets the value of the alliance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alliance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlliance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alliance }
         * 
         * 
         */
        public List<Alliance> getAlliance() {
            if (alliance == null) {
                alliance = new ArrayList<Alliance>();
            }
            return this.alliance;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Carrier" maxOccurs="999"/&gt;
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
        "carrier"
    })
    public static class DisfavoredCarriers {

        @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v45_0", required = true)
        protected List<Carrier> carrier;

        /**
         * Gets the value of the carrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Carrier }
         * 
         * 
         */
        public List<Carrier> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<Carrier>();
            }
            return this.carrier;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Provider" maxOccurs="999"/&gt;
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
        "provider"
    })
    public static class DisfavoredProviders {

        @XmlElement(name = "Provider", namespace = "http://www.travelport.com/schema/common_v45_0", required = true)
        protected List<Provider> provider;

        /**
         * Gets the value of the provider property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the provider property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProvider().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Provider }
         * 
         * 
         */
        public List<Provider> getProvider() {
            if (provider == null) {
                provider = new ArrayList<Provider>();
            }
            return this.provider;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BookingCode" maxOccurs="999"/&gt;
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
        "bookingCode"
    })
    public static class PermittedBookingCodes {

        @XmlElement(name = "BookingCode", required = true)
        protected List<BookingCode> bookingCode;

        /**
         * Gets the value of the bookingCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingCode }
         * 
         * 
         */
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<BookingCode>();
            }
            return this.bookingCode;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Alliance" maxOccurs="999"/&gt;
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
        "alliance"
    })
    public static class PreferredAlliances {

        @XmlElement(name = "Alliance", required = true)
        protected List<Alliance> alliance;

        /**
         * Gets the value of the alliance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alliance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlliance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alliance }
         * 
         * 
         */
        public List<Alliance> getAlliance() {
            if (alliance == null) {
                alliance = new ArrayList<Alliance>();
            }
            return this.alliance;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Provider" maxOccurs="999"/&gt;
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
        "provider"
    })
    public static class PreferredProviders {

        @XmlElement(name = "Provider", namespace = "http://www.travelport.com/schema/common_v45_0", required = true)
        protected List<Provider> provider;

        /**
         * Gets the value of the provider property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the provider property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProvider().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Provider }
         * 
         * 
         */
        public List<Provider> getProvider() {
            if (provider == null) {
                provider = new ArrayList<Provider>();
            }
            return this.provider;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BookingCode" maxOccurs="999"/&gt;
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
        "bookingCode"
    })
    public static class ProhibitedBookingCodes {

        @XmlElement(name = "BookingCode", required = true)
        protected List<BookingCode> bookingCode;

        /**
         * Gets the value of the bookingCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingCode }
         * 
         * 
         */
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<BookingCode>();
            }
            return this.bookingCode;
        }

    }

}
