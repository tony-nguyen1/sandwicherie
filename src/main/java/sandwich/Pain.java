package main.java.sandwich;

import java.util.*;

import main.java.nomAliment.*;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.IPain;

/**
 * 
 */
public class Pain extends Aliment implements IPain {
	
	
	
	
	
    /**
     * @param n 
     * @return
     */
    public Pain(NomPain n, float f) throws OutOfRangeKilocariesException {
    	super(n.toString(), f);
    }
    
    protected Pain(String s, float f) throws OutOfRangeKilocariesException {
    	super(s, f);
    }
    
    

	
}