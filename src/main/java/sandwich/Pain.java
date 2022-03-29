package main.java.sandwich;

import java.util.*;

import NomAliment.NomPain;
import main.java.inter.IPain;

/**
 * 
 */
public class Pain extends Aliment implements IPain {
	
	
	
	
	
    /**
     * @param n 
     * @return
     */
	
	
    public Pain(NomPain n) {
    	
    	this.nom = n.toString();
    	this.quantite = 1;
    }
    
    
    
    public Pain(NomPain n, int quantite) {
    	
    	this(n);
    	this.quantite = quantite;
    }
    
    

	
}