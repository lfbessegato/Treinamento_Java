package capituloXX;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
public class Tela extends Frame {
	private Label lblNome, lblEmail;
	private TextField txtNome, txtEmail;
	private Button btnSalvar, btnExibir;
	private Panel painel;
	
	public Tela (String titulo) {
		super(titulo);
		lblNome = new Label("Nome: ");
		lblEmail = new Label("Email: ");
		
		txtNome = new TextField(20);
		txtEmail = new TextField(20);
		
		btnSalvar = new Button("Salvar");
		btnExibir = new Button("Exibir");
		
		painel = new Panel();
		
		//FlowLayout() é o gerenciador de layout padrão
		//É ele que é assumido quando nenhum gerenciador for escolhido 
		//Ele coloca os objetos em uma linha
		
		painel.setLayout(new FlowLayout());
		painel.add(lblNome);
		painel.add(txtNome);
		painel.add(lblEmail);
		painel.add(txtEmail);
		painel.add(btnSalvar);
		painel.add(btnExibir);
		
		//This.setLayout(new FlowLayout());
		this.add(painel);
		this.pack();
	}
	
	public static void main(String[] args) {
		Tela tela = new Tela("Segundo Livro");
		tela.setVisible(true);
	}
}
