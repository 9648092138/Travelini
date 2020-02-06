
package com.travelport.schema.air_v45_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirPricingInfoRef" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}TicketingModifiers"/&gt;
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
    "airPricingInfoRef",
    "ticketingModifiers"
})
@XmlRootElement(name = "AirPricingTicketingModifiers")
public class AirPricingTicketingModifiers {

    @XmlElement(name = "AirPricingInfoRef")
    protected List<AirPricingInfoRef> airPricingInfoRef;
    @XmlElement(name = "TicketingModifiers", required = true)
    protected TicketingModifiers ticketingModifiers;

    /**
     * Gets the value of the airPricingInfoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfoRef }
     * 
     * 
     */
    public List<AirPricingInfoRef> getAirPricingInfoRef() {
        if (airPricingInfoRef == null) {
            airPricingInfoRef = new ArrayList<AirPricingInfoRef>();
        }
        return this.airPricingInfoRef;
    }

    /**
     * Gets the value of the ticketingModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingModifiers }
     *     
     */
    public TicketingModifiers getTicketingModifiers() {
        return ticketingModifiers;
    }

    /**
     * Sets the value of the ticketingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingModifiers }
     *     
     */
    public void setTicketingModifiers(TicketingModifiers value) {
        this.ticketingModifiers = value;
    }

}
