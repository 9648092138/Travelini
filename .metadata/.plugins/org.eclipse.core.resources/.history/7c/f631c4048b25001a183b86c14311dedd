
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}LegDetail" maxOccurs="999"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="TotalPrice" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateTotalPrice" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "legDetail"
})
@XmlRootElement(name = "LegPrice")
public class LegPrice {

    @XmlElement(name = "LegDetail", required = true)
    protected List<LegDetail> legDetail;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "TotalPrice", required = true)
    protected String totalPrice;
    @XmlAttribute(name = "ApproximateTotalPrice")
    protected String approximateTotalPrice;

    /**
     * Gets the value of the legDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegDetail }
     * 
     * 
     */
    public List<LegDetail> getLegDetail() {
        if (legDetail == null) {
            legDetail = new ArrayList<LegDetail>();
        }
        return this.legDetail;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the approximateTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotalPrice() {
        return approximateTotalPrice;
    }

    /**
     * Sets the value of the approximateTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTotalPrice(String value) {
        this.approximateTotalPrice = value;
    }

}
