package com.dla;

import java.util.Scanner;

/**
 * @author DevLabs Alliance
 *
 */

//Java program to print all pronic numbers between 1 to 100

//Pronic number can be defined as the number which is a product of two consecutive numbers
//for example 72=8*9    20=5*4

public class CheckPronic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = s.nextInt();
		s.close();
		pronic(n);

	}

	/**
	 * @param n
	 */
	private static void pronic(int n) {
		// TODO Auto-generated method stub
		int flag = 1;
		for (int i = 1; i <= n; i++) {
			if (i * (i + 1) == n) {
				flag = 1;

				break;
			} else
				flag = 0;

		}
		if (flag == 1) {
			System.out.println("It is  a pronic number ");
		} else
			System.out.println("It is not a pronic number ");

	}

}
