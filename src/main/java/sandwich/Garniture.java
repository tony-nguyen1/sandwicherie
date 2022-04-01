package main.java.sandwich;

import java.util.*;

import main.java.nomAliment.*;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.IGarniture;

/**
 * 
 */
public class Garniture extends Aliment implements IGarniture {
	
	
	public Garniture(String s, float f) throws OutOfRangeKilocariesException {
		super(s,f);
	}

    /**
     * @param n
     * @param f
     */
    public Garniture(NomGarniture n, float f) throws OutOfRangeKilocariesException {
    	this(n.toString(), f);
    }
    
    /**
     * @param n
     * @param f
     */
    public Garniture(NomAlimentVegan n, float f) throws OutOfRangeKilocariesException {
    	this(n.toString(), f);
    }
    
    /**
     * @param n
     * @param f
     */
    protected Garniture(NomAlimentVegetarien n, float f) throws OutOfRangeKilocariesException {
    	this(n.toString(), f);
    }

	
}