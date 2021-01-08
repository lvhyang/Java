package ninepointEleven;
import java.util.*;
public class NinepointEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        double a,b,c,d,e,f;
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter a, b, c, d, e, f:");
	        a=input.nextDouble();
	        b=input.nextDouble();
	        c=input.nextDouble();
	        d=input.nextDouble();
	        e=input.nextDouble();
	        f=input.nextDouble();
	        LinearEquation e1 = new LinearEquation(a,b,c,d,e,f);
	        if(e1.isSolvable()){
	            System.out.println("x:" + e1.getX() + "  " + "y:" + e1.getY());
	        }
	        else
	            System.out.println("The equation has no solution");
	}
}
	class LinearEquation {
	    private double a, b, c, d, e, f;

	    public LinearEquation(double v1, double v2, double v3, double v4, double v5, double v6) {
	        a = v1;
	        b = v2;
	        c = v3;
	        d = v4;
	        e = v5;
	        f = v6;
	    }

	    public double getA() {
	        return a;
	    }

	    public double getB() {
	        return b;
	    }

	    public double getC() {
	        return c;
	    }

	    public double getD() {
	        return d;
	    }

	    public double getE() {
	        return e;
	    }

	    public double getF() {
	        return f;
	    }
	    public boolean isSolvable() {
	        if ((a * d - b * c) != 0)
	            return true;
	        else
	            return false;
	    }
	    public double getX() {
	        return (e * d - b * f) / (a * d - b * c);
	    }
	    public double getY() {
	        return (a * f - e * c) / (a * d - b * c);
	    }
	}


