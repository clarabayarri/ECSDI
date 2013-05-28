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
@WebService(serviceName = "Asseguradora1Service", portName = "Asseguradora1Port", endpointInterface = "com.owl_ontologies.ecsdiservices.Asseguradora1PortType", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/Asseguradora1Service/Asseguradora1Service.wsdl")
public class Asseguradora1Service {

    public com.owl_ontologies.ecsdiservices.ConjuntCentresType llistaCentresDeSalut(com.owl_ontologies.ecsdiservices.ConjuntRestriccionsType inputRestriccions, com.owl_ontologies.ecsdiservices.PacientType inputPacientAutoritzacio, com.owl_ontologies.ecsdiservices.AccioType inputAccioAutoritzacio) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
