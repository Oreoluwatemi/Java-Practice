package practice;

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
	
	int number = (int) (Math.random() * 3);
	
	System.out.println("Input scissors(0), rock(1), paper(2) ");
	Scanner input = new Scanner(System.in);
	int choice = input.nextInt();
	
	System.out.println(number); 
	
	if (number == 0 && choice == 0)
		System.out.println("Its a draw");
	else if (number == 0 && choice == 1)
		System.out.println("You win");
	else if (number == 0 && choice == 2)
		System.out.println("You lose");
	else if (number == 1 && choice == 0)
		System.out.println("You lose");
	else if (number == 1 && choice == 1)
		System.out.println("Its a draw");
	else if (number == 1 && choice == 2)
		System.out.println("You win");
	else if (number == 2 && choice == 0)
		System.out.println("You win");
	else if (number == 2 && choice == 1)
		System.out.println("You lose");
	else if (number == 2 && choice == 2)
		System.out.println("Its a draw");
	
		
}
}