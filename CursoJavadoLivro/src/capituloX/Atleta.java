package capituloX;

public class Atleta {
	public int codigo;
	public String nome;
	public String esporte;
	public double valorPatrocinio;
	public void atualizarValor(double taxa) {
		this.valorPatrocinio = this.valorPatrocinio + (this.valorPatrocinio * taxa / 100);
	}
	

}
