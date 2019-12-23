package consultorio;
import java.util.HashMap;
public class NovoVetor {
	public static void main(String[] args) {
		HashMap pessoas = new HashMap();
		Pessoa newPessoa = new Pessoa();
		newPessoa.nome = "Fulano da Silva";
		String chave = "Fulano";
		
		pessoas.put(chave, newPessoa);
		Pessoa outraPessoa = (Pessoa)pessoas.get(chave);
		System.out.println("Nome Recuperado: " + outraPessoa.nome);
		
	}

}
