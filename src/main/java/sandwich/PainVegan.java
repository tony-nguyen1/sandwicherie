package main.java.sandwich;

import main.java.nomAliment.*;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegan;

public class PainVegan extends PainVegetarien implements estVegan{

	public PainVegan(NomPain nomPain, float f) throws OutOfRangeKilocariesException {
		super(nomPain.toString(), f);
	}

}
