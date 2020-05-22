package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */
public class PascalTriangle {
	
	public static void main(String args[])
	{
		int r;
		System.out.println("Enter number of rows ");
	    Scanner s = new Scanner(System.in);
	     r=s.nextInt();
	s.close();
	System.out.println("Pascal Triangle ");
	for(int i=0;i<r;i++)
	{ for(int j=0;j<r-i;j++)  //j<r-i not 1
	{
		System.out.print(" ");
	}
	for(int j=0;j<=i;j++)
		{
			System.out.print(" "+combination(i,j));
		}
		System.out.println();
	}
		
		

	}
	/**
	 * @param n
	 * @return
	 */
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	return fact;
	}
/**
 * @param n
 * @param r
 * @return
 */
public static int combination(int n,int r)
{
	return (factorial( n)/(factorial(r)*factorial(n-r)));
}


}
