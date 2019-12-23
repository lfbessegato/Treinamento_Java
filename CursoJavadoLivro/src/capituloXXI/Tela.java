package capituloXXI;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela  extends JFrame {
	private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir;
	private JPanel painel;
	
	public Tela (String titulo) {
		super(titulo);
		lblNome = new JLabel("Nome: ");
		lblEmail = new JLabel("Email: ");
		
		txtNome = new JTextField(20);
		txtEmail = new JTextField(20);
		
		btnSalvar = new JButton("Salvar");
		btnExibir = new JButton("Exibir");
		
		painel = new JPanel();
		
		//GridLayout() � o gerenciador de layout
		//que trabalha a posi��o dos objetos em linhas e colunas
			
		painel.setLayout(new GridLayout(3,2));
		/* Na chamada ao construtor desse Gerenciador de Layout s�o 
		 * informados os n�meros de Linha (primeiro) e colunas (depois da v�rgula)
		 */
		painel.add(lblNome);
		painel.add(txtNome);
		painel.add(lblEmail);
		painel.add(txtEmail);
		painel.add(btnSalvar);
		painel.add(btnExibir);
		
		this.getContentPane().add(painel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Tela tela = new Tela("Tela organizada em Grid ");
	}

}
