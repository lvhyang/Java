package homeworknine;
import java.util.*;
public class Twelvepointseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number:");
		String hex = input.nextLine();
		try {
			System.out.println("The decimal value for binary number "
			+ hex + " is " + bin2Dec (hex));
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
		}
	}
	public static int bin2Dec (String binaryString) {
		int tenValue=0;
		for (int i = binaryString.length()-1; i >= 0; i--) {
			char binaryChar = binaryString.charAt(i);
			tenValue += binaryCharCharToten(binaryChar) * Math.pow(2, binaryString.length()-i-1);
		}
		return tenValue;
	}

	 public static int binaryCharCharToten (char ch) {
		 if (ch == '0')
			 return 0;
		 else if(ch == '1')
			 return 1;
		 else
			 throw new NumberFormatException();
	}
}
