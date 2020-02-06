
package com.travelport.schema.hotel_v45_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseRsp;
import com.travelport.schema.common_v45_0.HostToken;
import com.travelport.schema.common_v45_0.NextResultReference;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}NextResultReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}HostToken" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}RequestedHotelDetails" minOccurs="0"/&gt;
 *           &lt;element name="AggregatorHotelDetails" maxOccurs="99" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://www.travelport.com/schema/hotel_v45_0}typeHotelDetails"&gt;
 *                   &lt;attGroup ref="{http://www.travelport.com/schema/hotel_v45_0}attrAggregatorHotelDetail"/&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelAlternateProperties"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}GuestReviews" minOccurs="0"/&gt;
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
    "nextResultReference",
    "hostToken",
    "requestedHotelDetails",
    "aggregatorHotelDetails",
    "hotelAlternateProperties",
    "guestReviews"
})
@XmlRootElement(name = "HotelDetailsRsp")
public class HotelDetailsRsp
    extends BaseRsp
{

    @XmlElement(name = "NextResultReference", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected NextResultReference nextResultReference;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected HostToken hostToken;
    @XmlElement(name = "RequestedHotelDetails")
    protected RequestedHotelDetails requestedHotelDetails;
    @XmlElement(name = "AggregatorHotelDetails")
    protected List<HotelDetailsRsp.AggregatorHotelDetails> aggregatorHotelDetails;
    @XmlElement(name = "HotelAlternateProperties")
    protected HotelAlternateProperties hotelAlternateProperties;
    @XmlElement(name = "GuestReviews")
    protected GuestReviews guestReviews;

    /**
     * Gets the value of the nextResultReference property.
     * 
     * @return
     *     possible object is
     *     {@link NextResultReference }
     *     
     */
    public NextResultReference getNextResultReference() {
        return nextResultReference;
    }

    /**
     * Sets the value of the nextResultReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextResultReference }
     *     
     */
    public void setNextResultReference(NextResultReference value) {
        this.nextResultReference = value;
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
     * Supported Provider GDS – 1G, 1V, 1P, 1J.
     * 
     * @return
     *     possible object is
     *     {@link RequestedHotelDetails }
     *     
     */
    public RequestedHotelDetails getRequestedHotelDetails() {
        return requestedHotelDetails;
    }

    /**
     * Sets the value of the requestedHotelDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedHotelDetails }
     *     
     */
    public void setRequestedHotelDetails(RequestedHotelDetails value) {
        this.requestedHotelDetails = value;
    }

    /**
     * Gets the value of the aggregatorHotelDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregatorHotelDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregatorHotelDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelDetailsRsp.AggregatorHotelDetails }
     * 
     * 
     */
    public List<HotelDetailsRsp.AggregatorHotelDetails> getAggregatorHotelDetails() {
        if (aggregatorHotelDetails == null) {
            aggregatorHotelDetails = new ArrayList<HotelDetailsRsp.AggregatorHotelDetails>();
        }
        return this.aggregatorHotelDetails;
    }

    /**
     * Gets the value of the hotelAlternateProperties property.
     * 
     * @return
     *     possible object is
     *     {@link HotelAlternateProperties }
     *     
     */
    public HotelAlternateProperties getHotelAlternateProperties() {
        return hotelAlternateProperties;
    }

    /**
     * Sets the value of the hotelAlternateProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAlternateProperties }
     *     
     */
    public void setHotelAlternateProperties(HotelAlternateProperties value) {
        this.hotelAlternateProperties = value;
    }

    /**
     * Gets the value of the guestReviews property.
     * 
     * @return
     *     possible object is
     *     {@link GuestReviews }
     *     
     */
    public GuestReviews getGuestReviews() {
        return guestReviews;
    }

    /**
     * Sets the value of the guestReviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestReviews }
     *     
     */
    public void setGuestReviews(GuestReviews value) {
        this.guestReviews = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.travelport.com/schema/hotel_v45_0}typeHotelDetails"&gt;
     *       &lt;attGroup ref="{http://www.travelport.com/schema/hotel_v45_0}attrAggregatorHotelDetail"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AggregatorHotelDetails
        extends TypeHotelDetails
    {

        @XmlAttribute(name = "Aggregator")
        protected String aggregator;
        @XmlAttribute(name = "AggregatorName")
        protected String aggregatorName;
        @XmlAttribute(name = "RulesAndRestriction")
        protected String rulesAndRestriction;
        @XmlAttribute(name = "TermsAndConditions")
        protected String termsAndConditions;
        @XmlAttribute(name = "SupportsPayment")
        protected Boolean supportsPayment;
        @XmlAttribute(name = "CommissionModel")
        protected String commissionModel;
        @XmlAttribute(name = "MultiRoomSupport")
        protected String multiRoomSupport;
        @XmlAttribute(name = "SupportsChildren")
        protected Boolean supportsChildren;
        @XmlAttribute(name = "ChildStartAge")
        protected BigInteger childStartAge;
        @XmlAttribute(name = "AdultStartAge")
        protected BigInteger adultStartAge;
        @XmlAttribute(name = "MaxChildrenPerRoom")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxChildrenPerRoom;
        @XmlAttribute(name = "PhoneNumber")
        protected String phoneNumber;
        @XmlAttribute(name = "AreaCode")
        protected String areaCode;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;

        /**
         * Gets the value of the aggregator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAggregator() {
            return aggregator;
        }

        /**
         * Sets the value of the aggregator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAggregator(String value) {
            this.aggregator = value;
        }

        /**
         * Gets the value of the aggregatorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAggregatorName() {
            return aggregatorName;
        }

        /**
         * Sets the value of the aggregatorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAggregatorName(String value) {
            this.aggregatorName = value;
        }

        /**
         * Gets the value of the rulesAndRestriction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRulesAndRestriction() {
            return rulesAndRestriction;
        }

        /**
         * Sets the value of the rulesAndRestriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRulesAndRestriction(String value) {
            this.rulesAndRestriction = value;
        }

        /**
         * Gets the value of the termsAndConditions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTermsAndConditions() {
            return termsAndConditions;
        }

        /**
         * Sets the value of the termsAndConditions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTermsAndConditions(String value) {
            this.termsAndConditions = value;
        }

        /**
         * Gets the value of the supportsPayment property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSupportsPayment() {
            return supportsPayment;
        }

        /**
         * Sets the value of the supportsPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSupportsPayment(Boolean value) {
            this.supportsPayment = value;
        }

        /**
         * Gets the value of the commissionModel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommissionModel() {
            return commissionModel;
        }

        /**
         * Sets the value of the commissionModel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommissionModel(String value) {
            this.commissionModel = value;
        }

        /**
         * Gets the value of the multiRoomSupport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMultiRoomSupport() {
            return multiRoomSupport;
        }

        /**
         * Sets the value of the multiRoomSupport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMultiRoomSupport(String value) {
            this.multiRoomSupport = value;
        }

        /**
         * Gets the value of the supportsChildren property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSupportsChildren() {
            return supportsChildren;
        }

        /**
         * Sets the value of the supportsChildren property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSupportsChildren(Boolean value) {
            this.supportsChildren = value;
        }

        /**
         * Gets the value of the childStartAge property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getChildStartAge() {
            return childStartAge;
        }

        /**
         * Sets the value of the childStartAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setChildStartAge(BigInteger value) {
            this.childStartAge = value;
        }

        /**
         * Gets the value of the adultStartAge property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAdultStartAge() {
            return adultStartAge;
        }

        /**
         * Sets the value of the adultStartAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAdultStartAge(BigInteger value) {
            this.adultStartAge = value;
        }

        /**
         * Gets the value of the maxChildrenPerRoom property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxChildrenPerRoom() {
            return maxChildrenPerRoom;
        }

        /**
         * Sets the value of the maxChildrenPerRoom property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxChildrenPerRoom(BigInteger value) {
            this.maxChildrenPerRoom = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the areaCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCode() {
            return areaCode;
        }

        /**
         * Sets the value of the areaCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCode(String value) {
            this.areaCode = value;
        }

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

    }

}
