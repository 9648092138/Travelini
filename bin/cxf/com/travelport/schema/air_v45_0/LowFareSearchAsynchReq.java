
package com.travelport.schema.air_v45_0;

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
 *     &lt;extension base="{http://www.travelport.com/schema/air_v45_0}BaseLowFareSearchReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirSearchAsynchModifiers" minOccurs="0"/&gt;
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
    "airSearchAsynchModifiers"
})
@XmlRootElement(name = "LowFareSearchAsynchReq")
public class LowFareSearchAsynchReq
    extends BaseLowFareSearchReq
{

    @XmlElement(name = "AirSearchAsynchModifiers")
    protected AirSearchAsynchModifiers airSearchAsynchModifiers;

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchAsynchModifiers }
     *     
     */
    public AirSearchAsynchModifiers getAirSearchAsynchModifiers() {
        return airSearchAsynchModifiers;
    }

    /**
     * Sets the value of the airSearchAsynchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchAsynchModifiers }
     *     
     */
    public void setAirSearchAsynchModifiers(AirSearchAsynchModifiers value) {
        this.airSearchAsynchModifiers = value;
    }

}
