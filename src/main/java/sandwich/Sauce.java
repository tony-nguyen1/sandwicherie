package main.java.sandwich;

import main.java.nomAliment.*;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.ISauce;

public class Sauce extends Aliment implements ISauce {

	protected Sauce(String n, float f) throws OutOfRangeKilocariesException {
		super(n.toString(), f);
	}

	/**
     * @param n 
     * @return
     */
    public Sauce(NomSauce n, float f) throws OutOfRangeKilocariesException {
    	this(n.toString(), f);
    }
    
    
}
