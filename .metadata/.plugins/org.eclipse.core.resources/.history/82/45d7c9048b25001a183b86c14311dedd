
package com.travelport.schema.common_v45_0;

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
 *         &lt;element name="TaxInfo" type="{http://www.travelport.com/schema/common_v45_0}typeTaxInfo" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="Commission" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrAmountPercent"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MCOAmount" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="MCOEquivalentFare" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *       &lt;attribute name="MCOTotalAmount" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "taxInfo",
    "commission"
})
@XmlRootElement(name = "MCOPriceData")
public class MCOPriceData {

    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "Commission")
    protected MCOPriceData.Commission commission;
    @XmlAttribute(name = "MCOAmount", required = true)
    protected String mcoAmount;
    @XmlAttribute(name = "MCOEquivalentFare")
    protected String mcoEquivalentFare;
    @XmlAttribute(name = "MCOTotalAmount")
    protected String mcoTotalAmount;

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * 
     * 
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TypeTaxInfo>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link MCOPriceData.Commission }
     *     
     */
    public MCOPriceData.Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCOPriceData.Commission }
     *     
     */
    public void setCommission(MCOPriceData.Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the mcoAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOAmount() {
        return mcoAmount;
    }

    /**
     * Sets the value of the mcoAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCOAmount(String value) {
        this.mcoAmount = value;
    }

    /**
     * Gets the value of the mcoEquivalentFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOEquivalentFare() {
        return mcoEquivalentFare;
    }

    /**
     * Sets the value of the mcoEquivalentFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCOEquivalentFare(String value) {
        this.mcoEquivalentFare = value;
    }

    /**
     * Gets the value of the mcoTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOTotalAmount() {
        return mcoTotalAmount;
    }

    /**
     * Sets the value of the mcoTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCOTotalAmount(String value) {
        this.mcoTotalAmount = value;
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
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrAmountPercent"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Commission {

        @XmlAttribute(name = "Amount")
        protected String amount;
        @XmlAttribute(name = "Percentage")
        protected String percentage;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
            this.amount = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPercentage(String value) {
            this.percentage = value;
        }

    }

}
