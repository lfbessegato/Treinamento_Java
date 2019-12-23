package capituloXVIII;

public class MountainBike extends Ciclista{
	public void atualizarValor(double taxa) {
		this.setValorPatrocinio((this.getValorPatrocinio() * taxa / 100) + this.getValorPatrocinio());
	}
}
