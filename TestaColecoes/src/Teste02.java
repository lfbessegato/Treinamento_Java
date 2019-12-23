import java.util.ArrayList;
import java.util.List;

public class Teste02 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Clara");
		a1.setNota(6.5);
		
		Aluno a2 = new Aluno();
		a2.setNome("Carlos");
		a2.setNota(8.4);
		
		Aluno a3 = new Aluno();
		a3.setNome("Sandra");
		a3.setNota(9.3);
		
		Aluno a4 = new Aluno();
		a4.setNome("Roberto");
		a4.setNota(7.9);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		//for (int a=0;a<alunos.size();a++){
		for(Aluno alno:alunos) {
			System.out.println(alno.getNome() + " - " + alno.getNota());
		}
		
	}

}
