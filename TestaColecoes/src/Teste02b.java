import java.util.ArrayList;
import java.util.List;
public class Teste02b {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno("Clara", 6.5));
		alunos.add(new Aluno("Carlos", 8.4));
		alunos.add(new Aluno("Sandra", 9.3));
		alunos.add(new Aluno("Roberto", 7.9));
			
		for (Aluno alno:alunos) {
			System.out.println(alno.getNome() + " - " + alno.getNota());
		}
	}
}