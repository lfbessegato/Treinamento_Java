package capituloXV;

import javax.swing.JOptionPane;

public class TesteDataFabricacao {
	public static void main(String[] args) {
		DataFabricacao data = new DataFabricacao();
	    String dtDia = JOptionPane.showInputDialog("Digite o dia de Fabricação ");
	    String dtMes = JOptionPane.showInputDialog("Digite o mês de Fabricação ");
	    String dtAno = JOptionPane.showInputDialog("Digite o ano de Fabricação ");
	    
	    Integer dia = Integer.parseInt(dtDia);
	    Integer mes = Integer.parseInt(dtMes);
	    Integer ano = Integer.parseInt(dtAno);
	    
	    data.setDia(dia);
	    data.setMes(mes);
	    data.setAno(ano);
	    
	    System.out.println(data.dataCompleta());
	    
	}

}
