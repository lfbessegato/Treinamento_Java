package biblioteca;

public class Alfanum {
	
	//M�todos est�ticos
	
	public static String ultimaParte(String original) {
		String sRet="";
		int o;
		while((o=original.indexOf(" "))!= -1) {
			original=original.substring(o+1);
			sRet=original;
		}
		
		return sRet;
	}
}
