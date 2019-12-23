package consultorio;
// Classe Pessoa.java
public class Pessoa {
	// Atributos
	String nome;
	String endereco;
	
	//Métodos 
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public void setEndereco(String newEndereco) {
		this.endereco = newEndereco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
}
