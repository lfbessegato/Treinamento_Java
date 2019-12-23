package capituloIX;

import javax.swing.JOptionPane;

public class Fatorial {
	
	public static long fatorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		else {
			return num * fatorial(num-1);
		}
	}
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para Cálculo do Fatorial: "));
		long resposta = fatorial(num);
		System.out.println("O Fatorial de " + num + " é: " + resposta);
	}

}
