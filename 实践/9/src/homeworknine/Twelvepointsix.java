package homeworknine;
import java.util.*;
public class Twelvepointsix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number:");
		String hex = input.nextLine();
		try {
			System.out.println("The decimal value for hex number "
			+ hex + " is " + hexToDecimal (hex.toUpperCase()));
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
		}
	}
			
	public static int hexToDecimal (String hexString) {
		int decimalValue=0;
		for (int i = 0; i < hexString.length(); i++) {
			char hexChar = hexString.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	 public static int hexCharToDecimal (char ch) {
		 if (ch >= 'A' && ch <= 'F')
			 return 10 + ch - 'A';
		 else if(ch >= '0' && ch <='9')
			 return ch - '0';
		 else
			 throw new NumberFormatException();
		 }
}

