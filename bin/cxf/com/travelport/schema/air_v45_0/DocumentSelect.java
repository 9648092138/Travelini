
package com.travelport.schema.air_v45_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}BackOfficeHandOff" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}Itinerary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IssueTicketOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IssueElectronicTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FaxIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "backOfficeHandOff",
    "itinerary"
})
@XmlRootElement(name = "DocumentSelect")
public class DocumentSelect {

    @XmlElement(name = "BackOfficeHandOff")
    protected BackOfficeHandOff backOfficeHandOff;
    @XmlElement(name = "Itinerary")
    protected Itinerary itinerary;
    @XmlAttribute(name = "IssueTicketOnly")
    protected Boolean issueTicketOnly;
    @XmlAttribute(name = "IssueElectronicTicket")
    protected Boolean issueElectronicTicket;
    @XmlAttribute(name = "FaxIndicator")
    protected Boolean faxIndicator;

    /**
     * Gets the value of the backOfficeHandOff property.
     * 
     * @return
     *     possible object is
     *     {@link BackOfficeHandOff }
     *     
     */
    public BackOfficeHandOff getBackOfficeHandOff() {
        return backOfficeHandOff;
    }

    /**
     * Sets the value of the backOfficeHandOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackOfficeHandOff }
     *     
     */
    public void setBackOfficeHandOff(BackOfficeHandOff value) {
        this.backOfficeHandOff = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link Itinerary }
     *     
     */
    public Itinerary getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Itinerary }
     *     
     */
    public void setItinerary(Itinerary value) {
        this.itinerary = value;
    }

    /**
     * Gets the value of the issueTicketOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssueTicketOnly() {
        return issueTicketOnly;
    }

    /**
     * Sets the value of the issueTicketOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIssueTicketOnly(Boolean value) {
        this.issueTicketOnly = value;
    }

    /**
     * Gets the value of the issueElectronicTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssueElectronicTicket() {
        return issueElectronicTicket;
    }

    /**
     * Sets the value of the issueElectronicTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIssueElectronicTicket(Boolean value) {
        this.issueElectronicTicket = value;
    }

    /**
     * Gets the value of the faxIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaxIndicator() {
        return faxIndicator;
    }

    /**
     * Sets the value of the faxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaxIndicator(Boolean value) {
        this.faxIndicator = value;
    }

}
