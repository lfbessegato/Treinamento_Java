package escola;
// Classe AlunoImp
public class AlunoImp implements Aluno {
	//Atributos 
	private float nota1, nota2;
	private int faltas;
	
	//Métodos 
	public float media() {
		return nota1(nota1)+nota2(nota2)/2;
	}
	
	public int faltas() {
		return faltas;
	}
	
	public float nota1(float nota) {
		this.nota1 = nota;
		return nota1;
	}
	
	public float nota2(float nota) {
		this.nota2 = nota;
		return nota2;
	}

}
