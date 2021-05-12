package practice;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 2 integers : ");
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		int i = x < y ? x : y;
		
	
		
		while(x % i != 0 || y % i != 0) {
			i--;
		}
		
		System.out.println("GCD is : " + i);
	}

}
