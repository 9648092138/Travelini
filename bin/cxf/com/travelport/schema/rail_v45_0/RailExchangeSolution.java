
package com.travelport.schema.rail_v45_0;

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
 *     &lt;extension base="{http://www.travelport.com/schema/rail_v45_0}typeRailPricingSolution"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v45_0}RailExchangeInfo" minOccurs="0"/&gt;
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
    "railExchangeInfo"
})
@XmlRootElement(name = "RailExchangeSolution")
public class RailExchangeSolution
    extends TypeRailPricingSolution
{

    @XmlElement(name = "RailExchangeInfo")
    protected RailExchangeInfo railExchangeInfo;

    /**
     * Gets the value of the railExchangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RailExchangeInfo }
     *     
     */
    public RailExchangeInfo getRailExchangeInfo() {
        return railExchangeInfo;
    }

    /**
     * Sets the value of the railExchangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailExchangeInfo }
     *     
     */
    public void setRailExchangeInfo(RailExchangeInfo value) {
        this.railExchangeInfo = value;
    }

}
