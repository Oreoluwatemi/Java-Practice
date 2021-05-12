package practice;

import java.util.Scanner;

public class SocialSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter social security number : ");
		Scanner input = new Scanner(System.in);
		
		String ss = input.next();
		
		 System.out.println("length is " + ss.length());
		
		if (ss.length() == 11) {
			  if ((Character.isDigit(ss.charAt(0))) &&
				 (Character.isDigit(ss.charAt(1)))&&
				 (Character.isDigit(ss.charAt(2)))&&
				 (ss.charAt(3) == '-')&&
				 (Character.isDigit(ss.charAt(4)))&&
				 (Character.isDigit(ss.charAt(5)))&&
				 (ss.charAt(6) == '-')&&
				 (Character.isDigit(ss.charAt(7)))&&
				 (Character.isDigit(ss.charAt(8)))&&
				 (Character.isDigit(ss.charAt(9)))&&
				 (Character.isDigit(ss.charAt(10)))) {
				  System.out.println(ss + "Is valid");	}		  
			  else 
				  System.out.println(ss + "Is invalid");}
		else
			System.out.println(ss + "Is invalid");
			   
				  
				 
				
		
	}

}
