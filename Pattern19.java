package com.dla;
/*
             10000
             02000
             00300
             00040
             00005
             
             
 */

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */

public class Pattern19 {
	public static void main(String[] args) {
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
			for(int j=1;j<i;j++)
			{
				System.out.print("0");
			}
			System.out.print(i);
			for(int k=i;k<n;k++)
			{
				System.out.print(0);
			}
			System.out.println();
		}
		
		
		
	}
}
