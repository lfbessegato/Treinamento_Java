package fundamentos;

import java.util.Scanner;

//QuartoPrograma
public class QuartoPrograma {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		
		// Lendo o número digitado no teclado
		int valor = entrada.nextInt();
		System.out.println("o número digitado: " + valor);				
	}

}
