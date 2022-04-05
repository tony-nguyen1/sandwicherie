package main.java.app;

import java.util.ArrayList;

import main.java.sandwich.*;

import main.java.customException.OutOfRangeKilocariesException;

import main.java.nomAliment.*;

public class Application {

	public static void main(String[] args) throws OutOfRangeKilocariesException {
		ArrayList<Sandwich<? extends Pain, ? extends Sauce, ? extends Garniture>> listSandwich = new ArrayList<>();
		Sandwich<Pain, Sauce, Garniture> sandwichNormal;
		Sandwich<PainVege, SauceVege, GarnitureVege> sandwichVege;
		Sandwich<PainVegan, Sauce, GarnitureVegan> sandwichVegan;
		
		
		//(1) création de sandwich
		sandwichNormal = new Sandwich<>(new Pain(NomPain.PainAuLardon, 50f), new Sauce(NomSauce.Bolognaise, 28f));
		listSandwich.add(sandwichNormal);
		sandwichNormal.ajouterIngredient(new Garniture(NomGarniture.Jambon, 88.88f));
		System.out.println(sandwichNormal);

		sandwichVege = new Sandwich<>(new PainVege(NomPainVegetarien.PainViennois, 50f), new SauceVege(NomSauceVegetarien.Aïoli, 28f));
		listSandwich.add(sandwichVege);
		sandwichVege.ajouterIngredient(new GarnitureVege(NomAlimentVegetarien.Oeuf, 34f));
		System.out.println(sandwichVege);

		
		//(2) l'ingrédient le plus calorique
		for (int i = 0; i < listSandwich.size(); i++)
		{
		 	Sandwich<? extends Pain, ? extends Sauce, ? extends Garniture> s = listSandwich.get(i);
			
			System.out.print("L'ingrédient le plus calorique du sandwich n°" + i + " : ");
			System.out.println(s.getIngredientMostCalorique());
		}
		
		//(3) le déplacement d’un ingrédient du sandwich végan vers le sandwich végétarien
//		Garniture ga;
//		ga = sandwichVege.getNthGarniture(0);
//		sandwichNormal.deplacerIngredientDepuis(sandwichVege, ga);
		
		
		Garniture ga;
		ga = sandwichNormal.getNthGarniture(0);
//		sandwichVege.deplacerIngredientVers(sandwichNormal, ga);TODO: réparer ça, marche pas
		
		System.out.println(sandwichNormal);
		System.out.println(sandwichVege);
		
		
		//(4) ingrédients en commun ?
		
		
		//(5) cas incorrects
//		ga = sandwichNormal.getNthGarniture(0);
//		sandwichVege.deplacerIngredient(sandwichNormal, ga);

		
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