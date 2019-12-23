package capituloXIV;

public class Corredor extends Atleta{
	public double atualizarValor(double taxa) {
		// return super.atualizarValor(2 * taxa);
		double valorPatrocinio = this.getValorPatrocinio();
		taxa = taxa * 2;
		valorPatrocinio = valorPatrocinio * taxa / 100;
		return this.getValorPatrocinio();
	}
	
	private double velocidadeMedia;
	public double getVelocidadeMedia() {
		return this.velocidadeMedia;
	}
	
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

}
