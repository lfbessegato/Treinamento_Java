
public class Divisao04 {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 0;
		
		System.out.println("Resultado da divisão de " + v1 + " e " + v2 + " -> " + dividir(v1,v2));
	}
	
	public static int dividir(int a, int b) {
		int r = 0;
		try {
			String[] s = new String[5];
			s[6]="Não existe este elemento da Array";
			r = a/b;
		}
		
		catch (ArithmeticException e) {
			System.out.println ("Aconteceu um erro aritmético. Detalhes: " + e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println("Aconteceu um erro. Não sei exatamente qual. Mas recebi a seguinte mensagem.");
			System.out.println(e.getMessage());
		}
			
		return r;
	}
		
}