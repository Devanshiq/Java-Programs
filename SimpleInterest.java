package com.dla;
import java.util.*;


/**
 * @author Devlabs Alliance
 *
 */
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the principal ");
		int p=s.nextInt();
		System.out.println("Enter the rate ");
		int r=s.nextInt();
		System.out.println("Enter the time ");
		int t=s.nextInt();
		int h=interest(p,r,t);
		s.close();
	System.out.println("The simple interest is "+h);
	}
	public static int interest(int p,int r,int t)
	{
		return (p*r*t/100);
	}
	
	

}
