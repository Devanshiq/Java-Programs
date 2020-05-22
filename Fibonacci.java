package com.dla;

import java.util.Scanner;

/**
 * @author DevLabs Alliance
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		/*
		 * Fibonacci series 0, 1,1,2,5,7,12,19,.......
		 * 
		 */

		// taking the input from the user
		Scanner sc = new Scanner(System.in);
		{
			int n;
			System.out.println("Enter the number upto which you want to print fibonacci series");
			n = sc.nextInt();
			sc.close();
			int a = 0, b = 1, c, i;
			System.out.print(a + " " + b);

			for (i = 2; i < n; i++) {
				c = a + b;
				System.out.print(" " + c);
				a = b;
				b = c;

			}
		}

	}

}
