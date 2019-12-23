package capituloVIII;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Conjuntos {
	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add(88);
		conjunto.add("Sobrenome e Nome");
		conjunto.add(3203.22);
		conjunto.add(99);
		System.out.println("Conteúdo do Comjunto: " + conjunto);
		if (conjunto.contains(88)) {
			System.out.println("O Conjunto contém o inteiro 88");
		}
		System.out.println("Removendo o inteiro 88");
		conjunto.remove(88);
		if (conjunto.contains(88)) {
			System.out.println("O Conjunto ainda contém o inteiro 88");
		}
		else {
			System.out.println("Não contém mais o inteiro 88");
		}
		
		// Percorrendo o conjunto (não tem get (i))
		System.out.println("Criando o objeto interagir --> do tipo Iterator");
		Iterator interagir =  conjunto.iterator();
		while (interagir.hasNext()) {
			System.out.println(interagir.next());
		}
		// Nota: Não aparecem na ordem que foram inseridos!	
	}
}
