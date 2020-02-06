
package com.travelport.schema.air_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.Email;
import com.travelport.schema.common_v45_0.LoyaltyCard;
import com.travelport.schema.common_v45_0.TypeStructuredAddress;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PersonName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}Email" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.travelport.com/schema/common_v45_0}typeStructuredAddress" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}RelatedTraveler" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}LoyaltyCard" maxOccurs="999" minOccurs="0"/&gt;
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
    "personName",
    "email",
    "address",
    "relatedTraveler",
    "loyaltyCard"
})
@XmlRootElement(name = "PrePayCustomer")
public class PrePayCustomer {

    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlElement(name = "Email", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<Email> email;
    @XmlElement(name = "Address")
    protected List<TypeStructuredAddress> address;
    @XmlElement(name = "RelatedTraveler")
    protected List<RelatedTraveler> relatedTraveler;
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v45_0")
    protected List<LoyaltyCard> loyaltyCard;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Customer email detail Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<Email>();
        }
        return this.email;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeStructuredAddress }
     * 
     * 
     */
    public List<TypeStructuredAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<TypeStructuredAddress>();
        }
        return this.address;
    }

    /**
     * Travelers related to this pre pay id Gets the value of the relatedTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTraveler }
     * 
     * 
     */
    public List<RelatedTraveler> getRelatedTraveler() {
        if (relatedTraveler == null) {
            relatedTraveler = new ArrayList<RelatedTraveler>();
        }
        return this.relatedTraveler;
    }

    /**
     * Customer loyalty card detail Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

}
