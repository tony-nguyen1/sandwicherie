package main.java.sandwich;

import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegetarien;
import main.java.nomAliment.NomAlimentVegetarien;

public class GarnitureVege extends Garniture implements estVegetarien {

	public GarnitureVege(NomAlimentVegetarien n, float f) throws OutOfRangeKilocariesException {
		super(n, f);
		// TODO Auto-generated constructor stub
	}

}
