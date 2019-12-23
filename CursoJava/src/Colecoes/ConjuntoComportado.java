package Colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		// Não ordena nem por ordem de inserção nem por ordem alfabética
		Set<String> aprovados = new HashSet<>();
		
		
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		//for(Object nome: aprovados) {
		// Como criei o conjunto de string não precisa criar o objeto pode criar como String
		System.out.println("Não Ordenado ...");
		for(String nome: aprovados) { 
			System.out.println(nome);
		}
		
		// Ordena por ordem de inserção
		Set<String> aprovados1 = new LinkedHashSet<>();
		aprovados1.add("João");
		aprovados1.add("Pedro");
		aprovados1.add("Maria");
		aprovados1.add("Rafael");
		
		// Como criei o conjunto de string não precisa criar o objeto pode criar como String
		System.out.println("Ordenado por Inserção ... ");
		for(String nome: aprovados1) { 
			System.out.println(nome);
		}
		
		// Ordena por ordem Alfabéticao
		Set<String> aprovados2 = new TreeSet<>();
		aprovados2.add("João");
		aprovados2.add("Pedro");
		aprovados2.add("Maria");
		aprovados2.add("Rafael");
				
		// Como criei o conjunto de string não precisa criar o objeto pode criar como String
		System.out.println("Ordenado Alfabética ... ");
		for(String nome: aprovados2) { 
			System.out.println(nome);
		}	
	}

}
