/**
 * 
 */
/**
 * 
 */
module fenlistemembres {
	
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
		
	opens vue to javafx.base, javafx.graphics, javafx.controls, javafx.fxml;
	opens modele to javafx.base, javafx.graphics, javafx.controls, javafx.fxml;
	opens controleur to javafx.base, javafx.graphics, javafx.controls, javafx.fxml;

}