package equipe;



public class HerdaFuncionarioDentroPacote extends Funcionario {
	public void setValores() {
		
		super.setor="Tecnologia"; //Definida como public
		
		super.matricula="0455675"; //Definida como protected
		
		super.anoInicio=2018; //Definida como default
		
		//super.senha="xyz"; //Definida como private
		
		super.setSenha("xyz"); //M�todo definido com public
		
		String Senha = super.getSenha(); // M�todo definido com public
	}
	

}
