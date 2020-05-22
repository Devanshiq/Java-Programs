package com.dla;


/**
 * @author Devlabs Alliance
 *
 */
public class Palindrome {
	 
	 public static void main(String ar[]) {
		 Palindrome p=new Palindrome();
		 p.palindrome(12321);
		 p.palindrome(1456838);
}
	 /**
	 * @param n
	 */
	public void palindrome(int n)
     {
     	int temp,r,sum=0;
     	temp=n;
     	while(n!=0)//while(n>0)
     	{
     		r=n%10;
     		sum=(sum*10)+r;
     		n=n/10;
     		
     	}
     	
     	if(sum==temp)
     		System.out.println("No is palindrome ");
     		else
     			System.out.println("No is not palindrome ");
 }
	}
