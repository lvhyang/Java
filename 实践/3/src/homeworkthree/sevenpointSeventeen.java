package homeworkthree;
import java.util.Scanner;
public class sevenpointSeventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();
		System.out.print("Enter name and grade: ");
		int i,j;
		int max = 0;
		int flag = 0;
		String[] name = new String[n];
		int[] grade = new int[n];
		for(i=0;i<n;i++)
		{
			name [i] = input.next();
			grade[i] = input.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				if(grade[j]>max)
				{
					max = grade[j];
					flag = j;
				}
			}
			System.out.println(name[flag]);			
			int t = grade[flag];
			grade[flag] = grade[n-i-1];
			grade[n-i-1] = t;
			String k = name[flag];
			name[flag] = name[n-i-1];
			name[n-i-1] = k;

			flag = 0;
			max = 0;
		}
	}

}
