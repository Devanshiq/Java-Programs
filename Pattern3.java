package com.dla;
/*
 12345
 1234
 123
 12
 1
 1
 12
 123
 1234
 12345

 */
import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */


public class Pattern3 {
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
public static  void pattern(int n)
{
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	
}

}
