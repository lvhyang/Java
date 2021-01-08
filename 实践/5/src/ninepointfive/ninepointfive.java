package ninepointfive;
import java.util.GregorianCalendar;
public class ninepointfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		System.out.println("now: " + gregorianCalendar.get(GregorianCalendar.YEAR) + "."
				+ (gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + "."
				+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		gregorianCalendar.setTimeInMillis(1234567898765L);
		System.out.println("after set: " + gregorianCalendar.get(GregorianCalendar.YEAR) + "."
				+ (gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + "."
				+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
				
	}		
}
