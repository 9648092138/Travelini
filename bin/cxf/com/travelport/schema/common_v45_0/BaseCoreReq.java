
package com.travelport.schema.common_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.travelport.schema.air_v45_0.BaseAirExchangeMultiQuoteReq;
import com.travelport.schema.air_v45_0.BaseAirExchangeQuoteReq;
import com.travelport.schema.air_v45_0.BaseAirPriceReq;


/**
 * <p>Java class for BaseCoreReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseCoreReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}BillingPointOfSaleInfo"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}AgentIDOverride" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}TerminalSessionInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TokenId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AuthorizedBy" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetBranch" type="{http://www.travelport.com/schema/common_v45_0}typeBranchCode" /&gt;
 *       &lt;attribute name="OverrideLogging" type="{http://www.travelport.com/schema/common_v45_0}typeLoggingLevel" /&gt;
 *       &lt;attribute name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCoreReq", propOrder = {
    "billingPointOfSaleInfo",
    "agentIDOverride",
    "terminalSessionInfo"
})
@XmlSeeAlso({
    BaseAirExchangeMultiQuoteReq.class,
    BaseCoreSearchReq.class,
    BaseAirExchangeQuoteReq.class,
    BaseReq.class,
    BaseAirPriceReq.class
})
public class BaseCoreReq {

    @XmlElement(name = "BillingPointOfSaleInfo", required = true)
    protected BillingPointOfSaleInfo billingPointOfSaleInfo;
    @XmlElement(name = "AgentIDOverride")
    protected List<AgentIDOverride> agentIDOverride;
    @XmlElement(name = "TerminalSessionInfo")
    protected String terminalSessionInfo;
    @XmlAttribute(name = "TraceId")
    protected String traceId;
    @XmlAttribute(name = "TokenId")
    protected String tokenId;
    @XmlAttribute(name = "AuthorizedBy")
    protected String authorizedBy;
    @XmlAttribute(name = "TargetBranch")
    protected String targetBranch;
    @XmlAttribute(name = "OverrideLogging")
    protected TypeLoggingLevel overrideLogging;
    @XmlAttribute(name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;

    /**
     * Gets the value of the billingPointOfSaleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPointOfSaleInfo }
     *     
     */
    public BillingPointOfSaleInfo getBillingPointOfSaleInfo() {
        return billingPointOfSaleInfo;
    }

    /**
     * Sets the value of the billingPointOfSaleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPointOfSaleInfo }
     *     
     */
    public void setBillingPointOfSaleInfo(BillingPointOfSaleInfo value) {
        this.billingPointOfSaleInfo = value;
    }

    /**
     * Gets the value of the agentIDOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentIDOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentIDOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentIDOverride }
     * 
     * 
     */
    public List<AgentIDOverride> getAgentIDOverride() {
        if (agentIDOverride == null) {
            agentIDOverride = new ArrayList<AgentIDOverride>();
        }
        return this.agentIDOverride;
    }

    /**
     * Gets the value of the terminalSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalSessionInfo() {
        return terminalSessionInfo;
    }

    /**
     * Sets the value of the terminalSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalSessionInfo(String value) {
        this.terminalSessionInfo = value;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenId(String value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the authorizedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedBy() {
        return authorizedBy;
    }

    /**
     * Sets the value of the authorizedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedBy(String value) {
        this.authorizedBy = value;
    }

    /**
     * Gets the value of the targetBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    /**
     * Sets the value of the targetBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetBranch(String value) {
        this.targetBranch = value;
    }

    /**
     * Gets the value of the overrideLogging property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLoggingLevel }
     *     
     */
    public TypeLoggingLevel getOverrideLogging() {
        return overrideLogging;
    }

    /**
     * Sets the value of the overrideLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLoggingLevel }
     *     
     */
    public void setOverrideLogging(TypeLoggingLevel value) {
        this.overrideLogging = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

}
