package model;

public abstract class Pessoa {
	
	//Atributos
	protected String CPF;
	private String nome;
	private int idade;
	private final int MENOR_IDADE=14;
	private final int MAIOR_IDADE=110;
	
	//Getters e Setters
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public boolean setIdade(int idade) {
		if(idade < MENOR_IDADE || idade > MAIOR_IDADE) {
			return false;
		}
		
		this.idade = idade;
		return true; 
	}
	
	public abstract String getUltimoNome();
	
}
