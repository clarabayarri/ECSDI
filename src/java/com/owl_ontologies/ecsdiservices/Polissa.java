
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Polissa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Polissa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="es_del_tipus_polissa" type="{http://www.owl-ontologies.com/ECSDIServices}Tipus_polissa"/>
 *         &lt;element name="cobreix_a" type="{http://www.owl-ontologies.com/ECSDIServices}PacientType"/>
 *         &lt;element name="pertany_a" type="{http://www.owl-ontologies.com/ECSDIServices}Asseguradora"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polissa", propOrder = {
    "esDelTipusPolissa",
    "cobreixA",
    "pertanyA"
})
public class Polissa {

    @XmlElement(name = "es_del_tipus_polissa", required = true)
    protected TipusPolissa esDelTipusPolissa;
    @XmlElement(name = "cobreix_a", required = true)
    protected PacientType cobreixA;
    @XmlElement(name = "pertany_a", required = true)
    protected Asseguradora pertanyA;

    /**
     * Gets the value of the esDelTipusPolissa property.
     * 
     * @return
     *     possible object is
     *     {@link TipusPolissa }
     *     
     */
    public TipusPolissa getEsDelTipusPolissa() {
        return esDelTipusPolissa;
    }

    /**
     * Sets the value of the esDelTipusPolissa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipusPolissa }
     *     
     */
    public void setEsDelTipusPolissa(TipusPolissa value) {
        this.esDelTipusPolissa = value;
    }

    /**
     * Gets the value of the cobreixA property.
     * 
     * @return
     *     possible object is
     *     {@link PacientType }
     *     
     */
    public PacientType getCobreixA() {
        return cobreixA;
    }

    /**
     * Sets the value of the cobreixA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacientType }
     *     
     */
    public void setCobreixA(PacientType value) {
        this.cobreixA = value;
    }

    /**
     * Gets the value of the pertanyA property.
     * 
     * @return
     *     possible object is
     *     {@link Asseguradora }
     *     
     */
    public Asseguradora getPertanyA() {
        return pertanyA;
    }

    /**
     * Sets the value of the pertanyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asseguradora }
     *     
     */
    public void setPertanyA(Asseguradora value) {
        this.pertanyA = value;
    }

}
