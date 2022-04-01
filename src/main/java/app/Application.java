package main.java.app;

import java.util.ArrayList;

import main.java.sandwich.Garniture;
import main.java.sandwich.Pain;
import main.java.sandwich.Sandwich;
import main.java.sandwich.Sauce;
import main.java.sandwich.AlimentVegetarien;
import main.java.sandwich.PainVegetarien;

import main.java.customException.OutOfRangeKilocariesException;

import main.java.nomAliment.*;

public class Application {

	public static void main(String[] args) throws OutOfRangeKilocariesException {
		ArrayList<Sandwich<?,?,?>> listSandwich = new ArrayList<>();
		Sandwich<Pain, Sauce, Garniture> sandwichNormal;
		// Sandwich<PainVegetarien, Sauce, AlimentVegetarien> sandwichVege;
		Sandwich sandwichVegan;
		
		
		//(1) création de sandwich
		sandwichNormal = new Sandwich(new Pain(NomPain.PainComplet, 100f), new Sauce(NomSauce.Algerienne, 28f));
		listSandwich.add(sandwichNormal);
		sandwichNormal.ajouterIngredient(new Garniture(NomGarniture.Jambon, 88.88f));

		// sandwichVege = new Sandwich(new Pain(NomPain.PainComplet, 100f), new Sauce(NomSauce.Algerienne, 28f));
		// listSandwich.add(sandwichVege);


		
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

		
		System.out.println("... fin");
	}

}
/*
compiler :
tony.nguyen@etu.umontpellier.fr@r24:~/eclipse-workspace/project/sandwicherie$ javac -cp ./src ./src/main/java/app/Application.java 

exécuter : 
tony.nguyen@etu.umontpellier.fr@r24:~/eclipse-workspace/project/sandwicherie/src$ java main.java.app.Application
... fin

source : https://javarevisited.blogspot.com/2015/04/error-could-not-find-or-load-main-class-helloworld-java.html#axzz7P6Fcb3YD
*/

/*
git

https://stackoverflow.com/questions/12501324/how-to-use-gitignore-command-in-git/54248181
*/