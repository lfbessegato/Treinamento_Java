package TestesMatematicos;
public class TestaLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Teste de while");
		int n=0;
		while(n<5) {
			System.out.println(n);
			n+=1;
		}
		
		System.out.println("-");
		
		//Testando a estrutura do/while
		System.out.println("Teste de do/while");
		int i=0;
		do {
			System.out.println(i);
			i++;
		} while (i<5);
		
		System.out.println("-");
		
		//Testando a estrutura for
		System.out.println("Teste do for");
		for(int z=0;z<5;z++) {
			System.out.println(z);
		}
	}
}
