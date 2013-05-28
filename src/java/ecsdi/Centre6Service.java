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
@WebService(serviceName = "Centre6Service", portName = "Centre6Port", endpointInterface = "com.owl_ontologies.ecsdiservices.Centre6PortType", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/Centre6Service/Centre6Service.wsdl")
public class Centre6Service {

    public com.owl_ontologies.ecsdiservices.ConjuntOfertesType demanarDisponibilitat(com.owl_ontologies.ecsdiservices.EspecialistaType tipusMetgeEspecialista, com.owl_ontologies.ecsdiservices.ConjuntRestriccionsType restriccionsMetgeEspecialista) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
