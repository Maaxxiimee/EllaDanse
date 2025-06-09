package vue;

import controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import modele.Employe;


public class CtrlListeEmployes {

    @FXML private Button bnFermer;
    @FXML private TableView<Employe> tvListeEmployes;
    
    @FXML
    private Button ajoutCours;
    
    @FXML
    private ToggleGroup rdBtnCroiDecroi;
	
    @FXML
    private RadioButton rdBtnCroi;

    @FXML
    private RadioButton rdBtnDecroi;
    
    @FXML
    static private RadioButton alphaSaison;

    @FXML
    static private RadioButton saisonAlphaCours;

    @FXML
    static private RadioButton saisonCoursAlpha;
    
    @FXML
    static private RadioButton saisonAlpha;
    
    @FXML
    private ToggleGroup rdBtn;
     
    @FXML
    void ajoutCours(ActionEvent event) {
    	System.out.println("Clic ajouter membre à un cours");
    }
    
    @FXML void clicFermer(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML
    void alphaSaison(ActionEvent event) {
    	System.out.println("1");
    	rdBtnCroi.setSelected(true);
    	rdBtnDecroi.setSelected(false);
    	Main.getLesEmployesAlphaSaison();
    }

    @FXML
    void saisonAlpha(ActionEvent event) {
    	System.out.println("2");
    	rdBtnCroi.setSelected(true);
    	rdBtnDecroi.setSelected(false);
    	Main.getLesEmployesSaisonAlpha();
    }

    @FXML
    void saisonCoursAlpha(ActionEvent event) {
    	System.out.println("3");
    	rdBtnCroi.setSelected(true);
    	rdBtnDecroi.setSelected(false);
    	Main.getLesEmployesSaisonCoursAlpha();
    }

    @FXML
    void saisonAlphaCours(ActionEvent event) {
    	System.out.println("4");
    	rdBtnCroi.setSelected(true);
    	rdBtnDecroi.setSelected(false);
    	Main.getLesEmployesSaisonAlphaCours();
    }
    
    @FXML
    void sensDecroissant(ActionEvent event) {
    	Main.getDecroissant();
    }

    @FXML
    void sensCroissant(ActionEvent event) {
    	Main.getCroissant();
    }
    
    
    @FXML void initialize() {
    	
    	TableColumn<Employe,Integer> colonne1 = new TableColumn<Employe,Integer>("prenom");
		colonne1.setCellValueFactory(new PropertyValueFactory<Employe,Integer>("prenom"));	
		tvListeEmployes.getColumns().set(0, colonne1);
		TableColumn<Employe, String> colonne2 = new TableColumn<Employe,String>("nom");
		colonne2.setCellValueFactory(new PropertyValueFactory<Employe, String>("nom"));
		tvListeEmployes.getColumns().set(1, colonne2);
		TableColumn<Employe, String> colonne3 = new TableColumn<Employe,String>("adresse");
		colonne3.setCellValueFactory(new PropertyValueFactory<Employe, String>("adresse"));
		tvListeEmployes.getColumns().set(2, colonne3);
		TableColumn<Employe,Integer> colonne4 = new TableColumn<Employe,Integer>("email");
		colonne4.setCellValueFactory(new PropertyValueFactory<Employe, Integer>("email"));
		tvListeEmployes.getColumns().set(3, colonne4);
		TableColumn<Employe,Integer> colonne5 = new TableColumn<Employe,Integer>("jour");
		colonne5.setCellValueFactory(new PropertyValueFactory<Employe, Integer>("jour"));
		tvListeEmployes.getColumns().set(4, colonne5);
		TableColumn<Employe,Integer> colonne6 = new TableColumn<Employe,Integer>("mois");
		colonne6.setCellValueFactory(new PropertyValueFactory<Employe, Integer>("mois"));
		tvListeEmployes.getColumns().set(5, colonne6);
		TableColumn<Employe,Integer> colonne7 = new TableColumn<Employe,Integer>("annee");
		colonne7.setCellValueFactory(new PropertyValueFactory<Employe, Integer>("annee"));
		tvListeEmployes.getColumns().set(6, colonne7);
		TableColumn<Employe,Integer> colonne8 = new TableColumn<Employe,Integer>("age");
		colonne8.setCellValueFactory(new PropertyValueFactory<Employe, Integer>("age"));
		tvListeEmployes.getColumns().set(7, colonne8);
		TableColumn<Employe,String> colonne9 = new TableColumn<Employe,String>("niveauDanse");
		colonne9.setCellValueFactory(new PropertyValueFactory<Employe, String>("niveauDanse"));
		tvListeEmployes.getColumns().set(8, colonne9);
		TableColumn<Employe,String> colonne10 = new TableColumn<Employe,String>("saison");
		colonne10.setCellValueFactory(new PropertyValueFactory<Employe, String>("saison"));
		tvListeEmployes.getColumns().set(9, colonne10);
		TableColumn<Employe,String> colonne11 = new TableColumn<Employe,String>("cours");
		colonne11.setCellValueFactory(new PropertyValueFactory<Employe, String>("cours"));
		tvListeEmployes.getColumns().set(10, colonne11);
		
		tvListeEmployes.setItems(Main.getLesEmployes());
		tvListeEmployes.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
	    // État initial du bouton : désactivé
	    ajoutCours.setDisable(true);

	    // Ajout du listener de sélection
	    tvListeEmployes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
	        ajoutCours.setDisable(newSelection == null);
	    });
    }
    
}
