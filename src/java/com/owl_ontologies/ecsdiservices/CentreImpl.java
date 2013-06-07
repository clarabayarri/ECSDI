/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author clara
 */
public class CentreImpl {
    
    public ConjuntResultatsType obtenirResultatsCita(CitaType citaObtenirResultatsCitaCentre1) {
        return new ConjuntResultatsType();
    }

    public ConjuntOfertesType demanarDisponibilitat(Object tipusProvaAnalisi, 
            ConjuntRestriccionsType restriccionsAnalisi) {
        ConjuntOfertesType conjuntOfertes = new ConjuntOfertesType();
        Random random = new Random();
        List<Oferta> ofertes = new ArrayList<Oferta>();
        do {
            Oferta oferta = new Oferta();
            oferta.costa = new Preu();
            oferta.costa.moneda = MonedaType.EURO;
            oferta.costa.quantitat = Math.abs(random.nextFloat());
            oferta.estaDisponibleEn = new Disponibilitat();
            List<FranjaHoraria> franjes = new ArrayList<FranjaHoraria>();
            franjes.add(new FranjaHoraria());
            oferta.estaDisponibleEn.conteFranjes = franjes;
            ofertes.add(oferta);
        } while (random.nextInt(5) != 0);
        conjuntOfertes.ofereix = ofertes;
        System.out.println("\tRetornem " + ofertes.size() + " ofertes.");
        return conjuntOfertes;
    }
}
