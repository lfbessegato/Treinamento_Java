package util;

public class NumeroRandomico {
	public static void main(String[] args) {
		int valorMin = 0;
		int valorMax = 10;
		
		int ranger = valorMax - valorMin;
		double valorRandomico;
		for (int i = 0; i < 10; i++) {
			valorRandomico = Math.random();
			System.out.println("o número entre " + valorMin + " e " + valorMax + " é: " + Math.round(valorMin + valorRandomico * ranger));
		}
	}

}
