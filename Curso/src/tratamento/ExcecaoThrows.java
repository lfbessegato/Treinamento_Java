package tratamento;

public class ExcecaoThrows {
	
	public static String  divisao(int a, int b) throws ArithmeticException{
		return "O valor da divisão é: " + a / b;
	}
	
	public static void main(String[] args) {
		int a = 20;
		int b = 0; 
		int c = 0;
		divisao(a,b);
	}

}
