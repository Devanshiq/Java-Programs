package com.dla;
/*
                
                1
                2 4
                3 6 9
                4 8 12 16
                5 10 15
                6 12 
                7
                
 */
import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */


public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n=s.nextInt();
		pattern(n);
		s.close();


	}
	/*
	 * private static void pattern(int n) { // TODO Auto-generated method stub 
	 * int k; for(int i=1;i<=n;i++) { k=i; for(int j=1;j<=i;j++) {
	 * System.out.print(k+" "); k=k*(j+1); } System.out.println(); } }
	 */

	/**
	 * @param n
	 */
	private static void pattern(int n) {
		// TODO Auto-generated method stub
		int temp=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(temp*j+" ");
		}
		System.out.println();
		temp++;
	}
	
	for(int i=1;i<n;i++)
	{
		for(int j=1;j<n+1-i;j++)
		{
			System.out.print(temp*j+" ");
		}
		System.out.println();
		temp++;
		
	}
	
	
	
	
	}






}
