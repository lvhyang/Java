package homeworkthree;

public class sevenpointTwentythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[100];
		int i,j;
		for(i=0;i<100;i++)
		{
			n[i] = 1;        //-1为关
		}
		for(i=1;i<100;i++)
		{
			for(j=i+1;j<=100;j+=(i+1))
			{
				n[j-1] = -n[j-1];
			}
		}
		for(i=0;i<100;i++)
		{
			if(n[i] == 1)
			System.out.print((i+1)+"开 ");
			else
			System.out.print((i+1)+"关  ");
		}
	}	

}
