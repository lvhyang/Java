package computeChange;

import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Receive the amount
		System.out.print(
		"Enter an amount in double, for example 11.56:");
		double amount =input.nextDouble();
		int remainingAmount =(int)(amount*100);
		// Find the number of one dollars
		int numberofoneDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		// Find the number of quarters in the remaining amount
		int numberofQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		// Find the number of dimes in the remaining amount
		int numberofDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		// Find the number of nickels in the remaining amount
		int numberofNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		// Find the number of pennies in the remaining amount
		int numberofPennies=remainingAmount;
		//Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("    " + numberofoneDollars + " dollars");
		System.out.println("    " + numberofQuarters + " quarters");
		System.out.println("    " + numberofDimes + " dimes");
		System.out.println("    " + numberofNickels + " nickels");
		System.out.println("    " + numberofPennies + " pennies");
	}

}
