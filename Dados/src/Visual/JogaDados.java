package Visual;
import Classes.Dado;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JogaDados extends Application{
	
	//ATRIBUTOS DA CLASSE
	int acertos = 0;
	int tentativas = 0;
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage telaEmBranco) {
		
		//NODES
		/* Imagem */
		Image img = new Image("Img\\dados.png");
		ImageView imgDado = new ImageView(img);
		imgDado.setPreserveRatio(true);
		imgDado.setFitWidth(80);
		
		/* Labels */
		Label lblTitulo = new Label("JOGANDO DADOS");
		Label lblOrientacao = new Label("Escolha um Número:");
		
		Label lblResultado1Titulo = new Label("Dado 1");
		Label lblResultado2Titulo = new Label("Dado 2");
		
		Label lblResultado1 = new Label();
		Label lblResultado2 = new Label();
		Label lblResultadoMensagem = new Label();
		Label lblDesempenho = new Label();
		
		/* Caixa de texto */
		TextField txtAposta = new TextField();
		
		/* Botoes */
		Button btnJogarDados = new Button("Jogar Dados!");
		btnJogarDados.setDefaultButton(true);
		
		/* Root node */
		GridPane grdTela = new GridPane();
		grdTela.setHgap(10);
		grdTela.setVgap(10);
		
		grdTela.add(imgDado, 1,0);
		grdTela.add(lblTitulo, 2, 0);
		grdTela.add(lblOrientacao, 2, 1);
		grdTela.add(txtAposta, 2, 2);
		grdTela.add(btnJogarDados, 2, 3);
		grdTela.add(lblResultado1Titulo,1,4);
		grdTela.add(lblResultado2Titulo, 3, 4);
		grdTela.add(lblResultado1, 1, 5);
		grdTela.add(lblResultado2, 3, 5);
		grdTela.add(lblResultadoMensagem, 1, 6,3,1);
		grdTela.add(lblDesempenho, 1, 8,3,1);
		
		//SCENE
		Scene cena = new Scene(grdTela,310,300);
		
		//JOGANDO TUDO NO STAGE
		telaEmBranco.setTitle("Jogo de Dados");
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
		
		//TRATANDO OS EVENTOS
		btnJogarDados.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				Dado d1 = new Dado();
				Dado d2 = new Dado();
				int resultado;
				d1.executaJogo();
				lblResultado1.setText(String.valueOf(d1.getResultado()));
				
				d2.executaJogo();
				lblResultado2.setText(String.valueOf(d2.getResultado()));
				
				resultado = d1.getResultado()+d2.getResultado();
				tentativas ++;
				
				if(resultado == Integer.parseInt(txtAposta.getText())) {
					lblResultadoMensagem.setText("Parabéns, o resultado foi " + resultado + ". Você acertou!");
					acertos ++;
				} else {
					lblResultadoMensagem.setText("Que pena, o resultado foi " + resultado + ". Continue Tentando.");
					lblDesempenho.setText("Sua proporção de acertos é de " + acertos + " para " + tentativas);
				}
			}
		});
	}
}
