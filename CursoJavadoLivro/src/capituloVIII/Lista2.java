package capituloVIII;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
public class Lista2 {
	public static void main(String[] args) {
		List lista = new ArrayList();
		JOptionPane.showMessageDialog(null, "Exemplo de Ordena��o de um ArrayLis");
		lista.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: ")));
		lista.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: ")));
		lista.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: ")));
		System.out.println("Lista como foi digitado: " + lista);
		Collections.sort(lista);
		System.out.println("Lista Ordenada: " + lista);
		
	}

}
