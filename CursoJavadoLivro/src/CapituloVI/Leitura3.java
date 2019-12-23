package CapituloVI;

import java.util.Scanner;

public class Leitura3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = ler.next();

		System.out.println("Digite seu endereço: ");
		ler.nextLine();
		String endereco = ler.nextLine();

		System.out.print("Digite seu recado: ");
		String recado = ler.nextLine();

		System.out.println("Resultado: \n" + nome + "\n" + endereco + "\n" + recado);
	}

}
