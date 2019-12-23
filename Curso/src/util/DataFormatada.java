package util;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Date;

public class DataFormatada {
	public static void main(String[] args) {
		Date d = new Date();
		Locale local = new Locale ("pt","BR");
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, local);
		System.out.println("Hoje são: " + df.format(d));
	}

}
