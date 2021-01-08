package ninepointfour;
import java.util.Random;
public class ninepointfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random random = new Random(1000);
        for (int i = 0, n = 0; i < 50; i++, n++) {
            if(n % 10 == 0 && n != 0) {
               System.out.println("");
            }
            System.out.print(random.nextInt(100) + " ");
		}
	}			
}
