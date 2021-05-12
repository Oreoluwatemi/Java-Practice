package practice;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers = 2;
		int prime = 0;

		for ( numbers = 2; numbers <= 50;) {
			boolean isPrime = true;
			for (int j = 2; j < numbers/2; j++) {
				if (numbers % j == 0) {
					isPrime = false;
					break;}
					
					
				}
				
				if (isPrime) {
					prime = numbers;
					System.out.println(prime);
					numbers++;
				}

		}

	}
}

