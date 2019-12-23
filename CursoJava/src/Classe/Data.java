package Classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		this(1,1,2017);
		
	}
	
	
	Data(int dia, int mes, int ano){
	
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	//Tipo do Retorno (String) + nome do Método (Formatar)
	String Formatar() { 
		return String.format("%d/%d/%d",dia,mes,ano);
	}
	
}
