package main.java.sandwich;

import main.java.nomAliment.*;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegetarien;

public class PainVege extends Pain implements estVegetarien{

	public PainVege(NomPainVegetarien n, float f) throws OutOfRangeKilocariesException {
		super(n.toString(), f);
		// TODO Auto-generated constructor stub
	}
	
	public PainVege(NomPainVegan n, float f) throws OutOfRangeKilocariesException {
		super(n.toString(), f);
		// TODO Auto-generated constructor stub
	}
	
	protected PainVege(String s, float f) throws OutOfRangeKilocariesException {
		super(s,f);
	}

}
