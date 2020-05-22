package com.dla;


import java.util.Scanner;

//java program to divide string into n parts
/**
 * @author  Devlabs Alliance
 *
 */
public class StringDivision {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String for division ");
	String  str = s.next();
	System.out.println("Enter the no for division ");
	int n=s.nextInt();
	int len= str.length();
	int p=len/n;
	division(p,len,n,str);
	s.close();
	}

	
	/**
	 * @param p
	 * @param l
	 * @param n
	 * @param str
	 */
	private static void division(int p,int l,int n,String str) {
		// TODO Auto-generated method stub
		//char [] ch=str.toCharArray();
		if(l%n!=0)
		{
			System.out.println(" division is not possible ");
		}
		else
		{int k=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<p;j++)
				{
					//System.out.println(ch[k]+" ");
					System.out.print(str.charAt(k) +" ");
					k++;
				}
				System.out.println();
			}
		}
			
		
	}
	

}
