
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClassesJavaFX extends Application {
	@Override
	public void start(Stage telaEmBranco) {
	
		// NODE ISOLADO
		Label labelA = new Label("Eu sou um label isolado");
	
		//BRANCH NODE A
		Label labelB = new Label("Eu sou o primeiro label do Grupo A");
		labelB.setLayoutX(0);
		labelB.setLayoutY(0);
	
		Label labelC = new Label("Eu sou o segundo label do Grupo A");
		labelC.setLayoutX(0);
		labelC.setLayoutY(20);
	
 
		Group grupoA = new Group();
		grupoA.getChildren().add(labelB);
		grupoA.getChildren().add(labelC);
	
		// BRANCH NODE B
		Label labelD = new Label("Eu sou o primeiro label do grupo B");
		labelD.setLayoutX(0);
		labelD.setLayoutY(0);
	
		// Node
		Label labelE = new Label("Eu sou o segundo label do Grupo B");
		labelE.setLayoutX(0);
		labelE.setLayoutY(20);
	
		Group grupoB = new Group();
		grupoB.getChildren().add(labelD);
		grupoB.getChildren().add(labelE);
	
		// PRIMARY NODE
		FlowPane primaryNode=new FlowPane(Orientation.VERTICAL);
		primaryNode.getChildren().add(labelA);
		primaryNode.getChildren().add(grupoA);
		primaryNode.getChildren().add(grupoB);
	
		//SCENE
		Scene cena = new Scene(primaryNode, 400, 300);
	
		telaEmBranco.setTitle("Inter-relação entre classes JavaFX");
		
		// JOGANDO TUDO NO STAGE
		telaEmBranco.setScene(cena);
		telaEmBranco.sizeToScene();
		telaEmBranco.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	

}
