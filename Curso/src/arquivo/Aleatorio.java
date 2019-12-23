package arquivo;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Aleatorio {
	public static void main(String[] args) {
		try {
			RandomAccessFile file = new RandomAccessFile("D:\\Temp\\Arq.Textos\\aleatorio.txt","rw");
			file.seek(1);
			System.out.print(file.read());
			file.writeChars("Escrito");
			file.write(12);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
