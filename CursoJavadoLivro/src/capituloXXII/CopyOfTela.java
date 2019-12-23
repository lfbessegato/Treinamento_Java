package capituloXXII;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CopyOfTela extends JFrame implements ActionListener {
	private List<Contato> minhaLista = new ArrayList<Contato>();
	private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir;
	private JPanel painel;
	public CopyOfTela (String titulo) {
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
			CopyOfTela tela = new CopyOfTela ("Capítulo XXII");
	}
		
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExibir) {
			JOptionPane.showMessageDialog(this,  minhaLista);
		}
		else if (e.getSource() ==btnSalvar) {/* no caso de haver clicado em Salvar: */
			//Cria o objeto do tipo contato:
			Contato meuContato = new Contato();
			
			// POpula objeto:
			meuContato.setNome(txtNome.getText());
			meuContato.setEmail(txtEmail.getText());
			
			//Adiciona a lista de Contatos
			if (!txtNome.getText().isEmpty()) {
				minhaLista.add(meuContato);
				JOptionPane.showInputDialog(this, "Contato: " + txtNome.getText() + " adicionado com sucesso!");	
			}
			
			//Desfaz o objeto meuContato
			meuContato = null;
		}
	}
}
