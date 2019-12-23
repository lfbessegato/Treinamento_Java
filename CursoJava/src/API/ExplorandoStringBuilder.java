package API;

public class ExplorandoStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Luciano");
		sb.append(",").append("Marcia");
		sb.append(",").append("Enzo");
		
		//É Mútavel
		//sb.reverse();
		
		System.out.println(sb.toString());
		System.out.println(sb.substring(1,3));
		System.out.println(sb.toString());
	}

}
