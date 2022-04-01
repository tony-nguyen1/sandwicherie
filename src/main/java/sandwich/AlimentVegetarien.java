package main.java.sandwich;

import java.util.*;

import main.java.nomAliment.*;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.IGarniture;
import main.java.inter.estVegetarien;

/**
 * 
 */
public class AlimentVegetarien extends Aliment implements estVegetarien, IGarniture {

    /**
     * @param n
     * @param f
     */
    public AlimentVegetarien(NomAlimentVegetarien n, float f) throws OutOfRangeKilocariesException {
    	super(n.toString(),f);
    }
    
    /**
     * @param n
     * @param f
     */
    public AlimentVegetarien(NomAlimentVegan n, float f) throws OutOfRangeKilocariesException {
    	super(n.toString(),f);
    }

    protected AlimentVegetarien(String s, float f) throws OutOfRangeKilocariesException {
    	super("", 0);
    }
	
}