package fundamentos;

import java.util.Scanner;

// Exemplo DoWhile.java
public class ExemploDoWhile {
	public static void main(String[] args) {
		int min, max;
		Scanner entradas = new Scanner(System.in);
		System.out.println("Digite o valor m�nimo: ");
		min = entradas.nextInt();
		System.out.println("Digite o valor m�ximo: ");
		max = entradas.nextInt();
		do {
			System.out.println(" " + min + " < " + max);
			min++;
			max--;
		} while ( min < max);
		System.out.println(" " + min + " < " + max + " Condi��o Inv�lida."); 
	}

}
