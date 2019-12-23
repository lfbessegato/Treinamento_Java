package capituloXIII;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
public class Atleta {
	private int codigo;
	private String nome;
	private String esporte;
	private double valorPatrocinio;
	
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEsporte() {
		return this.esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	
	public double getValorPatrocinio(){
		return this.valorPatrocinio;
	}
	public void setValorPatrocinio(double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
	}
	
	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código:"));
		this.nome = JOptionPane.showInputDialog("Digite o Nome:");
		this.esporte = JOptionPane.showInputDialog("Digite o esporte praticado:");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Patrocínio:"));
	}
	public double atualizarValor(double taxa) {
		this.valorPatrocinio = this.valorPatrocinio + (this.valorPatrocinio * taxa / 100);
		return this.valorPatrocinio;
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
