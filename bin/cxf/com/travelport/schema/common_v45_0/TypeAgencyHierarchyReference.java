
package com.travelport.schema.common_v45_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAgencyHierarchyReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAgencyHierarchyReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ProfileID" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeProfileID" /&gt;
 *       &lt;attribute name="ProfileType" use="required" type="{http://www.travelport.com/schema/common_v45_0}typeAgencyProfileLevel" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAgencyHierarchyReference")
@XmlSeeAlso({
    TypeAgencyHierarchyLongReference.class
})
public class TypeAgencyHierarchyReference {

    @XmlAttribute(name = "ProfileID", required = true)
    protected BigInteger profileID;
    @XmlAttribute(name = "ProfileType", required = true)
    protected TypeAgencyProfileLevel profileType;

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProfileID(BigInteger value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAgencyProfileLevel }
     *     
     */
    public TypeAgencyProfileLevel getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAgencyProfileLevel }
     *     
     */
    public void setProfileType(TypeAgencyProfileLevel value) {
        this.profileType = value;
    }

}
