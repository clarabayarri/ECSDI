/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
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
        while (random.nextInt(5) != 0) {
            Oferta oferta = new Oferta();
            ofertes.add(oferta);
        }
        conjuntOfertes.ofereix = ofertes;
        return conjuntOfertes;
    }
}
