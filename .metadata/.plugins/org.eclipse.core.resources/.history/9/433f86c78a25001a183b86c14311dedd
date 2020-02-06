
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
 *         &lt;element name="PolicyCompliance" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="InPolicy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PolicyToken" type="{http://www.travelport.com/schema/common_v45_0}StringLength1to128" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContractCompliance" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="InContract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ContractToken" type="{http://www.travelport.com/schema/common_v45_0}StringLength1to128" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PreferredSupplier" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Preferred" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ProfileType" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeProfileType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="RailSegmentRef" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *       &lt;attribute name="ReservationLocatorRef" type="{http://www.travelport.com/schema/common_v45_0}typeLocatorCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyCompliance",
    "contractCompliance",
    "preferredSupplier"
})
@XmlRootElement(name = "TravelComplianceData")
public class TravelComplianceData {

    @XmlElement(name = "PolicyCompliance")
    protected List<TravelComplianceData.PolicyCompliance> policyCompliance;
    @XmlElement(name = "ContractCompliance")
    protected List<TravelComplianceData.ContractCompliance> contractCompliance;
    @XmlElement(name = "PreferredSupplier")
    protected List<TravelComplianceData.PreferredSupplier> preferredSupplier;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "AirSegmentRef")
    protected String airSegmentRef;
    @XmlAttribute(name = "PassiveSegmentRef")
    protected String passiveSegmentRef;
    @XmlAttribute(name = "RailSegmentRef")
    protected String railSegmentRef;
    @XmlAttribute(name = "ReservationLocatorRef")
    protected String reservationLocatorRef;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Gets the value of the policyCompliance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyCompliance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyCompliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData.PolicyCompliance }
     * 
     * 
     */
    public List<TravelComplianceData.PolicyCompliance> getPolicyCompliance() {
        if (policyCompliance == null) {
            policyCompliance = new ArrayList<TravelComplianceData.PolicyCompliance>();
        }
        return this.policyCompliance;
    }

    /**
     * Gets the value of the contractCompliance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractCompliance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractCompliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData.ContractCompliance }
     * 
     * 
     */
    public List<TravelComplianceData.ContractCompliance> getContractCompliance() {
        if (contractCompliance == null) {
            contractCompliance = new ArrayList<TravelComplianceData.ContractCompliance>();
        }
        return this.contractCompliance;
    }

    /**
     * Gets the value of the preferredSupplier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredSupplier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredSupplier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData.PreferredSupplier }
     * 
     * 
     */
    public List<TravelComplianceData.PreferredSupplier> getPreferredSupplier() {
        if (preferredSupplier == null) {
            preferredSupplier = new ArrayList<TravelComplianceData.PreferredSupplier>();
        }
        return this.preferredSupplier;
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
     * Gets the value of the airSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirSegmentRef() {
        return airSegmentRef;
    }

    /**
     * Sets the value of the airSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirSegmentRef(String value) {
        this.airSegmentRef = value;
    }

    /**
     * Gets the value of the passiveSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveSegmentRef() {
        return passiveSegmentRef;
    }

    /**
     * Sets the value of the passiveSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassiveSegmentRef(String value) {
        this.passiveSegmentRef = value;
    }

    /**
     * Gets the value of the railSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailSegmentRef() {
        return railSegmentRef;
    }

    /**
     * Sets the value of the railSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailSegmentRef(String value) {
        this.railSegmentRef = value;
    }

    /**
     * Gets the value of the reservationLocatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationLocatorRef() {
        return reservationLocatorRef;
    }

    /**
     * Sets the value of the reservationLocatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationLocatorRef(String value) {
        this.reservationLocatorRef = value;
    }

    /**
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
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
     *       &lt;attribute name="InContract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ContractToken" type="{http://www.travelport.com/schema/common_v45_0}StringLength1to128" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContractCompliance {

        @XmlAttribute(name = "InContract", required = true)
        protected boolean inContract;
        @XmlAttribute(name = "ContractToken")
        protected String contractToken;

        /**
         * Gets the value of the inContract property.
         * 
         */
        public boolean isInContract() {
            return inContract;
        }

        /**
         * Sets the value of the inContract property.
         * 
         */
        public void setInContract(boolean value) {
            this.inContract = value;
        }

        /**
         * Gets the value of the contractToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractToken() {
            return contractToken;
        }

        /**
         * Sets the value of the contractToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractToken(String value) {
            this.contractToken = value;
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
     *       &lt;attribute name="InPolicy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PolicyToken" type="{http://www.travelport.com/schema/common_v45_0}StringLength1to128" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PolicyCompliance {

        @XmlAttribute(name = "InPolicy", required = true)
        protected boolean inPolicy;
        @XmlAttribute(name = "PolicyToken")
        protected String policyToken;

        /**
         * Gets the value of the inPolicy property.
         * 
         */
        public boolean isInPolicy() {
            return inPolicy;
        }

        /**
         * Sets the value of the inPolicy property.
         * 
         */
        public void setInPolicy(boolean value) {
            this.inPolicy = value;
        }

        /**
         * Gets the value of the policyToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyToken() {
            return policyToken;
        }

        /**
         * Sets the value of the policyToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyToken(String value) {
            this.policyToken = value;
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
     *       &lt;attribute name="Preferred" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ProfileType" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeProfileType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PreferredSupplier {

        @XmlAttribute(name = "Preferred", required = true)
        protected boolean preferred;
        @XmlAttribute(name = "ProfileType", required = true)
        protected TypeProfileType profileType;

        /**
         * Gets the value of the preferred property.
         * 
         */
        public boolean isPreferred() {
            return preferred;
        }

        /**
         * Sets the value of the preferred property.
         * 
         */
        public void setPreferred(boolean value) {
            this.preferred = value;
        }

        /**
         * Gets the value of the profileType property.
         * 
         * @return
         *     possible object is
         *     {@link TypeProfileType }
         *     
         */
        public TypeProfileType getProfileType() {
            return profileType;
        }

        /**
         * Sets the value of the profileType property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeProfileType }
         *     
         */
        public void setProfileType(TypeProfileType value) {
            this.profileType = value;
        }

    }

}
