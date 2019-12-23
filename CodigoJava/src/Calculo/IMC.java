package Calculo;

public class IMC {
	public static void main (String args[]){
		
		double peso;
		double altura;
		double imc;
		
		peso=92;
		altura=1.87;
		imc=(peso)/(altura*altura);
		
		System.out.println("Resultado do IMC: " + imc);
		
		if (imc<=18.5)
			System.out.println("Abaixo do peso normal");

		if (18.5 < imc && imc <= 25)
			System.out.println("Peso normal");

		if (25 < imc && imc<=30);
			System.out.println("Acima do peso normal");

		if( imc > 30);
			System.out.println("Obsidade");
	}
}