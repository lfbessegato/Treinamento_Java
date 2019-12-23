package arquivo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExemploStream {
	public static void main(String[] args) {
		FileOutputStream saida = null;
		FileInputStream entrada = null;
		
		try {
			saida = new FileOutputStream ("D:\\Temp\\Arq.Textos\\stream.txt");
			saida.write(2000);
			entrada = new FileInputStream("D:\\Temp\\Arq.Textos\\stream.txt");
			System.out.print(entrada.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
