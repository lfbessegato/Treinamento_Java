package Calculo;
public class TerceiroPrograma {
	public static void main (String args[]) {
		
		double boletoValor;
		double valorMulta;
		double valorTotal;
		
		boletoValor=450;
		valorMulta=boletoValor*0.10;
		valorTotal=boletoValor+valorMulta;
		
		System.out.println("Valor do seu boleto: " + boletoValor);
		System.out.println("Percentual da multa: 10%");
		System.out.println("Valor da multa: " + valorMulta);
		System.out.println("Total a pagar: " + valorTotal);
	}
}