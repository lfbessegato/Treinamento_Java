package TestesMatematicos;
public class TesteConversaoAvancado {
	public static void main(String[] args) {
		double valorDec = 3;
		int valorInt=(int)valorDec;
		
		System.out.println("Divisão do decimal: " +valorDec/2);
		System.out.println("Divisão do inteiro: " +valorInt/2);
		
		if (valorDec/2 == valorInt/2) 
			System.out.println("Mesmo resultado.");
		else
			System.out.println("Resultados diferentes.");
	
	}
}
