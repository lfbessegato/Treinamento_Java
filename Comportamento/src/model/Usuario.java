package model;

import biblioteca.Alfanum;
import biblioteca.Criptografia;

public class Usuario extends Pessoa implements testaCPF{
	
	//Construtores
	public Usuario() {
		usuariosLogados++;
	}
	
	//Atributos
	private String senha;
	private static int usuariosLogados=0;
	
	//Getters e Setters
	public void setSenha(String senha) {
		this.senha = Criptografia.criptografa(senha);
	}
	
	//Demais métodos da classe
	public boolean validaSenha(String senha) {
		boolean bRet = false;
		if(this.senha.equals(Criptografia.criptografa(senha))) {
			bRet = true;
		}
		
		return bRet;
	}
	
	public static int getUsuariosLogado() {
		return usuariosLogados;
	}
	
	//Impossição feita pela classe Pessoa
	@Override
	public String getUltimoNome() {
		return Alfanum.ultimaParte(this.getNome());
	}
	
	//Impoossição da interface TestaCPF
	@Override
	
	public boolean testaCPF() {
		if (this.CPF.length()!= 11) {
			return false;
		} else {
			return true;
		}
	}

}
