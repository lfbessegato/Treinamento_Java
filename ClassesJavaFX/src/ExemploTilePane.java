import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class ExemploTilePane extends Application {
	@Override
	public void start(Stage telaEmBranco) {
		//PAINEL PRINCIPAL
		/* Primary Node, também chamado de Root Node */
		TilePane root = new TilePane();
		root.setVgap(5);
		root.setHgap(5);
		
		for(int i=1;i<6;i++) {
			root.getChildren().add(new Button("Botão"+i));
			root.getChildren().add(new TextField("Caixa de Texto"+i));
			root.getChildren().add(new Label("Rótulo"+i));
		}
		
		//SCENE
		Scene cena = new Scene(root,500,300);
		
		//JOGANDO TUDO NO STAGE
		telaEmBranco.setTitle("Exemplo de TilePane");
		
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
