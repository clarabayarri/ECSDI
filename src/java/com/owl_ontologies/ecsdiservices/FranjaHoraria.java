
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Franja_horaria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Franja_horaria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data_inici" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Data_fi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Franja_horaria", propOrder = {
    "dataInici",
    "dataFi"
})
public class FranjaHoraria {

    @XmlElement(name = "Data_inici", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInici;
    @XmlElement(name = "Data_fi", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFi;

    /**
     * Gets the value of the dataInici property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInici() {
        return dataInici;
    }

    /**
     * Sets the value of the dataInici property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInici(XMLGregorianCalendar value) {
        this.dataInici = value;
    }

    /**
     * Gets the value of the dataFi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFi() {
        return dataFi;
    }

    /**
     * Sets the value of the dataFi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFi(XMLGregorianCalendar value) {
        this.dataFi = value;
    }

}
