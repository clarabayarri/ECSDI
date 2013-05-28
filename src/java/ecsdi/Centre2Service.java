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
@WebService(serviceName = "Centre2Service", portName = "Centre2Port", endpointInterface = "com.owl_ontologies.ecsdiservices.Centre2PortType", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/Centre2Service/Centre2Service.wsdl")
public class Centre2Service {

    public com.owl_ontologies.ecsdiservices.ConjuntResultatsType obtenirResultatsCita(com.owl_ontologies.ecsdiservices.CitaType citaObtenirResultatsCitaCentre2) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.owl_ontologies.ecsdiservices.ConjuntOfertesType demanarDisponibilitat(com.owl_ontologies.ecsdiservices.AnalisiDeOrinaType tipusProvaAnalisiOrina) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
