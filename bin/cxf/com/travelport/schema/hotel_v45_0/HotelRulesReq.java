
package com.travelport.schema.hotel_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;choice&gt;
 *         &lt;element name="HotelReservationLocatorCode" type="{http://www.travelport.com/schema/common_v45_0}typeLocatorCode"/&gt;
 *         &lt;element name="HotelRulesLookup"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelProperty"/&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelStay"/&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelRulesModifiers" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RatePlanType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Base" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *                 &lt;attribute name="RulesDetailReqd"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Rules"/&gt;
 *                       &lt;enumeration value="Details"/&gt;
 *                       &lt;enumeration value="All"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelReservationLocatorCode",
    "hotelRulesLookup"
})
@XmlRootElement(name = "HotelRulesReq")
public class HotelRulesReq
    extends BaseReq
{

    @XmlElement(name = "HotelReservationLocatorCode")
    protected String hotelReservationLocatorCode;
    @XmlElement(name = "HotelRulesLookup")
    protected HotelRulesReq.HotelRulesLookup hotelRulesLookup;

    /**
     * Gets the value of the hotelReservationLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelReservationLocatorCode() {
        return hotelReservationLocatorCode;
    }

    /**
     * Sets the value of the hotelReservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelReservationLocatorCode(String value) {
        this.hotelReservationLocatorCode = value;
    }

    /**
     * Gets the value of the hotelRulesLookup property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRulesReq.HotelRulesLookup }
     *     
     */
    public HotelRulesReq.HotelRulesLookup getHotelRulesLookup() {
        return hotelRulesLookup;
    }

    /**
     * Sets the value of the hotelRulesLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRulesReq.HotelRulesLookup }
     *     
     */
    public void setHotelRulesLookup(HotelRulesReq.HotelRulesLookup value) {
        this.hotelRulesLookup = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelProperty"/&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelStay"/&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v45_0}HotelRulesModifiers" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RatePlanType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Base" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *       &lt;attribute name="RulesDetailReqd"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Rules"/&gt;
     *             &lt;enumeration value="Details"/&gt;
     *             &lt;enumeration value="All"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hotelProperty",
        "hotelStay",
        "hotelRulesModifiers"
    })
    public static class HotelRulesLookup {

        @XmlElement(name = "HotelProperty", required = true)
        protected HotelProperty hotelProperty;
        @XmlElement(name = "HotelStay", required = true)
        protected HotelStay hotelStay;
        @XmlElement(name = "HotelRulesModifiers")
        protected HotelRulesModifiers hotelRulesModifiers;
        @XmlAttribute(name = "RatePlanType", required = true)
        protected String ratePlanType;
        @XmlAttribute(name = "Base", required = true)
        protected String base;
        @XmlAttribute(name = "RulesDetailReqd")
        protected String rulesDetailReqd;

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
         * Gets the value of the hotelStay property.
         * 
         * @return
         *     possible object is
         *     {@link HotelStay }
         *     
         */
        public HotelStay getHotelStay() {
            return hotelStay;
        }

        /**
         * Sets the value of the hotelStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelStay }
         *     
         */
        public void setHotelStay(HotelStay value) {
            this.hotelStay = value;
        }

        /**
         * Gets the value of the hotelRulesModifiers property.
         * 
         * @return
         *     possible object is
         *     {@link HotelRulesModifiers }
         *     
         */
        public HotelRulesModifiers getHotelRulesModifiers() {
            return hotelRulesModifiers;
        }

        /**
         * Sets the value of the hotelRulesModifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRulesModifiers }
         *     
         */
        public void setHotelRulesModifiers(HotelRulesModifiers value) {
            this.hotelRulesModifiers = value;
        }

        /**
         * Gets the value of the ratePlanType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanType() {
            return ratePlanType;
        }

        /**
         * Sets the value of the ratePlanType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanType(String value) {
            this.ratePlanType = value;
        }

        /**
         * Gets the value of the base property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBase() {
            return base;
        }

        /**
         * Sets the value of the base property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBase(String value) {
            this.base = value;
        }

        /**
         * Gets the value of the rulesDetailReqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRulesDetailReqd() {
            return rulesDetailReqd;
        }

        /**
         * Sets the value of the rulesDetailReqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRulesDetailReqd(String value) {
            this.rulesDetailReqd = value;
        }

    }

}
