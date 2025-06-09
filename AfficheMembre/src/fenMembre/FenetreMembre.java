package fenMembre;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FenetreMembre extends Stage{

	public FenetreMembre() throws IOException {
      
        Scene sc = new Scene(creerSceneGraph());
        this.setScene(sc);
        this.setResizable(false);
        this.initModality(Modality.APPLICATION_MODAL);
        this.show();
    }
    
	private Pane creerSceneGraph() throws IOException {
		File fichier = new File("/home/etuinfo/khilaire/eclipse-workspace/S201/bin/memberPane.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(fichier.toURI().toURL());
		Pane racine = loader.load();	
		return racine;
		}
}