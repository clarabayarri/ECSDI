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
@WebService(serviceName = "Centre5Service", portName = "Centre5Port", endpointInterface = "com.owl_ontologies.ecsdiservices.Centre5PortType", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/Centre5Service/Centre5Service.wsdl")
public class Centre5Service {

    public com.owl_ontologies.ecsdiservices.ConjuntOfertesType demanarDisponibilitat(com.owl_ontologies.ecsdiservices.EspecialistaAnestesistaType tipusMetgeEspecialistaAnestesista, com.owl_ontologies.ecsdiservices.ConjuntRestriccionsType restriccionsMetgeEspecialistaAnestesista) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
