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
	/* Aqui uma novidade: essa classe Principal é filha de JDialog, portanto é uma JDialog, sendo essa uma opção do
	 * analista/programador
	 */
	
	private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir, btnLimpar, btnVoltar,btnImportar,btnExportar;
	//Aqui foram adcionados os botões btnImportar e btnExportar
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
		/* Abaixo está a criação dos dois novos botões 
		 * (para a manipulação do XML) que serão adicionados ao painel e, consequentemente, á janela.
		 * Também vemos em ambos a instrução que os associa aos Listeners.
		 * Nota importante: Quando a própria classe gráfica implementa a interface ActionListener, ao 
		 * adicioná-los basta a palavra-chave this.
		 */
		btnImportar = new JButton("Importar XML");
		btnImportar.addActionListener(this);
		btnExportar = new JButton("Exportar XML");
		btnExportar.addActionListener(this);
		
		painel = new JPanel();
		/* 
		 * o Layout Manager (Gerenciados de Layout)
		 * escolhido foi o GridLayout(5,2) e note que 
		 * nesse capítulo foi adicionado um linha para 
		 * os novos botões.
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
		 * Na linha abaixo, configuração de ação
		 * ao fechar a janela é a constante DISPOSE_ON_CLOSE.
		 * e ela foi escolhida, pois queremos apenas fechar
		 * essa JDialog e voltar ao menu da aplicação (quando desejado).
		 * Ou seja, a palavra DISPOSE não encerra a aplicação inteira
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
			meuContato = new Contato();
				
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
				
			int confirma = JOptionPane.showConfirmDialog(this, "Quer excluir os contatos? ", "Capítulo XXIV", JOptionPane.YES_NO_OPTION);
			if (confirma == JOptionPane.YES_NO_OPTION) {
				Contato.limpar();
			}
			this.setVisible(false);
		}
		else if (e.getSource() == btnImportar ) {
			System.out.println("Implementar Importação");
			/* 
			 * Bloco try ... catch() usado para tratar a 
			 * excecao a que está sujeito o código (declarada
			 * pelo throws  no arquivo TrabalharXML.java. 
			 * E que são decorrentes de erros como se 
			 * alguém apagar o arquivoXML do diretório 
			 * especificado, ou se estiver corrompido.
			 */
			try {
				TrabalharXML.lerXML();
			} catch (JDOMException e1) {
				/* Caso seja disparada uma excecao do tipo
				 * JDOMException, ela será tratada aqui com 
				 * o nome de objeto e1 e será mostrada sua 
				 * mensagem original.
				 */
				System.out.println(e1.getMessage());
				
			} catch (IOException e1) {
				/* Já se houver uma excecao de Entrada e Saída,
				 * seu tratamento se dará aqui. Esse método 
				 * printStackTrace do objeto e1 mostra a 
				 * sequencia dos códigos envolvidos com a excecao. 
				 */
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == btnExportar) {
			System.out.println("Implementar Exportação");
			try {
				TrabalharXML.escreverXML();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
