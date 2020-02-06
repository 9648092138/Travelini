
package com.travelport.schema.air_v45_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BookingCodeInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="FareTokenInfo" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="FareInfoRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="HostTokenRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v45_0}typeProviderCode" /&gt;
 *       &lt;attribute name="HostTokenRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingCodeInfo",
    "fareTokenInfo"
})
@XmlRootElement(name = "AirAvailInfo")
public class AirAvailInfo {

    @XmlElement(name = "BookingCodeInfo")
    protected List<BookingCodeInfo> bookingCodeInfo;
    @XmlElement(name = "FareTokenInfo")
    protected List<AirAvailInfo.FareTokenInfo> fareTokenInfo;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "HostTokenRef")
    protected String hostTokenRef;

    /**
     * Gets the value of the bookingCodeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingCodeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingCodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingCodeInfo }
     * 
     * 
     */
    public List<BookingCodeInfo> getBookingCodeInfo() {
        if (bookingCodeInfo == null) {
            bookingCodeInfo = new ArrayList<BookingCodeInfo>();
        }
        return this.bookingCodeInfo;
    }

    /**
     * Gets the value of the fareTokenInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareTokenInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareTokenInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirAvailInfo.FareTokenInfo }
     * 
     * 
     */
    public List<AirAvailInfo.FareTokenInfo> getFareTokenInfo() {
        if (fareTokenInfo == null) {
            fareTokenInfo = new ArrayList<AirAvailInfo.FareTokenInfo>();
        }
        return this.fareTokenInfo;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the hostTokenRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTokenRef() {
        return hostTokenRef;
    }

    /**
     * Sets the value of the hostTokenRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTokenRef(String value) {
        this.hostTokenRef = value;
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
     *       &lt;attribute name="FareInfoRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="HostTokenRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareTokenInfo {

        @XmlAttribute(name = "FareInfoRef", required = true)
        protected String fareInfoRef;
        @XmlAttribute(name = "HostTokenRef", required = true)
        protected String hostTokenRef;

        /**
         * Gets the value of the fareInfoRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareInfoRef() {
            return fareInfoRef;
        }

        /**
         * Sets the value of the fareInfoRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareInfoRef(String value) {
            this.fareInfoRef = value;
        }

        /**
         * Gets the value of the hostTokenRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHostTokenRef() {
            return hostTokenRef;
        }

        /**
         * Sets the value of the hostTokenRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHostTokenRef(String value) {
            this.hostTokenRef = value;
        }

    }

}
