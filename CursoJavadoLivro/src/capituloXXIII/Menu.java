package capituloXXIII;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Menu extends JFrame implements MenuListener, ActionListener {
	private JMenuBar barraMenu; //Essa é a barra de Menu
	
	//Em seguida os próprios menus
	private JMenu menuCadastro, menuSobre;
	
	//Aqui são declarados os subitens dos menus, que depois
	//Serão adicionados aos respectivos menus
	private JMenuItem menuContatos, menuSair;
	private Principal pcontatos = null;
	public Menu (String titulo) {
		super(titulo); /* Aqui é a chamada ao construtor da 
		superclasse, deve ser a primeira instruç do construtor */
		
		this.setBounds(100,100,456,112);
		iniciar();
	}
	
	public void iniciar() {
		//Instanciando os objetos
		barraMenu = new JMenuBar();
		menuCadastro = new JMenu("Cadastro");
		menuContatos = new JMenuItem("Contatos");
		menuSair = new JMenuItem("Sair");
		menuSobre = new JMenu("Sobre");
		
		//Agora são adicionados os listeners respectivos
		menuCadastro.addMenuListener(this);
		menuContatos.addActionListener(this);
		menuSair.addActionListener(this);
		menuSobre.addActionListener(this);
		menuCadastro.add(menuContatos);
		menuCadastro.add(menuSair);
		barraMenu.add(menuCadastro);
		barraMenu.add(menuSobre);
		
		//É configurada a barra de Menu
		this.setJMenuBar(barraMenu);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Menu ("Menu da Aplicação").setVisible(true);
		/* Aqui é instanciado o objeto do tipo Menu,
		 * o que é suficiente para abrir a Janela
		 * passado o título da mesma e configurado o 
		 * modo exibição como true
		 */
	}	
	
	public void actionPerformed(ActionEvent e) {
		/* Se for clicado o item Contatos, então é testado
		 * se já está criado o objeto da janela Principal e, 
		 * se já estiver criado apenas é tornado visível
		 * senão é criado (instanciado)
		 */
		if (e.getSource() == menuContatos) {
			if (pcontatos == null) {
				pcontatos = new Principal(this, "Capitulo XXIII", true);
			} else {
				pcontatos.setVisible(true);
			}	
		} else if (e.getSource() == menuSair) {
			System.exit(0);
		}
	}
	
	public void menuCanceled(MenuEvent e) {
		/* Aqui sera a programação que atenderia o presente evento
		 * Foi criado esse método para atender à necessidade de 
		 * implementar todos os métodos abstratos da interface
		 * MenuListener
		 */
	}
	
	public void menuDeselected(MenuEvent e) {
		/* Esse código acontece quando o menu
		 * "perde" o foco que estava sobre ele
		 * 
		 */
		
		if (e.getSource() == menuCadastro ) {
			System.out.println("Menu Cadastro deselecionado");
		} else if (e.getSource() == menuSobre) {
			System.out.println("Menu Sobre deselecionado");
		}
	}
	
	public void menuSelected(MenuEvent e) {
		/* Aqui são trabalhados os eventos de clique nos Menus
		 * propriamente ditos. Observe qye aqui só são tratados
		 * os menus de primeiro nível e não seus subitens ...
		 */
		
		if (e.getSource() == menuCadastro) {
			/* Aqui podem ser instanciados e chamadas outras
			 * janelas (filhas de JFrame) mas nesse exemplo
			 * apenas estamos exibindo mensagens com fins didáticos
			 */
			System.out.println("Menu Cadastro acionado");
		} else if (e.getSource() == menuSobre) {
			System.out.println("Menu Sobre acionado");
			JOptionPane.showMessageDialog(this, "Créditos Java Avançado");
		}
	}

}
