package Classe;

public class Calculadora {
	double resultado;
	// Exemplo 1 Recebe entrada e envia saida
	double somar (double a, double b) {
		resultado = a + b;
		return resultado;
	}
	
	// Exemplo 2 Recebe entrada e não envia saída
	void acrescentar(double a) {
		resultado += a;
	} 
	
	// Exemplo 3 Não recebe entrada e envia saída
	double obterResultado() {
		return resultado;
	}
	
	// Exemplo 4 Não recebe entrada e nem Sáida.
	void limpar() {
		resultado = 0;
	}
}
