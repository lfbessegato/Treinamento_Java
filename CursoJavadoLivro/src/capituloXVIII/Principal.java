package capituloXVIII;

public class Principal {
	public static void main(String[] args) {
		//Atleta objCiclista = new Ciclista();
		Atleta objCiclistaMontanha = new MountainBike();
		
		//objCiclista.inserirDados();
		//objCiclista.atualizarValor(10);
		objCiclistaMontanha.inserirDados();
		objCiclistaMontanha.atualizarValor(10);
		Atleta objCorredor = new Corredor();
		objCorredor.inserirDados();
		objCorredor.atualizarValor(10);
		// objCiclista.mostrar()
		objCiclistaMontanha.mostrar();
		
		objCorredor.mostrar();
	}

}
