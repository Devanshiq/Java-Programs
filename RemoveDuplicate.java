package com.dla;
//having doubt

import java.util.Scanner;
/**
 * @author DevLabs Alliance
 *
 */

public class RemoveDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of the elements ");
		int n=s.nextInt();
		System.out.println("Enter the elements of the array");
		int arr[]=new int[n+1];  //n+1 for printing the last element
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		remove(arr);
		s.close();

	}
	/**
	 * @param arr
	 */
	public static  void remove(int []arr)
	{ int [] array=new int[arr.length];
	int j=0;
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]!=arr[i+1]);
		array[j++]=arr[i];
	}
	array[j++]=arr[arr.length-1];
	System.out.println("the new array will be ");
	{
		for(int i=0;i<array.length-1;i++)   // array.length-1 for not printing the extreme last
		{
			System.out.print(array[j]+" ");
		}
	}
		
	}
	
	

}
