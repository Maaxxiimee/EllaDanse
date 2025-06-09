package vue;


import controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ControleurAccueil {
	
    @FXML
    private Button bnListeMembres;

    @FXML
    private Button bnRetour;

    @FXML
    private Button bnListeBureau;

    @FXML
    private Button bnCreationMembre;

    @FXML
    private Button bnFermer;

    @FXML
    void afficherListeMembres(ActionEvent event){
    	Main.startLM();
    }

    @FXML
    void CreerMembre(ActionEvent event) {

    }

    @FXML
    void clicFermer(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void clicRetour(ActionEvent event) {
    	
    }

    @FXML
    void afficherListeBureau(ActionEvent event) {

    }

}
