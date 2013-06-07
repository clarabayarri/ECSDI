
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Coordenades complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coordenades">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Altitud" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Latitud" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coordenades", propOrder = {
    "altitud",
    "latitud"
})
public class Coordenades {

    @XmlElement(name = "Altitud")
    protected float altitud;
    @XmlElement(name = "Latitud")
    protected float latitud;

    /**
     * Gets the value of the altitud property.
     * 
     */
    public float getAltitud() {
        return altitud;
    }

    /**
     * Sets the value of the altitud property.
     * 
     */
    public void setAltitud(float value) {
        this.altitud = value;
    }

    /**
     * Gets the value of the latitud property.
     * 
     */
    public float getLatitud() {
        return latitud;
    }

    /**
     * Sets the value of the latitud property.
     * 
     */
    public void setLatitud(float value) {
        this.latitud = value;
    }

}
