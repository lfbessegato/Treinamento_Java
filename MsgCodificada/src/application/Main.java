package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Parent root = null;
		
		try {
			root=FXMLLoader.load(getClass().getResource("../view/Cripto.fxml"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		Scene cena = new Scene(root);
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
