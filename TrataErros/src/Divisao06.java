public class Divisao06 {
	public static void main(String[] args) {
		int v1 = 3;
		int v2 = 4;
		try {
			System.out.println("Resultado: " + v1 + " e " + v2 + " -> " + dividir(v1,v2));
		} catch (Exception x){
			System.out.println("Sinto muito, ocorreu o seguinte erro: " + x.getMessage());
		}
		
	}
	
	public static int dividir(int a, int b) throws Exception {
		if (a < b) {
			throw new Exception("Primeiro valor deve ser maior que o segundo.");
		}
				
		int r = 0;
		try {
			r = a/b;
		}
		
		catch (ArithmeticException e) {
			System.out.println ("Erro aritmético: " + e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println("Erro Genérico: " + e.getMessage());
		}
			
		return r;
	}		
}
