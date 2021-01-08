package homeworkthree;

import java.util.Scanner;

public class sevenpointfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the numbers: ");
		int[] number = new int[10];
		int i;
		int j;
		int sum=0;		
		for(i=0;i<10;i++)
		{
			number[i]=input.nextInt();
		}
		System.out.print("The number of distinct number is ");
		for(i=0;i<10;i++)
		{
			for(j=0;j<i;j++)
			{
				if(number[i] == number[j])
				{
					break;
				}
			}
			if(i==j)
			{
				sum++;
			}
		}
		System.out.println(sum);
		System.out.print("The distinct numbers are: ");
		for(i=0;i<10;i++)
		{
			for(j=0;j<i;j++)
			{
				if(number[i] == number[j])
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.print(number[i] + " ");
			}
		}
	}

}
