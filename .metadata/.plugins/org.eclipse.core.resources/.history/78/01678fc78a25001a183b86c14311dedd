
package com.travelport.soa.common.security.sessioncontext_v1;

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
 *       &lt;choice&gt;
 *         &lt;element name="SessTok"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SessProp" maxOccurs="999"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="nm" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="val" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessTok",
    "sessProp"
})
@XmlRootElement(name = "SessionContext")
public class SessionContext {

    @XmlElement(name = "SessTok")
    protected SessionContext.SessTok sessTok;
    @XmlElement(name = "SessProp")
    protected List<SessionContext.SessProp> sessProp;

    /**
     * Gets the value of the sessTok property.
     * 
     * @return
     *     possible object is
     *     {@link SessionContext.SessTok }
     *     
     */
    public SessionContext.SessTok getSessTok() {
        return sessTok;
    }

    /**
     * Sets the value of the sessTok property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionContext.SessTok }
     *     
     */
    public void setSessTok(SessionContext.SessTok value) {
        this.sessTok = value;
    }

    /**
     * Gets the value of the sessProp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessProp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionContext.SessProp }
     * 
     * 
     */
    public List<SessionContext.SessProp> getSessProp() {
        if (sessProp == null) {
            sessProp = new ArrayList<SessionContext.SessProp>();
        }
        return this.sessProp;
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
     *       &lt;attribute name="nm" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="val" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SessProp {

        @XmlAttribute(name = "nm", required = true)
        protected String nm;
        @XmlAttribute(name = "val", required = true)
        protected String val;

        /**
         * Gets the value of the nm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNm() {
            return nm;
        }

        /**
         * Sets the value of the nm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNm(String value) {
            this.nm = value;
        }

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVal() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVal(String value) {
            this.val = value;
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
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SessTok {

        @XmlAttribute(name = "id", required = true)
        protected String id;

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

    }

}
