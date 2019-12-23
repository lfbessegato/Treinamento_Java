package capituloXXV;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdom2.JDOMException;

public class Principal extends JDialog implements ActionListener {
	/* Aqui uma novidade: essa classe Principal � filha de JDialog, portanto � uma JDialog, sendo essa uma op��o do
	 * analista/programador
	 */
	
	private JFrame frame;
	private JMenuBar barraMenu;
	private JMenu menuExibir;
	private JMenuItem menuTabela;
	private JLabel lblId, lblNome, lblEmail;
	private JTextField txtId, txtNome, txtEmail;
	private JButton btnSalvar, btnExibir, btnLimpar, btnVoltar,btnImportar,btnExportar;
	private JPanel painel;
	private TabelaContatos ptab = null;
	
	private boolean verificarEmail() {
		/* 
		 * Esse m�todo simboliza a verifica��o de email
		 * v�lido ou n�o. A �nica coisa que est� fazendo 
		 * � ver se tem o @ nessa string capturada em
		 * txtEmail.getText()
		 */
		
		boolean resp = false;
		if (txtEmail.getText().contains("@")) {
			resp = true;
		}
		return resp;
	}
	
	public Principal(JFrame frame, String titulo, boolean modal) {
		super(frame, titulo,modal);
		this.frame = frame;
		
		/* Criando a janela como JDialog e colocando true em modal,
		 * fica imposs�vel retornar ao menu sem fechar essa janela.
		 */
		
		barraMenu = new JMenuBar();
		menuExibir = new JMenu("Exibir");
		menuTabela = new JMenuItem("Tabela");
		menuTabela.addActionListener(this);
		menuExibir.add(menuTabela);
		barraMenu.add(menuExibir);
		
		this.setJMenuBar(barraMenu);
		
		lblId = new JLabel("C�digo: ");
		lblNome = new JLabel("Nome: ");
		lblEmail = new JLabel("Email: ");
		txtId = new JTextField(5);
		txtNome = new JTextField(20);
		txtEmail = new JTextField(20);
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(this);
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(this);
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(this);
		
		btnImportar = new JButton("Importar XML");
		btnImportar.addActionListener(this);
		btnExportar = new JButton("Exportar XML");
		btnExportar.addActionListener(this);
		
		painel = new JPanel();
		
		painel.setLayout(new GridLayout(6,2));
		painel.add(lblId);
		painel.add(txtId);
		painel.add(lblNome);
		painel.add(txtNome);
		painel.add(lblEmail);
		painel.add(txtEmail);
		painel.add(btnSalvar);
		painel.add(btnExibir);
		painel.add(btnLimpar);
		painel.add(btnVoltar);
		painel.add(btnImportar);
		painel.add(btnExportar);
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(painel,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setLocation(100,100);
		this.setVisible(true);
	}	
	public void actionPerformed(ActionEvent e) {
		Contato meuContato = null;
		
		if (e.getSource()== menuTabela) {
			if (ptab == null) {
				ptab = new TabelaContatos(this.frame, "Cap�tulo XXV", true); 
			} else {
				ptab.setVisible(true);
			}
		} else if (e.getSource() == btnExibir) {
				
			JOptionPane.showMessageDialog(this, Contato.getMinhaLista());
		} else if (e.getSource() == btnSalvar){
			// no caso de haver clicado em Salvar:
			// Cria o objeto do tipo Contato:
			meuContato = new Contato();
				
			//Popula o objeto:
			meuContato.setId(Integer.parseInt(txtId.getText()));
			meuContato.setNome(txtNome.getText());
			meuContato.setEmail(txtEmail.getText());
				
			//Adiciona � lista de Contatos
			/*
			 * Se a caixa de texto n�o estiver vazia ...
			 * (repare no caracter de exclama��o, que inverte 
			 * o valor l�gico retornando pelo m�todo isEmpty()
			 */
			if (!txtNome.getText().isEmpty()) {
				/* 
				 * O Contato somente ser� adicionado se o 
				 * m�todo VerificarEmail() retornar verdadeiro
				 */
					
				if (verificarEmail()) {
					Contato.adiciona(meuContato);
					JOptionPane.showMessageDialog(this, "Contato: " + txtNome.getText() + " adicionado com sucesso");
				} else { 
					JOptionPane.showMessageDialog(this,"Esse email n�o � valido. Contato n�o adicionado");
				}
			}
			
			//Desfaz o objeto meuContato
			meuContato = null;
		}
		else if(e.getSource() == btnLimpar) {
			//Aqui s�o limpas as caixas de texto
			txtId.setText(null);
			txtNome.setText(null);
			txtEmail.setText(null);
		} 
		else if (e.getSource() == btnVoltar) {
			/* 
			 * Quando o usu�rio clica no bot�o Voltar
			 * � perguntado se deseja excluir os contatos
			 * da mem�ria (ainda n�o utilizamos banco de dados)
			 * se sim (JOptionPane.YES_OPTION) ent�o a lista � limpa
			 */
				
			int confirma = JOptionPane.showConfirmDialog(this, "Quer excluir os contatos? ", "Cap�tulo XXV", JOptionPane.YES_NO_OPTION);
			if (confirma == JOptionPane.YES_NO_OPTION) {
				Contato.limpar();
			}
			this.setVisible(false);
		}
		else if (e.getSource() == btnImportar ) {
			System.out.println("Implementar Importa��o");
			
			try {
				TrabalharXML.lerXML();
			} catch (JDOMException e1) {
				System.out.println("Exce��o ao trabalhar com XML: " + e1.getMessage());
				
			} catch (IOException e1) {
				System.out.print("Exce��o ao trabalhar com Opera��o de Entrada/Sa�da: " + e1.getMessage());
			}
		}
		else if (e.getSource() == btnExportar) {
			System.out.println("Implementar Exporta��o");
			try {
				TrabalharXML.escreverXML();
			} catch (IOException e1) {
				System.out.println("Exce��o ao trabalhar com Opera��o de Entrada/Sa�da: " + e1.getMessage());
			}
		}
	}
}
