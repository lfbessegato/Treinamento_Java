package Fundamentos;

public class VariaveisEConstantes {
public static void main(String[] args) {
	
	double raio = 4.5;
	// 	Define a Constante
	
	final double PI = 3.1416;
	double area = PI * raio * raio;
	
	//concatena
	System.out.println("�rea � " + area + " m�.");
	
	// Imprimir de forma formatada (printf)
	System.out.printf("�rea � %f m�. \n", area);
	System.out.printf("�rea � %.2f m�.", area);
}
}
