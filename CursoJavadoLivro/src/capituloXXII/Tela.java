package capituloXXII;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener {
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
		btnSalvar.addActionListener(this);
		btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(this);
		painel = new JPanel();
		painel.setLayout(new GridLayout(3,2));
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
		Tela tela = new Tela ("Tela Organizada em Grid");
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExibir) {
			JOptionPane.showMessageDialog(this,  "Nome: " + txtNome.getText());
		}
		else {
			JOptionPane.showInputDialog(this, "O botão clicado foi o: " + e.getActionCommand());	
		}
	}
}
