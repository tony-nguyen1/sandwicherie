package main.java.sandwich;

import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegetarien;
import main.java.nomAliment.NomAlimentVegetarien;

public class GarnitureVege extends Garniture implements estVegetarien {

	
	protected GarnitureVege(String s, float f) throws OutOfRangeKilocariesException {
		super(s,f);
	}
	
	
	public GarnitureVege(NomAlimentVegetarien n, float f) throws OutOfRangeKilocariesException {
		this(n.toString(), f);
		// TODO Auto-generated constructor stub
	}

	

}
