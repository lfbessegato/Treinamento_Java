package Colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		// N�o ordena nem por ordem de inser��o nem por ordem alfab�tica
		Set<String> aprovados = new HashSet<>();
		
		
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		//for(Object nome: aprovados) {
		// Como criei o conjunto de string n�o precisa criar o objeto pode criar como String
		System.out.println("N�o Ordenado ...");
		for(String nome: aprovados) { 
			System.out.println(nome);
		}
		
		// Ordena por ordem de inser��o
		Set<String> aprovados1 = new LinkedHashSet<>();
		aprovados1.add("Jo�o");
		aprovados1.add("Pedro");
		aprovados1.add("Maria");
		aprovados1.add("Rafael");
		
		// Como criei o conjunto de string n�o precisa criar o objeto pode criar como String
		System.out.println("Ordenado por Inser��o ... ");
		for(String nome: aprovados1) { 
			System.out.println(nome);
		}
		
		// Ordena por ordem Alfab�ticao
		Set<String> aprovados2 = new TreeSet<>();
		aprovados2.add("Jo�o");
		aprovados2.add("Pedro");
		aprovados2.add("Maria");
		aprovados2.add("Rafael");
				
		// Como criei o conjunto de string n�o precisa criar o objeto pode criar como String
		System.out.println("Ordenado Alfab�tica ... ");
		for(String nome: aprovados2) { 
			System.out.println(nome);
		}	
	}

}
