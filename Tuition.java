package practice;

public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Tuition for the period of 10 years :\n");
		double tuition = 10000;
		double sum = 0;
		for (int i = 1; i <=14; i++) {
			tuition = tuition * 1.05;
			       
			      
			       
			       if (i <= 10) {
			    	   System.out.printf("%4s%-3d%4s%12.4f\n", "year", i, " is ", tuition);
			    	   
			       }
			     if (i > 10) {
			    	   sum += tuition;
			       }
			
		}
		 System.out.printf("\ntotal 4 years cost after 10 years :" + sum);
	}

}
