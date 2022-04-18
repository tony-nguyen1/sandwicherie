package main.java.app;

import java.util.ArrayList;

import main.java.sandwich.*;

import main.java.customException.OutOfRangeKilocariesException;
import main.java.nomAliment.*;

/**
 * Exemple pour:
 * -déclarer, instancier des sandiwchs
 * -ajouter, déplacer des ingrédients
 * -etc ...
 */

/*
compiler et exécuter:
clementine.nebut@PC:~/sandwicherie$ make all

compiler:
clementine.nebut@PC:~/sandwicherie$ make compile

exécuter:
clementine.nebut@PC:~/sandwicherie$ make run
*/

public class Application {

	public static void main(String[] args) throws OutOfRangeKilocariesException {
		System.out.println("début ...");
		
		System.out.println("Déclaration des sandwichs");
		ArrayList<Sandwich<? extends Pain, ? extends Sauce, ? extends Garniture>> listSandwich = new ArrayList<>();
		Sandwich<Pain, Sauce, Garniture> sandwichNormal;
		SandwichVege<PainVege, SauceVege, GarnitureVege> sandwichVege;
		SandwichVegan<PainVegan, SauceVegan, GarnitureVegan> sandwichVegan;
		System.out.println();
		
		//(1) création de sandwich
		System.out.println("Création des sandwichs");
		sandwichNormal = new Sandwich<>(new Pain(NomPain.PainAuLardon, 50f), new Sauce(NomSauce.Bolognaise, 28f));
		listSandwich.add(sandwichNormal);
		sandwichNormal.ajouterIngredient(new Garniture(NomGarniture.Jambon, 88.88f));
		sandwichNormal.ajouterIngredient(new Garniture(NomGarniture.Dinde, 88.88f));
		System.out.println(sandwichNormal);

		sandwichVege = new SandwichVege<>(new PainVege(NomPainVegetarien.PainViennois, 50f), new SauceVege(NomSauceVegetarienne.Aïoli, 28f));
		listSandwich.add(sandwichVege);
		sandwichVege.ajouterIngredient(new GarnitureVege(NomGarnitureVegetarienne.Oeuf, 34f));
		sandwichVege.ajouterIngredient(new GarnitureVegan(NomGarnitureVegan.Salade, 34f));
		sandwichVege.ajouterIngredient(new GarnitureVegan(NomGarnitureVegan.Cornichon,1.23f));
		System.out.println(sandwichVege);
		
		sandwichVegan = new SandwichVegan<>(new PainVegan(NomPainVegan.PainDeMie, 4), new SauceVegan(NomSauceVegan.Ketchup, 999f));
		listSandwich.add(sandwichVegan);
		sandwichVegan.ajouterIngredient(new GarnitureVegan(NomGarnitureVegan.Oignon,0));
		sandwichVegan.ajouterIngredient(new GarnitureVegan(NomGarnitureVegan.Cornichon,0));
		System.out.println(sandwichVegan);
		System.out.println();
		
		//(2) l'ingrédient le plus calorique
		for (int i = 0; i < listSandwich.size(); i++)
		{
		 	Sandwich<? extends Pain, ? extends Sauce, ? extends Garniture> s = listSandwich.get(i);
			
			System.out.println("L'ingrédient le plus calorique du sandwich n°" + i + " : ");
			System.out.print("    ");
			System.out.println(s.getIngredientMostCalorique());
			System.out.print("    ");
			System.out.println(s.getIngredientMostCaloriqueIter()); 
			System.out.print("    ");
			System.out.println(s.getIngredientMostCaloriqueStream()); 
		}
		System.out.println();
		
		//(3) le déplacement d’un ingrédient du sandwich végan vers le sandwich végétarien
		sandwichNormal.deplacerIngredientDepuis(sandwichVege, 0);
		sandwichVege.deplacerIngredientVers(sandwichNormal, 0);
		
		System.out.println("Après déplacement d'ingrédients");
		System.out.println(sandwichNormal);
		System.out.println(sandwichVege);
		System.out.println(sandwichVegan);
		System.out.println();
		
		
		//(4) ingrédients en commun ?
		System.out.println("Ingredients en commun");
		System.out.println(sandwichNormal.aNomIngredientEnCommunAvec(sandwichVege));
		System.out.println(sandwichVege.aNomIngredientEnCommunAvec(sandwichVege)); // yep
		System.out.println(sandwichVege.aNomIngredientEnCommunAvec(sandwichVegan)); // cornichon
		System.out.println();
		
		//(5) cas incorrects, ne compile pas
		System.out.println("Cas incorrects");
		//// création de sandwich /////////////////////////////////////////////////////////////////////////////////////////////////
//		Sandwich<Sauce, Sauce, Garniture> sandwichFaux = new Sandwich<Sauce,Sauce,Garniture>(new Sauce(null,0), new Sauce(null,0));
//		Sandwich<Pain, Sauce, Pain> sandwichFaux = new Sandwich<Pain,Sauce,Pain>(new Pain(null,0), new Sauce(null,0)); // sandwich aux pains
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//// ajouter ingrédients //////////////////////////////////////////////////////////////////
//		sandwichVege.ajouterIngredient(new Garniture(NomGarniture.Saumon, 0));
//		sandwichVegan.ajouterIngredient(new GarnitureVege(NomGarnitureVegetarienne.Fromage,0));
//		sandwichVegan.ajouterIngredient(new Garniture(NomGarniture.Dinde,0));
		///////////////////////////////////////////////////////////////////////////////////////////
		
		//// déplacer ingrédients //////////////////////////////////////////////////////////////////
//		sandwichVege.deplacerIngredientVers(sandwichVegan, 1); // sandwichVege -> sandwichVegan
//		sandwichVegan.deplacerIngredientDepuis(sandwichVege, 0); // sandwichVegan <- sandwichVege
		
//		sandwichNormal.deplacerIngredientVers(sandwichVege, 1); // sandwichNormal -> sandwichVege
//		sandwichVege.deplacerIngredientDepuis(sandwichNormal, 0); // sandwichVege <- sandwichNormal
		
//		sandwichNormal.deplacerIngredientVers(sandwichVegan, 1); // sandwichNormal -> sandwichVegan
//		sandwichVegan.deplacerIngredientDepuis(sandwichNormal, 0); // sandwichVegan <- sandwichNormal
		////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//(6) plante
//		new Garniture(NomGarniture.Jambon,-1f);
//		new Garniture(NomGarniture.Jambon,1001f);
		System.out.println();
		
		System.out.println("... fin");
	}

}


/*
 * https://javarevisited.blogspot.com/2015/04/error-could-not-find-or-load-main-class-helloworld-java.html#axzz7P6Fcb3YD
 */


/*
git

https://stackoverflow.com/questions/12501324/how-to-use-gitignore-command-in-git/54248181
*/