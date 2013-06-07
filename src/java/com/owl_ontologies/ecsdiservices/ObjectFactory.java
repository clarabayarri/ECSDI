
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.owl_ontologies.ecsdiservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConjuntOfertes_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServices", "Conjunt_ofertes");
    private final static QName _ConjuntRestriccions_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServices", "Conjunt_restriccions");
    private final static QName _VisitaMedicaEspecialista_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServices", "Visita_medica_especialista");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.owl_ontologies.ecsdiservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConjuntRestriccionsType }
     * 
     */
    public ConjuntRestriccionsType createConjuntRestriccionsType() {
        return new ConjuntRestriccionsType();
    }

    /**
     * Create an instance of {@link ProfessionalSanitari }
     * 
     */
    public ProfessionalSanitari createProfessionalSanitari() {
        return new ProfessionalSanitari();
    }

    /**
     * Create an instance of {@link ConjuntOfertesType }
     * 
     */
    public ConjuntOfertesType createConjuntOfertesType() {
        return new ConjuntOfertesType();
    }

    /**
     * Create an instance of {@link Oferta }
     * 
     */
    public Oferta createOferta() {
        return new Oferta();
    }

    /**
     * Create an instance of {@link Preu }
     * 
     */
    public Preu createPreu() {
        return new Preu();
    }

    /**
     * Create an instance of {@link Disponibilitat }
     * 
     */
    public Disponibilitat createDisponibilitat() {
        return new Disponibilitat();
    }

    /**
     * Create an instance of {@link FranjaHoraria }
     * 
     */
    public FranjaHoraria createFranjaHoraria() {
        return new FranjaHoraria();
    }

    /**
     * Create an instance of {@link VisitaMedicaEspecialistaType }
     * 
     */
    public VisitaMedicaEspecialistaType createVisitaMedicaEspecialistaType() {
        return new VisitaMedicaEspecialistaType();
    }

    /**
     * Create an instance of {@link Coordenades }
     * 
     */
    public Coordenades createCoordenades() {
        return new Coordenades();
    }

    /**
     * Create an instance of {@link CentreDeSalut }
     * 
     */
    public CentreDeSalut createCentreDeSalut() {
        return new CentreDeSalut();
    }

    /**
     * Create an instance of {@link Accio }
     * 
     */
    public Accio createAccio() {
        return new Accio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConjuntOfertesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServices", name = "Conjunt_ofertes")
    public JAXBElement<ConjuntOfertesType> createConjuntOfertes(ConjuntOfertesType value) {
        return new JAXBElement<ConjuntOfertesType>(_ConjuntOfertes_QNAME, ConjuntOfertesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConjuntRestriccionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServices", name = "Conjunt_restriccions")
    public JAXBElement<ConjuntRestriccionsType> createConjuntRestriccions(ConjuntRestriccionsType value) {
        return new JAXBElement<ConjuntRestriccionsType>(_ConjuntRestriccions_QNAME, ConjuntRestriccionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisitaMedicaEspecialistaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServices", name = "Visita_medica_especialista")
    public JAXBElement<VisitaMedicaEspecialistaType> createVisitaMedicaEspecialista(VisitaMedicaEspecialistaType value) {
        return new JAXBElement<VisitaMedicaEspecialistaType>(_VisitaMedicaEspecialista_QNAME, VisitaMedicaEspecialistaType.class, null, value);
    }

}
