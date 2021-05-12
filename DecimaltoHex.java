package practice;

import java.util.Scanner;

public class DecimaltoHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Letter : ");
		Scanner input = new Scanner(System.in);
		String code = input.nextLine();
		
		char letter = code.charAt(0);
		
		if (letter < 'A' || letter > 'z')
			System.out.println("Invalid input");
		
		else if (letter == 'a' || letter == 'A' ||letter == 'e' || letter == 'E'
			||letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' ||letter == 'u' || letter == 'U')
			System.out.println(letter + " is a vowel");
		
		else
			System.out.println(letter + " is a consonant");
		
		 char x = (char) ((Math.random()* 26) + 65);
		 
		 System.out.println("Uppercase letter is : " + x);
		 
		
		 
	}

}
