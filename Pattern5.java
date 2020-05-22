package com.dla;
import java.util.*;

/*
 * @author Devlabs Alliance
 *
 */

/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5    
  
 */
public class Pattern5 {
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
	public static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
