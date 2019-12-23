/* 
 * Trim -> não retorna os espaços a esquerda e a direita
 */
public class StringTrim {
	public static void main(String[] args) {
		String s1 = "  -Eu gosto muito de Java-  ";
		System.out.println("A String original.......: " + s1);
		System.out.println("Sem os espaços .........: " + s1.trim());
	}


}
