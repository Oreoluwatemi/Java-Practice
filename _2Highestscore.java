package practice;

import java.util.Scanner;

public class _2Highestscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter number of students : ");
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int highest = 0;
		String shigh = null;
		String ss = null;
		int second = 0;
		
		for (int i = 0; i < x; i++) {
			System.out.println("Enter students name : ");			
			String name = input.next();
			
			System.out.println("Enter score : ");
			int score = input.nextInt();
			
			
			if (i == 0) {
				highest = score;
			 shigh = name;
			}
			else if (i == 1 && (score > highest)) {
				second = highest;
				highest = score;
				ss = shigh;
				shigh = name;				
			}
			else if (i == 1 && (score < highest)) {
				second = score;
				ss = name;
			}
			else if (i > 1 && (score > highest)&& (score > second)) {
				second = highest;
				highest = score;
				ss = shigh;
				shigh = name;
			}
			else if (i > 1 && (score > second)) {
				second = score;
				ss = name;
			}
			
			
		}
		
		System.out.printf("%21s%10s%4d\n", "Highest number is", shigh, highest);
		System.out.printf("%21s%10s%4d\n", "Second number is", ss, second);
	}

}
