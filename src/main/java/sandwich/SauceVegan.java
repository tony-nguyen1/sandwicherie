package main.java.sandwich;

import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegan;
import main.java.nomAliment.NomSauceVegan;

public class SauceVegan extends SauceVege implements estVegan {

	public SauceVegan(NomSauceVegan n, float f) throws OutOfRangeKilocariesException {
		super(n.toString(), f);
	}

}
