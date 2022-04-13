package main.java.sandwich;

import main.java.nomAliment.*;
import main.java.customException.OutOfRangeKilocariesException;
import main.java.inter.estVegan;

public class PainVegan extends PainVege implements estVegan{

	public PainVegan(NomPainVegan n, float f) throws OutOfRangeKilocariesException {
		super(n.toString(), f);
	}

}
