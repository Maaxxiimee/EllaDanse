package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ControleurListeMembres {
	@FXML
    private TextField txtCodePostal;

    @FXML
    private RadioButton radioBtn;

    @FXML
    private Button annulation;

    @FXML
    private Button bnOk;

    @FXML
    private ToggleGroup btnRadioAbo;

    @FXML
    private ToggleGroup btnRadioReg;

    @FXML
    private TextField txtNom;

    @FXML
    void nomKeyTyped(ActionEvent event) {

    }

    @FXML
    void annuler(ActionEvent event) {

    }

    @FXML
    void verifAlerte(ActionEvent event) {

    }

}

