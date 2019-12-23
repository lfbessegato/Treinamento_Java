package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipo Primitivos booleano 
		boolean bol1 = false;
		boolean bol2 = true;
		System.out.printf("%b %b\n", bol1, bol2);
		
		//Tipo Primitivo char
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c\n", c1, c2, c3);
		
		//Tipo Primitivo Inteiro
		byte b = 127;
		short s = 32767;
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L;
		System.out.printf("%d %d %d %d\n", b, s, i, l);
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
		
		//Tipo Primitivo Real
		float f = 3.1416f;
		double d = 2.45;
		System.out.printf("%.2f %.1f\n", f, d);
	}
}
