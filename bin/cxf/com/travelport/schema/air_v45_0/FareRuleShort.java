
package com.travelport.schema.air_v45_0;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}FareRuleNameValue" maxOccurs="999"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="TableNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareRuleNameValue"
})
@XmlRootElement(name = "FareRuleShort")
public class FareRuleShort {

    @XmlElement(name = "FareRuleNameValue", required = true)
    protected List<FareRuleNameValue> fareRuleNameValue;
    @XmlAttribute(name = "Category", required = true)
    protected BigInteger category;
    @XmlAttribute(name = "TableNumber")
    protected String tableNumber;

    /**
     * Gets the value of the fareRuleNameValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleNameValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRuleNameValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleNameValue }
     * 
     * 
     */
    public List<FareRuleNameValue> getFareRuleNameValue() {
        if (fareRuleNameValue == null) {
            fareRuleNameValue = new ArrayList<FareRuleNameValue>();
        }
        return this.fareRuleNameValue;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategory(BigInteger value) {
        this.category = value;
    }

    /**
     * Gets the value of the tableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableNumber() {
        return tableNumber;
    }

    /**
     * Sets the value of the tableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableNumber(String value) {
        this.tableNumber = value;
    }

}
