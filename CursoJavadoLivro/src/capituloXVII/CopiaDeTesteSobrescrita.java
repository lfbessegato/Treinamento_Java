package capituloXVII;
import javax.swing.JOptionPane;
public class CopiaDeTesteSobrescrita {
	public static void main(String[] args) {
		Atleta corredorAtleta = new Corredor();
		Atleta corredor = new Corredor();
		corredorAtleta.inserirDados();
		corredor.inserirDados();
		
		// Foi poss�vel chamar o m�todo inserirDados() no dois casos
		// Pois eles fazem parte da classe m�e
		
		corredorAtleta.mostrar();
		corredor.mostrar();
		/*  corredorAtleta.setVelocidade(80);
		* Essa linha n�o compila pois n�o h� m�todo
		* setVelocidade() na classe m�e Atleta
			
		corredor.setVelocidadeMedia */
	}

}
