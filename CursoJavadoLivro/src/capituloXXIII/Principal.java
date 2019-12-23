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
	/* Aqui uma novidade: essa classe Principal é filha de JDialog, portanto é uma JDialog, sendo essa uma opção do
	 * analista/programador
	 */
	
	private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir, btnLimpar, btnVoltar;
	private JPanel painel;
	private boolean verificarEmail() {
		/* 
		 * Esse método simboliza a verificação de email
		 * válido ou não. A única coisa que está fazendo 
		 * é ver se tem o @ nessa string capturada em
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
		
		/* Aqui é muito importante observar que o 
		 * construtor tem três argumentos . o boolean
		 * modal quando receber o valor true (verdadeiro)
		 * fará esta janela surgir após o menu.java e então 
		 * só será possível voltar a janela anterior (do menu) 
		 * se for fechado, impossibilitando o usuário final 
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
			 * Se clicado o botão Exibir, é aberta uma janela
			 * para exibir os contatos que estão na memória.
			 * São mostrados todos os contatos componentes da lista
			 * e cada um deles executa automaticamente o método
			 * toString() sobreposto bem Contato.java para customizar e
			 * exibição de seus atributos
			 */
				
			JOptionPane.showMessageDialog(this, Contato.getMinhaLista());
		} else if (e.getSource() == btnSalvar){
			// no caso de haver clicado em Salvar:
			// Cria o objeto do tipo Contato:
			Contato meuContato = new Contato();
				
			//Popula o objeto:
			meuContato.setNome(txtNome.getText());
			meuContato.setEmail(txtEmail.getText());
				
			//Adiciona à lista de Contatos
			/*
			 * Se a caixa de texto não estiver vazia ...
			 * (repare no caracter de exclamação, que inverte 
			 * o valor lógico retornando pelo método isEmpty()
			 */
			if (!txtNome.getText().isEmpty()) {
				/* 
				 * O Contato somente será adicionado se o 
				 * método VerificarEmail() retornar verdadeiro
				 */
					
				if (verificarEmail()) {
					Contato.adiciona(meuContato);
					JOptionPane.showMessageDialog(this, "Contato: " + txtNome.getText() + " adicionado com sucesso");
				} else { 
					JOptionPane.showMessageDialog(this,"Esse email não é valido. Contato não adicionado");
				}
			}
			
			//Desfaz o objeto meuContato
			meuContato = null;
		}
		else if(e.getSource() == btnLimpar) {
			//Aqui são limpas as caixas de texto
			txtNome.setText(null);
			txtEmail.setText(null);
		} 
		else if (e.getSource() == btnVoltar) {
			/* 
			 * Quando o usuário clica no botão Voltar
			 * é perguntado se deseja excluir os contatos
			 * da memória (ainda não utilizamos banco de dados)
			 * se sim (JOptionPane.YES_OPTION) então a lista é limpa
			 */
				
			int confirma = JOptionPane.showConfirmDialog(this, "Quer excluir os contatos? ", "Capítulo IV", JOptionPane.YES_NO_OPTION);
			if (confirma == JOptionPane.YES_NO_OPTION) {
				Contato.limpar();
			}
				
			//Depois a janela é "escondida" nessa linha
			this.setVisible(true);
		}
	}
}
