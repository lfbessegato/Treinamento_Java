import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InterfaceIMC extends Application{
	
	@Override
	public void start(Stage telaEmBranco)throws Exception {
	
		//PRIMARY NODE - GRID
		GridPane primaryNode = new GridPane();
		
		//primaryNode.setGridLinesVisible(true);
		
		primaryNode.setAlignment(Pos.CENTER);
		primaryNode.setHgap(20);
		primaryNode.setVgap(15);
		primaryNode.setPadding(new Insets(5));
		
		
		// NODE
		Label lblPeso = new Label("Peso: ");
		Label lblAltura = new Label("Altura: ");
		Label lblMensagem = new Label("Seu IMC é: ");
		
		TextField txtPeso = new TextField();
		TextField txtAltura = new TextField();
		
		Button btnCalcular = new Button("Calcular");
		
		primaryNode.add(lblPeso, 0, 0);
		primaryNode.add(txtPeso, 1, 0);
		
		primaryNode.add(lblAltura, 0, 2);
		primaryNode.add(txtAltura, 1, 2);
		
		primaryNode.add(btnCalcular, 1, 4);
		primaryNode.add(lblMensagem, 1, 6);
		
		//SCENE
		Scene cena = new Scene(primaryNode,280,300);
		
		//JOGANDO TUDO NO STAGE
		telaEmBranco.setTitle("Cálculo de IMC");
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
		
		//ADICIONANDO OS HANDLES PARA OS EVENTOS
		/* Botão Calcular */
		btnCalcular.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				double peso;
				double altura;
				double resultado;
				
				peso = Double.parseDouble(txtPeso.getText());
				altura = Double.parseDouble(txtAltura.getText());
				resultado = peso / (altura*altura);
				lblMensagem.setText("Seu IMC é: " + resultado);
			}
		});
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	
	
	
	
}
