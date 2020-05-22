package com.dla;

import java.util.Scanner;

/**
 * @author DevLabs Alliance
 *
 */

//Java program to check whether a number is a happy number or not

//The input number when replaced by the sum of the squares of the digits repeatedly

//If the process give 1 as final value then it ia happy number but if it reults in an endless cycles of numbers containing 4 then the number is called a unhappy number

// for example 82
//   8*8+2*2=68
//   6*6+8*8=100
//   1*1+0+0=1(result is 1)   //82 is a happy number

public class CheckHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  number");
		int n = s.nextInt();
		int last = n;
		s.close();
		while (last != 1 && last != 4) {
			last = happy(last);
		}
		if (last == 1) {
			System.out.println("The entered number is a happy number");
		} else
			System.out.println("The number is not a happy number ");

	}

	/**
	 * @param n
	 * @return
	 */
	private static int happy(int n) {
		// TODO Auto-generated method stub
		int r = 0, sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = sum + r * r;
			n = n / 10;

		}
		return sum;

	}

}
