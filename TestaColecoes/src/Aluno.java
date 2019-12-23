
public class Aluno {
	
	//ATRIBUTOS
	private String nome;
	private Double nota;
	
	//CONSTRUTOR
	public Aluno() {
		
	}
	
	public Aluno(String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	//GETTERS E SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public Double getNota() {
		return nota;
	}
}
