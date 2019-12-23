import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ExemploStackPane extends Application{
	@Override
	public void start(Stage telaEmBranco) {
		
		//PAINEL PRINCIPAL
		/* Primary Node, também chamado de Root Node */
		StackPane root = new StackPane();
		
		/* Nodes dentro do root node */
		root.getChildren().add(new Rectangle(200,200,Color.BLUE));
		root.getChildren().add(new Circle(100,Color.RED));
		root.getChildren().add(new Rectangle(140,140,Color.YELLOW));
		
		//SCENE
		Scene cena = new Scene(root,500,300);
		
		//JOGANDO TUDO NO STAGE
		telaEmBranco.setTitle("Exemplo de StackPane");
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
