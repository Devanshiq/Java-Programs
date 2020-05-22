package com.dla;

import java.util.Scanner;


/**
 * @author Devlabs Alliance
 *
 */
public class Pattern17 {

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
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)   //if we remove equality sign here then there will no pyramid structure (doesn't matter)
			{
				System.out.print(" ");
			}for(int k=i+1;k<=n;k++)
				{
					System.out.print(k+" ");
				}
			System.out.println(" ");
			}
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
			
		}
	}

