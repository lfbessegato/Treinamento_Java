package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Qual é a nota1?");
		String resposta2 = JOptionPane.showInputDialog("Qual é a nota2");
		
		System.out.println(resposta1 + resposta2);
		
		// Conversão string em Double
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double total = nota1 + nota2;
		
		System.out.println(total / 2);
				
				
}

}
