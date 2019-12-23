package util;
import java.util.Vector;
public class ExemploVector {
	public static void main(String[] args) {
		Vector vetor = new Vector();
		
		vetor.add("mercedez");
		
		vetor.add("bolaFutebol");
		
		if (!vetor.isEmpty()) {
			for (int i = 0; i < vetor.size(); i++) {
				Object object = vetor.elementAt(i);
			}
			System.out.println(vetor.size());
		}
	}

}
