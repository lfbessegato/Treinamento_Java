package capituloXXV;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class TabelaContatos extends JDialog{
	private TableModel modeloTabela = null;
	public TabelaContatos (JFrame frame, String titulo, boolean modal) {
		super(frame, titulo, modal);
		modeloTabela = new ContatoTableModel(Contato.getMinhaLista());
		final JTable tabela = new JTable(modeloTabela);
		Dimension dimensao = new Dimension(600,100);
		tabela.setPreferredScrollableViewportSize(dimensao);
		tabela.setFillsViewportHeight(true);
		
		//Create the scroll pane and add the table to it
		JScrollPane scrollPane = new JScrollPane(tabela);
		
		//Add the scroll pane to this panel
		this.getContentPane().add(scrollPane);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
