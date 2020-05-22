package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */

// formula to convert fahrenheit into celsius
//  C=(F-32)*5/9
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the fahrenheit temperature ");
		double f = s.nextDouble();
		// TODO Auto-generated method stub
		conversion(f);
		s.close();
	}

	/**
	 * @param f
	 */
	private static void conversion(double f) {
		// TODO Auto-generated method stub
		double c;
		c = (f - 32) * 5 / 9;
		System.out.println(" The converted celsius temperature is ");
		System.out.println(c);

	}

}
