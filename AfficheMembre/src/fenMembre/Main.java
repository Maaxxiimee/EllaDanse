package fenMembre;


import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

	static private Stage f;
	
	public void start(Stage fenetre) throws Exception {
		f = new FenetreMembre();
		f.setTitle("Ma fenetre");
		f.show();
	}
	public static void main(String args[]) {
		Application.launch(args);
	}
	
	static public void fermer() {
		f.close();
	}
}
