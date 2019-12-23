package fundamentos;
// Classe ExemploArray.java
public class ExemploArray {
	public static void main(String[] args) {
		int[] vetor = new int [10];
		System.out.println("Tamanho do Vetor: " + vetor.length);
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
			System.out.println(vetor[i]);
		}
	}

}
