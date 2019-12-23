package capituloXVII;
import javax.swing.JOptionPane;
public class CopiaDeTesteSobrescrita {
	public static void main(String[] args) {
		Atleta corredorAtleta = new Corredor();
		Atleta corredor = new Corredor();
		corredorAtleta.inserirDados();
		corredor.inserirDados();
		
		// Foi possível chamar o método inserirDados() no dois casos
		// Pois eles fazem parte da classe mãe
		
		corredorAtleta.mostrar();
		corredor.mostrar();
		/*  corredorAtleta.setVelocidade(80);
		* Essa linha não compila pois não há método
		* setVelocidade() na classe mãe Atleta
			
		corredor.setVelocidadeMedia */
	}

}
