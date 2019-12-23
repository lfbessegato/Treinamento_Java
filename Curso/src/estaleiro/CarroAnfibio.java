package estaleiro;
// Classe CarroAnfibio.java
public class CarroAnfibio implements Carro, Barco{
	public void puxarFreioDeMao() {
		System.out.println("Puxou o freio de mão.!");
	}
	
	public void navegar() {
		System.out.println("Navegando ...");
	}

}
