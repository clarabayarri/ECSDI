/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsdi;

import com.owl_ontologies.ecsdiservices.CentreDeSalut;
import com.owl_ontologies.ecsdiservices.ConjuntCentresType;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.jws.WebService;

/**
 *
 * @author clara.bayarri
 */
@WebService(serviceName = "Asseguradora1Service", portName = "Asseguradora1Port", endpointInterface = "com.owl_ontologies.ecsdiservices.Asseguradora1PortType", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "WEB-INF/wsdl/Asseguradora1Service/Asseguradora1Service.wsdl")
public class Asseguradora1Service {

    private MatchMakerWSImpl mmp;
    private Random random = new Random();
    
    public void init() {
        MatchMaker mm = new MatchMaker();
        mmp = mm.getMatchMakerPort();
        mmp.mapDomainOntology("http://www.owl-ontologies.com/ECSDIOntology.owl", "file:/path/to/the/local/file/OntologyFile.owl");
        mmp.registerServiceByURL("file:/path/to/the/local/file/ServiceOntology.owl");
    }
    
    public ConjuntCentresType llistaCentresDeSalut(com.owl_ontologies.ecsdiservices.ConjuntRestriccionsType inputRestriccions, com.owl_ontologies.ecsdiservices.PacientType inputPacientAutoritzacio, com.owl_ontologies.ecsdiservices.AccioType inputAccioAutoritzacio) {
        if (mmp == null) {
            init();
        }
        boolean superclassInput = (random.nextInt(2) == 0);
        List<String> inputs = new LinkedList<String>();
        inputs.add("URL del concepte de la accio o professional");
        inputs.add("http://www.owl-ontologies.com/ECSDIOntology.owl#Conjunt_restriccions");
        System.out.println("Solicitem serveis amb inputs " + inputs);
        List<String> outputs = new LinkedList<String>();
        outputs.add("http://www.owl-ontologies.com/ECSDIOntology.owl#Conjunt_ofertes");
        System.out.println("Solicitem serveis amb outputs " + outputs);
        System.out.println("Solicitem superclasses del input: " + superclassInput);

        // Crida el Match Maker
        List<MatchResult> lmr = mmp.performSignatureMatchWithParams(inputs, outputs, superclassInput, true);
        Iterator<MatchResult> it = lmr.iterator();

        // Imprimir resultats
        ConjuntCentresType resultat = new ConjuntCentresType();
        while(it.hasNext()) {
                CentreDeSalut centre = new CentreDeSalut();
                MatchResult mr = it.next();
                System.out.println(mr.getService());
                // TODO: assignar la url de mr.getService() al centre
                //resultat.add(centre);
        }
        return resultat;
    }
    
}
