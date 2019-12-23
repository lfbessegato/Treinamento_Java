package tratamento;

public class Excecao {
	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		int c = 0;
		
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Problemas na operação");
			System.out.println(e);
		}
		finally {
			System.out.println("Operação Finalizada");
		}
	}

}
