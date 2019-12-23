import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ExemploPane extends Application{
	@Override
	public void start(Stage telaEmBranco) {
		
		//PAINEL E SEUS NODES
		
		/* Criar o painel */
		BorderPane painel = new BorderPane();
		
		/* Criar o node círculo */
		Circle cabeca = new Circle(135,60,35);
		
		/* Criar nodes de retangulo */
		Rectangle tronco = new Rectangle(100,100,70,90);
		Rectangle bracoEsquerdo = new Rectangle(70,100,25,75);
		Rectangle bracoDireito = new Rectangle(175,100,25,75);
		Rectangle pernaEsquerda = new Rectangle(100,195,30,80);
		Rectangle pernaDireita = new Rectangle(140,195,30,80);
		
		/* Que tal um pouco de cor? */
		cabeca.setFill(Color.RED);
		tronco.setFill(Color.ORANGE);
		bracoEsquerdo.setFill(Color.BLUE);
		bracoDireito.setFill(Color.BLUE);
		
		/* Adicionar nodes no painel */
		painel.getChildren().add(cabeca);
		painel.getChildren().add(bracoEsquerdo);
		painel.getChildren().add(tronco);
		painel.getChildren().add(bracoDireito);
		painel.getChildren().add(pernaEsquerda);
		painel.getChildren().add(pernaDireita);
		
		//SCENE
		Scene cena = new Scene(painel, 280,330);
		
		//JOGANDO TUDO NO STAGE
		telaEmBranco.setTitle("Exemplo de Pane");
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
