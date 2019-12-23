package tratamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulacaoDados {
	public static void main(String[] args) {
		String dados = new String();
		BufferedReader entr = new BufferedReader(new InputStreamReader(System.in));
		
		try { 
			System.out.println("Entre com a sua frase: ");
			dados = entr.readLine();
			System.out.println("A frase digitada foi: " + dados);
			
		} catch (IOException e) {
			System.out.println("Erro ao ler string");
			e.printStackTrace();
		}
		
	}

}
