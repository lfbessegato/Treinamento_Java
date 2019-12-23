package consultorio;
// Classe consultorio.java
import java.util.Scanner;
public class Consultorio {
	public static void main(String[] args) {
		//Instância da Classe Médico
		Medico novoMedico = new Medico();
		Scanner scn = new Scanner(System.in);
				
		// Entrada de Dados
		System.out.println("##### Cadastro Clínico ######");
		System.out.println("Entre com o nome do Médico: ");
		novoMedico.setNome(scn.next());
		System.out.println("Entre com o endereço do Médico: ");
		novoMedico.setEndereco(scn.next());
		System.out.println("Entre com o horário do Médico: ");
		novoMedico.setHorario(scn.next());
		System.out.println("Entre com a especialidade do Médico: ");
		novoMedico.setEspecialidade(scn.next());
		
		// Impressão dos dados obtidos e mantidos para o objeto
		System.out.println("\n##### DADOS DO MÉDICO #####");
		System.out.println("Nome do Médico: " + novoMedico.getNome());
		System.out.println("Endereço do Médico: " + novoMedico.getEndereco());
		System.out.println("Horário do Médico: " + novoMedico.getHorario());
		System.out.println("Especialidade: " + novoMedico.getEspecialidade());
	}
	

}
