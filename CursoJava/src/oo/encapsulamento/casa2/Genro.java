package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {
	private String segredo = "Minha sogra fala demais";
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca Falarei .... " + euMesmo.segredo);
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);
		
		Sogro meuSograo = new Sogro();
		System.out.println(meuSograo.gostaDeCerveja);
		
		//Sogra sogrinha = new Sogra();
		//System.out.println(sogrinha.segredoDeFamilia);
	}

}
