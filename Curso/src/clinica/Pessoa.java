package clinica;
// Classe Pessoa.java
public class Pessoa implements Paciente {
	//Atributos 
	private String nome;
	private String historico;
	
	//M�todos
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
