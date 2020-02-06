
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
 *         &lt;element name="VoluntaryChanges" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Penalty" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VoluntaryRefunds" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Penalty" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "voluntaryChanges",
    "voluntaryRefunds"
})
@XmlRootElement(name = "ChargesRules")
public class ChargesRules {

    @XmlElement(name = "VoluntaryChanges")
    protected List<ChargesRules.VoluntaryChanges> voluntaryChanges;
    @XmlElement(name = "VoluntaryRefunds")
    protected List<ChargesRules.VoluntaryRefunds> voluntaryRefunds;

    /**
     * Gets the value of the voluntaryChanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voluntaryChanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoluntaryChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesRules.VoluntaryChanges }
     * 
     * 
     */
    public List<ChargesRules.VoluntaryChanges> getVoluntaryChanges() {
        if (voluntaryChanges == null) {
            voluntaryChanges = new ArrayList<ChargesRules.VoluntaryChanges>();
        }
        return this.voluntaryChanges;
    }

    /**
     * Gets the value of the voluntaryRefunds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voluntaryRefunds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoluntaryRefunds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesRules.VoluntaryRefunds }
     * 
     * 
     */
    public List<ChargesRules.VoluntaryRefunds> getVoluntaryRefunds() {
        if (voluntaryRefunds == null) {
            voluntaryRefunds = new ArrayList<ChargesRules.VoluntaryRefunds>();
        }
        return this.voluntaryRefunds;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Penalty" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "penalty"
    })
    public static class VoluntaryChanges {

        @XmlElement(name = "Penalty")
        protected Penalty penalty;
        @XmlAttribute(name = "VolChangeInd")
        protected Boolean volChangeInd;

        /**
         * Gets the value of the penalty property.
         * 
         * @return
         *     possible object is
         *     {@link Penalty }
         *     
         */
        public Penalty getPenalty() {
            return penalty;
        }

        /**
         * Sets the value of the penalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Penalty }
         *     
         */
        public void setPenalty(Penalty value) {
            this.penalty = value;
        }

        /**
         * Gets the value of the volChangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVolChangeInd() {
            return volChangeInd;
        }

        /**
         * Sets the value of the volChangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVolChangeInd(Boolean value) {
            this.volChangeInd = value;
        }

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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Penalty" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "penalty"
    })
    public static class VoluntaryRefunds {

        @XmlElement(name = "Penalty")
        protected Penalty penalty;
        @XmlAttribute(name = "VolChangeInd")
        protected Boolean volChangeInd;

        /**
         * Gets the value of the penalty property.
         * 
         * @return
         *     possible object is
         *     {@link Penalty }
         *     
         */
        public Penalty getPenalty() {
            return penalty;
        }

        /**
         * Sets the value of the penalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Penalty }
         *     
         */
        public void setPenalty(Penalty value) {
            this.penalty = value;
        }

        /**
         * Gets the value of the volChangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVolChangeInd() {
            return volChangeInd;
        }

        /**
         * Sets the value of the volChangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVolChangeInd(Boolean value) {
            this.volChangeInd = value;
        }

    }

}
