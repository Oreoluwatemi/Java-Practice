package practice;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer : ");
		int k = input.nextInt();
		
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= (k - i); j++) {
			    System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");}
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");}
			System.out.println();
		}
		
		for (int l = 1; k > 0; l++) {
			for (int m = 1; m <= k; m++) {
				System.out.print(m + " ");
				
			}
			k--;
			System.out.println();
		}
	
	}

}
