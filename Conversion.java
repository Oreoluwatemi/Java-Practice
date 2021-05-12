package practice;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%-12s%9s   |   %-12s%9s%n", "kilograms", "pounds", "pounds", "kilograms");
		int i = 1;
		int y = 20;
		 while ( i < 200 && y < 516) {
			 
			 
			 
			 System.out.printf("%-12d%9.1f   |   %-12d%9.1f\n", i, i * 2.2, y, y / 2.2);
			 i += 2;
			 y += 5;
		 }
				
	}

}
