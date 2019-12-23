package Calculo;
import Calculo.Apoio.Matematica;

public class QuartoPrograma{
	public static void main (String args[]){
		Matematica m=new Matematica();
		
		m.soma(5,10);
		//System.out.println("O resultado da soma: " + m.getresultado());
		
		m.multiplica(5,10);
		//System.out.println("O resultado da multiplicacao: " + m.getresultado());
	}
}