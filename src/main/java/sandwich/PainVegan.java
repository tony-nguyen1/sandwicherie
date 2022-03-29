package main.java.sandwich;

import NomAliment.NomPain;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegan;

public class PainVegan extends PainVegetarien implements estVegan{

	public PainVegan(NomPain nomPain, float f) throws OutOfRangeKilocariesException {
		super(nomPain.toString(), f);
	}

}
