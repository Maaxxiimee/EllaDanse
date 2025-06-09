
package modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Donnees {
	static private ObservableList<Employe> 		lesEmployes 	= FXCollections.observableArrayList();
    static private Supplier<ObservableList<Employe>> dernierTri;
	
	static private ObservableList<Employe> 		temp 	= FXCollections.observableArrayList();
	static private ObservableList<Employe> 		temp1 	= FXCollections.observableArrayList();
	static private ObservableList<Employe> 		temp2 	= FXCollections.observableArrayList();
	static private ObservableList<Employe> 		listeAffiches 	= FXCollections.observableArrayList();	

	static public void chargementDonnees() { 

		lesEmployes.add(new Employe("Lucas", "Martin", "45 Rue des Lilas, Nantes", "lucas.martin@example.com", 12, 3, 2005, 19, "Excellent", "2020-2021", "Salsa"));
		lesEmployes.add(new Employe("Emma", "Dupont", "12 Rue Victor Hugo, Paris", "emma.dupont@example.com", 8, 6, 1998, 26, "Avancé", "2021-2022", "Hip-hop"));
		lesEmployes.add(new Employe("Noah", "Lefevre", "77 Avenue de Lyon, Lyon", "noah.lefevre@example.com", 21, 9, 1995, 29, "Débutant", "2023-2024", "Tango"));
		lesEmployes.add(new Employe("Chloé", "Roux", "9 Rue des Fleurs, Marseille", "chloe.roux@example.com", 14, 11, 2000, 24, "Intermédiaire", "2022-2023", "Classique"));
		lesEmployes.add(new Employe("Nathan", "Morel", "5 Rue du Moulin, Lille", "nathan.morel@example.com", 2, 1, 1992, 32, "Excellent", "2020-2021", "Breakdance"));
		lesEmployes.add(new Employe("Léa", "Faure", "33 Rue Lafayette, Toulouse", "lea.faure@example.com", 10, 8, 2003, 21, "Avancé", "2021-2022", "Jazz"));
		lesEmployes.add(new Employe("Adam", "Girard", "18 Rue de la République, Nice", "adam.girard@example.com", 5, 12, 1990, 34, "Débutant", "2022-2023", "Contemporain"));
		lesEmployes.add(new Employe("Inès", "Henry", "60 Boulevard Haussmann, Paris", "ines.henry@example.com", 25, 4, 1999, 25, "Intermédiaire", "2023-2024", "Rock"));
		lesEmployes.add(new Employe("Tom", "Petit", "29 Rue Gambetta, Bordeaux", "tom.petit@example.com", 30, 10, 1997, 27, "Excellent", "2020-2021", "Salsa"));
		lesEmployes.add(new Employe("Manon", "Marchand", "11 Rue Victor Hugo, Rennes", "manon.marchand@example.com", 16, 2, 2002, 22, "Avancé", "2021-2022", "Hip-hop"));
		lesEmployes.add(new Employe("Hugo", "Blanc", "88 Rue Nationale, Nantes", "hugo.blanc@example.com", 4, 7, 2001, 23, "Débutant", "2022-2023", "Tango"));
		lesEmployes.add(new Employe("Sarah", "Renard", "13 Rue Pasteur, Lille", "sarah.renard@example.com", 11, 5, 1994, 30, "Intermédiaire", "2023-2024", "Classique"));
		lesEmployes.add(new Employe("Leo", "Robert", "25 Avenue des Champs, Paris", "leo.robert@example.com", 9, 6, 2000, 24, "Excellent", "2020-2021", "Breakdance"));
		lesEmployes.add(new Employe("Julie", "Lemoine", "7 Rue des Peupliers, Marseille", "julie.lemoine@example.com", 19, 3, 1996, 28, "Avancé", "2021-2022", "Jazz"));
		lesEmployes.add(new Employe("Mathis", "Bernard", "41 Rue Danton, Strasbourg", "mathis.bernard@example.com", 22, 1, 1993, 31, "Débutant", "2022-2023", "Contemporain"));
		lesEmployes.add(new Employe("Camille", "Thomas", "66 Rue Maréchal, Dijon", "camille.thomas@example.com", 3, 9, 2004, 20, "Intermédiaire", "2023-2024", "Rock"));
		lesEmployes.add(new Employe("Enzo", "Perrin", "15 Rue des Écoles, Metz", "enzo.perrin@example.com", 27, 11, 1991, 33, "Excellent", "2020-2021", "Salsa"));
		lesEmployes.add(new Employe("Clara", "Garnier", "92 Rue Belleville, Toulouse", "clara.garnier@example.com", 13, 10, 2005, 19, "Avancé", "2021-2022", "Hip-hop"));
		lesEmployes.add(new Employe("Thomas", "Lopez", "55 Avenue Victor Hugo, Tours", "thomas.lopez@example.com", 20, 2, 1998, 26, "Débutant", "2022-2023", "Tango"));
		lesEmployes.add(new Employe("Anaïs", "Chevalier", "23 Rue des Arts, Reims", "anais.chevalier@example.com", 6, 12, 1999, 25, "Intermédiaire", "2023-2024", "Classique"));
		lesEmployes.add(new Employe("Maxime", "Roy", "35 Rue Royale, Nancy", "maxime.roy@example.com", 1, 4, 1995, 29, "Excellent", "2020-2021", "Breakdance"));
		lesEmployes.add(new Employe("Maëlys", "Gomez", "28 Rue des Docks, Brest", "maelys.gomez@example.com", 18, 6, 1997, 27, "Avancé", "2021-2022", "Jazz"));
		lesEmployes.add(new Employe("Nathan", "Moreau", "36 Rue Nationale, Limoges", "nathan.moreau@example.com", 7, 5, 2002, 22, "Débutant", "2022-2023", "Contemporain"));
		lesEmployes.add(new Employe("Eva", "Fernandez", "42 Rue de l'Industrie, Caen", "eva.fernandez@example.com", 23, 8, 2001, 23, "Intermédiaire", "2023-2024", "Rock"));
		lesEmployes.add(new Employe("Jules", "Schmitt", "47 Rue du Port, Toulon", "jules.schmitt@example.com", 28, 9, 1996, 28, "Excellent", "2020-2021", "Salsa"));
		lesEmployes.add(new Employe("Zoé", "Richard", "8 Rue de la Mairie, Pau", "zoe.richard@example.com", 15, 10, 1994, 30, "Avancé", "2021-2022", "Hip-hop"));
		lesEmployes.add(new Employe("Louis", "Benoit", "90 Rue Sainte, Avignon", "louis.benoit@example.com", 24, 3, 1993, 31, "Débutant", "2022-2023", "Tango"));
		lesEmployes.add(new Employe("Alice", "Muller", "31 Rue Colbert, Rouen", "alice.muller@example.com", 26, 2, 1991, 33, "Intermédiaire", "2023-2024", "Classique"));
		lesEmployes.add(new Employe("Gabriel", "Leclerc", "14 Rue de la Gare, Annecy", "gabriel.leclerc@example.com", 17, 1, 1992, 32, "Excellent", "2020-2021", "Breakdance"));
		lesEmployes.add(new Employe("Lina", "Fontaine", "19 Rue Carnot, Perpignan", "lina.fontaine@example.com", 29, 5, 2000, 24, "Avancé", "2021-2022", "Jazz"));
		lesEmployes.add(new Employe("Axel", "Lucas", "6 Rue de la Liberté, Mulhouse", "axel.lucas@example.com", 12, 11, 1990, 34, "Débutant", "2022-2023", "Contemporain"));
		lesEmployes.add(new Employe("Jeanne", "Fabre", "70 Rue Oberkampf, Paris", "jeanne.fabre@example.com", 8, 4, 1999, 25, "Intermédiaire", "2023-2024", "Rock"));
		lesEmployes.add(new Employe("Théo", "Barbier", "81 Rue Saint-Michel, Amiens", "theo.barbier@example.com", 11, 7, 1996, 28, "Excellent", "2020-2021", "Salsa"));
		
	}

	static public ObservableList<Employe> triAlphaSaison() {	
		temp = lesEmployes;
		temp1 = temp;
		System.out.println("msg donnees 1");
		Collections.sort(temp, new EmployeComparatorSaison());
		Collections.sort(temp1, new EmployeComparatorAlphaNom());
		listeAffiches = temp1;
		dernierTri = Donnees::triAlphaSaison;
		return listeAffiches;
	}
	
	static public ObservableList<Employe> triSaisonAlpha() {
		System.out.println("msg donnees 2");
		temp = lesEmployes;
		temp1 = temp;
		Collections.sort(temp, new EmployeComparatorAlphaNom());
		Collections.sort(temp1, new EmployeComparatorSaison());
		listeAffiches = temp1;
		dernierTri = Donnees::triSaisonAlpha;
		return listeAffiches;
	}
	
	static public ObservableList<Employe> triSaisonCoursAlpha() {
		System.out.println("msg donnees 3");
		temp = lesEmployes;
		temp1 = temp;
		temp2 = temp1;
		Collections.sort(temp, new EmployeComparatorAlphaNom());
		Collections.sort(temp1, new EmployeComparatorCours());
		Collections.sort(temp2, new EmployeComparatorSaison());
		listeAffiches = temp2;
		dernierTri = Donnees::triSaisonCoursAlpha;
		return listeAffiches;
	}
	
	static public ObservableList<Employe> triSaisonAlphaCours() {
		System.out.println("msg donnees 4");
		temp = lesEmployes;
		temp1 = temp;
		temp2 = temp1;
		Collections.sort(temp, new EmployeComparatorCours());
		Collections.sort(temp1, new EmployeComparatorAlphaNom());
		Collections.sort(temp2, new EmployeComparatorSaison());
		listeAffiches = temp2;
		dernierTri = Donnees::triSaisonAlphaCours;
		return listeAffiches;
	}
	
	static public ObservableList<Employe> triDecroissant() {
	    System.out.println("msg donnees decroissant");

	    List<Employe> reversedList = new ArrayList<>(listeAffiches);
	    Collections.reverse(reversedList);
	    
	    listeAffiches.setAll(reversedList);
	    return listeAffiches;
	}
	
	static public ObservableList<Employe> triCroissant() {
	    System.out.println("msg donnees croissant");
	    return dernierTri.get();
	}
	
	static public ObservableList<Employe> getLesEmployes() {
		return lesEmployes;
	}

}
