/* Oreoluwa Lawal
 * Assignment 1
 * N01452264
 */

package practice;

// A nested loop program
public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable m is calculated to be used in the nested loop to make the output as a pyramid
		int m = (int) ((Math.log(128))/(Math.log(2)));

		//For loop to make i increment as i * 2
		for (int i = 1; i <= 128;) {
			
			//Loop to make the output a a pyramid arrangement
			for (int j = 0; j <= m-1; j++) {
			    System.out.print("    ");
			}
			
			//Calculates increment of j from 1  to multiples of 2 till the value gives 128
			for (int j = 1; j <= i;) {
				//prints the values of j increments
				System.out.printf("%4d",j );
				j = j * 2;
			}
			
			//Calculates decrement of j from 128 divided by 2 till the value gives 1
            for (int j = i; j > 1;) {
				
				j = j / 2;
				//print the values of j decrements
				System.out.printf("%4d", j );
			}
			
            //Prints values in a new line after a loop is completed
			System.out.println();
			
			//Increment of i till i=128
			i *= 2;
			m--;
		}
	}
}
