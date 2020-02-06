
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
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirSolutionChangedInfo" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ETR" maxOccurs="999" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v45_0}TicketFailureInfo" maxOccurs="999" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v45_0}DetailedBillingInformation" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
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
    "airSolutionChangedInfo",
    "etr",
    "ticketFailureInfo",
    "detailedBillingInformation"
})
@XmlRootElement(name = "AirTicketingRsp")
public class AirTicketingRsp
    extends BaseRsp
{

    @XmlElement(name = "AirSolutionChangedInfo")
    protected AirSolutionChangedInfo airSolutionChangedInfo;
    @XmlElement(name = "ETR")
    protected List<ETR> etr;
    @XmlElement(name = "TicketFailureInfo")
    protected List<TicketFailureInfo> ticketFailureInfo;
    @XmlElement(name = "DetailedBillingInformation")
    protected List<DetailedBillingInformation> detailedBillingInformation;

    /**
     * Gets the value of the airSolutionChangedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirSolutionChangedInfo }
     *     
     */
    public AirSolutionChangedInfo getAirSolutionChangedInfo() {
        return airSolutionChangedInfo;
    }

    /**
     * Sets the value of the airSolutionChangedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSolutionChangedInfo }
     *     
     */
    public void setAirSolutionChangedInfo(AirSolutionChangedInfo value) {
        this.airSolutionChangedInfo = value;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the etr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETR }
     * 
     * 
     */
    public List<ETR> getETR() {
        if (etr == null) {
            etr = new ArrayList<ETR>();
        }
        return this.etr;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the ticketFailureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketFailureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketFailureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketFailureInfo }
     * 
     * 
     */
    public List<TicketFailureInfo> getTicketFailureInfo() {
        if (ticketFailureInfo == null) {
            ticketFailureInfo = new ArrayList<TicketFailureInfo>();
        }
        return this.ticketFailureInfo;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the detailedBillingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedBillingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailedBillingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedBillingInformation }
     * 
     * 
     */
    public List<DetailedBillingInformation> getDetailedBillingInformation() {
        if (detailedBillingInformation == null) {
            detailedBillingInformation = new ArrayList<DetailedBillingInformation>();
        }
        return this.detailedBillingInformation;
    }

}
