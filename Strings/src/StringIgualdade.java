
public class StringIgualdade {
	public static void main(String[] args) {
		String s1 = "Gosto de Java";
		String s2 = "Gosto de Java";
		String s3 = new String ("Gosto de Java");
		String s4 = new String ("Gosto de Java");
		
		System.out.println("Comparando s1 e s2: " + (s1 == s2));
		System.out.println("Comparando s3 e s4: " + (s3 == s4));
		System.out.println("Comparando s1 e s3: " + (s1 == s3));
	}

}
