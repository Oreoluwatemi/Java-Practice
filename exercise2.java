package practice;

import java.util.*;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

long totalmilliseconds = System.currentTimeMillis();
		
		long totalseconds = totalmilliseconds / 1000;
		long seconds = totalseconds % 60;
		
		long totalminutes = totalseconds / 60;
		long minutes = totalminutes % 60;
		
		long totalhours = totalminutes / 60;
		long hours = totalhours % 24;
		
		System.out.println("Time is= " + hours + ":" + minutes + ":" + seconds);
		
		
		int x = (int) (System.currentTimeMillis() % 10);
		int y = (int) (System.currentTimeMillis() / 7 % 10);
		
		
		int Answer = x + y;
		
		System.out.println("What is =" + " "  + x +  " " + y);
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		
		System.out.println("The answer is =" + (Answer == number));
		
		
		
		
		
		
		
		
	}
	
}
