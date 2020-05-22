package com.dla;
import java.util.Scanner;
//
/**
 * @author DevLabs Alliance
 *
 */
public class Factorial {
	public static void main(String []args)
	{
		int n,fact=1;
		//Take the input from the user
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the entered number is  : "+fact);
	}

}
