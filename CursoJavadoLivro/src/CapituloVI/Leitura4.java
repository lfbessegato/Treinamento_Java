package CapituloVI;

import javax.swing.JOptionPane;

public class Leitura4 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "A Seguir digite seus dados");
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showMessageDialog(null, "Bom dia " + nome);
	}

}
