package com.dla;

import java.util.Scanner;

public class PermutationAndCombination {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		System.out.println("Enter the value of r");
		int r=s.nextInt();
		int p=permutation(n,r);
		int c=combination(n,r);
		if(n>=r)
		{
			System.out.println("The value of permutation is "+p);
			System.out.println("The value of the combination is "+c);
		}
		else
			System.out.println("not possible");
	
	
	}

	private static int combination(int n,int r ) {
		// TODO Auto-generated method stub
		return(fact(n)/(fact(r)*fact(n-r)));
		
	}

	private static  int permutation(int n,int r) {
		// TODO Auto-generated method stub
		return(fact(n)/fact(n-r));
		
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		int facto=1;
		for(int i=1;i<=n;i++)
		{
			facto=facto*i;
		}
		return facto;
	}
	
	
	
	
}
