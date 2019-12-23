package clinica;
// Classe Animal.java
public class Animal implements Paciente {
	//Atributos
	private String nome;
	private String historico;
	
	//Métodos
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getHistorico() {
		return historico;
	}
}
