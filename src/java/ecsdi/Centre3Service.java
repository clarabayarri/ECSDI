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
@WebService(serviceName = "Centre3Service", portName = "Centre3Port", endpointInterface = "com.owl_ontologies.ecsdiservices.Centre3PortType", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/Centre3Service/Centre3Service.wsdl")
public class Centre3Service {

    public com.owl_ontologies.ecsdiservices.ConjuntOfertesType demanarDisponibilitat(com.owl_ontologies.ecsdiservices.CirurgiaType tipusProvaCirurgia, com.owl_ontologies.ecsdiservices.ConjuntRestriccionsType restriccionsCirurgia) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
