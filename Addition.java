package practice;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long starttime = System.currentTimeMillis();
		int correct = 0;
		int wrong = 0;
		for (int i = 0; i < 5; i++) {
			int x = (int)(Math.random()* 151);
		    int a = x / 10;
		    int b = x % 10;
		    
		    System.out.println("what is the sum of " + a + "+" + b + ": \n" );
		  
			Scanner input = new Scanner(System.in);
			
			 int y = input.nextInt();
			 if (a + b == y) 
				 {correct++;
				 System.out.println("You are correct");}
			 else
				 {wrong++;
				 System.out.println("You are wrong");}
			 
		
		}
		long endtime = System.currentTimeMillis();
		long itime = endtime - starttime;
		long time = itime / 1000;
		
		System.out.println("Total time taken: " + time + " seconds");
		 System.out.println("You got " + wrong + " wrong");
		 System.out.println("You got " + correct + " correct");
	}

	

}
