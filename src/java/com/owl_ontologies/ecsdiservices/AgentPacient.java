/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owl_ontologies.ecsdiservices;

import com.github.tranchis.caller.Caller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author clara
 */
public class AgentPacient {
    
    private Random random = new Random();
    private PacientType pacient = new PacientType();
    private static final Object[] possibilitatsProves = {
        new AnalisiType(),
        new AnalisiDeOrinaType()};
    private static final Object[] possibilitatsTractaments = {
        new ColonoscopiaType(),
        new CirurgiaType()};
    private static final Object[] possibilitatsProfessionalsSanitaris = {
        new EspecialistaType(),
        new EspecialistaAnestesistaType()};
    private static final String asseguradoraService =
            "http://localhost:8080/ECSDI/Asseguradora1PortTypeService?WSDL#LlistaCentresDeSalut";
    private static final String reservesService =
            "http://localhost:8080/ECSDI/ReservesPortTypeService?WSDL#ReservaVisita";
    
    private Map<Class, String> correspondencies;
    
    private void init() {
        correspondencies = new HashMap<Class, String>();
        correspondencies.put(AnalisiDeOrinaType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Analisi_de_orina");
        correspondencies.put(AnalisiType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Analisi");
        correspondencies.put(ColonoscopiaType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Colonoscopia");
        correspondencies.put(CirurgiaType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Cirurgia");
        correspondencies.put(EspecialistaAnestesistaType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Visita_medica_especialista_anestesista");
        correspondencies.put(EspecialistaType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Visita_medica_especialista");
    }

    public void executaHistoria() {
        init();
        
        Historia historia = new Historia();
        historia.setDescripcioInicial("Nova historia");
        historia.setEstatHistoria(EstatHistoriaType.INICIADA);
        historia.estaFormadaPer = new ArrayList<Cita>();
        
        System.out.println("\n\n----------- Comença la historia! -----------\n");
        // Visita inicial
        System.out.println("\n---- Programem la primera visita ----\n");
        CitaType cita = programaVisitaProfessional();
        if (cita != null)
            historia.estaFormadaPer.add(transform(cita));
        
        // Tractaments, proves i visites a l'atzar
        System.out.println("\n---- Programem altres visites a l'atzar ----\n");
        do {
            int opcio = random.nextInt(3);
            switch (opcio) {
                case 0: cita = programaProva();
                    break;
                case 1: cita = programaTractament();
                    break;
                default: cita = programaVisitaProfessional();
                    break;
            }
            if (cita != null)
                historia.estaFormadaPer.add(transform(cita));
        } while (random.nextInt(7) != 0);
        
        // Visita final
        System.out.println("\n---- Programem la visita final ----\n");
        cita = programaVisitaProfessional();
        if (cita != null)
                historia.estaFormadaPer.add(transform(cita));
        
        System.out.println("\n----------- Historia completada! -----------");
        System.out.println("\tLa historia conté " + historia.estaFormadaPer.size() + " cites.\n");
    }
    
    private CitaType programaProva() {
        // Escollir prova
        int possIndex = random.nextInt(possibilitatsProves.length);
        Object accio = possibilitatsProves[possIndex];
        System.out.println("\tDecidim solicitar una cita per la prova " + accio.getClass() + "\n");
        return programaVisita(accio);
    }
    
    private CitaType programaTractament() {
        // Escollir prova
        int possIndex = random.nextInt(possibilitatsTractaments.length);
        Object accio = possibilitatsTractaments[possIndex];
        System.out.println("\tDecidim solicitar una cita per el tractament " + accio.getClass() + "\n");
        return programaVisita(accio);
    }
    
    private CitaType programaVisitaProfessional() {
        // Escollir prova
        int possIndex = random.nextInt(possibilitatsProfessionalsSanitaris.length);
        Object accio = possibilitatsProfessionalsSanitaris[possIndex];
        System.out.println("\tDecidim solicitar una cita per el metge " + accio.getClass() + "\n");
        return programaVisita(accio);
    }
    
    private CitaType programaVisita(Object accio) {
        // Obtenir serveis
        ConjuntCentresType centres = obtenirPossibilitats(accio);

        // Escollir servei
        List<CentreDeSalut> possibilitats = centres.getAutoritzaElsCentres();
        System.out.println("\n\tRebut el conjunt de centres: " + 
                possibilitats.toString());
        if (possibilitats.isEmpty()) {
            System.out.println("\tNo s'ha rebut cap possible centre!\n\n");
            return null;
        }
        int indexEscollit = random.nextInt(possibilitats.size());
        System.out.println("\tServei escollit: " + possibilitats.get(indexEscollit).getURLServeiDisponibilitat() + "\n");
        
        // Demanar disponibilitat al centre escollit
        ConjuntOfertesType ofertes = obtenirDisponibilitats(possibilitats.get(indexEscollit), accio);
        
        // Escollir oferta a random
        List<Oferta> ofertesRebudes = ofertes.getOfereix();
        System.out.println("\n\tRebut el conjunt de ofertes: " + 
                ofertesRebudes.toString());
        if (ofertesRebudes.isEmpty()) {
            System.out.println("\tNo s'ha rebut cap oferta!\n\n");
            return null;
        }
        int ofertaEscollida = random.nextInt(ofertesRebudes.size());
        
        // Obtenir cita
        CitaType cita = reservarCita(ofertesRebudes.get(ofertaEscollida));
        System.out.println("\tCita reservada correctament.\n\n");
        
        return cita;
    }

    private ConjuntCentresType obtenirPossibilitats(Object accio) {
        Caller c = new Caller();
        Object centres = c.callService(
                asseguradoraService,
                new Object[]{correspondencies.get(accio.getClass()), pacient, 
                    new ConjuntRestriccionsType()},
                ConjuntCentresType.class);

        return (ConjuntCentresType) centres;
    }

    private ConjuntOfertesType obtenirDisponibilitats(CentreDeSalut centre, Object accio) {
        Caller c = new Caller();
        Object result = c.callService(
                centre.getURLServeiDisponibilitat(),
                new Object[]{accio, new ConjuntRestriccionsType()},
                ConjuntOfertesType.class);

        return (ConjuntOfertesType) result;
    }

    private CitaType reservarCita(Oferta oferta) {
        Caller c = new Caller();
        // TODO: comprovar que es .getService()
        Object result = c.callService(
                reservesService,
                new Object[]{pacient, oferta},
                CitaType.class);

        return (CitaType) result;
    }
    
    private Cita transform(CitaType cita) {
        Cita novaCita = new Cita();
        novaCita.citatPer = cita.citatPer;
        novaCita.estatCita = cita.estatCita;
        novaCita.perRealitzar = cita.perRealitzar;
        novaCita.produeix = cita.produeix;
        novaCita.teLlocA = cita.teLlocA;
        novaCita.teLlocEn = cita.teLlocEn;
        return novaCita;
    }
}
