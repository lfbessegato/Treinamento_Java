package capituloXVI;

public class TesteData {
	public static void main(String[] args) {
		ExemploData dtPadrao = new ExemploData();
		dtPadrao.setDia(26);
		dtPadrao.setMes(01);
		dtPadrao.setAno(2018);
		System.out.println("Primeira data: " + dtPadrao.dataCompletamentar());
		
		ExemploData dtNova = new ExemploData(26,02,2019);
		System.out.println("Um ano e um mês depois: " + dtNova.dataCompletamentar());	
	}
	
}

