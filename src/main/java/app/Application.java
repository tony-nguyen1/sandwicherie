package main.java.app;

import java.util.ArrayList;

import main.java.sandwich.Garniture;
import main.java.sandwich.Pain;
import main.java.sandwich.Sandwich;
import main.java.sandwich.Sauce;

public class Application {

	public static void main(String[] args) {
		ArrayList<Sandwich<?,?,?>> listSandwich = new ArrayList<>();
		Sandwich<Pain, Sauce, Garniture> sandwichNormal;
		Sandwich sandwichVege;
		Sandwich sandwichVegan;
		
		
		//(1) création de sandwich
		
		
		//(2) l'ingrédient le plus calorique
		for (int i = 0; i < listSandwich.size(); i++)
		{
			Sandwich s = listSandwich.get(i);
			
			System.out.print("L'ingrédient le plus calorique du sandwich n°" + i + " : ");
			System.out.println(s.getIngredientMostCalorique());
		}
		
		//(3) le déplacement d’un ingrédient du sandwich végan vers le sandwich végétarien
		
		
		//(4) ingrédients en commun ?
		
		
		//(5) cas incorrects

		
		
	}

}
