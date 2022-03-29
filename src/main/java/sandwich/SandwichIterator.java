package main.java.sandwich;

import java.util.Iterator;

public class SandwichIterator implements Iterator<Aliment> {

	/**
	 * 0 -> pain
	 * 1 -> sauce
	 * 2 -> garniture
	 */
	int state = 0;
	Sandwich<?,?,?> leSandwich;
	Iterator<?> lIterator;
	
	
	
	public SandwichIterator(Sandwich<?, ?, ?> leSandwich) {
		this.leSandwich = leSandwich;
		this.lIterator = leSandwich.getGanitureIterator();
	}

	@Override
	public boolean hasNext() {
		if (state == 2) return lIterator.hasNext();
		else return true;
	}

	@Override
	public Aliment next() {
		
		Aliment unAliment = null;
		switch(state)
		{
		case 0:
			unAliment = leSandwich.getPain();
			state = 1;
			break;
		case 1:
			unAliment = leSandwich.getSauce();
			state = 2;
			break;
		case 2:
			unAliment = (Aliment) lIterator.next();
			break;
		}
		
		
		
		return unAliment;
	}

}
