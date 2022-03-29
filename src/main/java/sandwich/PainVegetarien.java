package main.java.sandwich;

import NomAliment.NomPain;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegetarien;

public class PainVegetarien extends Pain implements estVegetarien{

	public PainVegetarien(NomPain n, float f) throws OutOfRangeKilocariesException {
		super(n.toString(), f);
		// TODO Auto-generated constructor stub
	}
	
	protected PainVegetarien(String s, float f) throws OutOfRangeKilocariesException {
		super(s,f);
	}

}
