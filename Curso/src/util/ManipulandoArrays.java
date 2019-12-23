package util;
import java.util.Arrays;

public class ManipulandoArrays {
	public static void main(String[] args) {
		String[] nomes = new String[3];
		nomes[0] = "Fulano";
		nomes[1] = "Ciclano";
		nomes[2] = "Beltrano";
		Arrays.sort(nomes);
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}

}
