package main.java.sandwich;

public class SandwichVegan<P extends PainVegan, S extends SauceVegan, G extends GarnitureVegan> extends SandwichVege<P, S, G> {
	
	private static final String nomGeneral = "SandwichVega";
	
	public SandwichVegan(P unPain, S uneSauce) {
		super(unPain, uneSauce);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(SandwichVegan.nomGeneral);
    	sb.append(enChaines());
		return sb.toString();
	}

}
