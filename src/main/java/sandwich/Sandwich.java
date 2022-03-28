package main.java.sandwich;

import java.util.*;

import main.java.inter.IGarniture;
import main.java.inter.IPain;
import main.java.inter.ISauce;

/***
 *  TODO
 *  
 *  getIngredientMostCalorique avec Iterable
 *  getIngredientMostCalorique avec stream
 */


/**
 * 
 */
public class Sandwich <P extends IPain, S extends ISauce, G extends IGarniture> {
	
	private P monPain;
	private S maSauce;
	private LinkedList<G> garniture;

    /**
     * Default constructor
     */
    public Sandwich(P unPain, S uneSauce) {
    	throw new UnsupportedOperationException("Not implemented yet");
    }
    
    public void ajouterIngredient(G unIngredient) {
    	throw new UnsupportedOperationException("Not implemented yet");
    }

    public void ajouterIngredient(G unIngredient, int i) {
    	throw new UnsupportedOperationException("Not implemented yet");
    }
    
    public void deplacerIngredient(Sandwich s, G uneGarniture, int qte) {
    	throw new UnsupportedOperationException("Not implemented yet");
    }
    
    public G getNthGarniture(int i) {
    	throw new UnsupportedOperationException("Not implemented yet");
    }
    
    public Aliment getIngredientMostCalorique() {
    	throw new UnsupportedOperationException("Not implemented yet");
    }
}