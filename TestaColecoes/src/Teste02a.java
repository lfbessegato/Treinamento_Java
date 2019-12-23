import java.util.ArrayList;
import java.util.List;
public class Teste02a {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Clara", 6.5);
		Aluno a2 = new Aluno("Carlos", 8.4);
		Aluno a3 = new Aluno("Sandra", 9.3);
		Aluno a4 = new Aluno("Roberto", 7.9);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		for (Aluno alno:alunos) {
			System.out.println(alno.getNome() + " - " + alno.getNota());
		}
	}

}
