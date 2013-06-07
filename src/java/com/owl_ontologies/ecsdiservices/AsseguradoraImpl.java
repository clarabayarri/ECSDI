/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owl_ontologies.ecsdiservices;

import com.owl_ontologies.matchmakerclient.MatchMaker;
import com.owl_ontologies.matchmakerclient.MatchMakerWSImpl;
import com.owl_ontologies.matchmakerclient.MatchResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author clara
 */
public class AsseguradoraImpl {
    
    private MatchMakerWSImpl mmp;
    private Random random = new Random();
    
    public void init() {
        MatchMaker mm = new MatchMaker();
        mmp = mm.getMatchMakerPort();
        mmp.mapDomainOntology("http://www.owl-ontologies.com/ECSDIOntology.owl", "/Users/clara/Dropbox/ECSDI/Practica/implementacio/ontologiaDominiCler.rdf-xml.owl");
        mmp.registerServiceByURL("/Users/clara/Dropbox/ECSDI/Practica/implementacio/ontologiaServeisClerNet.rdf-xml.owl");
    }
    
    /**
     * 
     * @param inputRestriccions
     * @param inputPacientAutoritzacio
     * @param inputAccioAutoritzacio
     * @return
     *     returns ConjuntCentresType
     */
    public ConjuntCentresType llistaCentresDeSalut(
        ConjuntRestriccionsType inputRestriccions,
        PacientType inputPacientAutoritzacio,
        String inputAccioAutoritzacio) {
        if (mmp == null) {
            init();
        }
        
        boolean superclassInput = (random.nextInt(2) == 0);
        
        List<String> inputs = new LinkedList<String>();
        inputs.add(inputAccioAutoritzacio);
        inputs.add("http://www.owl-ontologies.com/ECSDIOntology.owl#Conjunt_restriccions");
        System.out.println("\tSolicitem serveis amb inputs " + inputs);
        List<String> outputs = new LinkedList<String>();
        outputs.add("http://www.owl-ontologies.com/ECSDIOntology.owl#Conjunt_ofertes");
        System.out.println("\tSolicitem serveis amb outputs " + outputs);
        System.out.println("\tSolicitem superclasses del input: " + superclassInput);

        // Crida el Match Maker
        List<MatchResult> lmr = mmp.performSignatureMatchWithParams(inputs, outputs, superclassInput, true);
        Iterator<MatchResult> it = lmr.iterator();

        // Imprimir resultats
        ConjuntCentresType resultat = new ConjuntCentresType();
        List<CentreDeSalut> centres = new ArrayList<CentreDeSalut>();
        while(it.hasNext()) {
                CentreDeSalut centre = new CentreDeSalut();
                MatchResult mr = it.next();
                System.out.println("\tService found by MatchMaker: " + mr.getService());
                // Assignar la url de mr.getService() al centre
                centre.urlServeiDisponibilitat = mr.getService();
                centres.add(centre);
        }
        resultat.autoritzaElsCentres = centres;
        System.out.println("\n\tHem trobat " + centres.size() + " possibles centres.\n");
        return resultat;
    }
}
