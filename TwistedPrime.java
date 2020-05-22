package com.dla;

import java.util.Scanner;

/**
 * @author DevLabs Alliance
 *
 */

//Java program to determine whether a given number is a twisted prime number or not

//A twisted prime number is called a twisted prime number if it is a prime number and reverse of this number is also a prime number
//for example  17,31,37  are twisted prime but 23 is not twisted prime it is just a prime number

public class TwistedPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = s.nextInt();
		s.close();
		check(n);
	}

	private static int reverse(int n) {
		// TODO Auto-generated method stub
		int r, rev = 0;
		while (n != 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}

		return rev;
	}

	/**
	 * @param n
	 */
	private static void check(int n) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int reverse = reverse(n);
		for (int i = 2; i <= reverse / 2; i++) {
			if (reverse % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("The number is twisted prime");
		} else
			System.out.println("The number is not twisted prime ");
	}

}
