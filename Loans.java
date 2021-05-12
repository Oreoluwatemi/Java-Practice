package practice;

import java.util.Scanner;

public class Loans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter loan amount : ");
		Scanner input = new Scanner(System.in);
		int loan = input.nextInt();
		System.out.println("Enter loan period : ");
		int year = input.nextInt();
		double rate = 5;
		double total = 0;
		double interest = 0;
		double month = 0;
		for (int i = 0; i >= rate; i++ ) {
			interest = loan * (rate / 100) * year;
			total = interest + loan;
			month = (total / 5) / 12;
			
			rate += 0.125;
			System.out.println(rate + " " + " " + month + " " + total);
			if (rate == 8)
				break;
			
			System.out.println(rate + " " + " " + month + " " + total);
			
		}
		
		
		
	}

}
