package Classe;

public class Calculadora {
	double resultado;
	// Exemplo 1 Recebe entrada e envia saida
	double somar (double a, double b) {
		resultado = a + b;
		return resultado;
	}
	
	// Exemplo 2 Recebe entrada e n�o envia sa�da
	void acrescentar(double a) {
		resultado += a;
	} 
	
	// Exemplo 3 N�o recebe entrada e envia sa�da
	double obterResultado() {
		return resultado;
	}
	
	// Exemplo 4 N�o recebe entrada e nem S�ida.
	void limpar() {
		resultado = 0;
	}
}
