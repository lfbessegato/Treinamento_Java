package capituloXVIII;

public class Corredor extends Atleta {
	public void atualizarValor(double taxa) {
		this.setValorPatrocinio((this.getValorPatrocinio() * taxa / 100) + this.getValorPatrocinio());
	}
	
	private double velocidadeMedia;
	public double getVelocidadeMedia() {
		return this.velocidadeMedia;
	}
	
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
}
