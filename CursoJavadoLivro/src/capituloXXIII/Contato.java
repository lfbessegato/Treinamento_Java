package capituloXXIII;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private String email;
	private static List<Contato> minhaLista = new ArrayList<Contato>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static List<Contato> getMinhaLista() {
		return Contato.minhaLista;
	}
	
	public static void setMinhaLista(List<Contato> minhalista){
		Contato.minhaLista = minhaLista;
	}
	
	public static void adiciona(Contato c) {
		minhaLista.add(c);
	}
	
	public static void limpar() {
		minhaLista.removeAll(getMinhaLista());
	}
	
	public String toString() {
		return "\nNome: " + this.nome + " e email: " + this.email;
	}
}
