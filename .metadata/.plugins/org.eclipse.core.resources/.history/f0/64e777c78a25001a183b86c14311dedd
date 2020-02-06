
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseRsp;
import com.travelport.schema.common_v45_0.MCO;
import com.travelport.schema.common_v45_0.ServiceFeeInfo;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}MCO" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}TCR" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="DocumentFailureInfo" type="{http://www.travelport.com/schema/air_v45_0}typeFailureInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}ServiceFeeInfo" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UniversalRecordLocatorCode" type="{http://www.travelport.com/schema/common_v45_0}typeLocatorCode" /&gt;
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
    "mco",
    "tcr",
    "documentFailureInfo",
    "serviceFeeInfo"
})
@XmlRootElement(name = "AirRetrieveDocumentRsp")
public class AirRetrieveDocumentRsp
    extends BaseRsp
{

    @XmlElement(name = "ETR")
    protected List<ETR> etr;
    @XmlElement(name = "MCO", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<MCO> mco;
    @XmlElement(name = "TCR")
    protected List<TCR> tcr;
    @XmlElement(name = "DocumentFailureInfo")
    protected List<TypeFailureInfo> documentFailureInfo;
    @XmlElement(name = "ServiceFeeInfo", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<ServiceFeeInfo> serviceFeeInfo;
    @XmlAttribute(name = "UniversalRecordLocatorCode")
    protected String universalRecordLocatorCode;

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
     * Provider: 1G,1V,1P,1J.Gets the value of the mco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMCO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCO }
     * 
     * 
     */
    public List<MCO> getMCO() {
        if (mco == null) {
            mco = new ArrayList<MCO>();
        }
        return this.mco;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the tcr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCR }
     * 
     * 
     */
    public List<TCR> getTCR() {
        if (tcr == null) {
            tcr = new ArrayList<TCR>();
        }
        return this.tcr;
    }

    /**
     * Gets the value of the documentFailureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentFailureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentFailureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFailureInfo }
     * 
     * 
     */
    public List<TypeFailureInfo> getDocumentFailureInfo() {
        if (documentFailureInfo == null) {
            documentFailureInfo = new ArrayList<TypeFailureInfo>();
        }
        return this.documentFailureInfo;
    }

    /**
     * Provider: 1G,1V Gets the value of the serviceFeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeeInfo }
     * 
     * 
     */
    public List<ServiceFeeInfo> getServiceFeeInfo() {
        if (serviceFeeInfo == null) {
            serviceFeeInfo = new ArrayList<ServiceFeeInfo>();
        }
        return this.serviceFeeInfo;
    }

    /**
     * Gets the value of the universalRecordLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

}
