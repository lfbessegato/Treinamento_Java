package capituloXVI;

import javax.swing.JOptionPane;

public class TesteDataFabricacao {
	public static void main(String[] args) {
		DataFabricacao minhaData = new DataFabricacao();
		/* 
		 * Aqui ser�o configurados o dia, m�s e ano do objeto minhaData.
		 * Mais a frente, nesse mesmo cap�tulo, esse processo ser�
		 * explicado e treinado.
		 */
		
		minhaData.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia: ")));
		minhaData.setMes(Integer.parseInt(JOptionPane.showInputDialog("M�s: ")));
		minhaData.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano: ")));
		System.out.println(minhaData.dataCompleta());
	}

}
