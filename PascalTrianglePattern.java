package com.dla;
import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */

/*   Pascal triangle
                       1
                      1 1
                     1 2 1
                    1 3 3 1
                   1 4 6 4 1

 */



public class PascalTrianglePattern {

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
		int k=1;
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			int temp=1;
			for( k=1;k<=i;k++)
			{
				System.out.print(temp+" ");
				temp=temp*(i-k)/k;
			}
			System.out.println();
		}
		
	}

}
