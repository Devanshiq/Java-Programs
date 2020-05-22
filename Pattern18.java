package com.dla;
/*
          1
          1 0
          1 0 1
          1 0 1 0
          1 0 1 0 1
           
 */

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */
public class Pattern18 {
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
		for(int j=1;j<=i;j++)
		{
			System.out.print(j%2+" ");
		}
		System.out.println();
	}
}
}
