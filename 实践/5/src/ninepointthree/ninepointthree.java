package ninepointthree;
import java.util.Date;
public class ninepointthree {
	public static void printDate(long time, Date date) {		
		System.out.println(time + ": " + date.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = 10000;
		Date date = new Date(time);
		printDate(time, date);
		time *= 10;
		for(int i = 0; i < 7; i++) {
			date.setTime(time);
			printDate(time, date);
			time *= 10;
		}
	}
}
