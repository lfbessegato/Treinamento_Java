package capituloXIX;

import java.util.List;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.inserirDados();
		Produto produto2 = new Produto();
		produto2.inserirDados();
		Produto produto3 = new Produto();
		produto3.inserirDados();
		CarrinhoCompras minhaCompra = new CarrinhoCompras();
		minhaCompra.adicionar(produto1);
		minhaCompra.adicionar(produto2);
		minhaCompra.adicionar(produto3);
		List<Produto> listaLocal = minhaCompra.gerarLista();
		for (Produto prod: listaLocal) {
			JOptionPane.showMessageDialog(null, prod.toString());
		}
	}

}
