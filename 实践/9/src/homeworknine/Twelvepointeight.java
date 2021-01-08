package homeworknine;
import java.util.*;
public class Twelvepointeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number:");
		String hex = input.nextLine();
		try {
			System.out.println("The decimal value for hex number "
			+ hex + " is " + hexToDecimal (hex.toUpperCase()));
		}
		catch (HexFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
			
	public static int hexToDecimal (String hexString) throws HexFormatException {
		int decimalValue=0;
		for (int i = 0; i < hexString.length(); i++) {
			char hexChar = hexString.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	 public static int hexCharToDecimal (char ch) throws HexFormatException {
		 if (ch >= 'A' && ch <= 'F')
			 return 10 + ch - 'A';
		 else if(ch >= '0' && ch <='9')
			 return ch - '0';
		 else
			 throw new HexFormatException(ch);
		 }
	
	 public static class HexFormatException extends Exception{
		 public HexFormatException(char message) {
			 super("输入的数不是十六进制:  "+message);

		 }
	 }
}

