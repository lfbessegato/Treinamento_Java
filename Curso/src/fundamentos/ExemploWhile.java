package fundamentos;
// Classe ExemploWhile.java
public class ExemploWhile {
	public static void main(String[] args) {
		int j = 10;
		while (j > Integer.parseInt(args[0])) {
			System.out.println(+j);
			j--;
		}
	}

}
