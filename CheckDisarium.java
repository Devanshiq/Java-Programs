package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */

//Java program to determine whether a given number is a disarium number

//A number is said to be a disarium number when the sum of its digit raised to the 
//power of their respective positions is equal to the number itself

// 1+ 7*7+ 5*5*5= 1+49+125=175

public class CheckDisarium {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();

		length(n);
		check(n);
		s.close();
	}

	/**
	 * @param n
	 */
	private static void check(int n) {
		// TODO Auto-generated method stub
		int sum = 0, r = 0;
		int dla = n;// copy of the given number
		int leng = length(n); // no of digits in the number
		while (n > 0) {
			r = n % 10;
			sum = sum + (int) Math.pow(r, leng);
			n = n / 10;
			leng--;

		}
		if (sum == dla) {
			System.out.println(" the entered number is a disarium number");
		} else
			System.out.println(" the number is not a disarium number ");

	}

	private static int length(int n) {
		// TODO Auto-generated method stub
		int l = 0;
		while (n > 0) {
			l = l + 1;
			n = n / 10;
		}
		return l;
	}

}
