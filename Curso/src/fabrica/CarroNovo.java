package fabrica;

// Classe CarroNovo
public class CarroNovo {

	// Atributos
	String cor;
	String marca;
	String modelo;
	Motor novoMotor = new Motor();

	// métodos
	public void andar() {
		novoMotor.ligar();
		System.out.println("ANDANDO...");
	}

	public void parar() {
		novoMotor.desligar();
		System.out.println("PARANDO...");
	}
}
