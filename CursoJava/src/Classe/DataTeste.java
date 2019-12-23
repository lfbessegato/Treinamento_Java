package Classe;

public class DataTeste {
	public static void main(String[] args) {
		// Criação de um novo Objeto
		
		Data nascimento = new Data();
		// nascimento.dia = 26;
		// nascimento.mes = 01;
		// nascimento.ano = 1971;
		
		Data casamento = new Data(9,9,2000);
		
		System.out.println(nascimento.Formatar());
		System.out.print(casamento.Formatar());
	}

}
