package capituloXVII;

public class Principal {
	public static void main(String[] args) {
		Produto prod = new Produto();
		prod.setDescricao("Lote de Livros Didáticos");
		prod.calcularFrete(30);
		System.out.println(prod.getDescricao() + " serão entregues a um custo de R$ " + prod.getFrete());
		
		Produto prod2 = new Produto();
		prod2.setDescricao("Livros Oceanografia");
		prod2.calcularFrete('L'); // significando Litoral
		System.out.println(prod2.getDescricao() + " serão entregues a um custo de R$ " + prod2.getFrete());
		
	}

}
