import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class ExemploFlowPane extends Application {
	@Override
	public void start(Stage telaEmBranco) {
		
		//PAINEL E SEUS NODES
		
		/* Criar o Painel */
		FlowPane painel = new FlowPane();
		painel.setOrientation(Orientation.VERTICAL);
		painel.setVgap(4);
		painel.setHgap(10);
		
		/* Colocar nodes dentro do pane */
		
		for (int i=1;i<51;i++) {
			Button b=new Button("B"+i);
			b.setPrefWidth(50);
			painel.getChildren().add(b);
		}
		
		//SCENE
		Scene cena = new Scene(painel, 300, 300);
		
		//JOGANDO TUDO NO STAGE
		telaEmBranco.setTitle("Exemplo de Flow Pane");
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
