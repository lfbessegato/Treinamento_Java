package capituloXVII;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class CarrinhoCompras2 {
	private List<Produto3> listaProd = new ArrayList<Produto3>();
	public void adicionar(Produto3 prod) {
		int km = Integer.parseInt(JOptionPane.showInputDialog("Quantos Kilometros para entregar?"));
		JOptionPane.showMessageDialog(null, "Frete para produto " + prod.getDescricao() + " é " + prod.calcularFrete(km));
	}
	
	public List<Produto3> gerarLista() {
		return this.listaProd;
	}

}
