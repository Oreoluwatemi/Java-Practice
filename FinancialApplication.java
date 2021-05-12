package practice;

import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Loan Amount: ");
		double loan = input.nextInt();
		
		System.out.println("Number of Years: ");
		double year = input.nextInt();
		
		System.out.printf("%-15s%-18s%-13s\n", "Interest rate", "Monthly Payment", "Total Payment");
		
		for (double i = 5; i <= 8; ) {
			double interest = loan * (i/100) * year;
			double total = interest + loan;
			double month = (total / year) / 12;
			
			System.out.printf("%-4.3f%-11s%-18.2f%-13.2f\n", i,"%", month, total);	
			
			i += 0.125;
			
			
		}

	}

}
