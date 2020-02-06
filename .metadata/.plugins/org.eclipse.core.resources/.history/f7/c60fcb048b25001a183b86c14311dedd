
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the rules for applying service rules
 * 
 * <p>Java class for ServiceRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RequiredForAllTravelers" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RequiredForAllSegments" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RequiredForAllSegmentsInOD" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="UnselectedOptionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="SecondaryOptionCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ApplicationLevel" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ApplicationLimits" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v45_0}OptionalServiceApplicationLimitType" maxOccurs="10"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v45_0}ServiceData" maxOccurs="999" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ApplicableLevels"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.travelport.com/schema/common_v45_0}OptionalServiceApplicabilityType" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ProviderDefinedApplicableLevels" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ModifyRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ModifyRule" maxOccurs="999"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}ModificationRulesGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="SupportedModifications"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.travelport.com/schema/common_v45_0}ModificationType" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ProviderDefinedModificationType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SecondaryTypeRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SecondaryTypeRule" maxOccurs="999"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v45_0}OptionalServiceApplicationLimitType" maxOccurs="10" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="SecondaryType" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Remarks" type="{http://www.travelport.com/schema/common_v45_0}FormattedTextTextType" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRuleType", propOrder = {
    "applicationRules",
    "applicationLevel",
    "modifyRules",
    "secondaryTypeRules",
    "remarks"
})
public class ServiceRuleType {

    @XmlElement(name = "ApplicationRules")
    protected ServiceRuleType.ApplicationRules applicationRules;
    @XmlElement(name = "ApplicationLevel")
    protected ServiceRuleType.ApplicationLevel applicationLevel;
    @XmlElement(name = "ModifyRules")
    protected ServiceRuleType.ModifyRules modifyRules;
    @XmlElement(name = "SecondaryTypeRules")
    protected ServiceRuleType.SecondaryTypeRules secondaryTypeRules;
    @XmlElement(name = "Remarks")
    protected List<FormattedTextTextType> remarks;
    @XmlAttribute(name = "Key", required = true)
    protected String key;

    /**
     * Gets the value of the applicationRules property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.ApplicationRules }
     *     
     */
    public ServiceRuleType.ApplicationRules getApplicationRules() {
        return applicationRules;
    }

    /**
     * Sets the value of the applicationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.ApplicationRules }
     *     
     */
    public void setApplicationRules(ServiceRuleType.ApplicationRules value) {
        this.applicationRules = value;
    }

    /**
     * Gets the value of the applicationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.ApplicationLevel }
     *     
     */
    public ServiceRuleType.ApplicationLevel getApplicationLevel() {
        return applicationLevel;
    }

    /**
     * Sets the value of the applicationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.ApplicationLevel }
     *     
     */
    public void setApplicationLevel(ServiceRuleType.ApplicationLevel value) {
        this.applicationLevel = value;
    }

    /**
     * Gets the value of the modifyRules property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.ModifyRules }
     *     
     */
    public ServiceRuleType.ModifyRules getModifyRules() {
        return modifyRules;
    }

    /**
     * Sets the value of the modifyRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.ModifyRules }
     *     
     */
    public void setModifyRules(ServiceRuleType.ModifyRules value) {
        this.modifyRules = value;
    }

    /**
     * Gets the value of the secondaryTypeRules property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.SecondaryTypeRules }
     *     
     */
    public ServiceRuleType.SecondaryTypeRules getSecondaryTypeRules() {
        return secondaryTypeRules;
    }

