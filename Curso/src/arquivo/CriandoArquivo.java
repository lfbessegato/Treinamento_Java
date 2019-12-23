package arquivo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CriandoArquivo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		PrintWriter arq = null;
		System.out.println("Nome do arquivo");
		String nome = entrada.nextLine();
		System.out.println("Entre com os dados");
		String dados = entrada.nextLine();
		try {
			arq = new PrintWriter(nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		arq.println(dados);
		arq.close();
	}

}
