package main.java.sandwich;

import main.java.nomAliment.*;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.IGarniture;

/**
 * 
 */
public class Garniture extends Aliment implements IGarniture {
	
	
	protected Garniture(String s, float f) throws OutOfRangeKilocariesException {
		super(s,f);
	}

    /**
     * @param n
     * @param f
     */
    public Garniture(NomGarniture n, float f) throws OutOfRangeKilocariesException {
    	this(n.toString(), f);
    }
    
    
    

	
}