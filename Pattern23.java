package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */


public class Pattern23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n=s.nextInt();
		pattern(n);
		s.close();
	}

	private static void pattern(int n) {
		// TODO Auto-generated method stub
	/*	
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j<=i;j--)
			{
				System.out.print(j+" ");
			}
			for(int k=i+1;k<=n;k++)
			{
				System.out.print(5+" ");
			}
			System.out.println();
		}
*/
		
		
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=n-i;k<n;k++)     //k==0 when i==5
			{
				System.out.print(5+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		

	}
}
