package main.java.sandwich;

import java.util.*;

import main.java.inter.IGarniture;
import main.java.inter.IPain;
import main.java.inter.ISauce;

/***
 *  TODO
 *  
 *  Application.java main()
 *  -> Déplacer des ingrédients entre sandwichs
 *  -> Remplacer genericété class par intefarce ?
 *  private LinkedList<G> garniture -> <Aliment>
 */


/**
 * 
 */
public class Sandwich <P extends Pain, S extends Sauce, G extends Garniture> implements Iterable<Aliment>{
	
	private P monPain;
	private S maSauce;
	private LinkedList<G> garniture;
	// on construit le sandwich du bas vers le haut (le premier élément de la liste est donc la gartinure la plus "basse" du sandwich)

    /**
     * Default constructor
     */
    public Sandwich(P unPain, S uneSauce) {
    	monPain = unPain;
    	maSauce = uneSauce;
    	garniture = new LinkedList<G>();
    }
    
    
    
    @Override
	public String toString() {
    	StringBuilder sb = new StringBuilder("Sandwich [monPain=");
    	sb.append(monPain);
    	sb.append(", maSauce=");
    	sb.append(maSauce);
    	sb.append(", garniture=");
    	
    	for ( Garniture g : garniture) {
    		sb.append(g);
    	}
    	
    	sb.append("]");
    	
		return sb.toString();
	}



	public void ajouterIngredient(G unIngredient) {
    	garniture.addLast(unIngredient);
    }

    public void ajouterIngredient(G unIngredient, int i) {
    	garniture.add(i, unIngredient);
    }
    
    /**
     * Déplace un ingrédient depuis un autre sandwich source vers this 
     * 
     * @param source
     * @param uneGarniture déjà dans source
     */
    public void deplacerIngredientDepuis(Sandwich<? extends P, ? extends S, ? extends G> source, G uneGarniture) {
    	source.garniture.removeLastOccurrence(uneGarniture);
    	this.ajouterIngredient(uneGarniture);
    }
    
    
    /**
     * Déplace un ingrédient de this.garniture VERS le puits (de données)
     * 
     * Pré-requis: i < this.garniture.length - 1
     * 
     * @param puits
     * @param i indice entier
     */
    public void deplacerIngredientVers(Sandwich<? super P, ? super S, ? super G> puits, int i) {
    	G uneGarniture = this.getNthGarniture(i);
    	this.garniture.removeLastOccurrence(uneGarniture);
    	puits.ajouterIngredient(uneGarniture);
    }
    
    
    public G getNthGarniture(int i) {
    	return garniture.get(i);
    }
    
    
    
    
    public Aliment getIngredientMostCalorique() {
    	float caloriePain = monPain.getKilocalories();
    	float calorieSauce = maSauce.getKilocalories();
    	
    	float max = -1f;
    	G maxGarniture= null;
    	
    	for (G garniture : this.garniture) {
    		
    		if ( max < garniture.getKilocalories() ) {
    			max = garniture.getKilocalories();
    			maxGarniture = garniture;
    		}
    	}
    	
    	Aliment maxAliment;
    	
    	if (maxGarniture.getKilocalories() < caloriePain) maxAliment = this.monPain;
    	else maxAliment = maxGarniture;
    	
    	if (maxAliment.getKilocalories() < calorieSauce) maxAliment = maSauce;
    	
    	
    	return maxAliment;    	

    	
    }
    
    
    public Aliment getIngredientMostCaloriqueIter() {
    	Aliment maxAliment = monPain;
    	for (Aliment aliment : this) {
    		
    		if (aliment.getKilocalories() > maxAliment.getKilocalories()) {
    			maxAliment = aliment;
    		}
    		
    	}
    	
    	return maxAliment;
    }
    
    public Aliment getIngredientMostCaloriqueStream() {
    	LinkedList<Aliment> foo = new LinkedList<Aliment>(this.garniture);
    	foo.addFirst(maSauce);
    	foo.addFirst(monPain);
    	
    	double max = foo.stream().mapToDouble(Aliment::getKilocalories).max().getAsDouble();
    	
    	return foo.stream().max(new SandwichComparator()).get();
    }
    

	@Override
	public SandwichIterator iterator() {
		// TODO Auto-generated method stub
		return new SandwichIterator(this);
	}
	
	public Iterator<G> getGanitureIterator() {
		return this.garniture.iterator();
	}

	
	public P getPain() {
		return monPain;
	}

	public S getSauce() {
		return maSauce;
	}
}


