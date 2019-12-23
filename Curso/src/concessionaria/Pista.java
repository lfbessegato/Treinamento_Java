package concessionaria;
// Classe Pista.java
public class Pista {
	public static void main(String[] args) {
		Carro carroDeCorrida = new Carro();
		Carro carroDePasseio = new Carro();
		carroDeCorrida.velocidadeMaxima = 300;
		carroDePasseio.velocidadeMaxima = 60;
		carroDeCorrida.mostrarVelocidadeMaxima();
		carroDePasseio.mostrarVelocidadeMaxima();
		
		Carro novoCarro = carroDeCorrida;
		carroDeCorrida.mostrarVelocidadeMaxima();
		carroDePasseio.mostrarVelocidadeMaxima();
		novoCarro.mostrarVelocidadeMaxima();
	}
}
