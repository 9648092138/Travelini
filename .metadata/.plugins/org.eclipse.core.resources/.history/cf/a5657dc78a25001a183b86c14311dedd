
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseSearchRsp;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseSearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightTimeTableList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FlightTimeDetail" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "flightTimeTableList"
})
@XmlRootElement(name = "FlightTimeTableRsp")
public class FlightTimeTableRsp
    extends BaseSearchRsp
{

    @XmlElement(name = "FlightTimeTableList")
    protected FlightTimeTableRsp.FlightTimeTableList flightTimeTableList;

    /**
     * Gets the value of the flightTimeTableList property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeTableRsp.FlightTimeTableList }
     *     
     */
    public FlightTimeTableRsp.FlightTimeTableList getFlightTimeTableList() {
        return flightTimeTableList;
    }

    /**
     * Sets the value of the flightTimeTableList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeTableRsp.FlightTimeTableList }
     *     
     */
    public void setFlightTimeTableList(FlightTimeTableRsp.FlightTimeTableList value) {
        this.flightTimeTableList = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FlightTimeDetail" maxOccurs="999"/&gt;
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
        "flightTimeDetail"
    })
    public static class FlightTimeTableList {

        @XmlElement(name = "FlightTimeDetail", required = true)
        protected List<FlightTimeDetail> flightTimeDetail;

        /**
         * Gets the value of the flightTimeDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightTimeDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightTimeDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightTimeDetail }
         * 
         * 
         */
        public List<FlightTimeDetail> getFlightTimeDetail() {
            if (flightTimeDetail == null) {
                flightTimeDetail = new ArrayList<FlightTimeDetail>();
            }
            return this.flightTimeDetail;
        }

    }

}
