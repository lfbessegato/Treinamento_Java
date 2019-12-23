package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import model.Criptografia;

public class CriptoController {
	
	@FXML private TextArea txtaOriginal;
	@FXML private TextArea txtaFinal;
	@FXML private Button btnCripto;
	@FXML private Button btnFechar;
	@FXML private Button btnDecripto;
	@FXML private Label lblMensagem;
	
	@FXML private void handleCripto(ActionEvent event) throws Exception {
		try {
			if (txtaOriginal.getLength()>0) {
				lblMensagem.setText("Mensagem:");
				Criptografia cripto=new Criptografia();
				String sOriginal=txtaOriginal.getText();
				sOriginal=cripto.criptografia(sOriginal);
				
				txtaFinal.setText(sOriginal);
				txtaOriginal.setText("");
			}
			else {
				lblMensagem.setText("Mensagem: Nehuma mensagem aberta foi informada.");
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@FXML private void handleDecripto(ActionEvent event) throws Exception {
		try {
			if (txtaFinal.getLength()>0) {
				lblMensagem.setText("Mensagem:");
				Criptografia cripto = new Criptografia();
				String sFinal=txtaFinal.getText();
				sFinal=cripto.decriptografia(sFinal);
				txtaOriginal.setText(sFinal);
				txtaFinal.setText("");
			} else {
				lblMensagem.setText("Mensagem: Nenhuma mensagem criptografada foi informada.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@FXML private void handleClose(ActionEvent event) throws Exception {
		System.exit(0);
	}

}
