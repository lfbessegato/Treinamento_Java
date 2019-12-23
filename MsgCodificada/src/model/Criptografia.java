package model;

public class Criptografia {
	
	public String criptografia(String aberta) {
		String sRet="";
		
		for (int n=aberta.length()-1;n>=0;n--) {
			char c=aberta.charAt(n);
			c+=5;
			sRet +=c;
		}
		
		return sRet;
	}
	
	public String decriptografia(String criptografada) {
		
		String sRet="";
		
		for(int n=criptografada.length()-1;n>=0;n--) {
			char c=criptografada.charAt(n);
			c-=5;
			sRet +=c;
		}
		
		return sRet;
	}

}
