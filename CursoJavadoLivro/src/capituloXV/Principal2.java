package capituloXV;

public class Principal2 {
	public static void main(String[] args) {
		Atleta atleta1 = new Atleta();
		atleta1.inserirDados();
		Time time = new Time();
		time.setCodigoTime(55);
		time.setNomeTime("Time X");
		time.setAtleta(atleta1);
		time.getAtleta().inserirDados();
		System.out.println("O time � " + time.getNomeTime());
		System.out.println("O nome do atleta �: " + time.getAtleta().getNome());
		System.out.println("Repito, o nome do atleta �: " + atleta1.getNome());
	}
}
