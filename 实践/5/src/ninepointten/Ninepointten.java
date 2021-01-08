package ninepointten;
import java.util.Scanner;
public class Ninepointten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("请输入a的值:");
        double a = input.nextDouble();
        System.out.println("请输入b的值:");
        double b = input.nextDouble();
        System.out.println("请输入c的值:");
        double c = input.nextDouble();
       QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("x1="+quadraticEquation.getRoot1());
            System.out.println("x2="+quadraticEquation.getRoot2());
        }
        else {
	            if (quadraticEquation.getDiscriminant() == 0) {
	            System.out.println("x1=x2="+quadraticEquation.getRoot1());
	        }
	            else {
	            System.out.println("The equation has no roots.");
	        }
        } 
	}
}

