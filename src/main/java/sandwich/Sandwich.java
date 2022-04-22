package main.java.sandwich;

import java.util.*;


public class Sandwich <P extends Pain, S extends Sauce, G extends Garniture> implements Iterable<Aliment>{
	
	private P monPain;
	private S maSauce;
	private LinkedList<G> garniture;
	// on construit le sandwich du bas vers le haut (le premier élément de la liste est donc la gartinure la plus "basse" du sandwich)
	private static final String nomGeneral = "Sandwich";
	
    
    protected Sandwich(P unPain, S uneSauce, LinkedList<G> mesGarnitures) {
    	monPain = unPain;
    	maSauce = uneSauce;
    	garniture = mesGarnitures;
    }
    
    public Sandwich(P unPain, S uneSauce) {
    	this(unPain, uneSauce, new LinkedList<G>());
    }

    @Override
	public String toString() {
    	StringBuilder sb = new StringBuilder(Sandwich.nomGeneral);
    	sb.append(enChaines());
		return sb.toString();
	}
    
    public String enChaines() {
    	StringBuilder sb = new StringBuilder(" [monPain=");
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
     * Pré-requis: i < this.garniture.length - 1
     * 
     * @param source
     * @param i indice entier de la garniture dans source.garniture à déplacer
     */
    public void deplacerIngredientDepuis(Sandwich<?, ?, ? extends G> source, int i) {
    	G uneGarniture = source.garniture.get(i);
    	source.garniture.removeLastOccurrence(uneGarniture);
    	this.ajouterIngredient(uneGarniture);
    }
    
    
    /**
     * Déplace un ingrédient de this.garniture VERS le puits (de données)
     * 
     * Pré-requis: i < this.garniture.length - 1
     * 
     * @param puits
     * @param i indice entier de la garniture dans this.garniture à déplacer
     */
    public void deplacerIngredientVers(Sandwich<?, ?, ? super G> puits, int i) {
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
    	
//    	foo.stream().mapToDouble(Aliment::getKilocalories).max().getAsDouble();
    	
    	return foo.stream().max(new AlimentComparator()).get();
    }
    

	@Override
	public SandwichIterator iterator() {
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
	
	/**
	 * 
	 * Compare this avec sand, renvoie True ssi ils ont des aliments avec le même nom.
	 * 
	 */
	public boolean aNomIngredientEnCommunAvec(Sandwich<?,?,?> sand) {
		
		for (Aliment foo : this) {
			for (Aliment oof : sand) {
				if (foo.nom.equals(oof.nom)) { return true; }
			}
		}
		
		return false;
	}
}


