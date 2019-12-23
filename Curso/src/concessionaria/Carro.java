
package concessionaria;
// Classe carro.java

import concessionaria.Pessoa;

public class Carro {
	// Atributos
	int velocidadeMaxima = 50;
	Pessoa proprietario = new Pessoa();
	
	//Métodos
	public void mostrarVelocidadeMaxima() {
		proprietario.dirigir();
		System.out.println(velocidadeMaxima);
	}

}
