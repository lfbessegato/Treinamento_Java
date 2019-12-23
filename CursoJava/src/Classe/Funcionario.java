package Classe;

public class Funcionario {

	String nome;
	Double salario;
	String funcao;
	
	Funcionario() {
	
	}
	
	Funcionario (String n, Double s, String f){
		nome = n;
		salario = s;
		funcao = f;
		
	}
	
	String Apresentar() {
		return String.format("Nome: %s,\n Salário = %.3f,\n Função=%s",nome,salario,funcao);
	}
}
