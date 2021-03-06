package main.java.sandwich;

import java.util.Comparator;

public class AlimentComparator implements Comparator<Aliment> {

	@Override
	public int compare(Aliment o1, Aliment o2) {
		return Integer.compare(Math.round(o1.getKilocalories()), Math.round(o2.getKilocalories()));
	}

}
