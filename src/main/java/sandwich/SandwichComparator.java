package main.java.sandwich;

import java.util.Comparator;

public class SandwichComparator implements Comparator<Aliment> {

	@Override
	public int compare(Aliment o1, Aliment o2) {
		// TODO Auto-generated method stub
		return Integer.compare(Math.round(o1.getKilocalories()), Math.round(o2.getKilocalories()));
	}

}
