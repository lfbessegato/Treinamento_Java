
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/* 
 * MVC: ESTE � O CONTTROLLER
 * O Controller � o intermedi�rio entre o View e o Model
 * � onde s�o colocadas as func��es invocadas pelo View 
 * que acessam o Model.
 */

public class calculaController {
	@FXML private TextField txtNota1;
	@FXML private TextField txtNota2;
	@FXML private TextField txtNota3;
	@FXML private TextField txtNota4;
	@FXML private Label lblResultado;
	@FXML private Button btnCalcular;
	@FXML private void handleCalcula(ActionEvent event) {
		try {
			Media m = new Media();
			m.addMedia(Double.parseDouble(txtNota1.getText()));
			m.addMedia(Double.parseDouble(txtNota2.getText()));
			m.addMedia(Double.parseDouble(txtNota3.getText()));
			m.addMedia(Double.parseDouble(txtNota4.getText()));
			
			lblResultado.setText(m.getMediaStr());
		} catch (NumberFormatException e) {
			lblResultado.setText("Informe valores n�mericos para todas as notas");
		} catch (Exception e) {
			lblResultado.setText("Erro: " + e.getMessage()); 
		}
	}
}
