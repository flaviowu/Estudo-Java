package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ExCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		int minutes = cal.get(Calendar.MINUTE); //extrair minutos da data
		int month= 1+cal.get(Calendar.MONTH); //extrair mês (+1) pois janeiro é ZERO
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		System.out.println("Minutos: " + minutes);
		System.out.println("Mês: " + month);
		
	}

}
