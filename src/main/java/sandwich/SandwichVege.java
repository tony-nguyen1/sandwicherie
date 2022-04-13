package main.java.sandwich;

public class SandwichVege<P extends PainVege, S extends SauceVege, G extends GarnitureVege> extends Sandwich<P,S,G>{
	
	private static final String nomGeneral = "SandwichVegetarien";
	
	public SandwichVege(P unPain, S uneSauce) {
		super(unPain, uneSauce);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(SandwichVege.nomGeneral);
    	sb.append(enChaines());
		return sb.toString();
	}

}
