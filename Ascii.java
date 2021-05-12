package practice;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter ASCII Code : ");
		Scanner input = new Scanner(System.in);
		int code = input.nextInt();
		
		char ch = (char) code;
		
		System.out.printf("The character for ASCII Code is :%3c", ch);
		
		System.out.println("\nEnter Unicode Code : ");
		
		String unicode = input.next();
		
		char k = unicode.charAt(0);
		int x = k;
	
		System.out.printf("The value is :%3d", x);
	
	}

}
