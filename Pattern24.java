package com.dla;
//having doubt

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */


public class Pattern24 {

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
		/*
		int j,k=1;
		for(int i=1;i<=n;i++)
		{  k=i;
			for( j=1;j<=i;j++)
			{
			//	System.out.print(j+" ");
			   // k=i;
			//for( k=1;k<i;k++)
			//{
				System.out.print(k+" ");
				k=k+n-j;
			//}
			System.out.println();
		}
		}
		
		*/
		
	
	int k=1;
	for(int i=1;i<=n;i++)
	{
		k=i;
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			k=k+n-j;
		}
		System.out.println();
	}
	
	
	}
	
		
	}


