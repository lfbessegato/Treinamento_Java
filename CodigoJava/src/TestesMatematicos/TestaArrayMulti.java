package TestesMatematicos;
public class TestaArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definindo os Arrays
		String Competicoes[][];
		
		// Criando os Arrays
		Competicoes = new String[3][4];
		
		// Carregando dados no Array a
		Competicoes[0][0]="Corrida 100m rasos";
		Competicoes[0][1]="Usain";
		Competicoes[0][2]="Florence";
		Competicoes[0][3]="Tyson";
		
		Competicoes[1][0]="Salto Triplo";
		Competicoes[1][1]="Inessa";
		Competicoes[1][2]="Jonathan";
		Competicoes[1][3]="Françoise";
		
		Competicoes[2][0]="Natação 50m";
		Competicoes[2][1]="César";
		Competicoes[2][2]="Ranomi";
		Competicoes[2][3]="Michael";
		
		//Exibindo dados do Array a
		System.out.println("Competição: " + Competicoes[0][0]);
		System.out.println("Ouro......: " + Competicoes[0][1]);
		System.out.println("Prata.....: " + Competicoes[0][2]);
		System.out.println("Bronze....: " + Competicoes[0][3]);
		System.out.println("-");
		
		System.out.println("Competição: " + Competicoes[1][0]);
		System.out.println("Ouro......: " + Competicoes[1][1]);
		System.out.println("Prata.....: " + Competicoes[1][2]);
		System.out.println("Bronze....: " + Competicoes[1][3]);
		System.out.println("-");
		
		System.out.println("Competição: " + Competicoes[2][0]);
		System.out.println("Ouro......: " + Competicoes[2][1]);
		System.out.println("Prata.....: " + Competicoes[2][2]);
		System.out.println("Bronze....: " + Competicoes[2][3]);
		System.out.println("-");
		
		
		

	}

}
