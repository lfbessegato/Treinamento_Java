package Controles;

import java.util.Scanner;

public class WhileDterminado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		
		int indice = 0;
		while (indice < 3) {
			nota = scanner.nextDouble();
			somaDasNotas += nota;
			indice++;
		}
		scanner.close();
		System.out.printf("A m�dia � %.2f", somaDasNotas / 3);
	}

}
