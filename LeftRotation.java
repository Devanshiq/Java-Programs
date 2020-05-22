package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */
public class LeftRotation {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no of elements you want to enter ");
		int n= s.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the no of positions by which you have to rotate the array ");
		int n1=s.nextInt();
		
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		left(arr,n1);
		s.close();
	}
	/**
	 * @param arr
	 * @param n
	 */
	public static void left(int []arr,int n)
	{for(int i=0;i<n;i++)
	{
		int first=arr[0];
		for(int j=0;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[arr.length-1]=first;
	}
	System.out.println("The rotated array is ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
		
		
	}


}
