package clinica;
//Classe Relatorios.java 
public class Relatorios {
	public void imprimiRelatorio(Paciente p) {
		System.out.println("Relat�rio de Pacientes");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Hist�rico: " + p.getHistorico());
	}

}
