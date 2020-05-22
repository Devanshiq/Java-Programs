package com.dla;
/*
         1 2 3 4 5
          2 3 4 5
           3 4 5
            4 5
             5
 
 
 
 */

import java.util.Scanner;


/**
 * @author Devlabs Alliance
 *
 */
public class Pattern15 {

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
			
		}
	}


