package com.dla;
/*
 1 
 2 3
 4 5 6
 7 8 9 10
 
 */
import java.util.Scanner;
/**
 * @author Devlabs Alliance
 *
 */

public class Pattern8 {
	static int k=1;
	public static void main(String[] args) {
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
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
	}

}
