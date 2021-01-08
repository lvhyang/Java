package homeworkthree;
import java.util.Scanner;


public class sevenpointthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the integers between 1 and 100: ");
		int[] numbers = new int[100];
		int[] times = new int[100];
		int i=0;
		while((numbers[i] = input.nextInt()) != 0)
		{
			times[numbers[i] - 1] += 1;
			i++;
		}		
		for(int j=0;j<100;j++)
		{
			if(times[j] == 1)
			{
				System.out.println((j+1) + " occurs " + times[j] + " time");
			}
			else if(times[j] != 0)
			{
				System.out.println((j+1) + " occurs " + times[j] + " times");
			}
		}
	}

}
