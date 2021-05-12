package practice;

public class NumbersDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int no = 10;
		for (int i = 100; i <= 1000; i++) {
			
			if ((i % 5 == 0) && (i % 6 == 0)) {
					System.out.print(i + " ");
					count++;
					if (count == no) {
						System.out.print("\n");
						count = 0;
					}
			}
		}
	}

}
