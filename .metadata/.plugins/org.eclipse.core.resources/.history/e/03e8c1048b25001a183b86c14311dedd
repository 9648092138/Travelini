
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.FormOfPaymentRef;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}FormOfPaymentRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}AirPricingInfoRef" maxOccurs="999"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BillingDetailItem" maxOccurs="999"/&gt;
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
    "formOfPaymentRef",
    "airPricingInfoRef",
    "billingDetailItem"
})
@XmlRootElement(name = "DetailedBillingInformation")
public class DetailedBillingInformation {

    @XmlElement(name = "FormOfPaymentRef", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected FormOfPaymentRef formOfPaymentRef;
    @XmlElement(name = "AirPricingInfoRef", required = true)
    protected List<AirPricingInfoRef> airPricingInfoRef;
    @XmlElement(name = "BillingDetailItem", required = true)
    protected List<BillingDetailItem> billingDetailItem;

    /**
     * Gets the value of the formOfPaymentRef property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentRef }
     *     
     */
    public FormOfPaymentRef getFormOfPaymentRef() {
        return formOfPaymentRef;
    }

    /**
     * Sets the value of the formOfPaymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentRef }
     *     
     */
    public void setFormOfPaymentRef(FormOfPaymentRef value) {
        this.formOfPaymentRef = value;
    }

    /**
     * Returns related air pricing infos.
     *                         Gets the value of the airPricingInfoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfoRef }
     * 
     * 
     */
    public List<AirPricingInfoRef> getAirPricingInfoRef() {
        if (airPricingInfoRef == null) {
            airPricingInfoRef = new ArrayList<AirPricingInfoRef>();
        }
        return this.airPricingInfoRef;
    }

    /**
     * Gets the value of the billingDetailItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingDetailItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingDetailItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDetailItem }
     * 
     * 
     */
    public List<BillingDetailItem> getBillingDetailItem() {
        if (billingDetailItem == null) {
            billingDetailItem = new ArrayList<BillingDetailItem>();
        }
        return this.billingDetailItem;
    }

}
