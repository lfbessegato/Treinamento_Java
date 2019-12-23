package Fundamentos;

public class VariaveisEConstantes {
public static void main(String[] args) {
	
	double raio = 4.5;
	// 	Define a Constante
	
	final double PI = 3.1416;
	double area = PI * raio * raio;
	
	//concatena
	System.out.println("Área é " + area + " m².");
	
	// Imprimir de forma formatada (printf)
	System.out.printf("Área é %f m². \n", area);
	System.out.printf("Área é %.2f m².", area);
}
}
