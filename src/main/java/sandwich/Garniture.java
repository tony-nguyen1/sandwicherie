package main.java.sandwich;

import java.util.*;

import main.java.nomAliment.*;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.IGarniture;

/**
 * 
 */
public class Garniture extends Aliment implements IGarniture {

    /**
     * @param n
     * @param f
     */
    public Garniture(NomGarniture n, float f) throws OutOfRangeKilocariesException {
    	super(n.toString(), f);
    }
    
    /**
     * @param n
     * @param f
     */
    public Garniture(NomAlimentVegan n, float f) throws OutOfRangeKilocariesException {
    	super(n.toString(), f);
    }
    
    /**
     * @param n
     * @param f
     */
    public Garniture(NomAlimentVegetarien n, float f) throws OutOfRangeKilocariesException {
    	super(n.toString(), f);
    }

	
}