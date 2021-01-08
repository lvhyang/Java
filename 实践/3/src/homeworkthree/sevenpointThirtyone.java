package homeworkthree;
import java.util.Arrays;
import java.util.Scanner;
public class sevenpointThirtyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.print("请输入数组1（第一个数字表示数组长度）：");
	    int[] list1 = new int[scanner.nextInt()];
	    for (int i = 0; i < list1.length; i++) {
	        list1[i] = scanner.nextInt();
	    }
	    System.out.print("请输入数组2（第一个数字表示数组长度）：");
	    int[] list2 = new int[scanner.nextInt()];
	    for (int i = 0; i < list2.length; i++) {
	        list2[i] = scanner.nextInt();
	    }
	    System.out.print("The merged list is " + Arrays.toString(merge(list1, list2)));
	}
	
	private static int[] merge(int[] list1, int[] list2) {
	    int[] newList = new int[list1.length + list2.length];
	    System.arraycopy(list1, 0, newList, 0, list1.length);
	    System.arraycopy(list2, 0, newList, list1.length, list2.length);
	    Arrays.sort(newList);
	    return newList;
	}

}
