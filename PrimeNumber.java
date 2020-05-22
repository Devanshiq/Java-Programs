//not running
package com.dla;
import java.util.Scanner;
/**
 * @author Devlabs Alliance
 *
 */

public class PrimeNumber {
	public static void main(String[] args)
	{
		int num,del;
		boolean flag=true;
		//Taking the user from the input
		Scanner dl = new Scanner(System.in);
		num=dl.nextInt();
		dl.close();
		for(int i=2;i<=num/2;i++)
		{
			del=num%i;
			if(del==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("The given number is  a prime number ");
		else
			System.out.println("The given number is not a prime number "+num);
		
	}
	

}
