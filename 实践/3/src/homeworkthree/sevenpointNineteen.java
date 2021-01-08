package homeworkthree;

import java.util.Scanner;

public class sevenpointNineteen {

	public static void sort(int a,double[] n) {
		int i,j;
		int flag = 0;
		for(i=0;i<n.length-1;i++) 
		{		
	            if(n[i]>n[i+1]) 
	            {
					flag = 1;
					break;
				}
		}
		if(flag == 0)
			System.out.print("The list is already sorted");
		else
			System.out.print("The list is not sorted");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			double[] n = new double[10];
			int i;
			for(i=0;i<10;i++)
			{
				n[i] = input.nextDouble();
			}
			sort(a,n);
		}

}
