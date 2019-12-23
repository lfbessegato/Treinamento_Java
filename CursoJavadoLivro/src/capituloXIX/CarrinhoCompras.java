package capituloXIX;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private List<Produto> listaProd = new ArrayList<Produto>();
	public void adicionar(Produto prod) {
		this.listaProd.add(prod);
	}
	
	public List<Produto> gerarLista() {
		return this.listaProd;
	}
	

}
