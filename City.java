package practice;

import java.util.Scanner;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter city 1: ");
		Scanner input = new Scanner(System.in);

		String city1 = input.next();
		System.out.println("Enter city 2: ");
		String city2 = input.next();
		System.out.println("Enter city 3: ");
		String city3 = input.next();

		if (city1.compareTo(city2) > 0) {
			String temp = city1;
			city1 = city2;
			city2 = temp;
		}

		if (city2.compareTo(city3) > 0) {
			String temp = city2;
			city2 = city3;
			city3 = temp;
		}
		if (city3.compareTo(city1) < 0) {
			String temp = city3;
			city3 = city1;
			city1 = temp;
		}

		System.out.println(city1 + "," + city2 + "," + city3);

	}

}
