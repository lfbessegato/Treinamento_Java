package equipe;

public class UsaFuncionarioDentroPacote {
	
	public static void main(String[] args) {
		Funcionario fnc = new Funcionario();
		fnc.setor="Tecnologia"; //Definida como public
		
		fnc.matricula="0455675"; //Definida como protected
		
		fnc.anoInicio=2018; //Definida como default
		
		// fnc.senha="xyz"; //Definida como private
		
		fnc.setSenha("xyz"); //Método definido com public
		
		String Senha = fnc.getSenha(); // Método definido com public
		
		System.out.println(fnc.setor + " " + " " + fnc.matricula + " " + fnc.anoInicio + " " + Senha);
	}
}
