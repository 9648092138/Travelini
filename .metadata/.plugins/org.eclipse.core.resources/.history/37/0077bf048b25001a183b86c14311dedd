
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PrePayProfileInfo" maxOccurs="999"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MaxResults" type="{http://www.travelport.com/schema/common_v45_0}typeMaxResults" /&gt;
 *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MoreDataStartIndex" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prePayProfileInfo"
})
@XmlRootElement(name = "AirPrePayRsp")
public class AirPrePayRsp
    extends BaseRsp
{

    @XmlElement(name = "PrePayProfileInfo", required = true)
    protected List<PrePayProfileInfo> prePayProfileInfo;
    @XmlAttribute(name = "MaxResults")
    protected Integer maxResults;
    @XmlAttribute(name = "MoreIndicator")
    protected Boolean moreIndicator;
    @XmlAttribute(name = "MoreDataStartIndex")
    protected String moreDataStartIndex;

    /**
     * Provider: ACH.Gets the value of the prePayProfileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prePayProfileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrePayProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrePayProfileInfo }
     * 
     * 
     */
    public List<PrePayProfileInfo> getPrePayProfileInfo() {
        if (prePayProfileInfo == null) {
            prePayProfileInfo = new ArrayList<PrePayProfileInfo>();
        }
        return this.prePayProfileInfo;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the moreIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreIndicator() {
        return moreIndicator;
    }

    /**
     * Sets the value of the moreIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreIndicator(Boolean value) {
        this.moreIndicator = value;
    }

    /**
     * Gets the value of the moreDataStartIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDataStartIndex() {
        return moreDataStartIndex;
    }

    /**
     * Sets the value of the moreDataStartIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreDataStartIndex(String value) {
        this.moreDataStartIndex = value;
    }

}
