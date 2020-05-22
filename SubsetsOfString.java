package com.dla;


import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */
public class SubsetsOfString {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the string ");
	String str = s.next();
	
	subset(str);
	s.close();
}

private static void subset(String dla) {
	// TODO Auto-generated method stub
	int len=dla.length();
	int k=0;
	//length of subsets of a given string of length n is n*(n+1)/2
	String array[]= new String[len*(len+1)/2  ];
	for(int i=0;i<len;i++)
	{
		for(int j=i;j<len;j++)
		{
			array[k]=dla.substring(i,j+1);
			k++;
		}
	}
	System.out.println(" the subsets of the given string ");
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ");
	}
	System.out.println();
	
}

}
