package main.java.sandwich;

import java.util.*;

import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.IAliment;

import java.lang.UnsupportedOperationException;

/**
 * 
 */
public abstract class Aliment implements IAliment {

    /**
     * 
     */
    protected String nom;
    private float kiloCalories;
    
    
    
    

    public Aliment(String nom, float kiloCalories) throws OutOfRangeKilocariesException {
		this.nom = nom;
		setKilocalories(kiloCalories);
	}



	/**
     * 
     */
    public String getNom() {
    	return this.nom;
    }

   
    
    /**
     * @param float f 
     * @return
     */
    public void setKilocalories(float f) throws OutOfRangeKilocariesException{
    	if (f < 0 || f > 1000) {
    		throw new OutOfRangeKilocariesException(f);
    	}
    	
    	this.kiloCalories = f;
    }
    
    /**
     * @return
     */
    public float getKilocalories() {
    	return this.kiloCalories;
    }

    @Override
    public String toString() {
      return String.format("Aliment:(%s->%f)", nom, getKilocalories());
    }
    	
}