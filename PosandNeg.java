package practice;

import java.util.Scanner;

public class PosandNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter integer : ");
		Scanner input = new Scanner(System.in);
		
		 int x = input.nextInt();
		 
		 int negative = 0;
		 int positive = 0;
		 int sum = 0;
		 int i = 0;
		  
		 while (x !=0) {
			 if (x < 0)
				 negative++;
			 else
				 positive++;
			 
			 sum += x;
			 System.out.println("Enter integer : ");
			  x = input.nextInt();
			 i++;
		 }
		 
		float average = sum / i;
		System.out.println("No + : " + positive);
		System.out.println("No - : " + negative);
		System.out.println("Total is " + i);
		System.out.println("Sumtotal is " + sum);
		System.out.println("Average is : " + average);
	}

}
