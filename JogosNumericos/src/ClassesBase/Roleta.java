package ClassesBase;

import java.util.Random;

public class Roleta extends Jogo {
	
	public void executaJogo() {
		Random rnd = new Random();
		this.setResultado(rnd.nextInt(37));
	}

}
