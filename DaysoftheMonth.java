package practice;

import java.util.Scanner;

public class DaysoftheMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a year : ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		System.out.println("Enter a month : ");
		String m = input.next();
		
		
		if (m.equals("Jan"))
			{System.out.println(m + "" + year + "has" + "31 days");}
		
		if (m.equals("Feb")) 
			if ((year % 4 == 0 & year % 100 != 0) || (year % 400 !=0)) 
	        	System.out.println(m + "" + year + "has 29 days"); 
             else 
            	 System.out.println(m + "" + year + "has 28 days");
			
		
		
		if (m.equals("Mar"))
			{System.out.println(m + "" + year + "has" + "31 days");}
	}

}
