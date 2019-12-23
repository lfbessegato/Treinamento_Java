package equipe;

public class Funcionario extends Pessoa{
	
	public String setor; // Visivel em todos os pacotes e classes
	
	protected String matricula; //Visivel no pacote e sub-classes
	
	int anoInicio; //Visivel apenas no pacote;
	
	private String senha; //Visivel apenas nessa classe;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
