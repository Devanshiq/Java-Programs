package com.dla;
import java.util.*;
/**
 * @author Devlabs Alliance
 *
 */

/*
/*
   5 4 3 2 1
   5 4 3 2 
   5 4 3 
   5 4
   5
 */
public class Pattern6 {

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
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
