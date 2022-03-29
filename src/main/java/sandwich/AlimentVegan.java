package main.java.sandwich;

import java.util.*;

import NomAliment.NomAlimentVegan;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegan;

/**
 * 
 */
public class AlimentVegan extends AlimentVegetarien implements estVegan {

    /**
     * @param NomAlimentVegan
     */
    public AlimentVegan(NomAlimentVegan n, float f) throws OutOfRangeKilocariesException {
    	super(n.toString(), f);
    }

}