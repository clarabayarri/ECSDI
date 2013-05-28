/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsdi;

import com.github.tranchis.caller.Caller;
import com.owl_ontologies.ecsdiservices.AnalisiDeOrinaType;
import com.owl_ontologies.ecsdiservices.AnalisiType;
import com.owl_ontologies.ecsdiservices.CentreDeSalut;
import com.owl_ontologies.ecsdiservices.CitaType;
import com.owl_ontologies.ecsdiservices.ConjuntCentresType;
import com.owl_ontologies.ecsdiservices.ConjuntOfertesType;
import com.owl_ontologies.ecsdiservices.ConjuntRestriccionsType;
import com.owl_ontologies.ecsdiservices.OfertaType;
import com.owl_ontologies.ecsdiservices.PacientType;
import java.util.Random;

/**
 *
 * @author clara.bayarri
 */
public class AgentPacient {

    private Random random = new Random();
    private PacientType pacient = new PacientType();
    private static final String[] possibilitatsProves = {
        "http://www.owl-ontologies.com/ECSDIOntology.owl#Analisi",
        "http://www.owl-ontologies.com/ECSDIOntology.owl#Analisi_de_orina"};
    private static final Object[] classesPossibilitatsProves = {
        new AnalisiType(),
        new AnalisiDeOrinaType()};
    private static final String asseguradoraService =
            "http://localhost:8080/ECSDI/Asseguradora1Service?WSDL#llistaCentresDeSalut";
    private static final String reservesService =
            "http://localhost:8080/ECSDI/ReservesService?WSDL#reservaVisita";

    public void programaVisita() {
        // Escollir prova
        int possIndex = random.nextInt(possibilitatsProves.length);
        // Obtenir serveis
        ConjuntCentresType centres = obtenirPossibilitats(possIndex);

        // Escollir servei
        //int indexEscollit = random.nextInt(centres.getAutoritzaElsCentres().size());
        //System.out.println("\nServei escollit: " + possibilitats.get(indexEscollit).getService());
        // Demanar disponibilitat al centre escollit
        // Escollir oferta a random
        // Obtenir cita
        //CitaType cita = reservaCita(oferta);
        System.out.println("Cita reservada correctament.");
    }

    private ConjuntCentresType obtenirPossibilitats(int possIndex) {
        Caller c = new Caller();
        Object centres = c.callService(
                asseguradoraService,
                new Object[]{new ConjuntRestriccionsType(), pacient,
            classesPossibilitatsProves[possIndex]},
                ConjuntCentresType.class);
        System.out.println("Rebut el conjunt de centres: " + centres.toString());

        return (ConjuntCentresType) centres;
    }

    private ConjuntOfertesType obtenirDisponibilitats(CentreDeSalut centre, Object accio) {
        Caller c = new Caller();
        // TODO: comprovar que es .getService()
        // String centreService = centre.get....
        Object result = c.callService(
                reservesService,
                new Object[]{accio, new ConjuntRestriccionsType()},
                ConjuntOfertesType.class);

        return (ConjuntOfertesType) result;
    }

    private CitaType reservarCita(OfertaType oferta) {
        Caller c = new Caller();
        // TODO: comprovar que es .getService()
        Object result = c.callService(
                reservesService,
                new Object[]{pacient, oferta},
                CitaType.class);

        return (CitaType) result;
    }
}