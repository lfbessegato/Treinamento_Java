package TestesMatematicos;
public class TestaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Definindo os Arrays
		String[] a;
		String b[];
		
		// Criando os Arrays
		a = new String[5];
		b = new String[5];
		
		//Carregando dados no Array a
		a[0]="João";
		a[1]="Maria";
		a[2]="Marcos";
		a[3]="Clara";
		a[4]="Rogério";
		
		//Carregando dados no Array b
		b[0]="Silva";
		b[1]="Fernandes";
		b[2]="Pereira";
		b[3]="Lins";
		b[4]="Gomes";
		
		//Exibindo dados no Array a
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("-");
		
		//Exibindo dados do Array b
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		System.out.println("-");
		
		System.out.println(a[0] + " " + b[0]);
		System.out.println(a[1] + " " + b[1]);
		System.out.println(a[2] + " " + b[2]);
		System.out.println(a[3] + " " + b[3]);
		System.out.println(a[4] + " " + b[4]);
		System.out.println("-");

	}

}
