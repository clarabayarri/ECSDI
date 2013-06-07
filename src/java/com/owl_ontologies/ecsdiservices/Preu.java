
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Preu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Moneda" type="{http://www.owl-ontologies.com/ECSDIServices}MonedaType"/>
 *         &lt;element name="Quantitat" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preu", propOrder = {
    "moneda",
    "quantitat"
})
public class Preu {

    @XmlElement(name = "Moneda", required = true)
    protected MonedaType moneda;
    @XmlElement(name = "Quantitat")
    protected float quantitat;

    /**
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link MonedaType }
     *     
     */
    public MonedaType getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonedaType }
     *     
     */
    public void setMoneda(MonedaType value) {
        this.moneda = value;
    }

    /**
     * Gets the value of the quantitat property.
     * 
     */
    public float getQuantitat() {
        return quantitat;
    }

    /**
     * Sets the value of the quantitat property.
     * 
     */
    public void setQuantitat(float value) {
        this.quantitat = value;
    }

}
