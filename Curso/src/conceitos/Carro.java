package conceitos;

import java.util.Scanner;

//Classe Carro.java
public class Carro {
	//atributos
	private Boolean chave = true;
	
	//Métodos Construtores
	
	
	public Carro() {
		setChave(true);
	}
	
	/**
	 * Construtor Carro
	 * @param chave
	 * @throws Sem exceções
	 * 
	 */
	public Carro(Boolean chave) {
		setChave(chave);
	}
	
	//Métodos de Encapsulamento
	private void setChave(Boolean status) {
		this.chave = status;
	}
	
	private Boolean getChave() {
		return this.chave;
	}
	
		
	//Métodos Funcionamento
	public void ligar() {
		setChave(true);
		System.out.println("### LIGADO ###");
	}
		
	public void desligar() {
		setChave(false);
		System.out.println("### DESLIGADO ###");
	}
	
	//Método Destrutor
	protected void finalize() {
		chave = null;
	}
	
	// Método Executável
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Carro novoCarro = new Carro();
		
		System.out.println("Digite 1 para Ligar e 2 para Desligar");
	
		int opcao = scn.nextInt();
		
		switch(opcao) {
		case 1: novoCarro.ligar();
				break;
				
		case 2: novoCarro.desligar();
				break;
		}
	}
}
  