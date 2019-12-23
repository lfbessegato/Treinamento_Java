package ClassesBase;

import ClassesBase.Dado;
import ClassesBase.Roleta;

public class TestaJogo {
	public static void main(String[] args) {
		Dado dd=new Dado();
		dd.executaJogo(6);
		dd.mostraResultado();
		
		System.out.println("-");
		
		Roleta rl = new Roleta();
		rl.executaJogo(35);
		rl.mostraResultado();
	}

}
