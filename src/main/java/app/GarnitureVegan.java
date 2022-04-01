package main.java.app;

import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegan;
import main.java.nomAliment.NomAlimentVegan;
import main.java.nomAliment.NomAlimentVegetarien;
import main.java.sandwich.GarnitureVege;

public class GarnitureVegan extends GarnitureVege implements estVegan {

	public GarnitureVegan(NomAlimentVegan n, float f) throws OutOfRangeKilocariesException {
		super(n.toString(), f);
		// TODO Auto-generated constructor stub
	}

}
