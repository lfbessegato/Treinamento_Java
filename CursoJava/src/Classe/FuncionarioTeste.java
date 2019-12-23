package Classe;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario consultor = new Funcionario();
		consultor.nome = "Eduardo Zizas";
		consultor.salario = 4.000;
		consultor.funcao = "Consultor";
		
		Funcionario suporte = new Funcionario("Luciano Bessegato", 5.000, "Suporte");
		
		System.out.println(consultor.Apresentar());
		System.out.println(suporte.Apresentar());
	}

}
