
package com.travelport.schema.rail_v45_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v45_0.TypeLocation;


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
 *         &lt;element name="PermittedConnectionPoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v45_0}ConnectionPoint" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProhibitedConnectionPoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v45_0}ConnectionPoint" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedConnectionPoints",
    "prohibitedConnectionPoints"
})
@XmlRootElement(name = "RailLegModifiers")
public class RailLegModifiers {

    @XmlElement(name = "PermittedConnectionPoints")
    protected RailLegModifiers.PermittedConnectionPoints permittedConnectionPoints;
    @XmlElement(name = "ProhibitedConnectionPoints")
    protected RailLegModifiers.ProhibitedConnectionPoints prohibitedConnectionPoints;
    @XmlAttribute(name = "Class")
    protected String clazz;

    /**
     * Gets the value of the permittedConnectionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link RailLegModifiers.PermittedConnectionPoints }
     *     
     */
    public RailLegModifiers.PermittedConnectionPoints getPermittedConnectionPoints() {
        return permittedConnectionPoints;
    }

    /**
     * Sets the value of the permittedConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailLegModifiers.PermittedConnectionPoints }
     *     
     */
    public void setPermittedConnectionPoints(RailLegModifiers.PermittedConnectionPoints value) {
        this.permittedConnectionPoints = value;
    }

    /**
     * Gets the value of the prohibitedConnectionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link RailLegModifiers.ProhibitedConnectionPoints }
     *     
     */
    public RailLegModifiers.ProhibitedConnectionPoints getProhibitedConnectionPoints() {
        return prohibitedConnectionPoints;
    }

    /**
     * Sets the value of the prohibitedConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailLegModifiers.ProhibitedConnectionPoints }
     *     
     */
    public void setProhibitedConnectionPoints(RailLegModifiers.ProhibitedConnectionPoints value) {
        this.prohibitedConnectionPoints = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}ConnectionPoint" maxOccurs="999"/&gt;
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
        "connectionPoint"
    })
    public static class PermittedConnectionPoints {

        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v45_0", required = true)
        protected List<TypeLocation> connectionPoint;

        /**
         * Gets the value of the connectionPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * 
         * 
         */
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<TypeLocation>();
            }
            return this.connectionPoint;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v45_0}ConnectionPoint" maxOccurs="999"/&gt;
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
        "connectionPoint"
    })
    public static class ProhibitedConnectionPoints {

        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v45_0", required = true)
        protected List<TypeLocation> connectionPoint;

        /**
         * Gets the value of the connectionPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * 
         * 
         */
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<TypeLocation>();
            }
            return this.connectionPoint;
        }

    }

}
