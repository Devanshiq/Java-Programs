package com.dla;
//Java program to determine whether a given is a Harshad number or not

import java.util.Scanner;

//A Harshad number is a number which is divisible by the sum of its digits

//for example  54   that is 5+4=9 (54 is divisible by 9)

/**
 * @author DevLabs Alliance
 *
 */
public class CheckHarshad {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = s.nextInt();
		s.close();

		harshad(n);
	}

	/**
	 * @param n
	 */
	private static void harshad(int n) {
		// TODO Auto-generated method stub
		int r = 0, sum = 0;
		int copynum = n;
		while (n > 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}

		if (copynum % sum == 0) {
			System.out.println("The number is happy number ");
		} else
			System.out.println("The number is not a happy number ");
	}

}
