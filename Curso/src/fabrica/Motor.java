package fabrica;
// Classe Motor.java
public class Motor {
	
	// Atributos
	Boolean ignicao;
	String potencia;
	String combustivel;
	
	//M�todos
	public void ligar() {
		ignicao = true;
		System.out.println("LIGADO...");
	}
	
	public void desligar() {
		ignicao = false;
		System.out.println("DESLIGADO...");
	}

}
