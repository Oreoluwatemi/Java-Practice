package practice;

import java.util.Scanner;

public class Nondecreasingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter x");
		int x = input.nextInt();
		
		System.out.println("Enter y");
		int y = input.nextInt();
		
		System.out.println("Enter z");
		int z = input.nextInt();
		
		if (x < y && y < z) {
			
			System.out.println(x + " " + y +  " " + z);			
		}
		else if ((x > y && y < z) && (x < z))
			System.out.println(y + " " + x +  " " + z);	
		
		else if ((x > y && y < z) && (x > z))
			System.out.println(y + " " + z +  " " + x);	
		else
			System.out.println(y + " " + z +  " " + x);	
			
	}

}
