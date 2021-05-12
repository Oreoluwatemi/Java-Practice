package practice;

import java.util.Scanner;

public class Monetaryunit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Amount : ");
		Scanner input = new Scanner(System.in);

		String a = input.next();
		
		int b = a.indexOf('.');
		String c = a.substring(0,b);
		int d = Integer.parseInt(c);
		String e = a.substring(b + 1);
		int f = Integer.parseInt(e);
		
		int cents = f;
		
		int quarter = cents / 25;
		 cents = cents % 25;
		int dimes = cents / 10;
		cents = cents % 10;
		int nickel = cents / 5;
		cents = cents % 5;
		int cent = cents / 1;
		cents = cents % 1;
		
		
		System.out.println("Amount is : " + d + "dollars" + quarter + "quarters" + dimes + "dimes" + nickel + "nickels" + cent + "cents");
		
		
		
		
		
	}

}
