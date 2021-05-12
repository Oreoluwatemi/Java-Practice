package practice;

import java.util.Scanner;

public class Nless12000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int k = 0;
		int i = 0;
		
		
		while (Math.pow(n, 3) < 12000) {
			n++;
		}
		System.out.println(n);
		
		while ( i < 12000) {
			
			
			if (Math.pow(k, 2) <= 12000) {
				k++;
			}
			else if (Math.pow(k, 2) > 12000)
				break;
		}
		System.out.println(k);
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer : ");
		int no = input.nextInt();

		for (int j = 2; no > 1;) {
			if (no % j == 0) {
			System.out.println(j + ", ");
			no = no/j;
			}
			else
				j++;
			
			
		}
	}

}
