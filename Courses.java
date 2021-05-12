package practice;

import java.util.Scanner;

public class Courses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter course code : ");
		Scanner input = new Scanner(System.in);
		
		String x = input.next();
		
		int y = x.length();
		
		String course = null;
		String status = null;
		
		char a = x.charAt(0);
		char b = x.charAt(1);
		 
		if (a == 'M')
			course = "Mathematics";
		if (a == 'C')
			course = "Computer Science";
		if (a == 'I')
				course = "Information Technology";
		if (b == '1')
			status = "Freshman";
		if (b == '2')
			status = "Sophomore";
		if (b == '3')
			status = "Junior";
		if (b == '4')
			status = "Senior";
		
		System.out.println(course + " " + status + " " + y);
		
		
		
	}

}
