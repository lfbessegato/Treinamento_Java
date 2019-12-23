import java.util.ArrayList;
import java.util.List;

public class Teste01a {
	public static void main(String[] args) {
		List<String> alunos = new ArrayList<String>();
		alunos.add("Clara");
		alunos.add("Carlos");
		alunos.add("Sandra");
		alunos.add("Roberto");
		
		List<Double> notas = new ArrayList<Double>();
		
		notas.add(6.5);
		notas.add(8.4);
		notas.add(9.3);
		notas.add(7.9);
		
		for (int a=0; a < alunos.size();a++) {
			System.out.println(alunos.get(a) + " - " + notas.get(a));
		}
	}
}
