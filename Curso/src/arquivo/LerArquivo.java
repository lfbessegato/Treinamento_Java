package arquivo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {
	public static void main(String[] args) {
		FileReader arq = null;
		try {
			arq = new FileReader("D:\\Temp\\Arq.Textos\\Arquivo.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner leitor = new Scanner(arq);
		while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			System.out.println(linha);
		}
	}

}
