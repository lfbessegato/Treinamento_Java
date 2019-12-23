package capituloXV;

import javax.swing.JOptionPane;

public class TesteProduto {
	public static void main(String[] args) {
		Produto produto = new Produto();
		String descricao = JOptionPane.showInputDialog("Digite a Descrição ");
		
		System.out.println("Nome do Produto: " + descricao + "\nData de Fabricação: " + "28/03/1977");
	}

}
