package main.java.sandwich;

import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegetarien;
import main.java.nomAliment.NomGarnitureVegetarienne;

public class GarnitureVege extends Garniture implements estVegetarien {

	
	protected GarnitureVege(String s, float f) throws OutOfRangeKilocariesException {
		super(s,f);
	}
	
	
	public GarnitureVege(NomGarnitureVegetarienne n, float f) throws OutOfRangeKilocariesException {
		this(n.toString(), f);
		// TODO Auto-generated constructor stub
	}

	

}
