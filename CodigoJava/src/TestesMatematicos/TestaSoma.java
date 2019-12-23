package TestesMatematicos;
public class TestaSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MatematicaAvancada ma = new MatematicaAvancada();
		ma.soma(10, 5);
		double rsto=ma.getResultado();
		System.out.println("Resultado: " + rsto);
		
		if (ma.par(rsto)) {
			System.out.println("Este número é par.");
		}
		else {
			System.out.println("Este número é impar.");
		}
		
		ma.soma(900, 750);
		
		double valorSeguro=ma.getResultado();
		System.out.println("Valor do Seguro.........: " + valorSeguro);
		
		if (ma.par(valorSeguro)) {
			System.out.println("-------------------------> Este número é par");
		}else {
			System.out.println("-------------------------> Este número é impar");
		}
		
		double fatorDesconto=ma.descontoSeguro(5); // Classe Bônus 5
		double seguroDesconto=valorSeguro*fatorDesconto;
		double seguroFinal=valorSeguro-seguroDesconto;
		
		System.out.println("Fator de desconto...........: " + fatorDesconto);
		System.out.println("Valor do Desconto...........: " + seguroDesconto);
		System.out.println("Seguro com desconto.........: " + seguroFinal);
		

	}

}
