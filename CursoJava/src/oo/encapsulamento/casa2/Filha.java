package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

// Classe Filha Herdando Heran�a da Classe Sogra
public class Filha  extends Sogra {
	String segredoDoCasal = "Meu marido est� quase sendo Demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem... " + euMesma.segredoDoCasal);
		System.out.println(euMesma.segredoDeFamilia);
		
		//Genro meuAmor = new Genro();
		//System.out.println(meuAmor.segredo);
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
		// Qdo a classe filha recebe uma heran�a n�o precisa instanciar a classe pai.
		//Sogra mamae = new Sogra();
		//System.out.println(mamae.segreoDeFamilia);
	}

}
