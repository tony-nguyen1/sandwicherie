package main.java.sandwich;

import java.util.*;

import main.java.inter.IAliment;

import java.lang.UnsupportedOperationException;

/**
 * 
 */
public abstract class Aliment implements IAliment {

    /**
     * 
     */
    private String nom;
    
    /**
     * 
     */
    private int quantite;

    /**
     * 
     */
    public void getNom() {
    	throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * 
     */
    public void getQte() {
    	throw new UnsupportedOperationException("Not implemented yet");
    }
    
    /**
     * @param float f 
     * @return
     */
    public void setKilocalories(float f) {
    	throw new UnsupportedOperationException("Not implemented yet");
    }
    	
}