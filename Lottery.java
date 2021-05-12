package practice;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lottery = (int) (Math.random() * 1000);
		
		System.out.println("Input lottery number : ");
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();
		
		int lottery1 = lottery / 100;
		int lottery2 = lottery % 100;
		int lottery3 = lottery % 7;
		
		int user1 = user / 100;
		int user2 = user % 100;
		int user3 = user % 7;
		
		if ((user1 == lottery1) && (user2 == lottery2) && (user3 == lottery3))
			System.out.println("You win $10,000 ");
		
		else if (((user1 == lottery2)||(user1 == lottery3)||(user1 == lottery1)) &&
				((user2 == lottery1)|| (user2 == lottery2)||(user2 == lottery3)) &&
				((user3 == lottery1)||(user3 == lottery1)||(user3 == lottery1)))
			System.out.println("You win $3,000 ");
		
		else if (((user1 == lottery2)||(user1 == lottery3)||(user1 == lottery1)) ||
				((user2 == lottery1)|| (user2 == lottery2)||(user2 == lottery3)) ||
				((user3 == lottery1)||(user3 == lottery1)||(user3 == lottery1)))
			System.out.println("You win $1,000 ");
		else
			System.out.println("You lost ");
	}

}
