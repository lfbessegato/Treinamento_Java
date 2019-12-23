

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/* 
 * CLASSE INICIAL
 * Esta é a classe que estende Application e 
 * carrega o View do MVC
 */
public class calculaMedia extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		Parent root = null;
		
		try {
			root = FXMLLoader.load(getClass().getResource("Calcula.fxml"));
		} catch (Exception e) {
			System.out.println("Aconteceu um erro: " + e.getMessage());
		}
		
		Scene cena = new Scene(root,350,450);
		primaryStage.setTitle("Média");
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
