package application;

import equipe.Funcionario;

public class UsaFuncionarioForaPacote {
	public static void main(String[] args) {
		Funcionario fnc = new Funcionario();
		fnc.setor="Tecnologia"; //Definida como public
		
		//fnc.matricula="0455675"; //Definida como protected
		
		//fnc.anoInicio=2018; //Definida como default
		
		//fnc.senha="xyz"; //Definida como private
		
		fnc.setSenha("xyz"); //M�todo definido com public
		
		String Senha = fnc.getSenha(); // M�todo definido com public
		
		//System.out.println(fnc.setor + " " + " " + fnc.matricula + " " + fnc.anoInicio + " " + Senha);

		System.out.println(fnc.setor + " " + Senha);
	}

}
