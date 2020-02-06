
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}EMDSummaryInfo" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}EMDInfo" maxOccurs="999"/&gt;
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
    "emdSummaryInfo",
    "emdInfo"
})
@XmlRootElement(name = "EMDIssuanceRsp")
public class EMDIssuanceRsp
    extends BaseRsp
{

    @XmlElement(name = "EMDSummaryInfo")
    protected List<EMDSummaryInfo> emdSummaryInfo;
    @XmlElement(name = "EMDInfo")
    protected List<EMDInfo> emdInfo;

    /**
     * List of EMDSummaryInfo elements to show minimal information in issuance response. Appears for ShowDetails=false in the request.This is the default behaviour.Gets the value of the emdSummaryInfo property.
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

    /**
     * List of EMDInfo elements to show detailoed information in issuance response. Appears for ShowDetails=true in the request.Gets the value of the emdInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDInfo }
     * 
     * 
     */
    public List<EMDInfo> getEMDInfo() {
        if (emdInfo == null) {
            emdInfo = new ArrayList<EMDInfo>();
        }
        return this.emdInfo;
    }

}
