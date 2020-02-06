
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}EMDInfo"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}EMDSummaryInfo" maxOccurs="999"/&gt;
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
    "emdInfo",
    "emdSummaryInfo"
})
@XmlRootElement(name = "EMDRetrieveRsp")
public class EMDRetrieveRsp
    extends BaseRsp
{

    @XmlElement(name = "EMDInfo")
    protected EMDInfo emdInfo;
    @XmlElement(name = "EMDSummaryInfo")
    protected List<EMDSummaryInfo> emdSummaryInfo;

    /**
     * Provider: 1G/1V/1P/1J.
     * 
     * @return
     *     possible object is
     *     {@link EMDInfo }
     *     
     */
    public EMDInfo getEMDInfo() {
        return emdInfo;
    }

    /**
     * Sets the value of the emdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDInfo }
     *     
     */
    public void setEMDInfo(EMDInfo value) {
        this.emdInfo = value;
    }

    /**
     * Provider: 1G/1V/1P/1J.Gets the value of the emdSummaryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdSummaryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMDSummaryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDSummaryInfo }
     * 
     * 
     */
    public List<EMDSummaryInfo> getEMDSummaryInfo() {
        if (emdSummaryInfo == null) {
            emdSummaryInfo = new ArrayList<EMDSummaryInfo>();
        }
        return this.emdSummaryInfo;
    }

}
