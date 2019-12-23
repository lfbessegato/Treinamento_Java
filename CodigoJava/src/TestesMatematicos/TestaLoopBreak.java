package TestesMatematicos;
public class TestaLoopBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int distancia=500;
		double tanqueGasolina=50;
		double quilometrosPorLitro=8.5;
		double consumoPorQuilometro=1/quilometrosPorLitro;
		
		for (int decorrido=1;decorrido<=distancia;decorrido++) {
			tanqueGasolina-=consumoPorQuilometro;
			System.out.println("Quilômetros rodados: " + decorrido);
			
			if (tanqueGasolina<=0) {
				System.out.println("Acabou a Gasolina.");
				break;
			}
			
		}

	}

}
