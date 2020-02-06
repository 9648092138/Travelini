
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}SSR"/&gt;
 *         &lt;element name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" maxOccurs="999" minOccurs="0"/&gt;
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
    "ssr",
    "bookingTravelerRef"
})
@XmlRootElement(name = "SSRInfo")
public class SSRInfo {

    @XmlElement(name = "SSR", required = true)
    protected SSR ssr;
    @XmlElement(name = "BookingTravelerRef")
    protected List<String> bookingTravelerRef;

    /**
     * Gets the value of the ssr property.
     * 
     * @return
     *     possible object is
     *     {@link SSR }
     *     
     */
    public SSR getSSR() {
        return ssr;
    }

    /**
     * Sets the value of the ssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSR }
     *     
     */
    public void setSSR(SSR value) {
        this.ssr = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<String>();
        }
        return this.bookingTravelerRef;
    }

}
