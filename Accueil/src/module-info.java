/**
 * 
 */
/**
 * 
 */
module Accueil {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	opens vue to javafx.graphics, javafx.fxml, javafx.base, javafx.controls;
	opens controleur to javafx.graphics, javafx.fxml, javafx.base, javafx.controls;
}