    /**
     * Sets the value of the secondaryTypeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.SecondaryTypeRules }
     *     
     */
    public void setSecondaryTypeRules(ServiceRuleType.SecondaryTypeRules value) {
        this.secondaryTypeRules = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextTextType }
     * 
     * 
     */
    public List<FormattedTextTextType> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<FormattedTextTextType>();
        }
        return this.remarks;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ApplicationLimits" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v45_0}OptionalServiceApplicationLimitType" maxOccurs="10"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}ServiceData" maxOccurs="999" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ApplicableLevels"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.travelport.com/schema/common_v45_0}OptionalServiceApplicabilityType" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ProviderDefinedApplicableLevels" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "applicationLimits",
        "serviceData"
    })
    public static class ApplicationLevel {

        @XmlElement(name = "ApplicationLimits")
        protected ServiceRuleType.ApplicationLevel.ApplicationLimits applicationLimits;
        @XmlElement(name = "ServiceData")
        protected List<ServiceData> serviceData;
        @XmlAttribute(name = "ApplicableLevels")
        protected List<OptionalServiceApplicabilityType> applicableLevels;
        @XmlAttribute(name = "ProviderDefinedApplicableLevels")
        protected String providerDefinedApplicableLevels;

        /**
         * Gets the value of the applicationLimits property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceRuleType.ApplicationLevel.ApplicationLimits }
         *     
         */
        public ServiceRuleType.ApplicationLevel.ApplicationLimits getApplicationLimits() {
            return applicationLimits;
        }

        /**
         * Sets the value of the applicationLimits property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceRuleType.ApplicationLevel.ApplicationLimits }
         *     
         */
        public void setApplicationLimits(ServiceRuleType.ApplicationLevel.ApplicationLimits value) {
            this.applicationLimits = value;
        }

        /**
         * Gets the value of the serviceData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceData }
         * 
         * 
         */
        public List<ServiceData> getServiceData() {
            if (serviceData == null) {
                serviceData = new ArrayList<ServiceData>();
            }
            return this.serviceData;
        }

        /**
         * Gets the value of the applicableLevels property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicableLevels property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApplicableLevels().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OptionalServiceApplicabilityType }
         * 
         * 
         */
        public List<OptionalServiceApplicabilityType> getApplicableLevels() {
            if (applicableLevels == null) {
                applicableLevels = new ArrayList<OptionalServiceApplicabilityType>();
            }
            return this.applicableLevels;
        }

        /**
         * Gets the value of the providerDefinedApplicableLevels property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderDefinedApplicableLevels() {
            return providerDefinedApplicableLevels;
        }

        /**
         * Sets the value of the providerDefinedApplicableLevels property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProviderDefinedApplicableLevels(String value) {
            this.providerDefinedApplicableLevels = value;
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
         *         &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v45_0}OptionalServiceApplicationLimitType" maxOccurs="10"/&gt;
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
            "applicationLimit"
        })
        public static class ApplicationLimits {

            @XmlElement(name = "ApplicationLimit", required = true)
            protected List<OptionalServiceApplicationLimitType> applicationLimit;

            /**
             * Gets the value of the applicationLimit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the applicationLimit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getApplicationLimit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OptionalServiceApplicationLimitType }
             * 
             * 
             */
            public List<OptionalServiceApplicationLimitType> getApplicationLimit() {
                if (applicationLimit == null) {
                    applicationLimit = new ArrayList<OptionalServiceApplicationLimitType>();
                }
                return this.applicationLimit;
            }

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
     *       &lt;attribute name="RequiredForAllTravelers" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RequiredForAllSegments" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RequiredForAllSegmentsInOD" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="UnselectedOptionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="SecondaryOptionCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ApplicationRules {

        @XmlAttribute(name = "RequiredForAllTravelers")
        protected Boolean requiredForAllTravelers;
        @XmlAttribute(name = "RequiredForAllSegments")
        protected Boolean requiredForAllSegments;
        @XmlAttribute(name = "RequiredForAllSegmentsInOD")
        protected Boolean requiredForAllSegmentsInOD;
        @XmlAttribute(name = "UnselectedOptionRequired")
        protected Boolean unselectedOptionRequired;
        @XmlAttribute(name = "SecondaryOptionCodeRequired")
        protected Boolean secondaryOptionCodeRequired;

        /**
         * Gets the value of the requiredForAllTravelers property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequiredForAllTravelers() {
            return requiredForAllTravelers;
        }

        /**
         * Sets the value of the requiredForAllTravelers property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRequiredForAllTravelers(Boolean value) {
            this.requiredForAllTravelers = value;
        }

        /**
         * Gets the value of the requiredForAllSegments property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequiredForAllSegments() {
            return requiredForAllSegments;
        }

        /**
         * Sets the value of the requiredForAllSegments property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRequiredForAllSegments(Boolean value) {
            this.requiredForAllSegments = value;
        }

        /**
         * Gets the value of the requiredForAllSegmentsInOD property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequiredForAllSegmentsInOD() {
            return requiredForAllSegmentsInOD;
        }

        /**
         * Sets the value of the requiredForAllSegmentsInOD property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRequiredForAllSegmentsInOD(Boolean value) {
            this.requiredForAllSegmentsInOD = value;
        }

        /**
         * Gets the value of the unselectedOptionRequired property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUnselectedOptionRequired() {
            return unselectedOptionRequired;
        }

        /**
         * Sets the value of the unselectedOptionRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUnselectedOptionRequired(Boolean value) {
            this.unselectedOptionRequired = value;
        }

        /**
         * Gets the value of the secondaryOptionCodeRequired property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSecondaryOptionCodeRequired() {
            return secondaryOptionCodeRequired;
        }

        /**
         * Sets the value of the secondaryOptionCodeRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSecondaryOptionCodeRequired(Boolean value) {
            this.secondaryOptionCodeRequired = value;
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
     *         &lt;element name="ModifyRule" maxOccurs="999"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}ModificationRulesGroup"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="SupportedModifications"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.travelport.com/schema/common_v45_0}ModificationType" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ProviderDefinedModificationType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "modifyRule"
    })
    public static class ModifyRules {

        @XmlElement(name = "ModifyRule", required = true)
        protected List<ServiceRuleType.ModifyRules.ModifyRule> modifyRule;
        @XmlAttribute(name = "SupportedModifications")
        protected List<ModificationType> supportedModifications;
        @XmlAttribute(name = "ProviderDefinedModificationType")
        protected String providerDefinedModificationType;

        /**
         * Gets the value of the modifyRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modifyRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModifyRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceRuleType.ModifyRules.ModifyRule }
         * 
         * 
         */
        public List<ServiceRuleType.ModifyRules.ModifyRule> getModifyRule() {
            if (modifyRule == null) {
                modifyRule = new ArrayList<ServiceRuleType.ModifyRules.ModifyRule>();
            }
            return this.modifyRule;
        }

        /**
         * Gets the value of the supportedModifications property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supportedModifications property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupportedModifications().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModificationType }
         * 
         * 
         */
        public List<ModificationType> getSupportedModifications() {
            if (supportedModifications == null) {
                supportedModifications = new ArrayList<ModificationType>();
            }
            return this.supportedModifications;
        }

        /**
         * Gets the value of the providerDefinedModificationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderDefinedModificationType() {
            return providerDefinedModificationType;
        }

        /**
         * Sets the value of the providerDefinedModificationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProviderDefinedModificationType(String value) {
            this.providerDefinedModificationType = value;
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
         *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v45_0}ModificationRulesGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ModifyRule {

            @XmlAttribute(name = "Modification", required = true)
            protected ModificationType modification;
            @XmlAttribute(name = "AutomaticallyAppliedOnAdd")
            protected Boolean automaticallyAppliedOnAdd;
            @XmlAttribute(name = "CanDelete")
            protected Boolean canDelete;
            @XmlAttribute(name = "CanAdd")
            protected Boolean canAdd;
            @XmlAttribute(name = "Refundable")
            protected Boolean refundable;
            @XmlAttribute(name = "ProviderDefinedModificationType")
            protected String providerDefinedModificationType;

            /**
             * Gets the value of the modification property.
             * 
             * @return
             *     possible object is
             *     {@link ModificationType }
             *     
             */
            public ModificationType getModification() {
                return modification;
            }

            /**
             * Sets the value of the modification property.
             * 
             * @param value
             *     allowed object is
             *     {@link ModificationType }
             *     
             */
            public void setModification(ModificationType value) {
                this.modification = value;
            }

            /**
             * Gets the value of the automaticallyAppliedOnAdd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isAutomaticallyAppliedOnAdd() {
                if (automaticallyAppliedOnAdd == null) {
                    return false;
                } else {
                    return automaticallyAppliedOnAdd;
                }
            }

            /**
             * Sets the value of the automaticallyAppliedOnAdd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAutomaticallyAppliedOnAdd(Boolean value) {
                this.automaticallyAppliedOnAdd = value;
            }

            /**
             * Gets the value of the canDelete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCanDelete() {
                return canDelete;
            }

            /**
             * Sets the value of the canDelete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCanDelete(Boolean value) {
                this.canDelete = value;
            }

            /**
             * Gets the value of the canAdd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCanAdd() {
                return canAdd;
            }

            /**
             * Sets the value of the canAdd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCanAdd(Boolean value) {
                this.canAdd = value;
            }

            /**
             * Gets the value of the refundable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRefundable() {
                return refundable;
            }

            /**
             * Sets the value of the refundable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRefundable(Boolean value) {
                this.refundable = value;
            }

            /**
             * Gets the value of the providerDefinedModificationType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderDefinedModificationType() {
                return providerDefinedModificationType;
            }

            /**
             * Sets the value of the providerDefinedModificationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderDefinedModificationType(String value) {
                this.providerDefinedModificationType = value;
            }

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
     *         &lt;element name="SecondaryTypeRule" maxOccurs="999"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v45_0}OptionalServiceApplicationLimitType" maxOccurs="10" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="SecondaryType" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
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
        "secondaryTypeRule"
    })
    public static class SecondaryTypeRules {

        @XmlElement(name = "SecondaryTypeRule", required = true)
        protected List<ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule> secondaryTypeRule;

        /**
         * Gets the value of the secondaryTypeRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the secondaryTypeRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSecondaryTypeRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule }
         * 
         * 
         */
        public List<ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule> getSecondaryTypeRule() {
            if (secondaryTypeRule == null) {
                secondaryTypeRule = new ArrayList<ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule>();
            }
            return this.secondaryTypeRule;
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
         *         &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v45_0}OptionalServiceApplicationLimitType" maxOccurs="10" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="SecondaryType" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicationLimit"
        })
        public static class SecondaryTypeRule {

            @XmlElement(name = "ApplicationLimit")
            protected List<OptionalServiceApplicationLimitType> applicationLimit;
            @XmlAttribute(name = "SecondaryType", required = true)
            protected String secondaryType;

            /**
             * Gets the value of the applicationLimit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the applicationLimit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getApplicationLimit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OptionalServiceApplicationLimitType }
             * 
             * 
             */
            public List<OptionalServiceApplicationLimitType> getApplicationLimit() {
                if (applicationLimit == null) {
                    applicationLimit = new ArrayList<OptionalServiceApplicationLimitType>();
                }
                return this.applicationLimit;
            }

            /**
             * Gets the value of the secondaryType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecondaryType() {
                return secondaryType;
            }

            /**
             * Sets the value of the secondaryType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecondaryType(String value) {
                this.secondaryType = value;
            }

        }

    }

}
