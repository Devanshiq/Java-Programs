package com.dla;
/*
 
        1
        1 2 1
        1 2 3 2 1
        1 2 3 4 3 2 1
        
 */
import java.util.*;


/**
 * @author Devlabs Alliance
 *
 */
public class Pattern12 {
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
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
			System.out.print(j+" ");	
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
				
			}
		System.out.println();
		}
		
	}

}
