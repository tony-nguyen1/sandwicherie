package main.java.sandwich;

import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegan;

public class NomSauceVegan extends SauceVege implements estVegan {

	public NomSauceVegan(NomSauceVegan n, float f) throws OutOfRangeKilocariesException {
		super(n.toString(), f);
	}

}
