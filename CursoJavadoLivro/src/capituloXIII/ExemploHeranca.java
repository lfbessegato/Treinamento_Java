package capituloXIII;

public class ExemploHeranca {
	public static void main(String[] args) {
		JogadorDeFutebol jogador1 = new JogadorDeFutebol();
		jogador1.setEsporte("Futebol");
		Corredor corredor1 = new Corredor();
		corredor1.setEsporte("Corrida");
		jogador1.setValorPatrocinio(9995.11);
		corredor1.setValorPatrocinio(8884.12);
		System.out.println(jogador1.getEsporte() + " paga " + 
		jogador1.getValorPatrocinio());
		System.out.println(corredor1.getEsporte() + " paga " + 
		corredor1.getValorPatrocinio());
	}

}
