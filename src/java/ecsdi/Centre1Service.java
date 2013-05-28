/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsdi;

import javax.jws.WebService;

/**
 *
 * @author clara.bayarri
 */
@WebService(serviceName = "Centre1Service", portName = "Centre1Port", endpointInterface = "com.owl_ontologies.ecsdiservices.Centre1PortType", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/Centre1Service/Centre1Service.wsdl")
public class Centre1Service {

    public com.owl_ontologies.ecsdiservices.ConjuntResultatsType obtenirResultatsCita(com.owl_ontologies.ecsdiservices.CitaType citaObtenirResultatsCitaCentre1) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.owl_ontologies.ecsdiservices.ConjuntOfertesType demanarDisponibilitat(com.owl_ontologies.ecsdiservices.ConjuntRestriccionsType restriccionsAnalisi) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
