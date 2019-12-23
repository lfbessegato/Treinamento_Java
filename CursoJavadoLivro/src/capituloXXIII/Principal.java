package capituloXXIII;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal extends JDialog implements ActionListener {
	/* Aqui uma novidade: essa classe Principal � filha de JDialog, portanto � uma JDialog, sendo essa uma op��o do
	 * analista/programador
	 */
	
	private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir, btnLimpar, btnVoltar;
	private JPanel painel;
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
		
		/* Aqui � muito importante observar que o 
		 * construtor tem tr�s argumentos . o boolean
		 * modal quando receber o valor true (verdadeiro)
		 * far� esta janela surgir ap�s o menu.java e ent�o 
		 * s� ser� poss�vel voltar a janela anterior (do menu) 
		 * se for fechado, impossibilitando o usu�rio final 
		 * de chegar ao menu novamente sem sair da atual janela 
		 * 
		 */
		
		lblNome = new JLabel("Nome: ");
		lblEmail = new JLabel("Email: ");
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
		painel = new JPanel();
		painel.setLayout(new GridLayout(4,2));
		painel.add(lblNome);
		painel.add(txtNome);
		painel.add(lblEmail);
		painel.add(txtEmail);
		painel.add(btnSalvar);
		painel.add(btnExibir);
		painel.add(btnLimpar);
		painel.add(btnVoltar);
		this.getContentPane().add(painel);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setLocation(100,100);
		this.setVisible(true);
	}	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExibir) {
			/* 
			 * Se clicado o bot�o Exibir, � aberta uma janela
			 * para exibir os contatos que est�o na mem�ria.
			 * S�o mostrados todos os contatos componentes da lista
			 * e cada um deles executa automaticamente o m�todo
			 * toString() sobreposto bem Contato.java para customizar e
			 * exibi��o de seus atributos
			 */
				
			JOptionPane.showMessageDialog(this, Contato.getMinhaLista());
		} else if (e.getSource() == btnSalvar){
			// no caso de haver clicado em Salvar:
			// Cria o objeto do tipo Contato:
			Contato meuContato = new Contato();
				
			//Popula o objeto:
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
				
			int confirma = JOptionPane.showConfirmDialog(this, "Quer excluir os contatos? ", "Cap�tulo IV", JOptionPane.YES_NO_OPTION);
			if (confirma == JOptionPane.YES_NO_OPTION) {
				Contato.limpar();
			}
				
			//Depois a janela � "escondida" nessa linha
			this.setVisible(true);
		}
	}
}
