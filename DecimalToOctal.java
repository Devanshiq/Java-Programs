package com.dla;
//not running

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the decimal number for conversion into octal ");
		int d = s.nextInt();
		conversion(d);
		s.close();

	}

	/**
	 * @param d
	 */
	private static void conversion(int d) {
		// TODO Auto-generated method stub
		int i = 0;
		int array[] = new int[50];
		while (d !=0) {
			array[i] = d % 8;
			i++;
			d = d / 8;
		}
		System.out.println(" The converted  octal nuber  is ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(array[i]);
		}

	}

}
