package arquivo;

import java.io.IOException;
import java.io.PrintWriter;

public class EscreverArquivo {
	public static void main(String[] args) {
		PrintWriter arq = null;
		try {
			arq = new PrintWriter("D:\\Temp\\Arq.Textos\\dados.txt");
			arq.println("Mensagem Escrita");
			arq.close();
		} catch (IOException e ) {
			e.printStackTrace();
			
		}
	}

}
