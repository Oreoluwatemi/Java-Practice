package practice;

import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter decimal number : ");
		Scanner input = new Scanner(System.in);
		
		int no = input.nextInt();
		
		
		String y = "";
		char x = 0;
		
		while (no != 0) {
			
			int hex = no % 16;
			 
			
			 if (hex > 9 && hex <=15)
				x = (char) (hex - 10 + 'A');
			 else
				 x = (char) (hex + '0');
			 
			
		
			y = x + y;
			
			int a = no / 16;
			no = a;
			
			
			
			
		}
		System.out.println("hex value is :" + y);
			
	}

}
