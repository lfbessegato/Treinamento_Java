package consultorio;
// Classe Medico.java
public class Medico extends Pessoa {
	String horario;
	String especialidade;
	
	//M�todos
	public void setHorario(String newHorario) {
		this.horario = newHorario;
	}
	
	public void setEspecialidade(String newEspecialidade) {
		this.especialidade = newEspecialidade;
	}
	
	public String getHorario() {
		return this.horario;
	}
	
	public String getEspecialidade() {
		return this.especialidade;
	}
	
	//redefini��o do m�todo
	public void andar() {
		System.out.println("Estou andando r�pido ...");
	}

}
