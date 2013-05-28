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
@WebService(serviceName = "ReservesService", portName = "ReservesPort", endpointInterface = "com.owl_ontologies.ecsdiservices.ReservesPortType", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/ReservesService/ReservesService.wsdl")
public class ReservesService {

    public com.owl_ontologies.ecsdiservices.CitaType reservaVisita(com.owl_ontologies.ecsdiservices.PacientType pacientReserva, com.owl_ontologies.ecsdiservices.OfertaType ofertaReserva) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
