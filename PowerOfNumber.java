package com.dla;
import java.util.Scanner;
/**
 * @author Devlabs Alliance
 *
 */

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");		
		int n=s.nextInt();
		System.out.println("Enter the power of a number ");
		int n1=s.nextInt();
		s.close();
			int h=pow(n,n1);
			System.out.println(" On applying the power "+n1+"  on the  number "
			+n+" we got the result that is "+h);
	}
		static int mul=1;
		/**
		 * @param n
		 * @param n1
		 * @return
		 */
		public static int pow(int n,int n1)
		{
			for(int i=1;i<=n1;i++)
			{
				mul=mul*n;
			}
			return mul;
		}

		
	}



