package capituloXVII;

public class Produto2 {
	private int codigo;
	private double preco;
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double calcularFrete(int km) {
		double valor = km * 1.05;
		return valor;
	}
}
