package fundamentos;
//Classe ExemploSwitch
public class ExemploSwitch {
	public static void main(String[] args) {
		switch(args[0].charAt(0)) {
		case 'A':System.out.println("Vogal A");break;
		case 'B':System.out.println("Vogal E");break;
		default:System.out.println("Não é vogal");
		}
	}
}
