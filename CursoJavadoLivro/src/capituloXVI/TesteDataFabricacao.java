package capituloXVI;

import javax.swing.JOptionPane;

public class TesteDataFabricacao {
	public static void main(String[] args) {
		DataFabricacao minhaData = new DataFabricacao();
		/* 
		 * Aqui serão configurados o dia, mês e ano do objeto minhaData.
		 * Mais a frente, nesse mesmo capítulo, esse processo será
		 * explicado e treinado.
		 */
		
		minhaData.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia: ")));
		minhaData.setMes(Integer.parseInt(JOptionPane.showInputDialog("Mês: ")));
		minhaData.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano: ")));
		System.out.println(minhaData.dataCompleta());
	}

}
