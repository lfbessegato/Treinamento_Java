package Controles;

public class IfElseIf {
	public static void main(String[] args) {
		double nota = 4.5;
		if (nota >= 9) { 
			System.out.println("Quadro de Honra!");
		} else if(nota >= 7) { 
			System.out.println("Aprovado");
		} else if (nota>=5.5) {
			System.out.println("Recupera��o");
		} else if (nota>=3.5) {
			System.out.println("Recupera��o + Trabalho");
		} else {
			System.out.println("Reprovado !");
		}
	}
}