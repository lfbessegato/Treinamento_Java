package capituloXXV;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ContatoTableModel extends AbstractTableModel {
	// Nome das colunas das tablelas
	private final String[] colunas = new String[] {"Código", "Nome", "Email"};
	
	//Lista para a manipulação do objeto
	private List<Contato> listaContatos;
	public ContatoTableModel() {
		this.listaContatos = new ArrayList<Contato>();
	}
	
	public ContatoTableModel(List<Contato> listaContatos) {
		this.listaContatos = listaContatos;
	}
	
	//número de Linhas
	public int getRowCount() {
		return this.listaContatos.size();
	}
	
	//número de Colunas
	public int getColumnCount() {
		return this.colunas.length;
	}
	
	//Define o que cada coluna conterá do objeto
	public Object getValueAt(int rowIndex, int columnIndex) {
		Contato c = this.listaContatos.get(rowIndex);
		switch (columnIndex) {
		
		case 0:
			return c.getId();
		case 1: 
			return c.getNome();
		case 2:
			return c.getEmail();
		default:
			return null;
		}
	}
	
	//Determina o nome das colunas
	public String getColumnName(int column) {
		return this.colunas[column];
	}
	
	//Determina que tipo de objeto cada coluna irá suportar
	public Class<?> getColumnClass(int columnIndex){
		switch (columnIndex) {
		case 0:
			return Integer.class;
		case 1: 
			return String.class;
		case 2:
			return String.class;
		default:
			return null;
		}
	}
}
