package practice;

import java.util.Scanner;

public class CheckSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter string1 : ");
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		System.out.println("Enter string2 : ");
		String b = input.next();
		
		
		if (a.contains(b.substring(0)))
			System.out.println(b + " is a substring of " + a);
		else
			System.out.println(b + " is not a substring of " + a);

	}

}
