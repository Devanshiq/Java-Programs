package com.dla;
import java.util.*;
/*
 1
 22
 333
 4444
 55555
 
 */



/**
 * @author DevLabs Alliance
 *
 */
public class Pattern1 {
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
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

}
