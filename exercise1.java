package practice;

import java.util.*;
public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*The U.S. Census Bureau projects population based on the
		following assumptions:
			One birth every 7 seconds
			One death every 13 seconds
			One new immigrant every 45 seconds */
		
		
		int Currentpopulation = 312032486;
		int Days_year = 365;
		
		//Calculate birth in a year assuming  One birth every 7 seconds
		//convert 365 days to seconds
		
		int Seconds_year = Days_year * 24 * 60 * 60;
		int Birth_year = (Seconds_year * 1) / 7;
		
		System.out.println("Births in a year:" + Birth_year);
		
		//Calculate death in a year assuming  One death every 13 seconds
		
		int Death_year = (Seconds_year * 1) / 13;
		System.out.println("Death in a year:" + Death_year);
		
		//Calculate new immigrant in a year assuming  One new immigrant every 45 seconds
		
		int Immigrant_year = (Seconds_year * 1) / 45;
		System.out.println("Immigrants in a year:" + Immigrant_year);
		
		// Calculate population increase in a year
		
		int Population_year = Birth_year + Immigrant_year - Death_year;
		System.out.println("population increase in a year:" + Population_year);
		
		System.out.println("total population in a year:" + (Currentpopulation + Population_year));
		System.out.println("total population in 2 years:" + (Currentpopulation + Population_year * 2));
		System.out.println("total population in 3 years:" + (Currentpopulation + Population_year * 3));
		System.out.println("total population in 4 years:" + (Currentpopulation + Population_year * 4));
		System.out.println("total population in 5 years:" + (Currentpopulation + Population_year * 5));
		
		
		double PA = 197.55;
		double tax = PA * 0.006;
		System.out.println("tax:" + tax);
		System.out.println("tax:" + (int) (tax * 100)/100.0);
		
		Scanner divisible = new Scanner(System.in);
				int i = divisible.nextInt();
		boolean x = i % 2 == 0;
		boolean y = i % 3 == 0;
		
		if (x && y) {
			System.out.println("it is divisible by 2 and 3" + i);
		}
		else if (x || y) {
			System.out.println("it is either divisible by 2 or 3 but not both" + i);
		}
		else {
			System.out.println("it is divisible by 2 and 3" + i);
		}
		
		long totalmilliseconds = System.currentTimeMillis();
		
		long totalseconds = totalmilliseconds / 1000;
		long seconds = totalseconds % 60;
		
		long totalminutes = totalseconds / 60;
		long minutes = totalminutes % 60;
		
		long totalhours = totalminutes / 60;
		long hours = totalhours % 24;
		
		System.out.println("Time is= " + hours + ":" + minutes + ":" + seconds);
		
		
		
	}

}
