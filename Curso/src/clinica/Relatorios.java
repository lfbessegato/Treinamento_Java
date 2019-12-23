package clinica;
//Classe Relatorios.java 
public class Relatorios {
	public void imprimiRelatorio(Paciente p) {
		System.out.println("Relatório de Pacientes");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Histórico: " + p.getHistorico());
	}

}
