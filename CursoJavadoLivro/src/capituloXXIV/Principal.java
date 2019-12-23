package capituloXXIV;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import org.jdom2.JDOMException;

public class Principal extends JDialog implements ActionListener {
	/* Aqui uma novidade: essa classe Principal � filha de JDialog, portanto � uma JDialog, sendo essa uma op��o do
	 * analista/programador
	 */
	
	private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir, btnLimpar, btnVoltar,btnImportar,btnExportar;
	//Aqui foram adcionados os bot�es btnImportar e btnExportar
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
		/* Abaixo est� a cria��o dos dois novos bot�es 
		 * (para a manipula��o do XML) que ser�o adicionados ao painel e, consequentemente, � janela.
		 * Tamb�m vemos em ambos a instru��o que os associa aos Listeners.
		 * Nota importante: Quando a pr�pria classe gr�fica implementa a interface ActionListener, ao 
		 * adicion�-los basta a palavra-chave this.
		 */
		btnImportar = new JButton("Importar XML");
		btnImportar.addActionListener(this);
		btnExportar = new JButton("Exportar XML");
		btnExportar.addActionListener(this);
		
		painel = new JPanel();
		/* 
		 * o Layout Manager (Gerenciados de Layout)
		 * escolhido foi o GridLayout(5,2) e note que 
		 * nesse cap�tulo foi adicionado um linha para 
		 * os novos bot�es.
		 */
		painel.setLayout(new GridLayout(5,2));
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
		this.getContentPane().add(painel);
		/* 
		 * Na linha abaixo, configura��o de a��o
		 * ao fechar a janela � a constante DISPOSE_ON_CLOSE.
		 * e ela foi escolhida, pois queremos apenas fechar
		 * essa JDialog e voltar ao menu da aplica��o (quando desejado).
		 * Ou seja, a palavra DISPOSE n�o encerra a aplica��o inteira
		 * como faria EXIT_ON_CLOSE.
		 */
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setLocation(100,100);
		this.setVisible(true);
	}	
	public void actionPerformed(ActionEvent e) {
		Contato meuContato = null;
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
			meuContato = new Contato();
				
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
			else {
				try {
					throw new MinhaExcecao();
				} catch (MinhaExcecao ex) {
					System.out.println(ex.getMessage());
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
				
			int confirma = JOptionPane.showConfirmDialog(this, "Quer excluir os contatos? ", "Cap�tulo XXIV", JOptionPane.YES_NO_OPTION);
			if (confirma == JOptionPane.YES_NO_OPTION) {
				Contato.limpar();
			}
			this.setVisible(false);
		}
		else if (e.getSource() == btnImportar ) {
			System.out.println("Implementar Importa��o");
			/* 
			 * Bloco try ... catch() usado para tratar a 
			 * excecao a que est� sujeito o c�digo (declarada
			 * pelo throws  no arquivo TrabalharXML.java. 
			 * E que s�o decorrentes de erros como se 
			 * algu�m apagar o arquivoXML do diret�rio 
			 * especificado, ou se estiver corrompido.
			 */
			try {
				TrabalharXML.lerXML();
			} catch (JDOMException e1) {
				/* Caso seja disparada uma excecao do tipo
				 * JDOMException, ela ser� tratada aqui com 
				 * o nome de objeto e1 e ser� mostrada sua 
				 * mensagem original.
				 */
				System.out.println(e1.getMessage());
				
			} catch (IOException e1) {
				/* J� se houver uma excecao de Entrada e Sa�da,
				 * seu tratamento se dar� aqui. Esse m�todo 
				 * printStackTrace do objeto e1 mostra a 
				 * sequencia dos c�digos envolvidos com a excecao. 
				 */
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == btnExportar) {
			System.out.println("Implementar Exporta��o");
			try {
				TrabalharXML.escreverXML();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
