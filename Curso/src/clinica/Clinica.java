package clinica;
// Classe clinica.java
public class Clinica {
	public static void main(String[] args) {
		Paciente p = new Pessoa();
		Paciente a = new Animal();
		
		//Dados para a pessoa
		p.setNome("Luciano Bessegato");
		p.setHistorico("Apresentou problemas na garganta");
		
		//Dados para o animal
		a.setNome("Megg");
		a.setHistorico("Problemas na Pata");
		
		//Imprimindo os relatórios
		Relatorios r = new Relatorios();
		r.imprimiRelatorio(p);
		r.imprimiRelatorio(a);
	}
}
