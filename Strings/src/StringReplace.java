/*
 * replace -> O método retorna String original com partes
 * 			  substituídas por outras.
 */
public class StringReplace {
	public static void main(String[] args) {
		String s1 = " -Eu gosto muito de Java-";
		
		System.out.println("Trocando partes 'muito' por 'demais'.........: " + s1.replace("muito", "demais"));
	}

}
