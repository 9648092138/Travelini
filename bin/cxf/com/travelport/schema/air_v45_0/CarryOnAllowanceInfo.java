
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
 *     &lt;extension base="{http://www.travelport.com/schema/air_v45_0}BaseBaggageAllowanceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarryOnDetails" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BaggageRestriction" maxOccurs="99" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ApplicableCarryOnBags" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BasePrice" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *                 &lt;attribute name="ApproximateBasePrice" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *                 &lt;attribute name="Taxes" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *                 &lt;attribute name="TotalPrice" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *                 &lt;attribute name="ApproximateTotalPrice" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "carryOnDetails"
})
@XmlRootElement(name = "CarryOnAllowanceInfo")
public class CarryOnAllowanceInfo
    extends BaseBaggageAllowanceInfo
{

    @XmlElement(name = "CarryOnDetails")
    protected List<CarryOnAllowanceInfo.CarryOnDetails> carryOnDetails;

    /**
     * Gets the value of the carryOnDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOnDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarryOnAllowanceInfo.CarryOnDetails }
     * 
     * 
     */
    public List<CarryOnAllowanceInfo.CarryOnDetails> getCarryOnDetails() {
        if (carryOnDetails == null) {
            carryOnDetails = new ArrayList<CarryOnAllowanceInfo.CarryOnDetails>();
        }
        return this.carryOnDetails;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BaggageRestriction" maxOccurs="99" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ApplicableCarryOnBags" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BasePrice" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *       &lt;attribute name="ApproximateBasePrice" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *       &lt;attribute name="Taxes" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
     *       &lt;attribute name="TotalPrice" type="{http://www.travelport.com/schema/common_v45_0}typeMoney" /&gt;
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
        "baggageRestriction"
    })
    public static class CarryOnDetails {

        @XmlElement(name = "BaggageRestriction")
        protected List<BaggageRestriction> baggageRestriction;
        @XmlAttribute(name = "ApplicableCarryOnBags")
        protected String applicableCarryOnBags;
        @XmlAttribute(name = "BasePrice")
        protected String basePrice;
        @XmlAttribute(name = "ApproximateBasePrice")
        protected String approximateBasePrice;
        @XmlAttribute(name = "Taxes")
        protected String taxes;
        @XmlAttribute(name = "TotalPrice")
        protected String totalPrice;
        @XmlAttribute(name = "ApproximateTotalPrice")
        protected String approximateTotalPrice;

        /**
         * Gets the value of the baggageRestriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baggageRestriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaggageRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageRestriction }
         * 
         * 
         */
        public List<BaggageRestriction> getBaggageRestriction() {
            if (baggageRestriction == null) {
                baggageRestriction = new ArrayList<BaggageRestriction>();
            }
            return this.baggageRestriction;
        }

        /**
         * Gets the value of the applicableCarryOnBags property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicableCarryOnBags() {
            return applicableCarryOnBags;
        }

        /**
         * Sets the value of the applicableCarryOnBags property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicableCarryOnBags(String value) {
            this.applicableCarryOnBags = value;
        }

        /**
         * Gets the value of the basePrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBasePrice() {
            return basePrice;
        }

        /**
         * Sets the value of the basePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBasePrice(String value) {
            this.basePrice = value;
        }

        /**
         * Gets the value of the approximateBasePrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateBasePrice() {
            return approximateBasePrice;
        }

        /**
         * Sets the value of the approximateBasePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApproximateBasePrice(String value) {
            this.approximateBasePrice = value;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxes(String value) {
            this.taxes = value;
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

}
