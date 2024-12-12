import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class LesDates {

	public static void main(String[] args) {
 
		System.out.format("La date du systéme est: %tc \n", System.currentTimeMillis());
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    s.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("UTC+1")));
	    System.out.println(s.format(System.currentTimeMillis()));
	 }
	}


