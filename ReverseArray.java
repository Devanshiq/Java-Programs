package com.dla;
import java.util.*;


/**
 * @author Devlabs Alliance
 *
 */
public class ReverseArray {
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of elements in an array ");
		//int n=sc.nextInt();		
		int arr[]=new int[4];
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=sc.nextInt();
				}
				for(int i:arr)
				System.out.println("The original elements are "+arr[i]);
			//swapping
				for(int i=0;i<arr.length;i++)
				{ int temp=arr[i];
					arr[i]=arr[arr.length-i];
				arr[arr.length-i]=temp;
				}
				sc.close();
				for(int i:arr)
			System.out.println("The reversed elements are "+arr[i]);	
	}
	
}
