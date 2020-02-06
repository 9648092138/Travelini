
package com.travelport.schema.hotel_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Comments" maxOccurs="999"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="CommentId" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
 *                 &lt;attribute name="Date" type="{http://www.travelport.com/schema/common_v45_0}typeDate" /&gt;
 *                 &lt;attribute name="CommenterLanguage" type="{http://www.travelport.com/schema/common_v45_0}typeLanguage" /&gt;
 *                 &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CommentSourceName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Commenter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
    "comments"
})
@XmlRootElement(name = "GuestReviews")
public class GuestReviews {

    @XmlElement(name = "Comments", required = true)
    protected List<GuestReviews.Comments> comments;

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestReviews.Comments }
     * 
     * 
     */
    public List<GuestReviews.Comments> getComments() {
        if (comments == null) {
            comments = new ArrayList<GuestReviews.Comments>();
        }
        return this.comments;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="CommentId" type="{http://www.travelport.com/schema/common_v45_0}typeRef" /&gt;
     *       &lt;attribute name="Date" type="{http://www.travelport.com/schema/common_v45_0}typeDate" /&gt;
     *       &lt;attribute name="CommenterLanguage" type="{http://www.travelport.com/schema/common_v45_0}typeLanguage" /&gt;
     *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CommentSourceName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Commenter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Comments {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "CommentId")
        protected String commentId;
        @XmlAttribute(name = "Date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "CommenterLanguage")
        protected String commenterLanguage;
        @XmlAttribute(name = "Source")
        protected String source;
        @XmlAttribute(name = "CommentSourceName")
        protected String commentSourceName;
        @XmlAttribute(name = "Commenter")
        protected String commenter;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the commentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommentId() {
            return commentId;
        }

        /**
         * Sets the value of the commentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommentId(String value) {
            this.commentId = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the commenterLanguage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommenterLanguage() {
            return commenterLanguage;
        }

        /**
         * Sets the value of the commenterLanguage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommenterLanguage(String value) {
            this.commenterLanguage = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the commentSourceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommentSourceName() {
            return commentSourceName;
        }

        /**
         * Sets the value of the commentSourceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommentSourceName(String value) {
            this.commentSourceName = value;
        }

        /**
         * Gets the value of the commenter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommenter() {
            return commenter;
        }

        /**
         * Sets the value of the commenter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommenter(String value) {
            this.commenter = value;
        }

    }

}
