package com.dla;

import java.util.Scanner;
/**
 * @author Devlabs Alliance
 *
 */


public class SmallestNumber {
	// to find smallest number using ternary operator
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);	
	System.out.println("Enter the first number ");

	int n1 = s.nextInt();
	System.out.println("Enter the second  number ");

	int n2 = s.nextInt();

	System.out.println("Enter the third number ");

	int n3 = s.nextInt();
	int  dla=n1>n2?n2:n1;
	int result= dla>n3?n3:dla;

	System.out.println("The smallest number of all the three numbers "+result);
	s.close();

	}

}
