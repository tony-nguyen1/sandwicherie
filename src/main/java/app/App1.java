package main.java.app;

import NomAliment.NomPain;
import NomAliment.NomSauce;
import main.java.sandwich.Garniture;
import main.java.sandwich.Pain;
import main.java.sandwich.Sandwich;
import main.java.sandwich.Sauce;

public class App1 {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		
		Pain painjsp = new Pain(NomPain.PainComplet);
		
		Sandwich<Pain, Sauce, Garniture> sa = new Sandwich(new Pain(NomPain.PainComplet), new Sauce(NomSauce.Algerienne));
		
		
	}

}
