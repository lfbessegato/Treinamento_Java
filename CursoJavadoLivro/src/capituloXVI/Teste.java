package capituloXVI;

public class Teste {
	public static void main(String[] args) {
		DataFabricacao dtPadrao = new DataFabricacao();
		dtPadrao.setDia(17);
		dtPadrao.setMes(06);
		dtPadrao.setAno(2013);
		System.out.println("Primeira data: " + dtPadrao.dataCompleta());
		
		DataFabricacao dtNova = new DataFabricacao(18,06,2013);
		System.out.println("Um dia depois: " + dtNova.dataCompleta());
	}

}
