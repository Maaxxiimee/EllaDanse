package fenMembre;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControleurMembre {

    @FXML
    private Label labTitre;

    @FXML
    private Label labStatut;

    @FXML
    private Label labVille;

    @FXML
    private Label labSex;

    @FXML
    private Button bnFermer;

    @FXML
    private Label labDateNais;

    @FXML
    private Button bnModifier;

    @FXML
    private Label labCodePostal;

    @FXML
    private Label labAdresse;

    @FXML
    private Label labNom;

    @FXML
    private Label labComite;

    @FXML
    private Label labMail;

    @FXML
    private Label labPrenom;

    @FXML
    private Label labTel;
    
    @FXML
    private Label labNiv;
    
    private Membre m = new Membre("Ricardo", "Daniel", "F", LocalDate.now(), "25 rue de l'Artois", 22300, "Lannion", 0736363636, "danielricardo@gmail.com", "non", false, false);

    @FXML
    void modifier(ActionEvent event) {
    	initialiser(m);
    }

    @FXML
    void fermer(ActionEvent event) {
    	Main.fermer();
    }
    
    void initialiser(Membre e) {
    	labNom.setText(m.getNom());
    	labAdresse.setText(m.getAdr());
    	String temp = String.valueOf(m.getcp());
    	labCodePostal.setText(temp);
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	temp = m.getNaiss().format(formatter);
    	labDateNais.setText(temp);
    	labMail.setText(m.getMail());
    	labNiv.setText(m.getNiv_danse());
    	labPrenom.setText(m.getPrenom());
    	labSex.setText(m.getGender());
    	labStatut.setText(String.valueOf(m.getEtu()));
    	labTel.setText(String.valueOf(m.getTel()));
    	labTitre.setText(m.getNom()+m.getPrenom());
    	labVille.setText(m.getCity());
    	labComite.setText(String.valueOf(m.getComite()));
    }

}














