package CapituloVI;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Leitura5 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Calculando Parcelas do crediário ...");
		double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do Produto? "));
		int numParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em Quantas Parcelas? "));
		double valorParcelas = valorTotal / numParcelas;
		
		NumberFormat formato = new DecimalFormat("R$ ###,000.00");
		JOptionPane.showMessageDialog(null,"O Valor de cada parcela é: " + formato.format(valorParcelas));
	}

}
