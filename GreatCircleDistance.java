package practice;

import java.util.Scanner;

public class GreatCircleDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter point1 latitude and longitude in degrees : ");
		Scanner input = new Scanner(System.in);
		
		double l1 = input.nextDouble();
		double la1 = input.nextDouble();
		
		System.out.println("Enter point2 latitude and longitude in degrees : ");
		
		double l2 = input.nextDouble();
		double la2 = input.nextDouble();
		
		double x1 = Math.toRadians(l1);
		double y1 =  Math.toRadians(la1);
		double x2 =  Math.toRadians(l2);
		double y2 =  Math.toRadians(la2);
		
		final double radius = 6371.01;
		 
		double d = (radius * (Math.acos((Math.sin(x1)*Math.sin(x2)) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))));
		
		System.out.println(d + "km");
		
		
	}

}
