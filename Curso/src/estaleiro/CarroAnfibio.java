package estaleiro;
// Classe CarroAnfibio.java
public class CarroAnfibio implements Carro, Barco{
	public void puxarFreioDeMao() {
		System.out.println("Puxou o freio de m�o.!");
	}
	
	public void navegar() {
		System.out.println("Navegando ...");
	}

}
