package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */

/*
            1 2 3 4 5 4 3 2 1
            2 3 4 5 4 3 2
            3 4 5 4 3
            4 5 4
            5
            
 */

public class Pattern21 {

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
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}

}
