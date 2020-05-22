package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */


public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n=s.nextInt();
		pattern(n);
		s.close();

	}

	/**
	 * @param n
	 */
	private static void pattern(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}

}
