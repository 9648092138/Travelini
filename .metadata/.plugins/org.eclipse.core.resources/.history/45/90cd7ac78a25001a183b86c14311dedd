
package com.travelport.schema.air_v45_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseReq;
import com.travelport.schema.common_v45_0.TypeProviderReservationDetail;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}ProviderReservationDetail"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}TicketNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}IssuanceModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}SelectionModifiers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UniversalRecordLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeLocatorCode" /&gt;
 *       &lt;attribute name="ShowDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IssueEmdsToAllSvc" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationDetail",
    "ticketNumber",
    "issuanceModifiers",
    "selectionModifiers"
})
@XmlRootElement(name = "EMDIssuanceReq")
public class EMDIssuanceReq
    extends BaseReq
{

    @XmlElement(name = "ProviderReservationDetail", namespace = "http://www.travelport.com/schema/common_v45_0", required = true)
    protected TypeProviderReservationDetail providerReservationDetail;
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected String ticketNumber;
    @XmlElement(name = "IssuanceModifiers")
    protected IssuanceModifiers issuanceModifiers;
    @XmlElement(name = "SelectionModifiers")
    protected SelectionModifiers selectionModifiers;
    @XmlAttribute(name = "UniversalRecordLocatorCode", required = true)
    protected String universalRecordLocatorCode;
    @XmlAttribute(name = "ShowDetails")
    protected Boolean showDetails;
    @XmlAttribute(name = "IssueEmdsToAllSvc")
    protected Boolean issueEmdsToAllSvc;

    /**
     * PNR information for which EMD is going to be issued.
     * 
     * @return
     *     possible object is
     *     {@link TypeProviderReservationDetail }
     *     
     */
    public TypeProviderReservationDetail getProviderReservationDetail() {
        return providerReservationDetail;
    }

    /**
     * Sets the value of the providerReservationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProviderReservationDetail }
     *     
     */
    public void setProviderReservationDetail(TypeProviderReservationDetail value) {
        this.providerReservationDetail = value;
    }

    /**
     * Ticket number for which EMD is going to be issued.Required for EMD-A issuance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * General modifiers related to EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link IssuanceModifiers }
     *     
     */
    public IssuanceModifiers getIssuanceModifiers() {
        return issuanceModifiers;
    }

    /**
     * Sets the value of the issuanceModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuanceModifiers }
     *     
     */
    public void setIssuanceModifiers(IssuanceModifiers value) {
        this.issuanceModifiers = value;
    }

    /**
     * Modifiers related to selection of services during EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link SelectionModifiers }
     *     
     */
    public SelectionModifiers getSelectionModifiers() {
        return selectionModifiers;
    }

    /**
     * Sets the value of the selectionModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionModifiers }
     *     
     */
    public void setSelectionModifiers(SelectionModifiers value) {
        this.selectionModifiers = value;
    }

    /**
     * Gets the value of the universalRecordLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

    /**
     * Gets the value of the showDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowDetails() {
        if (showDetails == null) {
            return false;
        } else {
            return showDetails;
        }
    }

    /**
     * Sets the value of the showDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDetails(Boolean value) {
        this.showDetails = value;
    }

    /**
     * Gets the value of the issueEmdsToAllSvc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIssueEmdsToAllSvc() {
        if (issueEmdsToAllSvc == null) {
            return false;
        } else {
            return issueEmdsToAllSvc;
        }
    }

    /**
     * Sets the value of the issueEmdsToAllSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIssueEmdsToAllSvc(Boolean value) {
        this.issueEmdsToAllSvc = value;
    }

}
