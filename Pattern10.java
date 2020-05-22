package com.dla;

import java.util.Scanner;

/*
 1
 2 8
 3 9 15
 4 10 16 22 
 5 11 17 23 29
 6 12 18 24 30 36
 
 */

/**
 * @author Devlabs Alliance
 *
 */
public class Pattern10 {
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
		int dev;
		for(int i=1;i<=n;i++)
		{dev=i;
			for(int j=i;j>=1;j--)
			{  
				System.out.print(dev+" ");
				dev=dev+n;
			}
			System.out.println();
		}
		
	}
	}


