package classe;

// Classe carro.java
/**
 * Classe que define a estrutura de um carro
 * @see java.lang.object
 * @author Luciano Bessegato
 *
 */
public class Carro {
	public String cor;
	public String marca;
	public String modelo;

	/**
	 * M�todo Andar que imprime
	 * o valor String na Tela
	 * @see java.lang.String
	 */
	protected void andar() {
		ligar();
		System.out.println("Carro Andando ...");
	}
	/**
	 * M�todo parar que imprime
	 * o valor String na Tela
	 * @see java.lang.String
	 * 
	 */

	/**
	 * M�todo ligar que imprime
	 * o valor String na Tela
	 * @see java.lang.String
	 */
	protected void parar() {
		System.out.println("Carro Parado ...");
	}
	
	private void ligar() {
		System.out.println("Carro Ligado ...");
	}
}
