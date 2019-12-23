package util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
public class ExemploData {
	public static void main(String[] args) {
		Date d = GregorianCalendar.getInstance().getTime();
		SimpleDateFormat format = new SimpleDateFormat();
		System.out.println(format.format(d));
	}

}
