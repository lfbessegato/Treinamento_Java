package capituloXIX;

import javax.swing.JOptionPane;

public class Livro  extends Produto implements Comercializavel {
	public void entregar() {
		String local = JOptionPane.showInputDialog("Qual o endere�o de entrega? ");
		System.out.println("Entregando livro em: " + local);
	}
	
	public void receber() {
		String opcao = JOptionPane.showInputDialog("Qual a forma de pagamento? ");
		System.out.println("Recebendo pagamento do livro por: " + opcao);
	}
}
