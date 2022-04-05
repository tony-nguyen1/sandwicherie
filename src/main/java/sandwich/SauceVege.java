package main.java.sandwich;

import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegetarien;
import main.java.nomAliment.NomSauce;
import main.java.nomAliment.NomSauceVegetarien;

public class SauceVege extends Sauce implements estVegetarien {

	protected SauceVege(String n, float f) throws OutOfRangeKilocariesException {
		super(n, f);
	}
	
	public SauceVege(NomSauceVegetarien n, float f) throws OutOfRangeKilocariesException {
		this(n.toString(), f);
	}

}
