package capituloX;

public class TesteAtleta {
	public static void main(String[] args) {
		Atleta atleta = new Atleta();
		atleta.codigo = 10;
		atleta.nome = "Joaquim";
		atleta.esporte = "Atletismo";
		atleta.valorPatrocinio = 3980.55;
		System.out.println("Objeto atleta criado a partir da classe Atleta");
		System.out.println("Código: " + atleta.codigo);
		System.out.println("Nome: " + atleta.nome);
		System.out.println("Esporte: " + atleta.esporte);
		System.out.println("Valor de Patrocínio: R$ " + atleta.valorPatrocinio);
	}
}
