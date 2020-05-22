package com.dla;

import java.util.Scanner;

/**
 * @author DevLabs Alliance
 *
 */
public class SquareRoot {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find the square root ");
		double n = s.nextDouble();
		square(n);

		s.close();
	}

	/**
	 * @param n
	 */
	private static void square(double n) {
		// TODO Auto-generated method stub
		System.out.println("The square root of a number is ");
		System.out.println((Math.sqrt(n)));
	}

}
