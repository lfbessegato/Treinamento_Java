package API;

public class ExplorandoString {
	public static void main(String[] args) {
		String nome = new String("Luciano");
		nome = "Luc" + "iano";
		
		//Alguns Métodos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.indexOf('c'));
		System.out.println(nome.charAt(6));
		System.out.println(nome.equalsIgnoreCase("luciano"));
		System.out.println(nome.startsWith("Luc"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" é legal !").concat("!"));
		
		//String é imútavel
		System.out.println(nome);
		
		nome = nome.toUpperCase().substring(0,3).concat(" é legal.");
		System.out.println(nome);
	}
}
