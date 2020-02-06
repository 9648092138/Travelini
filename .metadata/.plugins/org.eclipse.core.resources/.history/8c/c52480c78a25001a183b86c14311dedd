
package com.travelport.schema.air_v45_0;

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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v45_0}LanguageOption" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IncludeTermConditions" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "languageOption"
})
@XmlRootElement(name = "TermConditions")
public class TermConditions {

    @XmlElement(name = "LanguageOption")
    protected List<LanguageOption> languageOption;
    @XmlAttribute(name = "IncludeTermConditions", required = true)
    protected boolean includeTermConditions;

    /**
     * Gets the value of the languageOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageOption }
     * 
     * 
     */
    public List<LanguageOption> getLanguageOption() {
        if (languageOption == null) {
            languageOption = new ArrayList<LanguageOption>();
        }
        return this.languageOption;
    }

    /**
     * Gets the value of the includeTermConditions property.
     * 
     */
    public boolean isIncludeTermConditions() {
        return includeTermConditions;
    }

    /**
     * Sets the value of the includeTermConditions property.
     * 
     */
    public void setIncludeTermConditions(boolean value) {
        this.includeTermConditions = value;
    }

}
