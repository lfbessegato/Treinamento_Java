package capituloXI;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
public class Atleta {
	public int codigo;
	public String nome;
	public String esporte;
	public double valorPatrocinio;
	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código:"));
		this.nome = JOptionPane.showInputDialog("Digite o Nome:");
		this.esporte = JOptionPane.showInputDialog("Digite o esporte praticado:");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Patrocínio:"));
	}
	public void atualizarValor(double taxa) {
		this.valorPatrocinio = this.valorPatrocinio + (this.valorPatrocinio * taxa / 100);
	}
	
	public void mostrar() {
		String mensagem = "Objeto atleta criado a partir da classe atleta";
		mensagem += "\nCódigo: " + this.codigo;
		mensagem += "\nNome: " + this.nome;
		mensagem += "\nEsporte: " + this.esporte;
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\nValor do Patrocínio: " + formatar.format(this.valorPatrocinio);
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	

}
