
package capituloXVI;

import javax.swing.JOptionPane;

public class TesteExemploData {
	public static void main(String[] args) {
		ExemploData minhaData = new ExemploData();
		minhaData.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia: ")));
		minhaData.setMes(Integer.parseInt(JOptionPane.showInputDialog("Mês: ")));
		minhaData.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano: ")));
		JOptionPane.showMessageDialog(null, minhaData.dataCompletamentar());
	}

}
