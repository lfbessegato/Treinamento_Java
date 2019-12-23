package util;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
public class ExemploDataCalendar {
	public static void main(String[] args) {
		Date d = new Date();
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(d);
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(calendario.getTime()));
		
	}

}
