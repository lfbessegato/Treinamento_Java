package oo.polimorfismo;


public class Comida {
	
	/**
	 * peso em KG, Tecle de Atalho <ALT> + <SHIFT> + J
	 */
	private double peso = 0;
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		}
	}
	

}
