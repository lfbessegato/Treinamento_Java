package capituloIX;

import javax.swing.JOptionPane;

public class FatorialComWhile {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para C�lculo do Fatorial: "));
		long resposta = 1;
		while ( num > 1) {
			resposta = resposta * num;
			num --;
		}
		
		System.out.println("O Fatorial �: " + resposta);
	}

}
