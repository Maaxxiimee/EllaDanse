package controleur;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import vue.FenetreAccueil;
import vue.FenetreListeMembre;

public class Main extends Application{

	static private Stage fAccueil;
	
	static private Stage fListeMembres;
	
	public void start(Stage fenetre) throws Exception {
		fAccueil = new FenetreAccueil();
		fAccueil.setTitle("Gestion des membres");
		
		fListeMembres = new FenetreListeMembre();
		fListeMembres.setTitle("Liste des membres");
		
		fAccueil.show();
	}
	
	public static void main(String args[]) {
		Application.launch();
	}
	
	static public void fermer() {
		fAccueil.close();
	}
	
	public static void startLM(){
		fListeMembres.show();
	}

}
