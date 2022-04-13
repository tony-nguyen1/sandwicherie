package main.java.sandwich;

import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegan;
import main.java.nomAliment.NomGarnitureVegan;

public class GarnitureVegan extends GarnitureVege implements estVegan {

	public GarnitureVegan(NomGarnitureVegan n, float f) throws OutOfRangeKilocariesException {
		super(n.toString(), f);
		// TODO Auto-generated constructor stub
	}

}
