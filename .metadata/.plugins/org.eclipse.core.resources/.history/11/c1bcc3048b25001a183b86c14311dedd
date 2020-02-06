
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseRsp;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirSegment" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}CO2Emissions" maxOccurs="99" minOccurs="0"/&gt;
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
    "airSegment",
    "co2Emissions"
})
@XmlRootElement(name = "FlightDetailsRsp")
public class FlightDetailsRsp
    extends BaseRsp
{

    @XmlElement(name = "AirSegment", required = true)
    protected List<TypeBaseAirSegment> airSegment;
    @XmlElement(name = "CO2Emissions")
    protected List<CO2Emissions> co2Emissions;

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the airSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseAirSegment }
     * 
     * 
     */
    public List<TypeBaseAirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<TypeBaseAirSegment>();
        }
        return this.airSegment;
    }

    /**
     * Gets the value of the co2Emissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the co2Emissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCO2Emissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CO2Emissions }
     * 
     * 
     */
    public List<CO2Emissions> getCO2Emissions() {
        if (co2Emissions == null) {
            co2Emissions = new ArrayList<CO2Emissions>();
        }
        return this.co2Emissions;
    }

}
