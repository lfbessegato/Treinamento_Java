package util;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
public class DataCalendario {
	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,Locale.UK);
		System.out.println(df.format(calendario.getTime()));
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.DAY_OF_YEAR);
		
		// Adiciona 10 dias à data atual
		calendario.add(Calendar.DAY_OF_YEAR, 10);
		
		// Adiciona 5 meses a data atual
		calendario.add(Calendar.MONTH,5);
		
		// Adiciona 2 anos à data atual
		calendario.add(Calendar.YEAR, 2);
		
		System.out.println(df.format(calendario.getTime()));
		
	}

}
