package Classe;

public class ValorxReferencia {
	static void porValor(double numero) {
		numero++;
	}
	
	static void porReferencia(Produto produto) {
		produto.preco++;
	}
	
	public static void main(String[] args) {
		double numero = 1;
		Produto produto = new Produto("Caneta",1);
		Produto produto2 = produto;
		produto2.nome = "Lapis";
		
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println(produto.preco);
		System.out.println(produto.nome);
	}

}
