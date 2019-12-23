import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ExemploAnchorPane extends Application {
	@Override
	public void start(Stage telaEmBranco) {
		//FILHOS DE BorderPane
		/* HBox para o Topo */
		HBox opcoes = new HBox(4);
		opcoes.getChildren().add(new Button("Opção 1"));
		opcoes.getChildren().add(new Button("Opção 2"));
		
		//Botões para as Laterais */
		Button btnEsquerda = new Button("Esquerda");
		Button btnDireita = new Button("Direita");
		
		/* Caixa de texto para o centro */
		TextField txtCentro = new TextField();
		
		/* Rótulo para o rodapé */
		Label lblRodape = new Label("Sistema Construído em: Século XXI");
		
		//PAINEL PRINCIPAL
		/* Primary Node, também chamado de Root Node */
		AnchorPane root = new AnchorPane();
		AnchorPane.setTopAnchor(opcoes,10.0);
		AnchorPane.setLeftAnchor(btnEsquerda,10.0);
		AnchorPane.setRightAnchor(btnDireita,10.0);
		AnchorPane.setTopAnchor(txtCentro,80.0);
		AnchorPane.setBottomAnchor(lblRodape,10.0);
		
		root.getChildren().add(opcoes);
		root.getChildren().add(btnEsquerda);
		root.getChildren().add(btnDireita);
		root.getChildren().add(txtCentro);
		root.getChildren().add(lblRodape);
		
		
		//SCENE
		Scene cena = new Scene(root,300,300);
		
		//JOGANDO TUDO NO STAGE
		telaEmBranco.setTitle("Exemplo de AnchorPane");
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}
