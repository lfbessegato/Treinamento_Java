import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ExemploGridPane extends Application{
	@Override
	public void start(Stage telaEmBranco) {
		//PAINEL PRINCIPAL
		/* Primary Node, também chamado de Root Node */
		GridPane root = new GridPane();
		root.setVgap(10);
		
		/* Nodes dentro do root node */
		root.add(new Rectangle(50,50,Color.BLUE), 0, 0);
		root.add(new Circle(25,Color.RED), 0, 0);
		root.add(new Rectangle(30,10,Color.YELLOW), 0, 0);
		root.add(new Label(" CADASTRO DE CLIENTES "), 1, 0);
		root.add(new Label("Nome:"), 1, 2);
		root.add(new Label("Endereço:"), 1, 3);
		root.add(new Label("Telefone fixo:"), 1, 4);
		root.add(new Label("Telefone Celular:"), 1, 5);
		root.add(new Label("Possui Whatsapp:"), 1, 6);
		
		root.add(new TextField(), 2, 2);
		root.add(new TextField(), 2, 3);
		root.add(new TextField(), 2, 4);
		root.add(new TextField(), 2, 5);
		root.add(new TextField(), 2, 6);
		
		root.add(new Button("Cancelar"), 1, 8);
		root.add(new Button("Salvar"), 2, 8);
		
		//SCENE
		Scene cena = new Scene(root, 400,320);
		
		//JOGANDO TUDO NO STAGE
		telaEmBranco.setTitle("Exemplo de GridPane");
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
