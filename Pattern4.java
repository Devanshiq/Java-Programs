package com.dla;
//not running
/*
 54321
 4321
 321
 21
 1
 1
 21
 321
 4321
 54321
 */
import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */

public class Pattern4 {
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
	public  static void pattern(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
			
		
	}

}
