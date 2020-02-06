
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}ETR" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}VoidResultInfo" maxOccurs="999"/&gt;
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
    "etr",
    "voidResultInfo"
})
@XmlRootElement(name = "AirVoidDocumentRsp")
public class AirVoidDocumentRsp
    extends BaseRsp
{

    @XmlElement(name = "ETR")
    protected List<ETR> etr;
    @XmlElement(name = "VoidResultInfo", required = true)
    protected List<VoidResultInfo> voidResultInfo;

    /**
     * Provider: 1G,1V.Gets the value of the etr property.
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
     * Provider: 1G,1V.Gets the value of the voidResultInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voidResultInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoidResultInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoidResultInfo }
     * 
     * 
     */
    public List<VoidResultInfo> getVoidResultInfo() {
        if (voidResultInfo == null) {
            voidResultInfo = new ArrayList<VoidResultInfo>();
        }
        return this.voidResultInfo;
    }

}
