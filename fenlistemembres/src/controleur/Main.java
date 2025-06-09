package controleur;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import modele.*;
import vue.*;

public class Main extends Application{
	static private FenListeEmployes fListeEmp;

	
	public void start(Stage f) throws Exception {
		
		Donnees.chargementDonnees();
		//initialisation des fenêtres
		fListeEmp = new FenListeEmployes();
		fListeEmp.show();
	} 
	
	static public void main(String args[]) { 
		Application.launch(args); 
	}
	
	static public void fermerAppli() {
		System.exit(0);
	}

	
	//////////////////////////////////////////
	// gestion des données : les consultations
	//////////////////////////////////////////
	static public ObservableList<Employe> getLesEmployes(){
		return Donnees.getLesEmployes();
	}
	
	static public ObservableList<Employe> getLesEmployesAlphaSaison(){
		System.out.println("msg main 1");
		return Donnees.triAlphaSaison();
	}
	
	static public ObservableList<Employe> getLesEmployesSaisonAlpha(){
		System.out.println("msg main 2");
		return Donnees.triSaisonAlpha();
	}
	
	static public ObservableList<Employe> getLesEmployesSaisonCoursAlpha(){
		System.out.println("msg main 3");
		return Donnees.triSaisonCoursAlpha();
	}
	
	static public ObservableList<Employe> getLesEmployesSaisonAlphaCours(){
		System.out.println("msg main 4");
		return Donnees.triSaisonAlphaCours();
	}
	
	static public void getDecroissant() {
		System.out.println("msg main decroissant");
		Donnees.triDecroissant();
	}
	
	static public void getCroissant() {
		System.out.println("msg main croissant");
		Donnees.triCroissant();
	}
	
}
