package Classe;

public class Produto {
	String nome;
	double preco;
	static double desconto;
	
	Produto () {
		
	}
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	double precoComDesconto() {
		return preco - preco * desconto;
	}
}
