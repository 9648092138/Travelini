
package com.travelport.schema.common_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTransactionsAllowed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeTransactionsAllowed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}typeBookingTransactionsAllowed"&gt;
 *       &lt;attribute name="ShoppingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PricingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTransactionsAllowed")
@XmlSeeAlso({
    com.travelport.schema.common_v45_0.TransactionType.Air.class
})
public class TypeTransactionsAllowed
    extends TypeBookingTransactionsAllowed
{

    @XmlAttribute(name = "ShoppingEnabled")
    protected Boolean shoppingEnabled;
    @XmlAttribute(name = "PricingEnabled")
    protected Boolean pricingEnabled;

    /**
     * Gets the value of the shoppingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShoppingEnabled() {
        return shoppingEnabled;
    }

    /**
     * Sets the value of the shoppingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShoppingEnabled(Boolean value) {
        this.shoppingEnabled = value;
    }

    /**
     * Gets the value of the pricingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricingEnabled() {
        return pricingEnabled;
    }

    /**
     * Sets the value of the pricingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricingEnabled(Boolean value) {
        this.pricingEnabled = value;
    }

}
