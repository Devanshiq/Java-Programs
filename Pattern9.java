package com.dla;

import java.util.Scanner;
/**
 * @author Devlabs Alliance
 *
 */

public class Pattern9 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n=s.nextInt();
		pattern(n);
		s.close();

	}

	private static void pattern(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
	}

		
	}


