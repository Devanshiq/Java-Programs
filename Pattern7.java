package com.dla;
//not running

import java.util.Scanner;
/**
 * @author Devlabs Alliance
 *
 */
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/



public class Pattern7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n=s.nextInt();
		pattern(n);
		s.close();
	}

	private static void pattern(int n) {
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j>=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
