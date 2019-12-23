package TestesMatematicos;

public class MatematicaAvancada {
	private double resultado;

	public void soma(double valor1,double valor2) {
		setResultado(valor1+valor2);
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public boolean par(double valorDec) {
		boolean retorno=false;
		int valorInt = (int)valorDec;
		
		if (valorDec/2==valorInt/2) {
			retorno=true;
		}
		
		return retorno;
	}
	
	public double descontoSeguro(int classeBonus) {
		double retorno=0;
		switch (classeBonus) {
		case 1:
			retorno=0.05; // 5%
			break;
		case 2:
			retorno=0.06; // 6%
			break;
		case 3:
			retorno=0.065; // 6.5%
			break;
		case 4:
			retorno=0.07; // 7%
			break;
		case 5:
			retorno=0.08; // 8%
			break;
		case 6:
			retorno=0.085; // 8.5%
			break;
		case 7:
			retorno=0.087; // 8.7%
			break;
		case 8:
			retorno=0.09; // 9%
			break;
		case 9:
			retorno=0.096; // 9.6%
			break;
		case 10:
			retorno=0.10; // 10%
			break;
		}
		
		return retorno;
	}
}
