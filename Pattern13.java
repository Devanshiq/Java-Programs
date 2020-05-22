package com.dla;
/*
 
            1 2 3 4 5
             1 2 3 4
              1 2 3 
               1 2
                1
                
 */

import java.util.Scanner;


/**
 * @author Devlabs Alliance
 *
 */
public class Pattern13 {
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
		// TODO Auto-generated method stub
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=n-i;k++)
			{
				System.out.print(k+1+" ");
			}
			System.out.println();
		}
		
	}


}
