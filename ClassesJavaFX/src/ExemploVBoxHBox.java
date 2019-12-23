import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class ExemploVBoxHBox extends Application{
	@Override
	public void start(Stage telaEmBranco) {
		//PAINEL E SEUS NODES
		
		/* Criar o painel */
		//HBox painel = new HBox();
		VBox painel = new VBox();
		painel.setSpacing(4);
				
		/* Colocar nodes dentro do pane */
		for (int i=1;i<8;i++) {
			Button b=new Button("x"+i);
			b.setPrefWidth(50);
			painel.getChildren().add(b);
		}
		
		//SCENE
		Scene cena = new Scene(painel, 300,300);
		
		//JOGANDO TUDO NO STAGE
		telaEmBranco.setTitle("Exemplo de FlowPane");
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
