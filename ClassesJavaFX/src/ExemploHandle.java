import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExemploHandle extends Application {
	@Override
	public void start(Stage telaEmBranco) {
		//PAINEL PRINCIPAL
		/* Primary Node, Também chamado de Root Node */
		GridPane root = new GridPane();
		root.setVgap(10);
		
		/* Nodes dentro do root node */
		Label lblTitulo = new Label("Tratando eventos");
		Label lblMensagem = new Label();
		Button btnOk = new Button("OK");
		Button btnApagar = new Button("Apagar");
		
		root.add(lblTitulo, 0, 0);
		root.add(lblMensagem, 1, 3);
		root.add(btnOk, 1, 5);
		root.add(btnApagar, 1, 6);
		
		/* Tratando os eventos dos nodes */
		btnOk.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae) {
				lblMensagem.setText("Opa, quem clicou no botão [OK]?");
			}
		});
		
		btnApagar.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae) {
				lblMensagem.setText("");
			}
		});
		
		//SCENE
		Scene cena = new Scene(root,300,200);
		
		//JOGANDO TUDO NA STAGE
		telaEmBranco.setTitle("Exemplo de Handle");
		
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	
	}

}
