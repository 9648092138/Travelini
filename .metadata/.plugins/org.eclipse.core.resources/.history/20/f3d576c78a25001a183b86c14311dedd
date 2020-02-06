
package com.travelport.schema.air_v45_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.BaseReq;
import com.travelport.schema.common_v45_0.LoyaltyCard;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v45_0}BaseReq"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ListSearch"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice minOccurs="0"&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PersonNameSearch"/&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v45_0}LoyaltyCard" maxOccurs="999"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="StartFromResult" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeStartFromResult" /&gt;
 *                 &lt;attribute name="MaxResults" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeMaxResults" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrePayRetrieve"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Id" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeCardNumber" /&gt;
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listSearch",
    "prePayRetrieve"
})
@XmlRootElement(name = "AirPrePayReq")
public class AirPrePayReq
    extends BaseReq
{

    @XmlElement(name = "ListSearch")
    protected AirPrePayReq.ListSearch listSearch;
    @XmlElement(name = "PrePayRetrieve")
    protected AirPrePayReq.PrePayRetrieve prePayRetrieve;

    /**
     * Gets the value of the listSearch property.
     * 
     * @return
     *     possible object is
     *     {@link AirPrePayReq.ListSearch }
     *     
     */
    public AirPrePayReq.ListSearch getListSearch() {
        return listSearch;
    }

    /**
     * Sets the value of the listSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPrePayReq.ListSearch }
     *     
     */
    public void setListSearch(AirPrePayReq.ListSearch value) {
        this.listSearch = value;
    }

    /**
     * Gets the value of the prePayRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link AirPrePayReq.PrePayRetrieve }
     *     
     */
    public AirPrePayReq.PrePayRetrieve getPrePayRetrieve() {
        return prePayRetrieve;
    }

    /**
     * Sets the value of the prePayRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPrePayReq.PrePayRetrieve }
     *     
     */
    public void setPrePayRetrieve(AirPrePayReq.PrePayRetrieve value) {
        this.prePayRetrieve = value;
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
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}PersonNameSearch"/&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}LoyaltyCard" maxOccurs="999"/&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="StartFromResult" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeStartFromResult" /&gt;
     *       &lt;attribute name="MaxResults" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeMaxResults" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "personNameSearch",
        "loyaltyCard"
    })
    public static class ListSearch {

        @XmlElement(name = "PersonNameSearch")
        protected PersonNameSearch personNameSearch;
        @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v45_0")
        protected List<LoyaltyCard> loyaltyCard;
        @XmlAttribute(name = "StartFromResult", required = true)
        protected BigInteger startFromResult;
        @XmlAttribute(name = "MaxResults", required = true)
        protected int maxResults;

        /**
         * Customer name detail for searching flight pass content.
         * 
         * @return
         *     possible object is
         *     {@link PersonNameSearch }
         *     
         */
        public PersonNameSearch getPersonNameSearch() {
            return personNameSearch;
        }

        /**
         * Sets the value of the personNameSearch property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonNameSearch }
         *     
         */
        public void setPersonNameSearch(PersonNameSearch value) {
            this.personNameSearch = value;
        }

        /**
         * Customer loyalty card for searching flight pass content.Gets the value of the loyaltyCard property.
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

        /**
         * Gets the value of the startFromResult property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStartFromResult() {
            return startFromResult;
        }

        /**
         * Sets the value of the startFromResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStartFromResult(BigInteger value) {
            this.startFromResult = value;
        }

        /**
         * Gets the value of the maxResults property.
         * 
         */
        public int getMaxResults() {
            return maxResults;
        }

        /**
         * Sets the value of the maxResults property.
         * 
         */
        public void setMaxResults(int value) {
            this.maxResults = value;
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
     *       &lt;attribute name="Id" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeCardNumber" /&gt;
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PrePayRetrieve {

        @XmlAttribute(name = "Id", required = true)
        protected String id;
        @XmlAttribute(name = "Type")
        protected String type;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
