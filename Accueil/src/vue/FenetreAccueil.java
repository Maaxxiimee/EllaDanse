package vue;

import java.io.File;
import java.io.IOException;
import javafx.geometry.Insets;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FenetreAccueil extends Stage{

	public FenetreAccueil() throws IOException {
      
        Scene sc = new Scene(creerSceneGraph());
        this.setScene(sc);
        this.setResizable(false);
        this.initModality(Modality.APPLICATION_MODAL);
    }
    
	private Pane creerSceneGraph() throws IOException {
		File fichier = new File("/home/etuinfo/nlehebel/Documents/SAE 2.05 - Projet/Accueil/accueil.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(fichier.toURI().toURL());
		Pane racine = loader.load();	
		return racine;
		}
}
