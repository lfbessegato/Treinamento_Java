package application;

import model.Usuario;

public class TestaComportamento {
	
	public static void main(String[] args) {
		
		//Usuário 1
		Usuario u1 = new Usuario();
		u1.setNome("Luciano Bessegato");
		u1.setCPF("12345678912");
		u1.setSenha("senha");
		
		System.out.println("Usuário; " + u1.getNome());
		System.out.println("Usuário: " + u1.getUltimoNome());
		System.out.println("A senha confere? " + u1.validaSenha("senha"));
		System.out.println("O CPF é válido?  " + u1.testaCPF());
		System.out.println("Instâncias: " + Usuario.getUsuariosLogado());
		System.out.println(" - ");
		
		Usuario u2 = new Usuario();
		u1.setNome("Márcia Bessegato");
		u1.setCPF("2345678912");
		u1.setSenha("senha2");
		
		System.out.println("Usuário; " + u1.getNome());
		System.out.println("Usuário: " + u1.getUltimoNome());
		System.out.println("A senha confere? " + u1.validaSenha("senha"));
		System.out.println("O CPF é válido?  " + u1.testaCPF());
		System.out.println("Instâncias: " + Usuario.getUsuariosLogado());
		
				
	}

}
