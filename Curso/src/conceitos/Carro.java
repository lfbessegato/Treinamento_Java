package conceitos;

import java.util.Scanner;

//Classe Carro.java
public class Carro {
	//atributos
	private Boolean chave = true;
	
	//M�todos Construtores
	
	
	public Carro() {
		setChave(true);
	}
	
	/**
	 * Construtor Carro
	 * @param chave
	 * @throws Sem exce��es
	 * 
	 */
	public Carro(Boolean chave) {
		setChave(chave);
	}
	
	//M�todos de Encapsulamento
	private void setChave(Boolean status) {
		this.chave = status;
	}
	
	private Boolean getChave() {
		return this.chave;
	}
	
		
	//M�todos Funcionamento
	public void ligar() {
		setChave(true);
		System.out.println("### LIGADO ###");
	}
		
	public void desligar() {
		setChave(false);
		System.out.println("### DESLIGADO ###");
	}
	
	//M�todo Destrutor
	protected void finalize() {
		chave = null;
	}
	
	// M�todo Execut�vel
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
  