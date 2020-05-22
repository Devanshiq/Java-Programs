package com.dla;

import java.util.Scanner;

//Java program to convert decimal number into binary number
//for example 6 in decimal is same as binary of 110

/**
 * @author Devlabs Alliance
 *
 */
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the decimal number for conversion into binary ");
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
		while (d > 0) {
			array[i] = d % 2;
			i++;
			d = d / 2;
		}
		System.out.println(" The converted  binary is ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(array[i]);
		}

	}

}
