package consultorio;
// Classe consultorio.java
import java.util.Scanner;
public class Consultorio {
	public static void main(String[] args) {
		//Inst�ncia da Classe M�dico
		Medico novoMedico = new Medico();
		Scanner scn = new Scanner(System.in);
				
		// Entrada de Dados
		System.out.println("##### Cadastro Cl�nico ######");
		System.out.println("Entre com o nome do M�dico: ");
		novoMedico.setNome(scn.next());
		System.out.println("Entre com o endere�o do M�dico: ");
		novoMedico.setEndereco(scn.next());
		System.out.println("Entre com o hor�rio do M�dico: ");
		novoMedico.setHorario(scn.next());
		System.out.println("Entre com a especialidade do M�dico: ");
		novoMedico.setEspecialidade(scn.next());
		
		// Impress�o dos dados obtidos e mantidos para o objeto
		System.out.println("\n##### DADOS DO M�DICO #####");
		System.out.println("Nome do M�dico: " + novoMedico.getNome());
		System.out.println("Endere�o do M�dico: " + novoMedico.getEndereco());
		System.out.println("Hor�rio do M�dico: " + novoMedico.getHorario());
		System.out.println("Especialidade: " + novoMedico.getEspecialidade());
	}
	

}
