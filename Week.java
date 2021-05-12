package practice;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter day from 0 to 6 : ");
		int day = input.nextInt();
		
		switch (day) {
		
		case 0: System.out.println("Sunday");break;
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednesday");break;
		case 4: System.out.println("Thursday");break;
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		}
		
		System.out.println("Enter future day from 0 to 6 : ");
		int f_day = input.nextInt();
		
		int futureday = (day + f_day) % 7;
				
				switch (futureday) {
				
				case 0: System.out.println("Sunday");break;
				case 1: System.out.println("Monday");break;
				case 2: System.out.println("Tuesday");break;
				case 3: System.out.println("Wednesday");break;
				case 4: System.out.println("Thursday");break;
				case 5: System.out.println("Friday");break;
				case 6: System.out.println("Saturday");break;
				}	
		
				System.out.println(day + " " + futureday);
	}

}
